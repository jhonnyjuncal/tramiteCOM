package es.com.cc.ui;

import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import es.com.cc.core.schema.all.ActiveCurrencyAnd13DecimalAmount;
import es.com.cc.core.schema.all.AmountAndDirection61;
import es.com.cc.core.schema.all.FinancialInstrumentQuantity25Choice1;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.PriceStatus1Code;
import es.com.cc.core.schema.all.RegulatoryTradingCapacity1Code;
import es.com.cc.core.schema.all.SecuritiesTransaction11;
import es.com.cc.core.schema.all.SecuritiesTransactionPrice1;
import es.com.cc.core.schema.all.SecuritiesTransactionPrice2Choice;
import es.com.cc.core.schema.all.SecuritiesTransactionPrice4Choice;
import es.com.cc.core.schema.all.VariationType1Code;
import es.com.cc.core.util.DateUtil;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTree;

public class TransaccionPanel extends JPanel {
	
	private static final long serialVersionUID = -7813145032830198693L;
	private JTextField tradDtField;
	private JTextField netAmtField;
	private JTextField tradVnField;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField ctryOfBrnchField;
	private JTextField textField;
	private JTextField tradPlcMtchgIdField;
	private JTextField cmplxTradCmpntIdField;
	private JComboBox<String> tradgCpctycomboBox;
	
	private QuantityPanel qtyPanel;
	private PrecioPanel panelPrecio;
	private JComboBox<String> derivNtnlChngComboBox;

	/**
	 * Create the panel.
	 */
	public TransaccionPanel() {
		setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Transaccion");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 11, 200, 14);
		add(lblNewLabel_6);
		
		JLabel lblTraddt = new JLabel("TradDt");
		lblTraddt.setBounds(36, 35, 80, 14);
		add(lblTraddt);
		
		JLabel lblTradgcpcty = new JLabel("TradgCpcty");
		lblTradgcpcty.setBounds(380, 35, 90, 14);
		add(lblTradgcpcty);
		
		tradDtField = new JTextField();
		tradDtField.setBounds(126, 32, 200, 20);
		add(tradDtField);
		tradDtField.setColumns(10);
		
		qtyPanel = new QuantityPanel();
		qtyPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		qtyPanel.setBounds(0, 57, 350, 94);
		add(qtyPanel);
		
		panelPrecio = new PrecioPanel();
		panelPrecio.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPrecio.setBounds(0, 152, 350, 94);
		add(panelPrecio);
		
		JLabel lblDerivntnlchng = new JLabel("DerivNtnlChng");
		lblDerivntnlchng.setBounds(380, 60, 80, 14);
		add(lblDerivntnlchng);
		
		JLabel lblNetamt = new JLabel("NetAmt");
		lblNetamt.setBounds(380, 85, 80, 14);
		add(lblNetamt);
		
		netAmtField = new JTextField();
		netAmtField.setBounds(478, 82, 200, 20);
		add(netAmtField);
		netAmtField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("TradVn");
		lblNewLabel_7.setBounds(380, 210, 80, 14);
		add(lblNewLabel_7);
		
		tradVnField = new JTextField();
		tradVnField.setBounds(478, 207, 200, 20);
		add(tradVnField);
		tradVnField.setColumns(10);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(10, 257, 704, 33);
		add(panelBotones);
		
		btnAceptar = new JButton("Aceptar");
		panelBotones.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		panelBotones.add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("CtryOfBrnch");
		lblNewLabel.setBounds(380, 110, 80, 14);
		add(lblNewLabel);
		
		ctryOfBrnchField = new JTextField();
		ctryOfBrnchField.setBounds(478, 107, 200, 20);
		add(ctryOfBrnchField);
		ctryOfBrnchField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("UpFrntPmt");
		lblNewLabel_1.setBounds(380, 160, 80, 14);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(478, 157, 200, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("TradPlcMtchgId");
		lblNewLabel_2.setBounds(380, 135, 80, 14);
		add(lblNewLabel_2);
		
		tradPlcMtchgIdField = new JTextField();
		tradPlcMtchgIdField.setBounds(478, 132, 200, 20);
		add(tradPlcMtchgIdField);
		tradPlcMtchgIdField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CmplxTradCmpntId");
		lblNewLabel_3.setBounds(380, 185, 100, 14);
		add(lblNewLabel_3);
		
		cmplxTradCmpntIdField = new JTextField();
		cmplxTradCmpntIdField.setBounds(478, 182, 200, 20);
		add(cmplxTradCmpntIdField);
		cmplxTradCmpntIdField.setColumns(10);
		
		tradgCpctycomboBox = new JComboBox<String>();
		tradgCpctycomboBox.setBounds(478, 32, 200, 20);
		add(tradgCpctycomboBox);
		tradgCpctycomboBox.addItem("AOTC");
		tradgCpctycomboBox.addItem("DEAL");
		tradgCpctycomboBox.addItem("MTCH");
<<<<<<< HEAD
=======
		
		derivNtnlChngComboBox = new JComboBox<String>();
		derivNtnlChngComboBox.setBounds(478, 57, 200, 20);
		add(derivNtnlChngComboBox);
		derivNtnlChngComboBox.addItem("DECR");
		derivNtnlChngComboBox.addItem("INCR");
>>>>>>> 1266036975a8eb3a2ed836ec3a68b999fe38cbdd
	}
	
	public JButton getBotonAceptar() {
		return btnAceptar;
	}
	
	public JButton getBotonCancelar() {
		return btnCancelar;
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
<<<<<<< HEAD
//		txData.setDerivNtnlChng();
//		txData.setPric();
=======
		
		if (derivNtnlChngComboBox.getSelectedIndex() == 0) {
			txData.setDerivNtnlChng(VariationType1Code.DECR);
			
		} else if (derivNtnlChngComboBox.getSelectedIndex() == 1) {
			txData.setDerivNtnlChng(VariationType1Code.INCR);
		}
		
		
		txData.setPric(panelPrecio.getDatosIntroducidos());
>>>>>>> 1266036975a8eb3a2ed836ec3a68b999fe38cbdd
		txData.setNetAmt(new BigDecimal(netAmtField.getText()));
		txData.setTradVn(tradVnField.getText());
		txData.setCtryOfBrnch(ctryOfBrnchField.getText());
//		txData.setUpFrntPmt();
		txData.setTradPlcMtchgId(tradPlcMtchgIdField.getText());
		txData.setCmplxTradCmpntId(cmplxTradCmpntIdField.getText());
		
		return txData;
	}
}
