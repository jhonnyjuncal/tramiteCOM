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
 * Specifies the identification of a person.
 * 
 * <p>Clase Java para PersonIdentification12__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonIdentification12__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CtryOfBrnch" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}CountryCode"/>
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}GenericPersonIdentification1__1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification12__1", propOrder = {
    "ctryOfBrnch",
    "othr"
})
public class PersonIdentification121 {

    @XmlElement(name = "CtryOfBrnch", required = true)
    protected String ctryOfBrnch;
    @XmlElement(name = "Othr", required = true)
    protected GenericPersonIdentification11 othr;

    /**
     * Obtiene el valor de la propiedad ctryOfBrnch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfBrnch() {
        return ctryOfBrnch;
    }

    /**
     * Define el valor de la propiedad ctryOfBrnch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfBrnch(String value) {
        this.ctryOfBrnch = value;
    }

    /**
     * Obtiene el valor de la propiedad othr.
     * 
     * @return
     *     possible object is
     *     {@link GenericPersonIdentification11 }
     *     
     */
    public GenericPersonIdentification11 getOthr() {
        return othr;
    }

    /**
     * Define el valor de la propiedad othr.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPersonIdentification11 }
     *     
     */
    public void setOthr(GenericPersonIdentification11 value) {
        this.othr = value;
    }

}
