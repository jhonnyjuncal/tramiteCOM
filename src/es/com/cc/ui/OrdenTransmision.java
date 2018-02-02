package es.com.cc.ui;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrdenTransmision extends JPanel {

	private static final long serialVersionUID = -1841391778795823646L;

	/**
	 * Create the panel.
	 */
	public OrdenTransmision() {
		setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("OrdrTrnsmssn");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 11, 94, 14);
		add(lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("TrnsmssnInd");
		chckbxNewCheckBox.setBounds(47, 32, 200, 23);
		add(chckbxNewCheckBox);
	}

}
