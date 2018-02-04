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
 * <p>Clase Java para Side5Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Side5Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SESH"/>
 *     &lt;enumeration value="SELL"/>
 *     &lt;enumeration value="SSEX"/>
 *     &lt;enumeration value="UNDI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Side5Code")
@XmlEnum
public enum Side5Code {


    /**
     * An order to sell a security that the seller does not own; a sale effected by delivering a security borrowed by, or for the account of, the seller. Can only be executed on a plus or zero plus tick.
     * 
     */
    SESH,

    /**
     * Order is sell driven.
     * 
     */
    SELL,

    /**
     * Short sale exempt from short-sale rules.
     * 
     */
    SSEX,

    /**
     * The side of the indication of interest is not disclosed.
     * 
     */
    UNDI;

    public String value() {
        return name();
    }

    public static Side5Code fromValue(String v) {
        return valueOf(v);
    }

}
