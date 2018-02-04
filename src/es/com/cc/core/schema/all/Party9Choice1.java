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
 * Identification of a person, an organisation or a financial institution.
 * 
 * <p>Clase Java para Party9Choice__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Party9Choice__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.01}PartyIdentification42__1"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party9Choice__1", namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", propOrder = {
    "orgId"
})
public class Party9Choice1 {

    @XmlElement(name = "OrgId")
    protected PartyIdentification421 orgId;

    /**
     * Obtiene el valor de la propiedad orgId.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification421 }
     *     
     */
    public PartyIdentification421 getOrgId() {
        return orgId;
    }

    /**
     * Define el valor de la propiedad orgId.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification421 }
     *     
     */
    public void setOrgId(PartyIdentification421 value) {
        this.orgId = value;
    }

}
