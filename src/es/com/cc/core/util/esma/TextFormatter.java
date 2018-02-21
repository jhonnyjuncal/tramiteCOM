package es.com.cc.core.util.esma;

import java.text.ParseException;
import javax.swing.JFormattedTextField.AbstractFormatter;

public class TextFormatter extends AbstractFormatter {

	private static final long serialVersionUID = 1903078556960062747L;
	
	private String pattern;
	
	public TextFormatter(String pattern) {
		this.pattern = pattern;
	}
	
	@Override
	public Object stringToValue(String text) throws ParseException {
		if (text != null) {
			
		}
		return (Object)text;
	}

	@Override
	public String valueToString(Object value) throws ParseException {
		boolean isValid = true;
		String validValue = "";
		
		if (value != null) {
			String val = ((String) value).toUpperCase();
			
			if (!val.matches(pattern)) {
				isValid = false;
			}
			
			if (isValid) {
				validValue = val;
			}
		}
		return validValue;
	}

}
