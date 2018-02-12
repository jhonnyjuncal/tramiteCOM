package es.com.cc.ui;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.SecuritiesTransactionTransmission2;

public class OrdenTransmisionPanel extends JPanel {

	private static final long serialVersionUID = -1841391778795823646L;

	/**
	 * Create the panel.
	 */
	public OrdenTransmisionPanel() {
		setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("OrdrTrnsmssn");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 11, 94, 14);
		add(lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("TrnsmssnInd");
		chckbxNewCheckBox.setBounds(47, 32, 200, 23);
		add(chckbxNewCheckBox);
	}
	
	public SecuritiesTransactionTransmission2 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		SecuritiesTransactionTransmission2 ordTrans = factory.createSecuritiesTransactionTransmission2();
		
		return ordTrans;
	}
}
