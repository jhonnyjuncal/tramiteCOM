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
 * Details of the securities transaction report.
 * 
 * <p>Clase Java para SecuritiesTransactionReport4__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTransactionReport4__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ESMA_AlphaNumericMax52_Pattern"/>
 *         &lt;element name="ExctgPty" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}LEIIdentifier"/>
 *         &lt;element name="InvstmtPtyInd" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}TrueFalseIndicator"/>
 *         &lt;element name="SubmitgPty" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}LEIIdentifier"/>
 *         &lt;element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}PartyIdentification79__1"/>
 *         &lt;element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}PartyIdentification79__1"/>
 *         &lt;element name="OrdrTrnsmssn" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}SecuritiesTransactionTransmission2"/>
 *         &lt;element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}SecuritiesTransaction1__1"/>
 *         &lt;element name="FinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}FinancialInstrumentAttributes3Choice__1"/>
 *         &lt;element name="InvstmtDcsnPrsn" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}InvestmentParty1Choice__1" minOccurs="0"/>
 *         &lt;element name="ExctgPrsn" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ExecutingParty1Choice__1"/>
 *         &lt;element name="AddtlAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}SecuritiesTransactionIndicator2__1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionReport4__1", propOrder = {
    "txId",
    "exctgPty",
    "invstmtPtyInd",
    "submitgPty",
    "buyr",
    "sellr",
    "ordrTrnsmssn",
    "tx",
    "finInstrm",
    "invstmtDcsnPrsn",
    "exctgPrsn",
    "addtlAttrbts"
})
public class SecuritiesTransactionReport41 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "ExctgPty", required = true)
    protected String exctgPty;
    @XmlElement(name = "InvstmtPtyInd")
    protected boolean invstmtPtyInd;
    @XmlElement(name = "SubmitgPty", required = true)
    protected String submitgPty;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentification791 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification791 sellr;
    @XmlElement(name = "OrdrTrnsmssn", required = true)
    protected SecuritiesTransactionTransmission2 ordrTrnsmssn;
    @XmlElement(name = "Tx", required = true)
    protected SecuritiesTransaction11 tx;
    @XmlElement(name = "FinInstrm", required = true)
    protected FinancialInstrumentAttributes3Choice1 finInstrm;
    @XmlElement(name = "InvstmtDcsnPrsn")
    protected InvestmentParty1Choice1 invstmtDcsnPrsn;
    @XmlElement(name = "ExctgPrsn", required = true)
    protected ExecutingParty1Choice1 exctgPrsn;
    @XmlElement(name = "AddtlAttrbts", required = true)
    protected SecuritiesTransactionIndicator21 addtlAttrbts;

    /**
     * Obtiene el valor de la propiedad txId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Define el valor de la propiedad txId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Obtiene el valor de la propiedad exctgPty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExctgPty() {
        return exctgPty;
    }

    /**
     * Define el valor de la propiedad exctgPty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExctgPty(String value) {
        this.exctgPty = value;
    }

    /**
     * Obtiene el valor de la propiedad invstmtPtyInd.
     * 
     */
    public boolean isInvstmtPtyInd() {
        return invstmtPtyInd;
    }

    /**
     * Define el valor de la propiedad invstmtPtyInd.
     * 
     */
    public void setInvstmtPtyInd(boolean value) {
        this.invstmtPtyInd = value;
    }

    /**
     * Obtiene el valor de la propiedad submitgPty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitgPty() {
        return submitgPty;
    }

    /**
     * Define el valor de la propiedad submitgPty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitgPty(String value) {
        this.submitgPty = value;
    }

    /**
     * Obtiene el valor de la propiedad buyr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification791 }
     *     
     */
    public PartyIdentification791 getBuyr() {
        return buyr;
    }

    /**
     * Define el valor de la propiedad buyr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification791 }
     *     
     */
    public void setBuyr(PartyIdentification791 value) {
        this.buyr = value;
    }

    /**
     * Obtiene el valor de la propiedad sellr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification791 }
     *     
     */
    public PartyIdentification791 getSellr() {
        return sellr;
    }

    /**
     * Define el valor de la propiedad sellr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification791 }
     *     
     */
    public void setSellr(PartyIdentification791 value) {
        this.sellr = value;
    }

    /**
     * Obtiene el valor de la propiedad ordrTrnsmssn.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionTransmission2 }
     *     
     */
    public SecuritiesTransactionTransmission2 getOrdrTrnsmssn() {
        return ordrTrnsmssn;
    }

    /**
     * Define el valor de la propiedad ordrTrnsmssn.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionTransmission2 }
     *     
     */
    public void setOrdrTrnsmssn(SecuritiesTransactionTransmission2 value) {
        this.ordrTrnsmssn = value;
    }

    /**
     * Obtiene el valor de la propiedad tx.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransaction11 }
     *     
     */
    public SecuritiesTransaction11 getTx() {
        return tx;
    }

    /**
     * Define el valor de la propiedad tx.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransaction11 }
     *     
     */
    public void setTx(SecuritiesTransaction11 value) {
        this.tx = value;
    }

    /**
     * Obtiene el valor de la propiedad finInstrm.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes3Choice1 }
     *     
     */
    public FinancialInstrumentAttributes3Choice1 getFinInstrm() {
        return finInstrm;
    }

    /**
     * Define el valor de la propiedad finInstrm.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes3Choice1 }
     *     
     */
    public void setFinInstrm(FinancialInstrumentAttributes3Choice1 value) {
        this.finInstrm = value;
    }

    /**
     * Obtiene el valor de la propiedad invstmtDcsnPrsn.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentParty1Choice1 }
     *     
     */
    public InvestmentParty1Choice1 getInvstmtDcsnPrsn() {
        return invstmtDcsnPrsn;
    }

    /**
     * Define el valor de la propiedad invstmtDcsnPrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentParty1Choice1 }
     *     
     */
    public void setInvstmtDcsnPrsn(InvestmentParty1Choice1 value) {
        this.invstmtDcsnPrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad exctgPrsn.
     * 
     * @return
     *     possible object is
     *     {@link ExecutingParty1Choice1 }
     *     
     */
    public ExecutingParty1Choice1 getExctgPrsn() {
        return exctgPrsn;
    }

    /**
     * Define el valor de la propiedad exctgPrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutingParty1Choice1 }
     *     
     */
    public void setExctgPrsn(ExecutingParty1Choice1 value) {
        this.exctgPrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlAttrbts.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionIndicator21 }
     *     
     */
    public SecuritiesTransactionIndicator21 getAddtlAttrbts() {
        return addtlAttrbts;
    }

    /**
     * Define el valor de la propiedad addtlAttrbts.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionIndicator21 }
     *     
     */
    public void setAddtlAttrbts(SecuritiesTransactionIndicator21 value) {
        this.addtlAttrbts = value;
    }

}
