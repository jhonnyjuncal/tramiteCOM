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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Descriptive fields capturing where no strike price is known.
 * 
 * <p>Clase Java para SecuritiesTransactionPrice1__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTransactionPrice1__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}PriceStatus1Code__1"/>
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice1__1", propOrder = {
    "pdg",
    "ccy"
})
public class SecuritiesTransactionPrice11 {

    @XmlElement(name = "Pdg", required = true)
    @XmlSchemaType(name = "string")
    protected PriceStatus1Code1 pdg;
    @XmlElement(name = "Ccy")
    protected String ccy;

    /**
     * Obtiene el valor de la propiedad pdg.
     * 
     * @return
     *     possible object is
     *     {@link PriceStatus1Code1 }
     *     
     */
    public PriceStatus1Code1 getPdg() {
        return pdg;
    }

    /**
     * Define el valor de la propiedad pdg.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceStatus1Code1 }
     *     
     */
    public void setPdg(PriceStatus1Code1 value) {
        this.pdg = value;
    }

    /**
     * Obtiene el valor de la propiedad ccy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Define el valor de la propiedad ccy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

}
