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
 * Choice between formats for the identification of the financial instruments.
 * 
 * <p>Clase Java para FinancialInstrumentIdentification6Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstrumentIdentification6Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ISINOct2015Identifier"/>
 *         &lt;element name="Indx" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}FinancialInstrument58"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentIdentification6Choice", propOrder = {
    "isin",
    "indx"
})
public class FinancialInstrumentIdentification6Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "Indx")
    protected FinancialInstrument58 indx;

    /**
     * Obtiene el valor de la propiedad isin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Define el valor de la propiedad isin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Obtiene el valor de la propiedad indx.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument58 }
     *     
     */
    public FinancialInstrument58 getIndx() {
        return indx;
    }

    /**
     * Define el valor de la propiedad indx.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument58 }
     *     
     */
    public void setIndx(FinancialInstrument58 value) {
        this.indx = value;
    }

}
