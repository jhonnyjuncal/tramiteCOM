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
 * Set of elements used to identify a person or an organisation.
 * 
 * <p>Clase Java para PartyIdentification76__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentification76__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}PersonOrOrganisation1Choice__1"/>
 *         &lt;element name="CtryOfBrnch" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}CountryCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification76__1", propOrder = {
    "id",
    "ctryOfBrnch"
})
public class PartyIdentification761 {

    @XmlElement(name = "Id", required = true)
    protected PersonOrOrganisation1Choice1 id;
    @XmlElement(name = "CtryOfBrnch")
    protected String ctryOfBrnch;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link PersonOrOrganisation1Choice1 }
     *     
     */
    public PersonOrOrganisation1Choice1 getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonOrOrganisation1Choice1 }
     *     
     */
    public void setId(PersonOrOrganisation1Choice1 value) {
        this.id = value;
    }

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

}
