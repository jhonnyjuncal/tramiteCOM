//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.01.29 a las 12:13:04 PM CET 
//


package es.com.cc.core.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Choice between formats for the quantity of security.
 * 
 * <p>Clase Java para FinancialInstrumentQuantity25Choice__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstrumentQuantity25Choice__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ESMA_NonNegativeExcludingZeroMax18"/>
 *         &lt;element name="NmnlVal" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ESMA_PositiveExcludingZeroMax18"/>
 *         &lt;element name="MntryVal" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ESMA_PositiveExcludingZeroMax18"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentQuantity25Choice__1", propOrder = {
    "unit",
    "nmnlVal",
    "mntryVal"
})
public class FinancialInstrumentQuantity25Choice1 {

    @XmlElement(name = "Unit")
    protected BigDecimal unit;
    @XmlElement(name = "NmnlVal")
    protected ESMAPositiveExcludingZeroMax18 nmnlVal;
    @XmlElement(name = "MntryVal")
    protected ESMAPositiveExcludingZeroMax18 mntryVal;

    /**
     * Obtiene el valor de la propiedad unit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnit() {
        return unit;
    }

    /**
     * Define el valor de la propiedad unit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnit(BigDecimal value) {
        this.unit = value;
    }

    /**
     * Obtiene el valor de la propiedad nmnlVal.
     * 
     * @return
     *     possible object is
     *     {@link ESMAPositiveExcludingZeroMax18 }
     *     
     */
    public ESMAPositiveExcludingZeroMax18 getNmnlVal() {
        return nmnlVal;
    }

    /**
     * Define el valor de la propiedad nmnlVal.
     * 
     * @param value
     *     allowed object is
     *     {@link ESMAPositiveExcludingZeroMax18 }
     *     
     */
    public void setNmnlVal(ESMAPositiveExcludingZeroMax18 value) {
        this.nmnlVal = value;
    }

    /**
     * Obtiene el valor de la propiedad mntryVal.
     * 
     * @return
     *     possible object is
     *     {@link ESMAPositiveExcludingZeroMax18 }
     *     
     */
    public ESMAPositiveExcludingZeroMax18 getMntryVal() {
        return mntryVal;
    }

    /**
     * Define el valor de la propiedad mntryVal.
     * 
     * @param value
     *     allowed object is
     *     {@link ESMAPositiveExcludingZeroMax18 }
     *     
     */
    public void setMntryVal(ESMAPositiveExcludingZeroMax18 value) {
        this.mntryVal = value;
    }

}
