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
 * Specifies the identification of a person or an organisation.
 * 
 * <p>Clase Java para PersonOrOrganisation2Choice__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonOrOrganisation2Choice__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}LEIIdentifier"/>
 *         &lt;element name="Prsn" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}PersonIdentification10__1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonOrOrganisation2Choice__1", propOrder = {
    "lei",
    "prsn"
})
public class PersonOrOrganisation2Choice1 {

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "Prsn")
    protected PersonIdentification101 prsn;

    /**
     * Obtiene el valor de la propiedad lei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Define el valor de la propiedad lei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Obtiene el valor de la propiedad prsn.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification101 }
     *     
     */
    public PersonIdentification101 getPrsn() {
        return prsn;
    }

    /**
     * Define el valor de la propiedad prsn.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification101 }
     *     
     */
    public void setPrsn(PersonIdentification101 value) {
        this.prsn = value;
    }

}
