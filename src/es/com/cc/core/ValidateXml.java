package es.com.cc.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.xml.sax.SAXException;

public class ValidateXml {

	public ValidateXml() {
		
	}
	
	public String validateContentXmlFromXsd(String ruta) {
		XsdErrorHandler errorHandler = null;
		
		try {
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			InputStream contenidoXsd = getClass().getResourceAsStream("/es/com/cc/xsd/DRAFT15auth.016.001.01_ESMAUG_Reporting_1.0.3.xsd");
			
			File ficheroCabecera = createFileFromInputStream(contenidoXsd);
			
	        Schema schema = factory.newSchema(ficheroCabecera);
	        Validator validator = schema.newValidator();
	        errorHandler = new XsdErrorHandler();
	        validator.setErrorHandler(errorHandler);
	        File ficheroEntrada = new File(ruta);
	        validator.validate(new StreamSource(ficheroEntrada));
	        return "fichero validado correctamente";
	        
		} catch (SAXException | IOException ex) {
        	ex.printStackTrace();
        	return errorHandler.getMensajeDeError();
        }
	}
	
	public String validateHeadXmlFromXsd(String ruta) {
		XsdErrorHandler errorHandler = null;
		
		try {
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			InputStream cabeceraXsd = getClass().getResourceAsStream("/es/com/cc/xsd/head.001.001.01_ESMAUG_1.0.0.xsd");
			
			File ficheroCabecera = createFileFromInputStream(cabeceraXsd);
			
	        Schema schema = factory.newSchema(ficheroCabecera);
	        Validator validator = schema.newValidator();
	        errorHandler = new XsdErrorHandler();
	        validator.setErrorHandler(errorHandler);
	        File ficheroEntrada = new File(ruta);
	        validator.validate(new StreamSource(ficheroEntrada));
	        return "fichero validado correctamente";
	        
		} catch (SAXException | IOException ex) {
        	ex.printStackTrace();
        	return errorHandler.getMensajeDeError();
        }
	}
	
	public String validateAllSchemas(String ruta) {
		XsdErrorHandler errorHandler = null;
		
		try {
			InputStream xsd1 = getClass().getResourceAsStream("/es/com/cc/xsd/head.003.001.01.xsd");
			InputStream xsd2 = getClass().getResourceAsStream("/es/com/cc/xsd/DRAFT15auth.016.001.01_ESMAUG_Reporting_1.0.3.xsd");
			InputStream xsd3 = getClass().getResourceAsStream("/es/com/cc/xsd/head.001.001.01_ESMAUG_1.0.0.xsd");
			
			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = schemaFactory.newSchema(new Source[] {
			    new StreamSource(xsd1), new StreamSource(xsd2), new StreamSource(xsd3)
			});
			
			
			
	        Validator validator = schema.newValidator();
	        errorHandler = new XsdErrorHandler();
	        validator.setErrorHandler(errorHandler);
	        File ficheroEntrada = new File(ruta);
	        validator.validate(new StreamSource(ficheroEntrada));
	        return "fichero validado correctamente";
	        
		} catch (SAXException | IOException ex) {
        	ex.printStackTrace();
        	return errorHandler.getMensajeDeError();
        }
	}
	
	private File createFileFromInputStream(InputStream initialStream) {
		File targetFile = null;
		
		try {
		    byte[] buffer = new byte[initialStream.available()];
		    initialStream.read(buffer);
				 
		    targetFile = new File("targetFile.tmp");
		    OutputStream outStream = new FileOutputStream(targetFile);
		    outStream.write(buffer);
		    
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return targetFile;
	}
}
