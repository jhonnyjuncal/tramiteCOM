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
 * <p>Clase Java para RegulatoryTradingCapacity1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RegulatoryTradingCapacity1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MTCH"/>
 *     &lt;enumeration value="DEAL"/>
 *     &lt;enumeration value="AOTC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegulatoryTradingCapacity1Code")
@XmlEnum
public enum RegulatoryTradingCapacity1Code {


    /**
     * Transaction was carried out as a matched principal trading under Article 4(38) of Directive 2014/65/EU.
     * 
     */
    MTCH,

    /**
     * Transaction was carried out as a deal under own account under Article 4(6) of Directive 2014/65/EU.
     * 
     */
    DEAL,

    /**
     * Transaction was carried out as an agent.
     * 
     */
    AOTC;

    public String value() {
        return name();
    }

    public static RegulatoryTradingCapacity1Code fromValue(String v) {
        return valueOf(v);
    }

}
