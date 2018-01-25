package es.com.cc.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import es.com.cc.core.ValidateXml;

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
		
		JButton btnCargarFicheroXml = new JButton("Cargar");
		btnCargarFicheroXml.setBounds(504, 127, 86, 23);
		add(btnCargarFicheroXml);
		
		JLabel lblRutaFichero = new JLabel("Introduzca la ruta del fichero XML que desea validar:");
		lblRutaFichero.setBounds(20, 103, 253, 14);
		add(lblRutaFichero);
		
		JButton btnValidateFile = new JButton("Validar fichero XML");
		btnValidateFile.setBounds(235, 192, 123, 23);
		add(btnValidateFile);
		btnValidateFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// obtener la ruta del fichero
				String rutaFichero = lblRutaFichero.getText();
				
				// llamar al metodo de validacion
				ValidateXml valida = new ValidateXml();
				valida.validateXmlFromXsd_method_2(rutaFichero);
				
			}
		});
		
		JTextArea texstAreaResults = new JTextArea();
		texstAreaResults.setBounds(10, 272, 580, 117);
		add(texstAreaResults);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado de la validaci\u00F3n:");
		lblNewLabel_1.setBounds(20, 247, 128, 14);
		add(lblNewLabel_1);
	}
}
