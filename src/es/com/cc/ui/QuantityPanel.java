package es.com.cc.ui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import es.com.cc.core.schema.all.ESMAPositiveExcludingZeroMax18;
import es.com.cc.core.schema.all.FinancialInstrumentQuantity25Choice1;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.util.CharactersUtil;
import es.com.cc.core.util.esma.DecimalFormatter;
import es.com.cc.core.util.esma.TextFormatter;

public class QuantityPanel extends JPanel {

	private static final long serialVersionUID = 7693260638964038663L;
	
	private JFormattedTextField unidadesField;
	private JFormattedTextField ccyField;
	private JFormattedTextField valueField;
	private JRadioButton radioUnit;
	private JRadioButton radioNominal;
	private JRadioButton radioMonetario;
	
	private JPanel panelUnidades;
	private JPanel panelNominal;
	private JPanel panelRadios;

	/**
	 * Create the panel.
	 */
	public QuantityPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(299, 94));
		
		panelRadios = new JPanel();
		panelRadios.setBounds(1, 1, 298, 33);
		add(panelRadios);
		
		radioUnit = new JRadioButton("Unit");
		panelRadios.add(radioUnit);
		radioUnit.setSelected(true);
		radioUnit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				muestraPanelMonetario(0);
			}
		});
		
		radioNominal = new JRadioButton("NmnlVal");
		panelRadios.add(radioNominal);
		radioNominal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				muestraPanelMonetario(1);
			}
		});
		
		radioMonetario = new JRadioButton("MntryVal");
		panelRadios.add(radioMonetario);
		radioMonetario.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				muestraPanelMonetario(2);
			}
		});
		
		ButtonGroup group = new ButtonGroup();
	    group.add(radioUnit);
	    group.add(radioNominal);
	    group.add(radioMonetario);
		
	    /**
	     * ***************************************************************************************************************
	     * panel de unidades
	     */
		panelUnidades = new JPanel();
		panelUnidades.setBounds(1, 32, 298, 59);
		add(panelUnidades);
		panelUnidades.setPreferredSize(new Dimension(100, 50));
		panelUnidades.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Unidades");
		lblNewLabel.setBounds(10, 11, 70, 14);
		panelUnidades.add(lblNewLabel);
		
		DecimalFormatter df1 = new DecimalFormatter(CharactersUtil.ESMA_NonNegativeExcludingZeroMax18);
		unidadesField = new JFormattedTextField(df1.getDecimalFormat());
		unidadesField.setBounds(90, 8, 200, 20);
		panelUnidades.add(unidadesField);
		unidadesField.setColumns(10);
		
		/**
		 * ***************************************************************************************************************
		 * panel valor nominal y valor monetario
		 */
		panelNominal = new JPanel();
		panelNominal.setBounds(1, 32, 298, 59);
		panelNominal.setPreferredSize(new Dimension(100, 50));
		add(panelNominal);
		panelNominal.setLayout(null);
		panelNominal.setVisible(false);
		
		JLabel lblNewLabel2 = new JLabel("Moneda");
		lblNewLabel2.setBounds(10, 11, 80, 14);
		panelNominal.add(lblNewLabel2);
		
		ccyField = new JFormattedTextField(new TextFormatter(CharactersUtil.ActiveOrHistoricCurrencyCode));
		ccyField.setBounds(90, 8, 200, 20);
		panelNominal.add(ccyField);
		ccyField.setColumns(10);
		
		lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setBounds(10, 36, 46, 14);
		panelNominal.add(lblNewLabel);
		
		DecimalFormatter df2 = new DecimalFormatter(CharactersUtil.ESMA_PositiveExcludingZeroMax18_SimpleType);
		valueField = new JFormattedTextField(df2.getDecimalFormat());
		valueField.setBounds(90, 33, 200, 20);
		panelNominal.add(valueField);
		valueField.setColumns(10);
	}
	
	public FinancialInstrumentQuantity25Choice1 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		FinancialInstrumentQuantity25Choice1 fiQty = factory.createFinancialInstrumentQuantity25Choice1();
		
		if (radioUnit.isSelected()) {
			fiQty.setUnit(new BigDecimal(unidadesField.getText()));
			
		} else if (radioNominal.isSelected()) {
			ESMAPositiveExcludingZeroMax18 zeroMax18 = factory.createESMAPositiveExcludingZeroMax18();
			zeroMax18.setCcy(ccyField.getText());
			zeroMax18.setValue(new BigDecimal(valueField.getText()));
			fiQty.setNmnlVal(zeroMax18);
			
		} else if (radioMonetario.isSelected()) {
			ESMAPositiveExcludingZeroMax18 zeroMax18 = factory.createESMAPositiveExcludingZeroMax18();
			zeroMax18.setCcy(ccyField.getText());
			zeroMax18.setValue(new BigDecimal(valueField.getText()));
			fiQty.setMntryVal(zeroMax18);
		}
		
		return fiQty;
	}
	
	private void muestraPanelMonetario(int posicion) {
		switch (posicion) {
			case 0:
				panelUnidades.setVisible(true);
				panelNominal.setVisible(false);
				break;
				
			case 1:
			case 2:
				panelUnidades.setVisible(false);
				panelNominal.setVisible(true);
				break;
		}
	}
}
