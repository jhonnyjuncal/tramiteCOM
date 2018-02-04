//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.04 a las 06:39:56 PM CET 
//


package es.com.cc.core.schema.part1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReportingWaiverType1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportingWaiverType1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OILQ"/>
 *     &lt;enumeration value="NLIQ"/>
 *     &lt;enumeration value="PRIC"/>
 *     &lt;enumeration value="ILQD"/>
 *     &lt;enumeration value="RFPT"/>
 *     &lt;enumeration value="SIZE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportingWaiverType1Code")
@XmlEnum
public enum ReportingWaiverType1Code {


    /**
     * Pre-trade waiver was for a negotiated transaction in illiquid financial instruments. Applicable to equity instruments.
     * 
     */
    OILQ,

    /**
     * Pre-trade waiver was for a negotiated transaction in liquid financial instruments. Applicable to equity instruments.
     * 
     */
    NLIQ,

    /**
     * Pre-trade waiver was for a negotiated transaction subject to conditions other than the current market price of that financial instruments. Applicable to equity instruments.
     * 
     */
    PRIC,

    /**
     * Pre-trade waiver was for an illiquid instrument transaction. Applicable to non-equity instruments.
     * 
     */
    ILQD,

    /**
     * Pre-trade waiver was for a reference price transaction. Applicable to equity instruments.
     * 
     */
    RFPT,

    /**
     * Pre-trade waiver was for an above specific size transaction. Applicable to non-equity instruments.
     * 
     */
    SIZE;

    public String value() {
        return name();
    }

    public static ReportingWaiverType1Code fromValue(String v) {
        return valueOf(v);
    }

}
