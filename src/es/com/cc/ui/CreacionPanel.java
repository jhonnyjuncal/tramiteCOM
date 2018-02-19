package es.com.cc.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CreacionPanel extends JPanel {

	private static final long serialVersionUID = -4094814046038700337L;
	
	private static PrincipalPanel frame;
	private EdicionXmlPanel edicionPanel;
	private Container esteContenedor;

	/**
	 * Create the panel.
	 */
	public CreacionPanel(PrincipalPanel frame) {
		CreacionPanel.frame = frame;
		setBounds(0, 0, 580, 370);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 236, 580, 33);
		add(panel);
		
		JButton btnNewXml = new JButton("Crear Nuevo XML");
		panel.add(btnNewXml);
		
		JButton btnLoadXml = new JButton("Cargar XML existente");
		panel.add(btnLoadXml);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 292, 580, 33);
		add(panel_1);
		
		JButton btnNewButton = new JButton("Volver");
		panel_1.add(btnNewButton);
		btnLoadXml.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewXml.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CreacionPanel.frame.setBounds(200, 200, 1025, 700);
				edicionPanel = new EdicionXmlPanel(CreacionPanel.frame);
				muestraPanel(edicionPanel);
			}
		});
	}
	
	private void muestraPanel(JPanel panel) {
		esteContenedor = new Container();
		for (Component comp : CreacionPanel.frame.getContentPane().getComponents()) {
			esteContenedor.add(comp);
		}
		
		CreacionPanel.frame.getContentPane().removeAll();
		CreacionPanel.frame.setContentPane(panel);
		CreacionPanel.frame.revalidate();
	}
}
