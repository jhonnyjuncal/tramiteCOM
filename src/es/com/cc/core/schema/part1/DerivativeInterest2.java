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
 * Specifies a multi-leg interest derivative.
 * 
 * <p>Clase Java para DerivativeInterest2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DerivativeInterest2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OthrNtnlCcy" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ActiveOrHistoricCurrencyCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeInterest2", propOrder = {
    "othrNtnlCcy"
})
public class DerivativeInterest2 {

    @XmlElement(name = "OthrNtnlCcy", required = true)
    protected String othrNtnlCcy;

    /**
     * Obtiene el valor de la propiedad othrNtnlCcy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrNtnlCcy() {
        return othrNtnlCcy;
    }

    /**
     * Define el valor de la propiedad othrNtnlCcy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrNtnlCcy(String value) {
        this.othrNtnlCcy = value;
    }

}
