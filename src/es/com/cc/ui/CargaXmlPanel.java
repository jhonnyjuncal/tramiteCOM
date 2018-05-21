package es.com.cc.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CargaXmlPanel extends JPanel {
	
	private static final long serialVersionUID = 4788553031400929249L;
	
	private JTextField textField;
	private String path = "";
	
	private static PrincipalPanel frame;
	
	/**
	 * Create the panel.
	 */
	public CargaXmlPanel(PrincipalPanel frame) {
		CargaXmlPanel.frame = frame;
		
		setBounds(0, 0, 580, 242);
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 128, 462, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnCargarFicheroXml = new JButton("Cargar");
		btnCargarFicheroXml.setBounds(482, 127, 86, 23);
		add(btnCargarFicheroXml);
		btnCargarFicheroXml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				final JFileChooser jfc = new JFileChooser();
				int returnValue = jfc.showOpenDialog(null);
				
				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File selectedFile = jfc.getSelectedFile();
					path = selectedFile.getAbsolutePath();
					textField.setText(selectedFile.getAbsolutePath());
				}
			}
		});
		
		JLabel lblRutaFichero = new JLabel("Introduzca la ruta del fichero XML que desea cargar:");
		lblRutaFichero.setBounds(20, 103, 452, 14);
		add(lblRutaFichero);	
		
		JButton btnCargarContenidoXml = new JButton("Carga fichero XML");
		btnCargarContenidoXml.setBounds(181, 182, 212, 23);
		add(btnCargarContenidoXml);
		btnCargarContenidoXml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

}
