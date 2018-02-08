package es.com.cc.ui;

import java.awt.Font;
import java.math.BigDecimal;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import es.com.cc.core.schema.all.FinancialInstrumentQuantity25Choice1;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.RegulatoryTradingCapacity1Code;
import es.com.cc.core.schema.all.SecuritiesTransaction11;
import es.com.cc.core.util.DateUtil;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class TransaccionPanel extends JPanel {
	
	private static final long serialVersionUID = -7813145032830198693L;
	private JTextField tradDtField;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField netAmtField;
	private JTextField tradVnField;
	
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JTextField ctryOfBrnchField;
	private JTextField textField;
	private JTextField tradPlcMtchgIdField;
	private JTextField cmplxTradCmpntIdField;
	
	private JComboBox<String> tradgCpctycomboBox;

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
		lblTradgcpcty.setBounds(391, 35, 80, 14);
		add(lblTradgcpcty);
		
		tradDtField = new JTextField();
		tradDtField.setBounds(126, 32, 200, 20);
		add(tradDtField);
		tradDtField.setColumns(10);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setBounds(36, 60, 80, 14);
		add(lblQty);
		
		textField_6 = new JTextField();
		textField_6.setBounds(126, 57, 200, 20);
		add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDerivntnlchng = new JLabel("DerivNtnlChng");
		lblDerivntnlchng.setBounds(391, 60, 80, 14);
		add(lblDerivntnlchng);
		
		textField_7 = new JTextField();
		textField_7.setBounds(478, 57, 200, 20);
		add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblPric = new JLabel("Pric");
		lblPric.setBounds(36, 85, 80, 14);
		add(lblPric);
		
		textField_8 = new JTextField();
		textField_8.setBounds(126, 82, 200, 20);
		add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNetamt = new JLabel("NetAmt");
		lblNetamt.setBounds(391, 85, 80, 14);
		add(lblNetamt);
		
		netAmtField = new JTextField();
		netAmtField.setBounds(478, 82, 200, 20);
		add(netAmtField);
		netAmtField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("TradVn");
		lblNewLabel_7.setBounds(36, 110, 80, 14);
		add(lblNewLabel_7);
		
		tradVnField = new JTextField();
		tradVnField.setBounds(126, 107, 200, 20);
		add(tradVnField);
		tradVnField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 228, 704, 33);
		add(panel);
		
		btnAceptar = new JButton("Aceptar");
		panel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		panel.add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("CtryOfBrnch");
		lblNewLabel.setBounds(391, 110, 80, 14);
		add(lblNewLabel);
		
		ctryOfBrnchField = new JTextField();
		ctryOfBrnchField.setBounds(478, 107, 200, 20);
		add(ctryOfBrnchField);
		ctryOfBrnchField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("UpFrntPmt");
		lblNewLabel_1.setBounds(36, 135, 80, 14);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(126, 132, 200, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("TradPlcMtchgId");
		lblNewLabel_2.setBounds(391, 135, 80, 14);
		add(lblNewLabel_2);
		
		tradPlcMtchgIdField = new JTextField();
		tradPlcMtchgIdField.setBounds(478, 132, 200, 20);
		add(tradPlcMtchgIdField);
		tradPlcMtchgIdField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("CmplxTradCmpntId");
		lblNewLabel_3.setBounds(36, 160, 80, 14);
		add(lblNewLabel_3);
		
		cmplxTradCmpntIdField = new JTextField();
		cmplxTradCmpntIdField.setBounds(126, 157, 200, 20);
		add(cmplxTradCmpntIdField);
		cmplxTradCmpntIdField.setColumns(10);
		
		tradgCpctycomboBox = new JComboBox<String>();
		tradgCpctycomboBox.setBounds(481, 32, 197, 20);
		add(tradgCpctycomboBox);
		tradgCpctycomboBox.addItem("");
		tradgCpctycomboBox.addItem("");
		tradgCpctycomboBox.addItem("");
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
		
		QuantityPanel qtyPanel = new QuantityPanel();
		
		txData.setQty(qtyPanel.getDatosIntroducidos());
		txData.setDerivNtnlChng();
		txData.setPric();
		txData.setNetAmt(new BigDecimal(netAmtField.getText()));
		txData.setTradVn(tradVnField.getText());
		txData.setCtryOfBrnch(ctryOfBrnchField.getText());
		txData.setUpFrntPmt();
		txData.setTradPlcMtchgId(tradPlcMtchgIdField.getText());
		txData.setCmplxTradCmpntId(cmplxTradCmpntIdField.getText());
		
		return txData;
	}
}
