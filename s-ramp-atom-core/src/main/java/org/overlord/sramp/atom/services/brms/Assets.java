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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 04:24:21 PM EDT 
//


package org.overlord.sramp.atom.services.brms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asset" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="binaryContentAttachmentFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="binaryLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="metadata">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="checkInComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="disabled" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="published" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="refLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="sourceLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "asset"
})
@XmlRootElement(name = "assets")
public class Assets
    implements Serializable
{

    private static final long serialVersionUID = 7561111833611451562L;
    protected List<Assets.Asset> asset;

    /**
     * Gets the value of the asset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Assets.Asset }
     * 
     * 
     */
    public List<Assets.Asset> getAsset() {
        if (asset == null) {
            asset = new ArrayList<Assets.Asset>();
        }
        return this.asset;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="binaryContentAttachmentFileName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="binaryLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="metadata">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="checkInComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="disabled" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="published" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="refLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         &lt;element name="sourceLink" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "author",
        "binaryContentAttachmentFileName",
        "binaryLink",
        "description",
        "metadata",
        "published",
        "refLink",
        "sourceLink",
        "title"
    })
    public static class Asset
        implements Serializable
    {

        private static final long serialVersionUID = 7561111833611451562L;
        @XmlElement(required = true)
        protected String author;
        @XmlElement(required = true)
        protected String binaryContentAttachmentFileName;
        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String binaryLink;
        @XmlElement(required = true)
        protected String description;
        @XmlElement(required = true)
        protected Assets.Asset.Metadata metadata;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar published;
        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String refLink;
        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String sourceLink;
        @XmlElement(required = true)
        protected String title;

        /**
         * Gets the value of the author property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthor() {
            return author;
        }

        /**
         * Sets the value of the author property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthor(String value) {
            this.author = value;
        }

        /**
         * Gets the value of the binaryContentAttachmentFileName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBinaryContentAttachmentFileName() {
            return binaryContentAttachmentFileName;
        }

        /**
         * Sets the value of the binaryContentAttachmentFileName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBinaryContentAttachmentFileName(String value) {
            this.binaryContentAttachmentFileName = value;
        }

        /**
         * Gets the value of the binaryLink property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBinaryLink() {
            return binaryLink;
        }

        /**
         * Sets the value of the binaryLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBinaryLink(String value) {
            this.binaryLink = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the metadata property.
         * 
         * @return
         *     possible object is
         *     {@link Assets.Asset.Metadata }
         *     
         */
        public Assets.Asset.Metadata getMetadata() {
            return metadata;
        }

        /**
         * Sets the value of the metadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link Assets.Asset.Metadata }
         *     
         */
        public void setMetadata(Assets.Asset.Metadata value) {
            this.metadata = value;
        }

        /**
         * Gets the value of the published property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPublished() {
            return published;
        }

        /**
         * Sets the value of the published property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPublished(XMLGregorianCalendar value) {
            this.published = value;
        }

        /**
         * Gets the value of the refLink property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRefLink() {
            return refLink;
        }

        /**
         * Sets the value of the refLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRefLink(String value) {
            this.refLink = value;
        }

        /**
         * Gets the value of the sourceLink property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceLink() {
            return sourceLink;
        }

        /**
         * Sets the value of the sourceLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceLink(String value) {
            this.sourceLink = value;
        }

        /**
         * Gets the value of the title property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle() {
            return title;
        }

        /**
         * Sets the value of the title property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle(String value) {
            this.title = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="checkInComment" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="disabled" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="versionNumber" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "checkInComment",
            "created",
            "disabled",
            "format",
            "note",
            "state",
            "uuid",
            "versionNumber"
        })
        public static class Metadata
            implements Serializable
        {

            private static final long serialVersionUID = 7561111833611451562L;
            @XmlElement(required = true)
            protected String checkInComment;
            @XmlElement(required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar created;
            @XmlElement(required = true)
            protected String disabled;
            @XmlElement(required = true)
            protected String format;
            @XmlElement(required = true)
            protected String note;
            @XmlElement(required = true)
            protected String state;
            @XmlElement(required = true)
            protected String uuid;
            protected byte versionNumber;

            /**
             * Gets the value of the checkInComment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckInComment() {
                return checkInComment;
            }

            /**
             * Sets the value of the checkInComment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckInComment(String value) {
                this.checkInComment = value;
            }

            /**
             * Gets the value of the created property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getCreated() {
                return created;
            }

            /**
             * Sets the value of the created property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setCreated(XMLGregorianCalendar value) {
                this.created = value;
            }

            /**
             * Gets the value of the disabled property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisabled() {
                return disabled;
            }

            /**
             * Sets the value of the disabled property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisabled(String value) {
                this.disabled = value;
            }

            /**
             * Gets the value of the format property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFormat() {
                return format;
            }

            /**
             * Sets the value of the format property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFormat(String value) {
                this.format = value;
            }

            /**
             * Gets the value of the note property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNote() {
                return note;
            }

            /**
             * Sets the value of the note property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNote(String value) {
                this.note = value;
            }

            /**
             * Gets the value of the state property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getState() {
                return state;
            }

            /**
             * Sets the value of the state property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setState(String value) {
                this.state = value;
            }

            /**
             * Gets the value of the uuid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUuid() {
                return uuid;
            }

            /**
             * Sets the value of the uuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUuid(String value) {
                this.uuid = value;
            }

            /**
             * Gets the value of the versionNumber property.
             * 
             */
            public byte getVersionNumber() {
                return versionNumber;
            }

            /**
             * Sets the value of the versionNumber property.
             * 
             */
            public void setVersionNumber(byte value) {
                this.versionNumber = value;
            }

        }

    }

}