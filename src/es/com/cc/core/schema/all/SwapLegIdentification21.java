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
 * Details of the legs of swap transaction.
 * 
 * <p>Clase Java para SwapLegIdentification2__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SwapLegIdentification2__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SwpIn" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}FinancialInstrumentIdentification7Choice" minOccurs="0"/>
 *         &lt;element name="SwpOut" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}FinancialInstrumentIdentification7Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwapLegIdentification2__1", propOrder = {
    "swpIn",
    "swpOut"
})
public class SwapLegIdentification21 {

    @XmlElement(name = "SwpIn")
    protected FinancialInstrumentIdentification7Choice swpIn;
    @XmlElement(name = "SwpOut")
    protected FinancialInstrumentIdentification7Choice swpOut;

    /**
     * Obtiene el valor de la propiedad swpIn.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public FinancialInstrumentIdentification7Choice getSwpIn() {
        return swpIn;
    }

    /**
     * Define el valor de la propiedad swpIn.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public void setSwpIn(FinancialInstrumentIdentification7Choice value) {
        this.swpIn = value;
    }

    /**
     * Obtiene el valor de la propiedad swpOut.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public FinancialInstrumentIdentification7Choice getSwpOut() {
        return swpOut;
    }

    /**
     * Define el valor de la propiedad swpOut.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification7Choice }
     *     
     */
    public void setSwpOut(FinancialInstrumentIdentification7Choice value) {
        this.swpOut = value;
    }

}
