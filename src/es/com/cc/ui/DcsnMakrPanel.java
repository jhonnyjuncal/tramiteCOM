package es.com.cc.ui;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.PersonOrOrganisation2Choice1;

public class DcsnMakrPanel extends JPanel {

	private static final long serialVersionUID = 5562761115936446721L;
	
	private JTextField LEIField;
	
	/**
	 * Create the panel.
	 */
	public DcsnMakrPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(691, 140));
		
		JLabel lblNewLabel_1 = new JLabel("LEI");
		lblNewLabel_1.setBounds(25, 11, 46, 14);
		add(lblNewLabel_1);
		
		LEIField = new JTextField();
		LEIField.setBounds(81, 8, 200, 20);
		add(LEIField);
		LEIField.setColumns(10);
		
		PersonaPanel panelPersonaDcsnMakr = new PersonaPanel();
		panelPersonaDcsnMakr.setLocation(10, 36);
		panelPersonaDcsnMakr.setSize(671, 100);
		panelPersonaDcsnMakr.setPreferredSize(new Dimension(691, 100));
		add(panelPersonaDcsnMakr);
	}
	
	public PersonOrOrganisation2Choice1 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		
		PersonOrOrganisation2Choice1 dcsnMakr = factory.createPersonOrOrganisation2Choice1();
		
		
		return dcsnMakr;
	}
}
