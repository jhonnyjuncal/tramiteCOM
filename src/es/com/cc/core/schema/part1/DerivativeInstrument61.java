//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.04 a las 06:39:56 PM CET 
//


package es.com.cc.core.schema.part1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Specifies the derivative instrument.
 * 
 * <p>Clase Java para DerivativeInstrument6__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DerivativeInstrument6__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ISODate" minOccurs="0"/>
 *         &lt;element name="PricMltplr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ESMA_NonNegativeExcludingZeroMax18"/>
 *         &lt;element name="UndrlygInstrm" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}UnderlyingIdentification2Choice__1"/>
 *         &lt;element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}OptionType2Code" minOccurs="0"/>
 *         &lt;element name="StrkPric" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}SecuritiesTransactionPrice4Choice__1" minOccurs="0"/>
 *         &lt;element name="OptnExrcStyle" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}OptionStyle7Code" minOccurs="0"/>
 *         &lt;element name="DlvryTp" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}PhysicalTransferType4Code"/>
 *         &lt;element name="AsstClssSpcfcAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}AssetClassAttributes1Choice__1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeInstrument6__1", propOrder = {
    "xpryDt",
    "pricMltplr",
    "undrlygInstrm",
    "optnTp",
    "strkPric",
    "optnExrcStyle",
    "dlvryTp",
    "asstClssSpcfcAttrbts"
})
public class DerivativeInstrument61 {

    @XmlElement(name = "XpryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "PricMltplr", required = true)
    protected BigDecimal pricMltplr;
    @XmlElement(name = "UndrlygInstrm", required = true)
    protected UnderlyingIdentification2Choice1 undrlygInstrm;
    @XmlElement(name = "OptnTp")
    @XmlSchemaType(name = "string")
    protected OptionType2Code optnTp;
    @XmlElement(name = "StrkPric")
    protected SecuritiesTransactionPrice4Choice1 strkPric;
    @XmlElement(name = "OptnExrcStyle")
    @XmlSchemaType(name = "string")
    protected OptionStyle7Code optnExrcStyle;
    @XmlElement(name = "DlvryTp", required = true)
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType4Code dlvryTp;
    @XmlElement(name = "AsstClssSpcfcAttrbts")
    protected AssetClassAttributes1Choice1 asstClssSpcfcAttrbts;

    /**
     * Obtiene el valor de la propiedad xpryDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Define el valor de la propiedad xpryDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
    }

    /**
     * Obtiene el valor de la propiedad pricMltplr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricMltplr() {
        return pricMltplr;
    }

    /**
     * Define el valor de la propiedad pricMltplr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricMltplr(BigDecimal value) {
        this.pricMltplr = value;
    }

    /**
     * Obtiene el valor de la propiedad undrlygInstrm.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingIdentification2Choice1 }
     *     
     */
    public UnderlyingIdentification2Choice1 getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Define el valor de la propiedad undrlygInstrm.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingIdentification2Choice1 }
     *     
     */
    public void setUndrlygInstrm(UnderlyingIdentification2Choice1 value) {
        this.undrlygInstrm = value;
    }

    /**
     * Obtiene el valor de la propiedad optnTp.
     * 
     * @return
     *     possible object is
     *     {@link OptionType2Code }
     *     
     */
    public OptionType2Code getOptnTp() {
        return optnTp;
    }

    /**
     * Define el valor de la propiedad optnTp.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType2Code }
     *     
     */
    public void setOptnTp(OptionType2Code value) {
        this.optnTp = value;
    }

    /**
     * Obtiene el valor de la propiedad strkPric.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice4Choice1 }
     *     
     */
    public SecuritiesTransactionPrice4Choice1 getStrkPric() {
        return strkPric;
    }

    /**
     * Define el valor de la propiedad strkPric.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice4Choice1 }
     *     
     */
    public void setStrkPric(SecuritiesTransactionPrice4Choice1 value) {
        this.strkPric = value;
    }

    /**
     * Obtiene el valor de la propiedad optnExrcStyle.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle7Code }
     *     
     */
    public OptionStyle7Code getOptnExrcStyle() {
        return optnExrcStyle;
    }

    /**
     * Define el valor de la propiedad optnExrcStyle.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle7Code }
     *     
     */
    public void setOptnExrcStyle(OptionStyle7Code value) {
        this.optnExrcStyle = value;
    }

    /**
     * Obtiene el valor de la propiedad dlvryTp.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public PhysicalTransferType4Code getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Define el valor de la propiedad dlvryTp.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public void setDlvryTp(PhysicalTransferType4Code value) {
        this.dlvryTp = value;
    }

    /**
     * Obtiene el valor de la propiedad asstClssSpcfcAttrbts.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassAttributes1Choice1 }
     *     
     */
    public AssetClassAttributes1Choice1 getAsstClssSpcfcAttrbts() {
        return asstClssSpcfcAttrbts;
    }

    /**
     * Define el valor de la propiedad asstClssSpcfcAttrbts.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassAttributes1Choice1 }
     *     
     */
    public void setAsstClssSpcfcAttrbts(AssetClassAttributes1Choice1 value) {
        this.asstClssSpcfcAttrbts = value;
    }

}
