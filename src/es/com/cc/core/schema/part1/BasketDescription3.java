//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.04 a las 06:39:56 PM CET 
//


package es.com.cc.core.schema.part1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the constituents of the basket.
 * 
 * <p>Clase Java para BasketDescription3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BasketDescription3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}ISINOct2015Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Indx" type="{urn:iso:std:iso:20022:tech:xsd:DRAFT15auth.016.001.01}FinancialInstrument58" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketDescription3", propOrder = {
    "isin",
    "indx"
})
public class BasketDescription3 {

    @XmlElement(name = "ISIN")
    protected List<String> isin;
    @XmlElement(name = "Indx")
    protected List<FinancialInstrument58> indx;

    /**
     * Gets the value of the isin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getISIN() {
        if (isin == null) {
            isin = new ArrayList<String>();
        }
        return this.isin;
    }

    /**
     * Gets the value of the indx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument58 }
     * 
     * 
     */
    public List<FinancialInstrument58> getIndx() {
        if (indx == null) {
            indx = new ArrayList<FinancialInstrument58>();
        }
        return this.indx;
    }

}
