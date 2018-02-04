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
 * <p>Clase Java para PhysicalTransferType4Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="PhysicalTransferType4Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PHYS"/>
 *     &lt;enumeration value="OPTL"/>
 *     &lt;enumeration value="CASH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhysicalTransferType4Code")
@XmlEnum
public enum PhysicalTransferType4Code {


    /**
     * Physical transfer.
     * 
     */
    PHYS,

    /**
     * Determined by a third party or optional for counterparty.
     * 
     */
    OPTL,

    /**
     * Cash transfer.
     * 
     */
    CASH;

    public String value() {
        return name();
    }

    public static PhysicalTransferType4Code fromValue(String v) {
        return valueOf(v);
    }

}
