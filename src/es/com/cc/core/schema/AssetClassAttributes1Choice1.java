//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.01.29 a las 12:13:04 PM CET 
//


package es.com.cc.core.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Asset class specific details of a derivative.
 * 
 * <p>Clase Java para AssetClassAttributes1Choice__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AssetClassAttributes1Choice__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}DerivativeInterest2"/>
 *         &lt;element name="FX" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}DerivativeForeignExchange2"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassAttributes1Choice__1", propOrder = {
    "intrst",
    "fx"
})
public class AssetClassAttributes1Choice1 {

    @XmlElement(name = "Intrst")
    protected DerivativeInterest2 intrst;
    @XmlElement(name = "FX")
    protected DerivativeForeignExchange2 fx;

    /**
     * Obtiene el valor de la propiedad intrst.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeInterest2 }
     *     
     */
    public DerivativeInterest2 getIntrst() {
        return intrst;
    }

    /**
     * Define el valor de la propiedad intrst.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeInterest2 }
     *     
     */
    public void setIntrst(DerivativeInterest2 value) {
        this.intrst = value;
    }

    /**
     * Obtiene el valor de la propiedad fx.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeForeignExchange2 }
     *     
     */
    public DerivativeForeignExchange2 getFX() {
        return fx;
    }

    /**
     * Define el valor de la propiedad fx.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeForeignExchange2 }
     *     
     */
    public void setFX(DerivativeForeignExchange2 value) {
        this.fx = value;
    }

}
