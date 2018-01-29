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
 * <p>Clase Java para Document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinInstrmRptgTxRpt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}FinancialInstrumentReportingTransactionReportV01"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "finInstrmRptgTxRpt"
})
public class Document {

    @XmlElement(name = "FinInstrmRptgTxRpt", required = true)
    protected FinancialInstrumentReportingTransactionReportV01 finInstrmRptgTxRpt;

    /**
     * Obtiene el valor de la propiedad finInstrmRptgTxRpt.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentReportingTransactionReportV01 }
     *     
     */
    public FinancialInstrumentReportingTransactionReportV01 getFinInstrmRptgTxRpt() {
        return finInstrmRptgTxRpt;
    }

    /**
     * Define el valor de la propiedad finInstrmRptgTxRpt.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentReportingTransactionReportV01 }
     *     
     */
    public void setFinInstrmRptgTxRpt(FinancialInstrumentReportingTransactionReportV01 value) {
        this.finInstrmRptgTxRpt = value;
    }

}
