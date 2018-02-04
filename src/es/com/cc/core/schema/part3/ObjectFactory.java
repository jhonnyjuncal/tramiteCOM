//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.04 a las 08:52:42 PM CET 
//


package es.com.cc.core.schema.part3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.com.cc.core.schema.part3 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BizData_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:head.003.001.01", "BizData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.com.cc.core.schema.part3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusinessDataHeaderV01 }
     * 
     */
    public BusinessDataHeaderV01 createBusinessDataHeaderV01() {
        return new BusinessDataHeaderV01();
    }

    /**
     * Create an instance of {@link BusinessApplicationHeaderEnvelope }
     * 
     */
    public BusinessApplicationHeaderEnvelope createBusinessApplicationHeaderEnvelope() {
        return new BusinessApplicationHeaderEnvelope();
    }

    /**
     * Create an instance of {@link StrictPayload }
     * 
     */
    public StrictPayload createStrictPayload() {
        return new StrictPayload();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessDataHeaderV01 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:head.003.001.01", name = "BizData")
    public JAXBElement<BusinessDataHeaderV01> createBizData(BusinessDataHeaderV01 value) {
        return new JAXBElement<BusinessDataHeaderV01>(_BizData_QNAME, BusinessDataHeaderV01 .class, null, value);
    }

}
