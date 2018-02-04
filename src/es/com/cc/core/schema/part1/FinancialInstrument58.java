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
 * Specifies underlying instruments or index a derivative has.
 * 
 * <p>Clase Java para FinancialInstrument58 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstrument58">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ISINOct2015Identifier" minOccurs="0"/>
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}FloatingInterestRate8"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument58", propOrder = {
    "isin",
    "nm"
})
public class FinancialInstrument58 {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "Nm", required = true)
    protected FloatingInterestRate8 nm;

    /**
     * Obtiene el valor de la propiedad isin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Define el valor de la propiedad isin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Obtiene el valor de la propiedad nm.
     * 
     * @return
     *     possible object is
     *     {@link FloatingInterestRate8 }
     *     
     */
    public FloatingInterestRate8 getNm() {
        return nm;
    }

    /**
     * Define el valor de la propiedad nm.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingInterestRate8 }
     *     
     */
    public void setNm(FloatingInterestRate8 value) {
        this.nm = value;
    }

}
