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
 * Choice element capturing strike price related descriptive information.
 * 
 * <p>Clase Java para SecuritiesTransactionPrice4Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTransactionPrice4Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}SecuritiesTransactionPrice2Choice"/>
 *         &lt;element name="NoPric" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}SecuritiesTransactionPrice1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice4Choice", propOrder = {
    "pric",
    "noPric"
})
public class SecuritiesTransactionPrice4Choice {

    @XmlElement(name = "Pric")
    protected SecuritiesTransactionPrice2Choice pric;
    @XmlElement(name = "NoPric")
    protected SecuritiesTransactionPrice1 noPric;

    /**
     * Obtiene el valor de la propiedad pric.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getPric() {
        return pric;
    }

    /**
     * Define el valor de la propiedad pric.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public void setPric(SecuritiesTransactionPrice2Choice value) {
        this.pric = value;
    }

    /**
     * Obtiene el valor de la propiedad noPric.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice1 }
     *     
     */
    public SecuritiesTransactionPrice1 getNoPric() {
        return noPric;
    }

    /**
     * Define el valor de la propiedad noPric.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice1 }
     *     
     */
    public void setNoPric(SecuritiesTransactionPrice1 value) {
        this.noPric = value;
    }

}
