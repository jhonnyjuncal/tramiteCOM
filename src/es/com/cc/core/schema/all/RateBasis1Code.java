//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.04 a las 10:16:02 PM CET 
//


package es.com.cc.core.schema.all;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RateBasis1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="RateBasis1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAYS"/>
 *     &lt;enumeration value="MNTH"/>
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="YEAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RateBasis1Code")
@XmlEnum
public enum RateBasis1Code {


    /**
     * Rate is reported in days.
     * 
     */
    DAYS,

    /**
     * Rate is reported in months.
     * 
     */
    MNTH,

    /**
     * Rate is reported in weeks.
     * 
     */
    WEEK,

    /**
     * Rate is reported in years.
     * 
     */
    YEAR;

    public String value() {
        return name();
    }

    public static RateBasis1Code fromValue(String v) {
        return valueOf(v);
    }

}