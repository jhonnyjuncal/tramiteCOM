package es.com.cc.ui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GeneralesPanel extends JPanel {
	
	private static final long serialVersionUID = 7259197554317082474L;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public GeneralesPanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TxId");
		lblNewLabel.setBounds(10, 11, 70, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ExctgPty");
		lblNewLabel_1.setBounds(10, 36, 70, 14);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(90, 8, 200, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 33, 200, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("InvstmtPtyInd");
		lblNewLabel_2.setBounds(350, 11, 85, 14);
		add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(445, 8, 200, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("SubmitgPty");
		lblNewLabel_3.setBounds(350, 36, 85, 14);
		add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(445, 33, 200, 20);
		add(textField_3);
		textField_3.setColumns(10);
	}

}
