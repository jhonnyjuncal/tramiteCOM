//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.04 a las 10:16:02 PM CET 
//


package es.com.cc.core.schema.all;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides additional indicators on the transaction.
 * 
 * <p>Clase Java para SecuritiesTransactionIndicator2__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTransactionIndicator2__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WvrInd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ReportingWaiverType1Code" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="ShrtSellgInd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}Side5Code" minOccurs="0"/>
 *         &lt;element name="OTCPstTradInd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ReportingWaiverType3Code" maxOccurs="13" minOccurs="0"/>
 *         &lt;element name="RskRdcgTx" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         &lt;element name="SctiesFincgTxInd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}TrueFalseIndicator"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionIndicator2__1", propOrder = {
    "wvrInd",
    "shrtSellgInd",
    "otcPstTradInd",
    "rskRdcgTx",
    "sctiesFincgTxInd"
})
public class SecuritiesTransactionIndicator21 {

    @XmlElement(name = "WvrInd")
    @XmlSchemaType(name = "string")
    protected List<ReportingWaiverType1Code> wvrInd;
    @XmlElement(name = "ShrtSellgInd")
    @XmlSchemaType(name = "string")
    protected Side5Code shrtSellgInd;
    @XmlElement(name = "OTCPstTradInd")
    @XmlSchemaType(name = "string")
    protected List<ReportingWaiverType3Code> otcPstTradInd;
    @XmlElement(name = "RskRdcgTx")
    protected Boolean rskRdcgTx;
    @XmlElement(name = "SctiesFincgTxInd")
    protected boolean sctiesFincgTxInd;

    /**
     * Gets the value of the wvrInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wvrInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWvrInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingWaiverType1Code }
     * 
     * 
     */
    public List<ReportingWaiverType1Code> getWvrInd() {
        if (wvrInd == null) {
            wvrInd = new ArrayList<ReportingWaiverType1Code>();
        }
        return this.wvrInd;
    }

    /**
     * Obtiene el valor de la propiedad shrtSellgInd.
     * 
     * @return
     *     possible object is
     *     {@link Side5Code }
     *     
     */
    public Side5Code getShrtSellgInd() {
        return shrtSellgInd;
    }

    /**
     * Define el valor de la propiedad shrtSellgInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Side5Code }
     *     
     */
    public void setShrtSellgInd(Side5Code value) {
        this.shrtSellgInd = value;
    }

    /**
     * Gets the value of the otcPstTradInd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otcPstTradInd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOTCPstTradInd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingWaiverType3Code }
     * 
     * 
     */
    public List<ReportingWaiverType3Code> getOTCPstTradInd() {
        if (otcPstTradInd == null) {
            otcPstTradInd = new ArrayList<ReportingWaiverType3Code>();
        }
        return this.otcPstTradInd;
    }

    /**
     * Obtiene el valor de la propiedad rskRdcgTx.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRskRdcgTx() {
        return rskRdcgTx;
    }

    /**
     * Define el valor de la propiedad rskRdcgTx.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRskRdcgTx(Boolean value) {
        this.rskRdcgTx = value;
    }

    /**
     * Obtiene el valor de la propiedad sctiesFincgTxInd.
     * 
     */
    public boolean isSctiesFincgTxInd() {
        return sctiesFincgTxInd;
    }

    /**
     * Define el valor de la propiedad sctiesFincgTxInd.
     * 
     */
    public void setSctiesFincgTxInd(boolean value) {
        this.sctiesFincgTxInd = value;
    }

}
