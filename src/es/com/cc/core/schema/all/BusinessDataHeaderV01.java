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
 * <p>Clase Java para BusinessDataHeaderV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessDataHeaderV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:head.003.001.01}BusinessApplicationHeaderEnvelope"/>
 *         &lt;element name="Pyld" type="{urn:iso:std:iso:20022:tech:xsd:head.003.001.01}StrictPayload"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDataHeaderV01", namespace = "urn:iso:std:iso:20022:tech:xsd:head.003.001.01", propOrder = {
    "hdr",
    "pyld"
})
public class BusinessDataHeaderV01 {

    @XmlElement(name = "Hdr", required = true)
    protected BusinessApplicationHeaderEnvelope hdr;
    @XmlElement(name = "Pyld", required = true)
    protected StrictPayload pyld;

    /**
     * Obtiene el valor de la propiedad hdr.
     * 
     * @return
     *     possible object is
     *     {@link BusinessApplicationHeaderEnvelope }
     *     
     */
    public BusinessApplicationHeaderEnvelope getHdr() {
        return hdr;
    }

    /**
     * Define el valor de la propiedad hdr.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessApplicationHeaderEnvelope }
     *     
     */
    public void setHdr(BusinessApplicationHeaderEnvelope value) {
        this.hdr = value;
    }

    /**
     * Obtiene el valor de la propiedad pyld.
     * 
     * @return
     *     possible object is
     *     {@link StrictPayload }
     *     
     */
    public StrictPayload getPyld() {
        return pyld;
    }

    /**
     * Define el valor de la propiedad pyld.
     * 
     * @param value
     *     allowed object is
     *     {@link StrictPayload }
     *     
     */
    public void setPyld(StrictPayload value) {
        this.pyld = value;
    }

}
