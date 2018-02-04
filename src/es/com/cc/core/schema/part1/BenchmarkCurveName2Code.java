//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.02.04 a las 06:39:56 PM CET 
//


package es.com.cc.core.schema.part1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BenchmarkCurveName2Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="BenchmarkCurveName2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WIBO"/>
 *     &lt;enumeration value="TREA"/>
 *     &lt;enumeration value="TIBO"/>
 *     &lt;enumeration value="TLBO"/>
 *     &lt;enumeration value="SWAP"/>
 *     &lt;enumeration value="STBO"/>
 *     &lt;enumeration value="PRBO"/>
 *     &lt;enumeration value="PFAN"/>
 *     &lt;enumeration value="NIBO"/>
 *     &lt;enumeration value="MAAA"/>
 *     &lt;enumeration value="MOSP"/>
 *     &lt;enumeration value="LIBO"/>
 *     &lt;enumeration value="LIBI"/>
 *     &lt;enumeration value="JIBA"/>
 *     &lt;enumeration value="ISDA"/>
 *     &lt;enumeration value="GCFR"/>
 *     &lt;enumeration value="FUSW"/>
 *     &lt;enumeration value="EUCH"/>
 *     &lt;enumeration value="EUUS"/>
 *     &lt;enumeration value="EURI"/>
 *     &lt;enumeration value="EONS"/>
 *     &lt;enumeration value="EONA"/>
 *     &lt;enumeration value="CIBO"/>
 *     &lt;enumeration value="CDOR"/>
 *     &lt;enumeration value="BUBO"/>
 *     &lt;enumeration value="BBSW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BenchmarkCurveName2Code")
@XmlEnum
public enum BenchmarkCurveName2Code {


    /**
     * Warsaw Interbank Offered Rate.
     * 
     */
    WIBO,

    /**
     * Treasury benchmark that comes in three types: the yield curve, the par curve, and the spot curve.  All curves also have a constituent time series.
     * 
     */
    TREA,

    /**
     * Tokyo Interbank Offered Rate.
     * 
     */
    TIBO,

    /**
     * Tel Aviv Interbank Offered Rate.
     * 
     */
    TLBO,

    /**
     * In curve construction, Swap is the long portion of the curve constituting about 3 years to 30 years term.
     * The exchange of one security, currency or interest rate for another to change the maturity (bonds), or quality of issues (stocks or bonds), or because investment objectives have changed.
     * 
     */
    SWAP,

    /**
     * Stockholm Interbank Offered Rate.
     * 
     */
    STBO,

    /**
     * Czech Fixing of Interest Rates on Interbank Deposits.
     * 
     */
    PRBO,

    /**
     * Pfandbriefe security is a collateralised bullet bond backed by either mortgage loans or loans to the public sector.  Pfandbriefe differ from traditional asset-backed securities in significant ways.  The most important difference is that Pfandbriefe carry no pre-payment risk since they remain on the balance sheet of the issuing institution.  Therefore, their spreads over sovereign bonds are attributable to liquidity and credit quality alone.  New indices have been created and existing indices have been modified in response to the growing importance of the Pfandbriefe market.  The Deutsche Borse has three synthetic indices called REX, JEX, and PEX.  The Pfandbriefe curve is used as a reference for credit as well as mortgage market.
     * 
     */
    PFAN,

    /**
     * Norwegian Interbank Offered Rate.
     * 
     */
    NIBO,

    /**
     * Benchmark curve used for municipals based on the best credit rating for municipal market debt.
     * 
     */
    MAAA,

    /**
     * Moscow Prime Offered Rate.
     * 
     */
    MOSP,

    /**
     * London Interbank Offered Rate, the interest rate that major international banks in London charge each other for borrowing.
     * 
     */
    LIBO,

    /**
     * Rate at which major international banks are willing to take deposits from one another, is normally 1/8 percent below LIBOR.
     * London InterBank Bid Rate, the rate bid by banks on Eurocurrency deposits; the international rate that banks lend to other banks.
     * 
     */
    LIBI,

    /**
     * Johannesburg Interbank Agreed Rate.
     * 
     */
    JIBA,

    /**
     * Worldwide common reference rate value for fixed interest rate swap rates, as defined by the International Swaps and Derivatives Association (ISDA).
     * 
     */
    ISDA,

    /**
     * GCF Repo Index, the Depository Trust & Clearing Corporation (DTCC) general collateral finance repurchase agreements index.
     * 
     */
    GCFR,

    /**
     * Portion of a synthetic curve that is composed of Eurodollar or Treasury or similar Futures and Swap rates.  The term usually begins at 3 months to 2 years for the futures strip component with the Swaps filling in the points to 10 years and beyond.
     * 
     */
    FUSW,

    /**
     * Swiss Franc LIBOR rate.
     * 
     */
    EUCH,

    /**
     * Rate for the eurodollars, time deposits denominated in U.S. dollars at banks outside the United States, and thus are not under the jurisdiction of the Federal Reserve.
     * 
     */
    EUUS,

    /**
     * Euro Interbank Offer Rate is the rate at which Euro inter-bank term deposits within the Euro zone are offered by one prime bank to another prime bank.
     * 
     */
    EURI,

    /**
     * Euro OverNight Index Average swap rate.
     * 
     */
    EONS,

    /**
     * Euro OverNight Index Average rate.
     * 
     */
    EONA,

    /**
     * Copenhagen Interbank Offered Rate.
     * 
     */
    CIBO,

    /**
     * Canadian Dollar Offered Rate.
     * 
     */
    CDOR,

    /**
     * Budapest Interbank Offered Rate.
     * 
     */
    BUBO,

    /**
     * Australian Financial Markets Association (AFMA) Bank-Bill Reference Rate (BBSW).
     * 
     */
    BBSW;

    public String value() {
        return name();
    }

    public static BenchmarkCurveName2Code fromValue(String v) {
        return valueOf(v);
    }

}
