package es.com.cc.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtil {
	
	public static XMLGregorianCalendar convertToXmlGregorianCalendar(String value) {
		XMLGregorianCalendar xmlCalendar = null;
		
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");
			Date date = formatter.parse(value);
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
			
		} catch (DatatypeConfigurationException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xmlCalendar;
	}
}
