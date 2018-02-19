package es.com.cc.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CreacionPanel extends JPanel {

	private static final long serialVersionUID = -4094814046038700337L;
	
	private static PrincipalPanel frame;
	private EdicionXmlPanel edicionPanel;

	/**
	 * Create the panel.
	 */
	public CreacionPanel(PrincipalPanel frame) {
		CreacionPanel.frame = frame;
		setBounds(0, 0, 580, 370);
		setLayout(null);
		
		JButton btnNewXml = new JButton("Crear Nuevo XML");
		btnNewXml.setBounds(63, 253, 179, 23);
		add(btnNewXml);
		btnNewXml.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CreacionPanel.frame.setBounds(200, 200, 1025, 700);
				edicionPanel = new EdicionXmlPanel(CreacionPanel.frame);
				muestraPanel(edicionPanel);
			}
		});
		
		JButton btnLoadXml = new JButton("Cargar XML existente");
		btnLoadXml.setBounds(301, 253, 179, 23);
		add(btnLoadXml);
		btnLoadXml.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	private void muestraPanel(JPanel panel) {
		frame.getContentPane().removeAll();
		frame.setContentPane(panel);
		frame.revalidate();
	}
}
