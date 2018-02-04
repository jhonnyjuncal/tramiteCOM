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
 * Choice for identifying the underlying instruments that a derivative can consist of.
 * 
 * <p>Clase Java para FinancialInstrumentIdentification7Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstrumentIdentification7Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Sngl" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}FinancialInstrumentIdentification6Choice"/>
 *         &lt;element name="Bskt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}BasketDescription3"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentIdentification7Choice", propOrder = {
    "sngl",
    "bskt"
})
public class FinancialInstrumentIdentification7Choice {

    @XmlElement(name = "Sngl")
    protected FinancialInstrumentIdentification6Choice sngl;
    @XmlElement(name = "Bskt")
    protected BasketDescription3 bskt;

    /**
     * Obtiene el valor de la propiedad sngl.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification6Choice }
     *     
     */
    public FinancialInstrumentIdentification6Choice getSngl() {
        return sngl;
    }

    /**
     * Define el valor de la propiedad sngl.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification6Choice }
     *     
     */
    public void setSngl(FinancialInstrumentIdentification6Choice value) {
        this.sngl = value;
    }

    /**
     * Obtiene el valor de la propiedad bskt.
     * 
     * @return
     *     possible object is
     *     {@link BasketDescription3 }
     *     
     */
    public BasketDescription3 getBskt() {
        return bskt;
    }

    /**
     * Define el valor de la propiedad bskt.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketDescription3 }
     *     
     */
    public void setBskt(BasketDescription3 value) {
        this.bskt = value;
    }

}
