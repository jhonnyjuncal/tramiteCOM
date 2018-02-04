//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.04 a las 06:39:56 PM CET 
//


package es.com.cc.core.schema.part1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of the executing party.
 * 
 * <p>Clase Java para ExecutingParty1Choice__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExecutingParty1Choice__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Prsn" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}PersonIdentification12__1"/>
 *         &lt;element name="Algo" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ESMA_AlphaNumericCapitalLettersMax50_Pattern"/>
 *         &lt;element name="Clnt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}NoReasonCode"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutingParty1Choice__1", propOrder = {
    "prsn",
    "algo",
    "clnt"
})
public class ExecutingParty1Choice1 {

    @XmlElement(name = "Prsn")
    protected PersonIdentification121 prsn;
    @XmlElement(name = "Algo")
    protected String algo;
    @XmlElement(name = "Clnt")
    @XmlSchemaType(name = "string")
    protected NoReasonCode clnt;

    /**
     * Obtiene el valor de la propiedad prsn.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification121 }
     *     
     */
    public PersonIdentification121 getPrsn() {
        return prsn;
    }

    /**
     * Define el valor de la propiedad prsn.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification121 }
     *     
     */
    public void setPrsn(PersonIdentification121 value) {
        this.prsn = value;
    }

    /**
     * Obtiene el valor de la propiedad algo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgo() {
        return algo;
    }

    /**
     * Define el valor de la propiedad algo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgo(String value) {
        this.algo = value;
    }

    /**
     * Obtiene el valor de la propiedad clnt.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getClnt() {
        return clnt;
    }

    /**
     * Define el valor de la propiedad clnt.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setClnt(NoReasonCode value) {
        this.clnt = value;
    }

}
