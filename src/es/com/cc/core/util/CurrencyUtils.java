package es.com.cc.core.util;

import java.util.Vector;

public class CurrencyUtils {
	
	private static Vector<String> currencyVector = new Vector<>();
	
	static {
		currencyVector.addElement("EUR");
		currencyVector.addElement("USD");
		currencyVector.addElement("LIB");
		currencyVector.addElement("YEN");
	}
	
	public static String getCurrencyFromCombo(int position) {
		return currencyVector.get(position);
	}
	
	public static Vector<String> getComboCurrecyValues() {
		return currencyVector;
	}
}
