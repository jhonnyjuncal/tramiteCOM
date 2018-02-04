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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Unique and unambiguous way to identify a person.
 * 
 * <p>Clase Java para PersonIdentification10__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonIdentification10__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrstNm" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ESMA_EeaEuropeanAlphabetMax140_Pattern"/>
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ESMA_EeaEuropeanAlphabetMax140_Pattern"/>
 *         &lt;element name="BirthDt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ISODate"/>
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
@XmlType(name = "PersonIdentification10__1", propOrder = {
    "frstNm",
    "nm",
    "birthDt",
    "othr"
})
public class PersonIdentification101 {

    @XmlElement(name = "FrstNm", required = true)
    protected String frstNm;
    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "BirthDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "Othr", required = true)
    protected GenericPersonIdentification11 othr;

    /**
     * Obtiene el valor de la propiedad frstNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstNm() {
        return frstNm;
    }

    /**
     * Define el valor de la propiedad frstNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrstNm(String value) {
        this.frstNm = value;
    }

    /**
     * Obtiene el valor de la propiedad nm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Define el valor de la propiedad nm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Obtiene el valor de la propiedad birthDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Define el valor de la propiedad birthDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
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
