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
 * Provides the index used to define the rate and optionally the basis point spread.
 * 
 * <p>Clase Java para FloatingInterestRate8 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FloatingInterestRate8">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefRate" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}BenchmarkCurveName5Choice"/>
 *         &lt;element name="Term" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}InterestRateContractTerm2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingInterestRate8", propOrder = {
    "refRate",
    "term"
})
public class FloatingInterestRate8 {

    @XmlElement(name = "RefRate", required = true)
    protected BenchmarkCurveName5Choice refRate;
    @XmlElement(name = "Term")
    protected InterestRateContractTerm2 term;

    /**
     * Obtiene el valor de la propiedad refRate.
     * 
     * @return
     *     possible object is
     *     {@link BenchmarkCurveName5Choice }
     *     
     */
    public BenchmarkCurveName5Choice getRefRate() {
        return refRate;
    }

    /**
     * Define el valor de la propiedad refRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BenchmarkCurveName5Choice }
     *     
     */
    public void setRefRate(BenchmarkCurveName5Choice value) {
        this.refRate = value;
    }

    /**
     * Obtiene el valor de la propiedad term.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public InterestRateContractTerm2 getTerm() {
        return term;
    }

    /**
     * Define el valor de la propiedad term.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateContractTerm2 }
     *     
     */
    public void setTerm(InterestRateContractTerm2 value) {
        this.term = value;
    }

}
