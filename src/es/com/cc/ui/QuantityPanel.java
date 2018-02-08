package es.com.cc.ui;

import javax.swing.JPanel;
import es.com.cc.core.schema.all.ESMAPositiveExcludingZeroMax18;
import es.com.cc.core.schema.all.FinancialInstrumentQuantity25Choice1;
import es.com.cc.core.schema.all.ObjectFactory;
import javax.swing.JRadioButton;
import java.math.BigDecimal;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class QuantityPanel extends JPanel {

	private static final long serialVersionUID = 7693260638964038663L;
	
	private JTextField unidadesField;
	private JTextField ccyField;
	private JRadioButton radioUnit;
	private JRadioButton radioNominal;
	private JRadioButton radioMonetario;
	private JTextField valueField;

	/**
	 * Create the panel.
	 */
	public QuantityPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 5, 330, 33);
		add(panel);
		
		radioUnit = new JRadioButton("Unit");
		panel.add(radioUnit);
		
		radioNominal = new JRadioButton("NmnlVal");
		panel.add(radioNominal);
		
		radioMonetario = new JRadioButton("MntryVal");
		panel.add(radioMonetario);
		
		ButtonGroup group = new ButtonGroup();
	    group.add(radioUnit);
	    group.add(radioNominal);
	    group.add(radioMonetario);
		
	    /**
	     * panel de unidades
	     */
		JPanel panelUnidades = new JPanel();
		panelUnidades.setBounds(10, 38, 330, 127);
		add(panelUnidades);
		panelUnidades.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Unidades");
		lblNewLabel.setBounds(10, 11, 80, 14);
		panelUnidades.add(lblNewLabel);
		
		unidadesField = new JTextField();
		unidadesField.setBounds(100, 8, 200, 20);
		panelUnidades.add(unidadesField);
		unidadesField.setColumns(10);
		
		/**
		 * panel valor nominal
		 */
		JPanel panelNominal = new JPanel();
		panelNominal.setBounds(10, 38, 330, 55);
		add(panelNominal);
		panelNominal.setLayout(null);
		
		JLabel lblNewLabel2 = new JLabel("Moneda");
		lblNewLabel2.setBounds(10, 11, 80, 14);
		panelNominal.add(lblNewLabel2);
		
		ccyField = new JTextField();
		ccyField.setBounds(100, 8, 200, 20);
		panelNominal.add(ccyField);
		ccyField.setColumns(10);
		
		lblNewLabel = new JLabel("Cantidad");
		lblNewLabel.setBounds(10, 36, 46, 14);
		panelNominal.add(lblNewLabel);
		
		valueField = new JTextField();
		valueField.setBounds(100, 33, 200, 20);
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
}
