package es.com.cc.ui;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientPanel extends JPanel {

	private static final long serialVersionUID = -6312641808136486429L;

	/**
	 * Create the panel.
	 */
	public ClientPanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NoReasonCode");
		lblNewLabel.setBounds(10, 11, 96, 14);
		add(lblNewLabel);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(132, 8, 174, 20);
		add(comboBox);
		comboBox.addItem("NORE");
	}
}
