//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.04 a las 06:41:21 PM CET 
//


package es.com.cc.core.schema.part2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.com.cc.core.schema package. 
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

    private final static QName _AppHdr_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:head.001.001.01", "AppHdr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.com.cc.core.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusinessApplicationHeaderV01 }
     * 
     */
    public BusinessApplicationHeaderV01 createBusinessApplicationHeaderV01() {
        return new BusinessApplicationHeaderV01();
    }

    /**
     * Create an instance of {@link OrganisationIdentificationSchemeName1Choice }
     * 
     */
    public OrganisationIdentificationSchemeName1Choice createOrganisationIdentificationSchemeName1Choice() {
        return new OrganisationIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification421 }
     * 
     */
    public PartyIdentification421 createPartyIdentification421() {
        return new PartyIdentification421();
    }

    /**
     * Create an instance of {@link Party9Choice1 }
     * 
     */
    public Party9Choice1 createParty9Choice1() {
        return new Party9Choice1();
    }

    /**
     * Create an instance of {@link GenericOrganisationIdentification11 }
     * 
     */
    public GenericOrganisationIdentification11 createGenericOrganisationIdentification11() {
        return new GenericOrganisationIdentification11();
    }

    /**
     * Create an instance of {@link BusinessApplicationHeader11 }
     * 
     */
    public BusinessApplicationHeader11 createBusinessApplicationHeader11() {
        return new BusinessApplicationHeader11();
    }

    /**
     * Create an instance of {@link OrganisationIdentification71 }
     * 
     */
    public OrganisationIdentification71 createOrganisationIdentification71() {
        return new OrganisationIdentification71();
    }

    /**
     * Create an instance of {@link Party10Choice1 }
     * 
     */
    public Party10Choice1 createParty10Choice1() {
        return new Party10Choice1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessApplicationHeaderV01 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:head.001.001.01", name = "AppHdr")
    public JAXBElement<BusinessApplicationHeaderV01> createAppHdr(BusinessApplicationHeaderV01 value) {
        return new JAXBElement<BusinessApplicationHeaderV01>(_AppHdr_QNAME, BusinessApplicationHeaderV01 .class, null, value);
    }

}
