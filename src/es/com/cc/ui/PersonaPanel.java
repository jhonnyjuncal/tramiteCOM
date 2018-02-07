package es.com.cc.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Dimension;

import javax.swing.JComboBox;

public class PersonaPanel extends JPanel {

	private static final long serialVersionUID = -5585239586552794691L;
	private JTextField txtFrstnmfield;
	private JTextField txtNmfield;
	private JTextField txtBirthdtfield;
	private JTextField idField;

	/**
	 * Create the panel.
	 */
	public PersonaPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(691, 100));
		
		JLabel lblNewLabel = new JLabel("FrstNm");
		lblNewLabel.setBounds(10, 11, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nm");
		lblNewLabel_1.setBounds(353, 11, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblBirthdt = new JLabel("BirthDt");
		lblBirthdt.setBounds(10, 36, 46, 14);
		add(lblBirthdt);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 61, 46, 14);
		add(lblId);
		
		JLabel lblSchmenm = new JLabel("SchmeNm");
		lblSchmenm.setBounds(353, 36, 46, 14);
		add(lblSchmenm);
		
		txtFrstnmfield = new JTextField();
		txtFrstnmfield.setText("frstNmField");
		txtFrstnmfield.setBounds(66, 8, 200, 20);
		add(txtFrstnmfield);
		txtFrstnmfield.setColumns(10);
		
		txtNmfield = new JTextField();
		txtNmfield.setText("nmField");
		txtNmfield.setBounds(409, 8, 200, 20);
		add(txtNmfield);
		txtNmfield.setColumns(10);
		
		txtBirthdtfield = new JTextField();
		txtBirthdtfield.setText("birthDtField");
		txtBirthdtfield.setBounds(66, 33, 200, 20);
		add(txtBirthdtfield);
		txtBirthdtfield.setColumns(10);
		
		idField = new JTextField();
		idField.setBounds(66, 58, 200, 20);
		add(idField);
		idField.setColumns(10);
		
		JComboBox<String> schmeNmCombo = new JComboBox<String>();
		schmeNmCombo.setBounds(409, 33, 200, 20);
		add(schmeNmCombo);
		
	}
}
