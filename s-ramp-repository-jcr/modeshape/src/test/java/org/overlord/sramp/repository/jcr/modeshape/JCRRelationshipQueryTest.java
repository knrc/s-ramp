/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.overlord.sramp.repository.jcr.modeshape;

import java.io.InputStream;

import org.junit.Assert;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.oasis_open.docs.s_ramp.ns.s_ramp_v1.BaseArtifactEnum;
import org.oasis_open.docs.s_ramp.ns.s_ramp_v1.BaseArtifactType;
import org.oasis_open.docs.s_ramp.ns.s_ramp_v1.WsdlDocument;
import org.oasis_open.docs.s_ramp.ns.s_ramp_v1.XsdDocument;
import org.overlord.sramp.common.ArtifactType;
import org.overlord.sramp.common.SrampException;
import org.overlord.sramp.common.SrampModelUtils;
import org.overlord.sramp.repository.query.ArtifactSet;
import org.overlord.sramp.repository.query.SrampQuery;


/**
 * Tests that relationships can be queried.
 * @author eric.wittmann@redhat.com
 */
public class JCRRelationshipQueryTest extends AbstractNoAuditingJCRPersistenceTest {

    /**
     * Tests the query manager + derived relationships.
     * @throws Exception
     */
    @Test
    public void testDerivedRelationshipQueries() throws Exception {
        addWsdlDoc();

        // Get all the element style WSDL message parts
        SrampQuery query = queryManager.createQuery("/s-ramp/wsdl/Part[element]"); //$NON-NLS-1$
        ArtifactSet artifactSet = query.executeQuery();
        Assert.assertNotNull(artifactSet);
        Assert.assertEquals(3, artifactSet.size());

        // Get all the element style WSDL message parts that refer to the element with name 'findRequest'
        query = queryManager.createQuery("/s-ramp/wsdl/Part[element[@name = 'find']]"); //$NON-NLS-1$
        artifactSet = query.executeQuery();
        Assert.assertNotNull(artifactSet);
        Assert.assertEquals(1, artifactSet.size());

        // Get all the messages that have at least one part
        query = queryManager.createQuery("/s-ramp/wsdl/Message[part]"); //$NON-NLS-1$
        artifactSet = query.executeQuery();
        Assert.assertNotNull(artifactSet);
        Assert.assertEquals(5, artifactSet.size());

        // Get all operations that have faults
        query = queryManager.createQuery("/s-ramp/wsdl/Operation[fault]"); //$NON-NLS-1$
        artifactSet = query.executeQuery();
        Assert.assertNotNull(artifactSet);
        Assert.assertEquals(1, artifactSet.size());

        // Get all operations that have faults named 'foo' (hint - there aren't any)
        query = queryManager.createQuery("/s-ramp/wsdl/Operation[fault[@name = 'foo']]"); //$NON-NLS-1$
        artifactSet = query.executeQuery();
        Assert.assertNotNull(artifactSet);
        Assert.assertEquals(0, artifactSet.size());

        // Get all faults
        query = queryManager.createQuery("/s-ramp/wsdl/Fault"); //$NON-NLS-1$
        artifactSet = query.executeQuery();
        Assert.assertNotNull(artifactSet);
        Assert.assertEquals(2, artifactSet.size());

        // Get all operations for the port type (sub-artifact-set query)
        query = queryManager.createQuery("/s-ramp/wsdl/PortType[@name = 'SamplePortType']/operation"); //$NON-NLS-1$
        artifactSet = query.executeQuery();
        Assert.assertNotNull(artifactSet);
        Assert.assertEquals(2, artifactSet.size());

        // Get just one operation for the port type (sub-artifact-set query with predicate)
        query = queryManager.createQuery("/s-ramp/wsdl/PortType[@name = 'SamplePortType']/operation[@name = 'findSimple']"); //$NON-NLS-1$
        artifactSet = query.executeQuery();
        Assert.assertNotNull(artifactSet);
        Assert.assertEquals(1, artifactSet.size());
    }

