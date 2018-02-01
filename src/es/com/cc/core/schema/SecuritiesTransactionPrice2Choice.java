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
import javax.xml.bind.annotation.XmlType;


/**
 * Choice to define the price of the securities transaction.
 * 
 * <p>Clase Java para SecuritiesTransactionPrice2Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTransactionPrice2Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="MntryVal" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}AmountAndDirection61"/>
 *         &lt;element name="Pctg" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}PercentageRate"/>
 *         &lt;element name="Yld" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}PercentageRate"/>
 *         &lt;element name="BsisPts" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}DecimalNumber"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice2Choice", propOrder = {
    "mntryVal",
    "pctg",
    "yld",
    "bsisPts"
})
public class SecuritiesTransactionPrice2Choice {

    @XmlElement(name = "MntryVal")
    protected AmountAndDirection61 mntryVal;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "Yld")
    protected BigDecimal yld;
    @XmlElement(name = "BsisPts")
    protected BigDecimal bsisPts;

    /**
     * Obtiene el valor de la propiedad mntryVal.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection61 }
     *     
     */
    public AmountAndDirection61 getMntryVal() {
        return mntryVal;
    }

    /**
     * Define el valor de la propiedad mntryVal.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection61 }
     *     
     */
    public void setMntryVal(AmountAndDirection61 value) {
        this.mntryVal = value;
    }

    /**
     * Obtiene el valor de la propiedad pctg.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Define el valor de la propiedad pctg.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctg(BigDecimal value) {
        this.pctg = value;
    }

    /**
     * Obtiene el valor de la propiedad yld.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYld() {
        return yld;
    }

    /**
     * Define el valor de la propiedad yld.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYld(BigDecimal value) {
        this.yld = value;
    }

    /**
     * Obtiene el valor de la propiedad bsisPts.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBsisPts() {
        return bsisPts;
    }

    /**
     * Define el valor de la propiedad bsisPts.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBsisPts(BigDecimal value) {
        this.bsisPts = value;
    }

}
