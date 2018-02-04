//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.04 a las 10:16:02 PM CET 
//


package es.com.cc.core.schema.all;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The Business Layer deals with Business Messages. The behaviour of the Business Messages is fully described by the Business Transaction and the structure of the Business Messages is fully described by the Message Definitions and related Message Rules, Rules and Market Practices. All of which are registered in the ISO 20022 Repository.
 * A single new Business Message (with its accompagnying business application header) is created - by the sending MessagingEndpoint - for each business event; that is each interaction in a Business Transaction. A Business Message adheres to the following principles:
 * " A Business Message (and its business application header) must not contain information about the Message Transport System or the mechanics or mechanism of message sending, transportation, or receipt. 
 * " A Business Message must be comprehensible outside of the context of the Transport Message. That is the Business Message must not require knowledge of the Transport Message to be understood.
 * " A Business Message may contain headers, footers, and envelopes that are meaningful for the business. When present, they are treated as any other message content, which means that they are considered part of the Message Definition of the Business Message and as such will be part of the ISO 20022 Repository.
 * " A Business Message refers to Business Actors by their Name. Each instance of a Business Actor has one Name. The Business Actor must not be referred to in the Transport Layer.
 * Specific usage of this BusinessMessageHeader may be defined by the relevant SEG.
 * 
 * <p>Clase Java para BusinessApplicationHeaderV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessApplicationHeaderV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}Party9Choice__1"/>
 *         &lt;element name="To" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}Party9Choice__1"/>
 *         &lt;element name="BizMsgIdr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}Max35Text"/>
 *         &lt;element name="MsgDefIdr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}Max35Text"/>
 *         &lt;element name="CreDt" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}ISONormalisedDateTime"/>
 *         &lt;element name="Rltd" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}BusinessApplicationHeader1__1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessApplicationHeaderV01", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", propOrder = {
    "fr",
    "to",
    "bizMsgIdr",
    "msgDefIdr",
    "creDt",
    "rltd"
})
public class BusinessApplicationHeaderV01 {

    @XmlElement(name = "Fr", required = true)
    protected Party9Choice1 fr;
    @XmlElement(name = "To", required = true)
    protected Party9Choice1 to;
    @XmlElement(name = "BizMsgIdr", required = true)
    protected String bizMsgIdr;
    @XmlElement(name = "MsgDefIdr", required = true)
    protected String msgDefIdr;
    @XmlElement(name = "CreDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDt;
    @XmlElement(name = "Rltd")
    protected BusinessApplicationHeader11 rltd;

    /**
     * Obtiene el valor de la propiedad fr.
     * 
     * @return
     *     possible object is
     *     {@link Party9Choice1 }
     *     
     */
    public Party9Choice1 getFr() {
        return fr;
    }

    /**
     * Define el valor de la propiedad fr.
     * 
     * @param value
     *     allowed object is
     *     {@link Party9Choice1 }
     *     
     */
    public void setFr(Party9Choice1 value) {
        this.fr = value;
    }

    /**
     * Obtiene el valor de la propiedad to.
     * 
     * @return
     *     possible object is
     *     {@link Party9Choice1 }
     *     
     */
    public Party9Choice1 getTo() {
        return to;
    }

    /**
     * Define el valor de la propiedad to.
     * 
     * @param value
     *     allowed object is
     *     {@link Party9Choice1 }
     *     
     */
    public void setTo(Party9Choice1 value) {
        this.to = value;
    }

    /**
     * Obtiene el valor de la propiedad bizMsgIdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizMsgIdr() {
        return bizMsgIdr;
    }

    /**
     * Define el valor de la propiedad bizMsgIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizMsgIdr(String value) {
        this.bizMsgIdr = value;
    }

    /**
     * Obtiene el valor de la propiedad msgDefIdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgDefIdr() {
        return msgDefIdr;
    }

    /**
     * Define el valor de la propiedad msgDefIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgDefIdr(String value) {
        this.msgDefIdr = value;
    }

    /**
     * Obtiene el valor de la propiedad creDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDt() {
        return creDt;
    }

    /**
     * Define el valor de la propiedad creDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDt(XMLGregorianCalendar value) {
        this.creDt = value;
    }

    /**
     * Obtiene el valor de la propiedad rltd.
     * 
     * @return
     *     possible object is
     *     {@link BusinessApplicationHeader11 }
     *     
     */
    public BusinessApplicationHeader11 getRltd() {
        return rltd;
    }

    /**
     * Define el valor de la propiedad rltd.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessApplicationHeader11 }
     *     
     */
    public void setRltd(BusinessApplicationHeader11 value) {
        this.rltd = value;
    }

}
