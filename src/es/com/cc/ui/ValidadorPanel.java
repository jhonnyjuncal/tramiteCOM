package es.com.cc.ui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ValidadorPanel extends JPanel {

	private static final long serialVersionUID = 8436552952350523727L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public ValidadorPanel() {
		setBounds(100, 100, 600, 400);
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 128, 484, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(504, 127, 86, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Introduzca la ruta del fichero XML que desea validar:");
		lblNewLabel.setBounds(20, 103, 253, 14);
		add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Validar fichero XML");
		btnNewButton_1.setBounds(235, 192, 123, 23);
		add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 272, 580, 117);
		add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado de la validaci\u00F3n:");
		lblNewLabel_1.setBounds(20, 247, 128, 14);
		add(lblNewLabel_1);
	}
}
