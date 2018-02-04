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
import javax.xml.bind.annotation.XmlType;


/**
 * Details of the securities transaction report.
 * 
 * <p>Clase Java para SecuritiesTransactionReport2__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTransactionReport2__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ESMA_AlphaNumericMax52_Pattern"/>
 *         &lt;element name="ExctgPty" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}LEIIdentifier"/>
 *         &lt;element name="SubmitgPty" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}LEIIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionReport2__1", propOrder = {
    "txId",
    "exctgPty",
    "submitgPty"
})
public class SecuritiesTransactionReport21 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "ExctgPty", required = true)
    protected String exctgPty;
    @XmlElement(name = "SubmitgPty", required = true)
    protected String submitgPty;

    /**
     * Obtiene el valor de la propiedad txId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Define el valor de la propiedad txId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Obtiene el valor de la propiedad exctgPty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExctgPty() {
        return exctgPty;
    }

    /**
     * Define el valor de la propiedad exctgPty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExctgPty(String value) {
        this.exctgPty = value;
    }

    /**
     * Obtiene el valor de la propiedad submitgPty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitgPty() {
        return submitgPty;
    }

    /**
     * Define el valor de la propiedad submitgPty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitgPty(String value) {
        this.submitgPty = value;
    }

}
