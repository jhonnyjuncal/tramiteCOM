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
 * <p>Clase Java para OptionStyle7Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionStyle7Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AMER"/>
 *     &lt;enumeration value="ASIA"/>
 *     &lt;enumeration value="BERM"/>
 *     &lt;enumeration value="EURO"/>
 *     &lt;enumeration value="OTHR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptionStyle7Code")
@XmlEnum
public enum OptionStyle7Code {


    /**
     * Option can be exercised before or on expiry date.
     * 
     */
    AMER,

    /**
     * Option where the payoff is not determined by the underlying price at maturity but by the average underlying price over some pre-set period of time.
     * 
     */
    ASIA,

    /**
     * Option that can be exercised on multiple discrete dates prior to, or on expiry date.
     * 
     */
    BERM,

    /**
     * Option that can be exercised on expiry date only.
     * 
     */
    EURO,

    /**
     * Other type of option style.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static OptionStyle7Code fromValue(String v) {
        return valueOf(v);
    }

}
