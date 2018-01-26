package es.com.cc.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.Source;

public class ValidateXml {

	public ValidateXml() {
		
	}
	
	public void validateXmlFromXsd_method_1(String ruta) {
		try {
			InputStream inputStream = getClass().getResourceAsStream("/es/com/cc/xsd/DRAFT15auth.016.001.01_ESMAUG_Reporting_1.0.3.xsd");
			
			Source xmlFile = new StreamSource(new File(ruta));
			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			
			String data = readFromInputStream(inputStream);
			Source[] xsd = new Source[] {new StreamSource(data)};
			
			Schema schema = schemaFactory.newSchema(xsd);
			Validator validator = schema.newValidator();
			validator.validate(xmlFile);
			
			System.out.println(xmlFile.getSystemId() + " is valid");
            
        } catch (SAXException | IOException ex) {
        	ex.printStackTrace();
//            System.out.println(ex.getMessage());
        }
	}
	
	public void validateXmlFromXsd_method_2(String ruta) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setValidating(false);
            factory.setNamespaceAware(true);

            SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            InputStream inputStream = getClass().getResourceAsStream("/es/com/cc/xsd/DRAFT15auth.016.001.01_ESMAUG_Reporting_1.0.3.xsd");
            String data = readFromInputStream(inputStream);
            
            factory.setSchema(schemaFactory.newSchema(new Source[] {new StreamSource(data)}));
            
            SAXParser parser = factory.newSAXParser();
            XMLReader reader = parser.getXMLReader();
            reader.setErrorHandler(new SimpleErrorHandler());
            
            reader.parse(new InputSource(ruta));
            
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            
        } catch (SAXException e) {
            e.printStackTrace();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	private String readFromInputStream(InputStream inputStream) throws IOException {
	    StringBuilder resultStringBuilder = new StringBuilder();
	    try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            resultStringBuilder.append(line).append("\n");
	        }
	    }
	  return resultStringBuilder.toString();
	}
}
