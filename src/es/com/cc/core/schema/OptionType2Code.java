//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.01.29 a las 12:13:04 PM CET 
//


package es.com.cc.core.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OptionType2Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="OptionType2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CALL"/>
 *     &lt;enumeration value="PUTO"/>
 *     &lt;enumeration value="OTHR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OptionType2Code")
@XmlEnum
public enum OptionType2Code {


    /**
     * Right to buy a quantity of an asset for an agreed price at exercise date.
     * 
     */
    CALL,

    /**
     * Right to sell a quantity of an asset for an agreed price at exercise date.
     * 
     */
    PUTO,

    /**
     * Right where the holder of the option decides whether the option is put or call.
     * 
     */
    OTHR;

    public String value() {
        return name();
    }

    public static OptionType2Code fromValue(String v) {
        return valueOf(v);
    }

}
