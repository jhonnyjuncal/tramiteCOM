package es.com.cc.ui;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BuyerSeller extends JPanel {

	private static final long serialVersionUID = -9187935108462518636L;
	
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnAceptar;
	private JButton btnCancelar;
	

	/**
	 * Create the panel.
	 */
	public BuyerSeller() {
		setLayout(null);
		
		JLabel lblTipoBuyer = new JLabel();
		lblTipoBuyer.setText("Tipo");
		lblTipoBuyer.setBounds(10, 11, 110, 14);
		add(lblTipoBuyer);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(130, 8, 205, 20);
		add(comboBox);
		
		/**
		 * primer panel
		 */
		JPanel datosPanel = new JPanel();
		datosPanel.setBounds(10, 39, 692, 222);
		add(datosPanel);
		datosPanel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("AcctOwnr");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 11, 85, 14);
		datosPanel.add(lblNewLabel_4);
		
		JLabel lblDcsnmakr = new JLabel("DcsnMakr");
		lblDcsnmakr.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDcsnmakr.setBounds(10, 64, 85, 14);
		datosPanel.add(lblDcsnmakr);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(35, 36, 46, 14);
		datosPanel.add(lblId);
		
		JLabel lblNewLabel = new JLabel("CtryOfBrnch");
		lblNewLabel.setBounds(384, 36, 75, 14);
		datosPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(91, 33, 200, 20);
		datosPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(469, 33, 200, 20);
		datosPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("LEI");
		rdbtnNewRadioButton.setBounds(125, 85, 109, 23);
		datosPanel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Prsn");
		rdbtnNewRadioButton_1.setBounds(326, 85, 109, 23);
		datosPanel.add(rdbtnNewRadioButton_1);
		
		PersonaPanel panelPersona = new PersonaPanel();
		panelPersona.setBounds(10, 111, 672, 100);
		datosPanel.add(panelPersona);
		panelPersona.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 272, 692, 38);
		add(panel);
		
		btnAceptar = new JButton("Aceptar");
		panel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		panel.add(btnCancelar);
	}
	
	public JButton getBotonAceptar() {
		return this.btnAceptar;
	}
	
	public JButton getBotonCancelar() {
		return this.btnCancelar;
	}
}
