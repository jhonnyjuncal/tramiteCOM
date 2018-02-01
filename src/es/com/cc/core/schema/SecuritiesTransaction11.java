//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.01.29 a las 12:13:04 PM CET 
//


package es.com.cc.core.schema;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Provides the details of the reported transaction.
 * 
 * <p>Clase Java para SecuritiesTransaction1__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTransaction1__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ISONormalisedDateTime"/>
 *         &lt;element name="TradgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}RegulatoryTradingCapacity1Code"/>
 *         &lt;element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}FinancialInstrumentQuantity25Choice__1"/>
 *         &lt;element name="DerivNtnlChng" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}VariationType1Code" minOccurs="0"/>
 *         &lt;element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}SecuritiesTransactionPrice4Choice"/>
 *         &lt;element name="NetAmt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="TradVn" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}MICIdentifier"/>
 *         &lt;element name="CtryOfBrnch" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}CountryCode" minOccurs="0"/>
 *         &lt;element name="UpFrntPmt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}AmountAndDirection53" minOccurs="0"/>
 *         &lt;element name="TradPlcMtchgId" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ESMA_AlphaNumericMax52_Pattern" minOccurs="0"/>
 *         &lt;element name="CmplxTradCmpntId" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ESMA_AlphaNumericCapitalLettersMax35_Pattern" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransaction1__1", propOrder = {
    "tradDt",
    "tradgCpcty",
    "qty",
    "derivNtnlChng",
    "pric",
    "netAmt",
    "tradVn",
    "ctryOfBrnch",
    "upFrntPmt",
    "tradPlcMtchgId",
    "cmplxTradCmpntId"
})
public class SecuritiesTransaction11 {

    @XmlElement(name = "TradDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "TradgCpcty", required = true)
    @XmlSchemaType(name = "string")
    protected RegulatoryTradingCapacity1Code tradgCpcty;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity25Choice1 qty;
    @XmlElement(name = "DerivNtnlChng")
    @XmlSchemaType(name = "string")
    protected VariationType1Code derivNtnlChng;
    @XmlElement(name = "Pric", required = true)
    protected SecuritiesTransactionPrice4Choice pric;
    @XmlElement(name = "NetAmt")
    protected BigDecimal netAmt;
    @XmlElement(name = "TradVn", required = true)
    protected String tradVn;
    @XmlElement(name = "CtryOfBrnch")
    protected String ctryOfBrnch;
    @XmlElement(name = "UpFrntPmt")
    protected AmountAndDirection53 upFrntPmt;
    @XmlElement(name = "TradPlcMtchgId")
    protected String tradPlcMtchgId;
    @XmlElement(name = "CmplxTradCmpntId")
    protected String cmplxTradCmpntId;

    /**
     * Obtiene el valor de la propiedad tradDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Define el valor de la propiedad tradDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
    }

    /**
     * Obtiene el valor de la propiedad tradgCpcty.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryTradingCapacity1Code }
     *     
     */
    public RegulatoryTradingCapacity1Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Define el valor de la propiedad tradgCpcty.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryTradingCapacity1Code }
     *     
     */
    public void setTradgCpcty(RegulatoryTradingCapacity1Code value) {
        this.tradgCpcty = value;
    }

    /**
     * Obtiene el valor de la propiedad qty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice1 }
     *     
     */
    public FinancialInstrumentQuantity25Choice1 getQty() {
        return qty;
    }

    /**
     * Define el valor de la propiedad qty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice1 }
     *     
     */
    public void setQty(FinancialInstrumentQuantity25Choice1 value) {
        this.qty = value;
    }

    /**
     * Obtiene el valor de la propiedad derivNtnlChng.
     * 
     * @return
     *     possible object is
     *     {@link VariationType1Code }
     *     
     */
    public VariationType1Code getDerivNtnlChng() {
        return derivNtnlChng;
    }

    /**
     * Define el valor de la propiedad derivNtnlChng.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationType1Code }
     *     
     */
    public void setDerivNtnlChng(VariationType1Code value) {
        this.derivNtnlChng = value;
    }

    /**
     * Obtiene el valor de la propiedad pric.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice4Choice }
     *     
     */
    public SecuritiesTransactionPrice4Choice getPric() {
        return pric;
    }

    /**
     * Define el valor de la propiedad pric.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice4Choice }
     *     
     */
    public void setPric(SecuritiesTransactionPrice4Choice value) {
        this.pric = value;
    }

    /**
     * Obtiene el valor de la propiedad netAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmt() {
        return netAmt;
    }

    /**
     * Define el valor de la propiedad netAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmt(BigDecimal value) {
        this.netAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad tradVn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradVn() {
        return tradVn;
    }

    /**
     * Define el valor de la propiedad tradVn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradVn(String value) {
        this.tradVn = value;
    }

    /**
     * Obtiene el valor de la propiedad ctryOfBrnch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfBrnch() {
        return ctryOfBrnch;
    }

    /**
     * Define el valor de la propiedad ctryOfBrnch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfBrnch(String value) {
        this.ctryOfBrnch = value;
    }

    /**
     * Obtiene el valor de la propiedad upFrntPmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getUpFrntPmt() {
        return upFrntPmt;
    }

    /**
     * Define el valor de la propiedad upFrntPmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public void setUpFrntPmt(AmountAndDirection53 value) {
        this.upFrntPmt = value;
    }

    /**
     * Obtiene el valor de la propiedad tradPlcMtchgId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradPlcMtchgId() {
        return tradPlcMtchgId;
    }

    /**
     * Define el valor de la propiedad tradPlcMtchgId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradPlcMtchgId(String value) {
        this.tradPlcMtchgId = value;
    }

    /**
     * Obtiene el valor de la propiedad cmplxTradCmpntId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmplxTradCmpntId() {
        return cmplxTradCmpntId;
    }

    /**
     * Define el valor de la propiedad cmplxTradCmpntId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmplxTradCmpntId(String value) {
        this.cmplxTradCmpntId = value;
    }

}
