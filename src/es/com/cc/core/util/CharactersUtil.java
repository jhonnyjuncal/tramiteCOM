package es.com.cc.core.util;

public class CharactersUtil {
	
	/**
	 * Patrones de ESMA
	 */
	public static final String ESMA_AlphaNumericCapitalLettersMax35_Pattern = "([A-Z]|[0-9]){1,35}";
	public static final String ESMA_AlphaNumericMax52_Pattern = "([A-Z]|[0-9]){1,52}";
	public static final String MICIdentifier = "[A-Z0-9]{4,4}";
	public static final String CountryCode = "[A-Z]{2,2}";
	public static final String ESMA_ISODate = "####-##-##T##:##:######Z";
	public static final String ActiveOrHistoricCurrencyCode = "[A-Z]{3,3}";
	
	/**
	 * Mapa de decimales ESMA
	 */
	public static final Integer[] ESMA_NonNegativeExcludingZeroMax18 = new Integer[]{17, 1};
	public static final Integer[] ESMA_PositiveExcludingZeroMax18_SimpleType = new Integer[] {5, 13};
	
}
