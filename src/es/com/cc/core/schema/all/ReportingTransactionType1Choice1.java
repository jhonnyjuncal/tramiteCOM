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
 * Choice between a new or a cancellation transaction.
 * 
 * <p>Clase Java para ReportingTransactionType1Choice__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReportingTransactionType1Choice__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="New" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}SecuritiesTransactionReport4__1"/>
 *         &lt;element name="Cxl" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}SecuritiesTransactionReport2__1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingTransactionType1Choice__1", propOrder = {
    "_new",
    "cxl"
})
public class ReportingTransactionType1Choice1 {

    @XmlElement(name = "New")
    protected SecuritiesTransactionReport41 _new;
    @XmlElement(name = "Cxl")
    protected SecuritiesTransactionReport21 cxl;

    /**
     * Obtiene el valor de la propiedad new.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionReport41 }
     *     
     */
    public SecuritiesTransactionReport41 getNew() {
        return _new;
    }

    /**
     * Define el valor de la propiedad new.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionReport41 }
     *     
     */
    public void setNew(SecuritiesTransactionReport41 value) {
        this._new = value;
    }

    /**
     * Obtiene el valor de la propiedad cxl.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionReport21 }
     *     
     */
    public SecuritiesTransactionReport21 getCxl() {
        return cxl;
    }

    /**
     * Define el valor de la propiedad cxl.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionReport21 }
     *     
     */
    public void setCxl(SecuritiesTransactionReport21 value) {
        this.cxl = value;
    }

}
