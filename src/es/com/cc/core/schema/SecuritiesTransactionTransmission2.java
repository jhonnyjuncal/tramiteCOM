//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.01.29 a las 12:13:04 PM CET 
//


package es.com.cc.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies the securities order transmission attributes.
 * 
 * 
 * <p>Clase Java para SecuritiesTransactionTransmission2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTransactionTransmission2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrnsmssnInd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}TrueFalseIndicator"/>
 *         &lt;element name="TrnsmttgBuyr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}LEIIdentifier" minOccurs="0"/>
 *         &lt;element name="TrnsmttgSellr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}LEIIdentifier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionTransmission2", propOrder = {
    "trnsmssnInd",
    "trnsmttgBuyr",
    "trnsmttgSellr"
})
public class SecuritiesTransactionTransmission2 {

    @XmlElement(name = "TrnsmssnInd")
    protected boolean trnsmssnInd;
    @XmlElement(name = "TrnsmttgBuyr")
    protected String trnsmttgBuyr;
    @XmlElement(name = "TrnsmttgSellr")
    protected String trnsmttgSellr;

    /**
     * Obtiene el valor de la propiedad trnsmssnInd.
     * 
     */
    public boolean isTrnsmssnInd() {
        return trnsmssnInd;
    }

    /**
     * Define el valor de la propiedad trnsmssnInd.
     * 
     */
    public void setTrnsmssnInd(boolean value) {
        this.trnsmssnInd = value;
    }

    /**
     * Obtiene el valor de la propiedad trnsmttgBuyr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnsmttgBuyr() {
        return trnsmttgBuyr;
    }

    /**
     * Define el valor de la propiedad trnsmttgBuyr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnsmttgBuyr(String value) {
        this.trnsmttgBuyr = value;
    }

    /**
     * Obtiene el valor de la propiedad trnsmttgSellr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnsmttgSellr() {
        return trnsmttgSellr;
    }

    /**
     * Define el valor de la propiedad trnsmttgSellr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnsmttgSellr(String value) {
        this.trnsmttgSellr = value;
    }

}
