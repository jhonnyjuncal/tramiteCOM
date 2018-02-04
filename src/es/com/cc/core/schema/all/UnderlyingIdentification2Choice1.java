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
 * Details of the underlying of a security transaction.
 * 
 * <p>Clase Java para UnderlyingIdentification2Choice__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingIdentification2Choice__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Swp" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}SwapLegIdentification2__1"/>
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}FinancialInstrumentIdentification7Choice"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingIdentification2Choice__1", propOrder = {
    "swp",
    "othr"
})
public class UnderlyingIdentification2Choice1 {

    @XmlElement(name = "Swp")
    protected SwapLegIdentification21 swp;
    @XmlElement(name = "Othr")
    protected FinancialInstrumentIdentification7Choice othr;

    /**
     * Obtiene el valor de la propiedad swp.
     * 
     * @return
     *     possible object is
     *     {@link SwapLegIdentification21 }
     *     
     */
    public SwapLegIdentification21 getSwp() {
        return swp;
    }

    /**
     * Define el valor de la propiedad swp.
     * 
     * @param value
     *     allowed object is
     *     {@link SwapLegIdentification21 }
     *     
     */
    public void setSwp(SwapLegIdentification21 value) {
        this.swp = value;
    }

    /**
     * Obtiene el valor de la propiedad othr.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public FinancialInstrumentIdentification7Choice getOthr() {
        return othr;
    }

    /**
     * Define el valor de la propiedad othr.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public void setOthr(FinancialInstrumentIdentification7Choice value) {
        this.othr = value;
    }

}
