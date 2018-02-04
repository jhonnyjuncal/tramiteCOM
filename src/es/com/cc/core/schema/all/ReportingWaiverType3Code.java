//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.04 a las 10:16:02 PM CET 
//


package es.com.cc.core.schema.all;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReportingWaiverType3Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportingWaiverType3Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BENC"/>
 *     &lt;enumeration value="ACTX"/>
 *     &lt;enumeration value="ILQD"/>
 *     &lt;enumeration value="SIZE"/>
 *     &lt;enumeration value="CANC"/>
 *     &lt;enumeration value="AMND"/>
 *     &lt;enumeration value="SDIV"/>
 *     &lt;enumeration value="RPRI"/>
 *     &lt;enumeration value="DUPL"/>
 *     &lt;enumeration value="LRGS"/>
 *     &lt;enumeration value="TNCP"/>
 *     &lt;enumeration value="TPAC"/>
 *     &lt;enumeration value="XFPH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportingWaiverType3Code")
@XmlEnum
public enum ReportingWaiverType3Code {


    /**
     * Benchmark transaction.
     * 
     */
    BENC,

    /**
     * Agency cross transaction.
     * 
     */
    ACTX,

    /**
     * Pre-trade waiver was for an illiquid instrument transaction. Applicable to non-equity instruments.
     * 
     */
    ILQD,

    /**
     * Pre-trade waiver was for an above specific size transaction. Applicable to non-equity instruments.
     * 
     */
    SIZE,

    /**
     * Cancellations.
     * 
     */
    CANC,

    /**
     * Amendments
     * 
     */
    AMND,

    /**
     * Special dividend transactions.
     * 
     */
    SDIV,

    /**
     * Transactions which have received price improvement. Applicable to equity instruments.
     * 
     */
    RPRI,

    /**
     * Duplicative trade reports
     * 
     */
    DUPL,

    /**
     * Large-in-scale transactions.  Applicable for all instruments.
     * 
     */
    LRGS,

    /**
     * Transactions not contributing to the price discovery process for the purposes of Article 23 of Regulation (EU) No 600/2014
     * 
     */
    TNCP,

    /**
     * Package transaction
     * 
     */
    TPAC,

    /**
     * Transaction where the contract  on a commodity is exchanged for the actual physical good.
     * 
     */
    XFPH;

    public String value() {
        return name();
    }

    public static ReportingWaiverType3Code fromValue(String v) {
        return valueOf(v);
    }

}
