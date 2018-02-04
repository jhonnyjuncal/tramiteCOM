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
 * Identifies the security instrument by its name and typical characteristics.
 * 
 * <p>Clase Java para SecurityInstrumentDescription13__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecurityInstrumentDescription13__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinInstrmGnlAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}SecurityInstrumentDescription11"/>
 *         &lt;element name="DebtInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}DebtInstrument4" minOccurs="0"/>
 *         &lt;element name="DerivInstrmAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}DerivativeInstrument6__1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityInstrumentDescription13__1", propOrder = {
    "finInstrmGnlAttrbts",
    "debtInstrmAttrbts",
    "derivInstrmAttrbts"
})
public class SecurityInstrumentDescription131 {

    @XmlElement(name = "FinInstrmGnlAttrbts", required = true)
    protected SecurityInstrumentDescription11 finInstrmGnlAttrbts;
    @XmlElement(name = "DebtInstrmAttrbts")
    protected DebtInstrument4 debtInstrmAttrbts;
    @XmlElement(name = "DerivInstrmAttrbts", required = true)
    protected DerivativeInstrument61 derivInstrmAttrbts;

    /**
     * Obtiene el valor de la propiedad finInstrmGnlAttrbts.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInstrumentDescription11 }
     *     
     */
    public SecurityInstrumentDescription11 getFinInstrmGnlAttrbts() {
        return finInstrmGnlAttrbts;
    }

    /**
     * Define el valor de la propiedad finInstrmGnlAttrbts.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInstrumentDescription11 }
     *     
     */
    public void setFinInstrmGnlAttrbts(SecurityInstrumentDescription11 value) {
        this.finInstrmGnlAttrbts = value;
    }

    /**
     * Obtiene el valor de la propiedad debtInstrmAttrbts.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrument4 }
     *     
     */
    public DebtInstrument4 getDebtInstrmAttrbts() {
        return debtInstrmAttrbts;
    }

    /**
     * Define el valor de la propiedad debtInstrmAttrbts.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrument4 }
     *     
     */
    public void setDebtInstrmAttrbts(DebtInstrument4 value) {
        this.debtInstrmAttrbts = value;
    }

    /**
     * Obtiene el valor de la propiedad derivInstrmAttrbts.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInstrument61 }
     *     
     */
    public DerivativeInstrument61 getDerivInstrmAttrbts() {
        return derivInstrmAttrbts;
    }

    /**
     * Define el valor de la propiedad derivInstrmAttrbts.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInstrument61 }
     *     
     */
    public void setDerivInstrmAttrbts(DerivativeInstrument61 value) {
        this.derivInstrmAttrbts = value;
    }

}
