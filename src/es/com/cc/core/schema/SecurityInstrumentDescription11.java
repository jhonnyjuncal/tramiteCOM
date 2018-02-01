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
 * Identifies the security instrument by its name and typical characteristics.
 * 
 * <p>Clase Java para SecurityInstrumentDescription11 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecurityInstrumentDescription11">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ISINOct2015Identifier" minOccurs="0"/>
 *         &lt;element name="FullNm" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}Max350Text"/>
 *         &lt;element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}CFIOct2015Identifier"/>
 *         &lt;element name="NtnlCcy" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityInstrumentDescription11", propOrder = {
    "id",
    "fullNm",
    "clssfctnTp",
    "ntnlCcy"
})
public class SecurityInstrumentDescription11 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "FullNm", required = true)
    protected String fullNm;
    @XmlElement(name = "ClssfctnTp", required = true)
    protected String clssfctnTp;
    @XmlElement(name = "NtnlCcy")
    protected String ntnlCcy;

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
     * Obtiene el valor de la propiedad fullNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNm() {
        return fullNm;
    }

    /**
     * Define el valor de la propiedad fullNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNm(String value) {
        this.fullNm = value;
    }

    /**
     * Obtiene el valor de la propiedad clssfctnTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Define el valor de la propiedad clssfctnTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClssfctnTp(String value) {
        this.clssfctnTp = value;
    }

    /**
     * Obtiene el valor de la propiedad ntnlCcy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcy() {
        return ntnlCcy;
    }

    /**
     * Define el valor de la propiedad ntnlCcy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtnlCcy(String value) {
        this.ntnlCcy = value;
    }

}
