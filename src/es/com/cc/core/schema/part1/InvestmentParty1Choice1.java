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
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of the investment party.
 * 
 * <p>Clase Java para InvestmentParty1Choice__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvestmentParty1Choice__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Prsn" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}PersonIdentification12__1"/>
 *         &lt;element name="Algo" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ESMA_AlphaNumericCapitalLettersMax50_Pattern"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentParty1Choice__1", propOrder = {
    "prsn",
    "algo"
})
public class InvestmentParty1Choice1 {

    @XmlElement(name = "Prsn")
    protected PersonIdentification121 prsn;
    @XmlElement(name = "Algo")
    protected String algo;

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

}