    /**
     * Tests the query manager + custom/generic relationships
     * @throws Exception
     */
    @Test
    public void testGenericRelationshipQueries() throws Exception {
    	XsdDocument xsdDoc = addXsdDoc();
    	WsdlDocument wsdlDoc = addWsdlDoc();

    	SrampModelUtils.addGenericRelationship(xsdDoc, "importedBy", wsdlDoc.getUuid()); //$NON-NLS-1$
    	SrampModelUtils.addGenericRelationship(xsdDoc, "markerRel", null); //$NON-NLS-1$

    	persistenceManager.updateArtifact(xsdDoc, ArtifactType.XsdDocument());

        SrampQuery query = queryManager.createQuery("/s-ramp/xsd/XsdDocument[markerRel]"); //$NON-NLS-1$
        ArtifactSet artifactSet = query.executeQuery();
        Assert.assertNotNull(artifactSet);
        Assert.assertEquals(1, artifactSet.size());

        query = queryManager.createQuery("/s-ramp/xsd/XsdDocument[importedBy]"); //$NON-NLS-1$
        artifactSet = query.executeQuery();
        Assert.assertNotNull(artifactSet);
        Assert.assertEquals(1, artifactSet.size());

        query = queryManager.createQuery("/s-ramp/xsd/XsdDocument[importedBy[@uuid = ?]]"); //$NON-NLS-1$
        query.setString(wsdlDoc.getUuid());
        artifactSet = query.executeQuery();
        Assert.assertNotNull(artifactSet);
        Assert.assertEquals(1, artifactSet.size());

        query = queryManager.createQuery("/s-ramp/xsd/XsdDocument[noSuchRel]"); //$NON-NLS-1$
        artifactSet = query.executeQuery();
        Assert.assertNotNull(artifactSet);
        Assert.assertEquals(0, artifactSet.size());

        query = queryManager.createQuery("/s-ramp/wsdl/WsdlDocument[importedBy]"); //$NON-NLS-1$
        artifactSet = query.executeQuery();
        Assert.assertNotNull(artifactSet);
        Assert.assertEquals(0, artifactSet.size());
    }

	/**
	 * @throws RepositoryException
	 * @throws DerivedArtifactsCreationException
	 */
	private WsdlDocument addWsdlDoc() throws SrampException {
		String artifactFileName = "jcr-sample.wsdl"; //$NON-NLS-1$
        InputStream contentStream = this.getClass().getResourceAsStream("/sample-files/wsdl/" + artifactFileName); //$NON-NLS-1$

        try {
	        WsdlDocument wsdlDoc = new WsdlDocument();
	        wsdlDoc.setArtifactType(BaseArtifactEnum.WSDL_DOCUMENT);
	        wsdlDoc.setName(artifactFileName);
	        wsdlDoc.setContentEncoding("application/xml"); //$NON-NLS-1$
	        // Persist the artifact
	        BaseArtifactType artifact = persistenceManager.persistArtifact(wsdlDoc, contentStream);
	        Assert.assertNotNull(artifact);

            return (WsdlDocument) artifact;
        } finally {
        	IOUtils.closeQuietly(contentStream);
        }
	}

	/**
	 * @throws RepositoryException
	 * @throws DerivedArtifactsCreationException
	 */
	private XsdDocument addXsdDoc() throws SrampException {
		String artifactFileName = "PO.xsd"; //$NON-NLS-1$
        InputStream contentStream = this.getClass().getResourceAsStream("/sample-files/xsd/" + artifactFileName); //$NON-NLS-1$

        try {
	        XsdDocument xsdDoc = new XsdDocument();
	        xsdDoc.setArtifactType(BaseArtifactEnum.XSD_DOCUMENT);
	        xsdDoc.setName(artifactFileName);
	        xsdDoc.setContentEncoding("application/xml"); //$NON-NLS-1$
	        // Persist the artifact
	        BaseArtifactType artifact = persistenceManager.persistArtifact(xsdDoc, contentStream);
	        Assert.assertNotNull(artifact);

            return (XsdDocument) artifact;
        } finally {
        	IOUtils.closeQuietly(contentStream);
        }
	}

}
