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
 * Specifies the attributes of the financial instrument.
 * 
 * <p>Clase Java para FinancialInstrumentAttributes3Choice__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstrumentAttributes3Choice__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ISINOct2015Identifier"/>
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}SecurityInstrumentDescription13__1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes3Choice__1", propOrder = {
    "id",
    "othr"
})
public class FinancialInstrumentAttributes3Choice1 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Othr")
    protected SecurityInstrumentDescription131 othr;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad othr.
     * 
     * @return
     *     possible object is
     *     {@link SecurityInstrumentDescription131 }
     *     
     */
    public SecurityInstrumentDescription131 getOthr() {
        return othr;
    }

    /**
     * Define el valor de la propiedad othr.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityInstrumentDescription131 }
     *     
     */
    public void setOthr(SecurityInstrumentDescription131 value) {
        this.othr = value;
    }

}
