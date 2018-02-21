package es.com.cc.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

import com.sun.javafx.binding.StringFormatter;

import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.RegulatoryTradingCapacity1Code;
import es.com.cc.core.schema.all.SecuritiesTransaction11;
import es.com.cc.core.schema.all.VariationType1Code;
import es.com.cc.core.util.CharactersUtil;
import es.com.cc.core.util.DateUtil;
import es.com.cc.core.util.esma.TextFormatter;

import javax.swing.JFormattedTextField;

public class TransaccionPanel extends JPanel {
	
	private static final long serialVersionUID = -7813145032830198693L;
	private JFormattedTextField netAmtField;
	private JFormattedTextField tradVnField;
	private JFormattedTextField ctryOfBrnchField;
	private JFormattedTextField tradPlcMtchgIdField;
	private JFormattedTextField cmplxTradCmpntIdField;
	private JFormattedTextField tradDtField;
	private JComboBox<String> tradgCpctycomboBox;
	private JComboBox<String> derivNtnlChngComboBox;
	
	private QuantityPanel qtyPanel;
	private PrecioPanel panelPrecio;
	private UpFrntPmtPanel panelUpFrntPmt;

	/**
	 * Create the panel.
	 */
	public TransaccionPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(996, 233));
		
		JLabel lblNewLabel_6 = new JLabel("Transaccion");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(36, 11, 200, 14);
		add(lblNewLabel_6);
		
		JLabel lblTraddt = new JLabel("TradDt");
		lblTraddt.setBounds(20, 36, 80, 14);
		add(lblTraddt);
		
		JLabel lblTradgcpcty = new JLabel("TradgCpcty");
		lblTradgcpcty.setBounds(330, 36, 90, 14);
		add(lblTradgcpcty);
		
		qtyPanel = new QuantityPanel();
		qtyPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		qtyPanel.setBounds(10, 61, 300, 95);
		add(qtyPanel);
		
		panelPrecio = new PrecioPanel();
		panelPrecio.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPrecio.setBounds(686, 36, 300, 120);
		add(panelPrecio);
		
		JLabel lblDerivntnlchng = new JLabel("DerivNtnlChng");
		lblDerivntnlchng.setBounds(330, 60, 80, 14);
		add(lblDerivntnlchng);
		
		JLabel lblNetamt = new JLabel("NetAmt");
		lblNetamt.setBounds(330, 85, 80, 14);
		add(lblNetamt);
		
	    NumberFormat nf = NumberFormat.getNumberInstance();
	    DecimalFormat df = (DecimalFormat)nf;
	    df.applyPattern("#############.#####");
		netAmtField = new JFormattedTextField(df);
		netAmtField.setBounds(461, 82, 200, 20);
		add(netAmtField);
		netAmtField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("TradVn");
		lblNewLabel_7.setBounds(330, 186, 80, 14);
		add(lblNewLabel_7);
		
		tradVnField = new JFormattedTextField(new TextFormatter(CharactersUtil.MICIdentifier));
		tradVnField.setBounds(461, 183, 200, 20);
		add(tradVnField);
		tradVnField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CtryOfBrnch");
		lblNewLabel.setBounds(330, 110, 80, 14);
		add(lblNewLabel);
		
		ctryOfBrnchField = new JFormattedTextField(new TextFormatter(CharactersUtil.CountryCode));
		ctryOfBrnchField.setBounds(461, 107, 200, 20);
		add(ctryOfBrnchField);
		ctryOfBrnchField.setColumns(10);
		
		panelUpFrntPmt = new UpFrntPmtPanel();
		panelUpFrntPmt.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelUpFrntPmt.setSize(300, 60);
		panelUpFrntPmt.setLocation(686, 169);
		add(panelUpFrntPmt);
		
		JLabel lblNewLabel_2 = new JLabel("TradPlcMtchgId");
		lblNewLabel_2.setBounds(330, 135, 121, 14);
		add(lblNewLabel_2);
		
		tradPlcMtchgIdField = new JFormattedTextField(new TextFormatter(CharactersUtil.ESMA_AlphaNumericMax52_Pattern));
		tradPlcMtchgIdField.setColumns(52);
		tradPlcMtchgIdField.setBounds(461, 132, 200, 20);
		add(tradPlcMtchgIdField);
		
		JLabel lblNewLabel_3 = new JLabel("CmplxTradCmpntId");
		lblNewLabel_3.setBounds(330, 160, 121, 14);
		add(lblNewLabel_3);
		
		cmplxTradCmpntIdField = new JFormattedTextField(new TextFormatter(CharactersUtil.ESMA_AlphaNumericCapitalLettersMax35_Pattern));
		cmplxTradCmpntIdField.setBounds(461, 157, 200, 20);
		add(cmplxTradCmpntIdField);
		cmplxTradCmpntIdField.setColumns(10);
		
		tradgCpctycomboBox = new JComboBox<String>();
		tradgCpctycomboBox.setBounds(461, 33, 200, 20);
		add(tradgCpctycomboBox);
		tradgCpctycomboBox.addItem("AOTC");
		tradgCpctycomboBox.addItem("DEAL");
		tradgCpctycomboBox.addItem("MTCH");
		
		derivNtnlChngComboBox = new JComboBox<String>();
		derivNtnlChngComboBox.setBounds(461, 57, 200, 20);
		add(derivNtnlChngComboBox);
		derivNtnlChngComboBox.addItem("DECR");
		derivNtnlChngComboBox.addItem("INCR");
		
		try {
			MaskFormatter dateMask = new MaskFormatter(CharactersUtil.ESMA_ISODate);
			tradDtField = new JFormattedTextField(dateMask);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		tradDtField.setBounds(99, 33, 200, 20);
		add(tradDtField);

	}
	
	public SecuritiesTransaction11 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		SecuritiesTransaction11 txData = factory.createSecuritiesTransaction11();
		
		txData.setTradDt(DateUtil.convertToXmlGregorianCalendar(tradDtField.getText()));
		
		if (tradgCpctycomboBox.getSelectedIndex() == 0) {
			txData.setTradgCpcty(RegulatoryTradingCapacity1Code.AOTC);
			
		} else if (tradgCpctycomboBox.getSelectedIndex() == 1) {
			txData.setTradgCpcty(RegulatoryTradingCapacity1Code.DEAL);
			
		} else if (tradgCpctycomboBox.getSelectedIndex() == 2) {
			txData.setTradgCpcty(RegulatoryTradingCapacity1Code.MTCH);
		}
		
		txData.setQty(qtyPanel.getDatosIntroducidos());


		if (derivNtnlChngComboBox.getSelectedIndex() == 0) {
			txData.setDerivNtnlChng(VariationType1Code.DECR);
			
		} else if (derivNtnlChngComboBox.getSelectedIndex() == 1) {
			txData.setDerivNtnlChng(VariationType1Code.INCR);
		}
		
		txData.setPric(panelPrecio.getDatosIntroducidos());
		txData.setNetAmt(new BigDecimal(netAmtField.getText()));
		txData.setTradVn(tradVnField.getText());
		txData.setCtryOfBrnch(ctryOfBrnchField.getText());
		txData.setUpFrntPmt(panelUpFrntPmt.getDatosIntroducidos());
		txData.setTradPlcMtchgId(tradPlcMtchgIdField.getText());
		txData.setCmplxTradCmpntId(cmplxTradCmpntIdField.getText());
		
		return txData;
	}
}
