package es.com.cc.core.util.esma;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

public class DecimalFormatter implements Serializable {

	private static final long serialVersionUID = -4655337605689308171L;
	
	private Integer[] mapaValores;
	
	public DecimalFormatter(Integer[] mapaValores) {
		this.mapaValores = mapaValores;
	}

	public DecimalFormat getDecimalFormat() {
		NumberFormat nf1 = NumberFormat.getNumberInstance();
	    DecimalFormat df1 = (DecimalFormat)nf1;
	    df1.setMaximumFractionDigits(mapaValores[0]);
	    df1.setMaximumIntegerDigits(mapaValores[1]);
	    df1.setMinimumFractionDigits(0);
	    df1.setMinimumIntegerDigits(1);
	    
	    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
	    decimalFormatSymbols.setDecimalSeparator('.');
	    df1.setDecimalFormatSymbols(decimalFormatSymbols);
	    
	    return df1;
	}

}
