package es.com.cc.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.RegulatoryTradingCapacity1Code;
import es.com.cc.core.schema.all.SecuritiesTransaction11;
import es.com.cc.core.schema.all.VariationType1Code;
import es.com.cc.core.util.DateUtil;

public class TransaccionPanel extends JPanel {
	
	private static final long serialVersionUID = -7813145032830198693L;
	
	private JTextField tradDtField;
	private JTextField netAmtField;
	private JTextField tradVnField;
	private JTextField ctryOfBrnchField;
	private JTextField tradPlcMtchgIdField;
	private JTextField cmplxTradCmpntIdField;
	private JButton btnAceptar;
	private JButton btnCancelar;
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
		setPreferredSize(new Dimension(730, 370));
		
		JLabel lblNewLabel_6 = new JLabel("Transaccion");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 11, 200, 14);
		add(lblNewLabel_6);
		
		JLabel lblTraddt = new JLabel("TradDt");
		lblTraddt.setBounds(20, 36, 80, 14);
		add(lblTraddt);
		
		JLabel lblTradgcpcty = new JLabel("TradgCpcty");
		lblTradgcpcty.setBounds(380, 35, 90, 14);
		add(lblTradgcpcty);
		
		tradDtField = new JTextField();
		tradDtField.setBounds(110, 33, 200, 20);
		add(tradDtField);
		tradDtField.setColumns(10);
		
		qtyPanel = new QuantityPanel();
		qtyPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		qtyPanel.setBounds(10, 60, 354, 122);
		add(qtyPanel);
		
		panelPrecio = new PrecioPanel();
		panelPrecio.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelPrecio.setBounds(10, 190, 354, 122);
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
		lblNewLabel_7.setBounds(380, 261, 80, 14);
		add(lblNewLabel_7);
		
		tradVnField = new JTextField();
		tradVnField.setBounds(478, 258, 200, 20);
		add(tradVnField);
		tradVnField.setColumns(10);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(10, 323, 704, 33);
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
		
		panelUpFrntPmt = new UpFrntPmtPanel();
		panelUpFrntPmt.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelUpFrntPmt.setSize(340, 60);
		panelUpFrntPmt.setLocation(380, 165);
		add(panelUpFrntPmt);
		
		JLabel lblNewLabel_2 = new JLabel("TradPlcMtchgId");
		lblNewLabel_2.setBounds(380, 135, 80, 14);
		add(lblNewLabel_2);
		
		tradPlcMtchgIdField = new JTextField();
		tradPlcMtchgIdField.setBounds(478, 132, 200, 20);
		add(tradPlcMtchgIdField);
		tradPlcMtchgIdField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CmplxTradCmpntId");
		lblNewLabel_3.setBounds(380, 236, 100, 14);
		add(lblNewLabel_3);
		
		cmplxTradCmpntIdField = new JTextField();
		cmplxTradCmpntIdField.setBounds(478, 233, 200, 20);
		add(cmplxTradCmpntIdField);
		cmplxTradCmpntIdField.setColumns(10);
		
		tradgCpctycomboBox = new JComboBox<String>();
		tradgCpctycomboBox.setBounds(478, 32, 200, 20);
		add(tradgCpctycomboBox);
		
		JComboBox<String> derivComboBox = new JComboBox<String>();
		derivComboBox.setBounds(478, 57, 200, 20);
		add(derivComboBox);
		tradgCpctycomboBox.addItem("AOTC");
		tradgCpctycomboBox.addItem("DEAL");
		tradgCpctycomboBox.addItem("MTCH");

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
