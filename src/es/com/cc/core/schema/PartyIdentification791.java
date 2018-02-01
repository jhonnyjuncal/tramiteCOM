//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.01.29 a las 12:13:04 PM CET 
//


package es.com.cc.core.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Set of elements used to identify an account owner and the associated decision maker.
 * 
 * <p>Clase Java para PartyIdentification79__1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentification79__1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}PartyIdentification76__1" maxOccurs="unbounded"/>
 *         &lt;element name="DcsnMakr" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}PersonOrOrganisation2Choice__1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification79__1", propOrder = {
    "acctOwnr",
    "dcsnMakr"
})
public class PartyIdentification791 {

    @XmlElement(name = "AcctOwnr", required = true)
    protected List<PartyIdentification761> acctOwnr;
    @XmlElement(name = "DcsnMakr")
    protected List<PersonOrOrganisation2Choice1> dcsnMakr;

    /**
     * Gets the value of the acctOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification761 }
     * 
     * 
     */
    public List<PartyIdentification761> getAcctOwnr() {
        if (acctOwnr == null) {
            acctOwnr = new ArrayList<PartyIdentification761>();
        }
        return this.acctOwnr;
    }

    /**
     * Gets the value of the dcsnMakr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dcsnMakr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDcsnMakr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonOrOrganisation2Choice1 }
     * 
     * 
     */
    public List<PersonOrOrganisation2Choice1> getDcsnMakr() {
        if (dcsnMakr == null) {
            dcsnMakr = new ArrayList<PersonOrOrganisation2Choice1>();
        }
        return this.dcsnMakr;
    }

}
