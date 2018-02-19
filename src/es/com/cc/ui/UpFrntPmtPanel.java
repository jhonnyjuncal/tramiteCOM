package es.com.cc.ui;

import java.awt.Dimension;
import java.math.BigDecimal;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import es.com.cc.core.schema.all.ActiveOrHistoricCurrencyAndAmount;
import es.com.cc.core.schema.all.AmountAndDirection53;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.util.CurrencyUtils;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class UpFrntPmtPanel extends JPanel {

	private static final long serialVersionUID = 671485532901471783L;
	
	private JTextField upFrntPmtField;
	private JRadioButton radioSi;
	private JRadioButton radioNo;
	private JComboBox<String> ccyComboBox;

	/**
	 * Create the panel.
	 */
	public UpFrntPmtPanel() {
		setPreferredSize(new Dimension(298, 58));
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("UpFrntPmt");
		lblNewLabel_1.setBounds(10, 36, 57, 14);
		add(lblNewLabel_1);
		
		upFrntPmtField = new JTextField();
		upFrntPmtField.setBounds(77, 33, 211, 20);
		add(upFrntPmtField);
		upFrntPmtField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Signo");
		lblNewLabel.setBounds(10, 11, 46, 14);
		add(lblNewLabel);
		
		radioSi = new JRadioButton("Si");
		radioSi.setBounds(62, 7, 40, 23);
		add(radioSi);
		
		radioNo = new JRadioButton("No");
		radioNo.setBounds(104, 7, 40, 23);
		add(radioNo);
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(radioSi);
		grupo1.add(radioNo);
		
		JLabel lblNewLabel_2 = new JLabel("Ccy");
		lblNewLabel_2.setBounds(184, 11, 46, 14);
		add(lblNewLabel_2);
		
		ccyComboBox = new JComboBox<String>();
		ccyComboBox.setBounds(231, 8, 57, 20);
		add(ccyComboBox);
		cargaValoresDelComboCurrency();
		
	}
	
	private void cargaValoresDelComboCurrency() {
		for (String valor : CurrencyUtils.getComboCurrecyValues()) {
			ccyComboBox.addItem(valor);
		}
	}
	
	public AmountAndDirection53 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		
		ActiveOrHistoricCurrencyAndAmount active = factory.createActiveOrHistoricCurrencyAndAmount();
		active.setCcy(CurrencyUtils.getCurrencyFromCombo(ccyComboBox.getSelectedIndex()));
		active.setValue(new BigDecimal(upFrntPmtField.getText()));
		
		AmountAndDirection53 amtAndDir = factory.createAmountAndDirection53();
		amtAndDir.setAmt(active);
		
		if (radioSi.isSelected()) {
			amtAndDir.setSgn(true);
			
		} else if (radioNo.isSelected()) {
			amtAndDir.setSgn(false);
		}
		
		
		return amtAndDir;
	}
}
