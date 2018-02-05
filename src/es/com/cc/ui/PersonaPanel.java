package es.com.cc.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class PersonaPanel extends JPanel {

	private static final long serialVersionUID = -5585239586552794691L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public PersonaPanel() {
		setLayout(null);
		
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
		
		textField = new JTextField();
		textField.setBounds(66, 8, 200, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(409, 8, 200, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(66, 33, 200, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(66, 58, 200, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(409, 33, 200, 20);
		add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(353, 61, 46, 14);
		add(lblNewLabel_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(409, 58, 200, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
	}
}
