//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.04 a las 10:16:02 PM CET 
//


package es.com.cc.core.schema.all;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes how interest rates are reported.
 * 
 * <p>Clase Java para InterestRateContractTerm2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InterestRateContractTerm2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}RateBasis1Code"/>
 *         &lt;element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}Max3Number"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestRateContractTerm2", propOrder = {
    "unit",
    "val"
})
public class InterestRateContractTerm2 {

    @XmlElement(name = "Unit", required = true)
    @XmlSchemaType(name = "string")
    protected RateBasis1Code unit;
    @XmlElement(name = "Val", required = true)
    protected BigDecimal val;

    /**
     * Obtiene el valor de la propiedad unit.
     * 
     * @return
     *     possible object is
     *     {@link RateBasis1Code }
     *     
     */
    public RateBasis1Code getUnit() {
        return unit;
    }

    /**
     * Define el valor de la propiedad unit.
     * 
     * @param value
     *     allowed object is
     *     {@link RateBasis1Code }
     *     
     */
    public void setUnit(RateBasis1Code value) {
        this.unit = value;
    }

    /**
     * Obtiene el valor de la propiedad val.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVal() {
        return val;
    }

    /**
     * Define el valor de la propiedad val.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVal(BigDecimal value) {
        this.val = value;
    }

}
