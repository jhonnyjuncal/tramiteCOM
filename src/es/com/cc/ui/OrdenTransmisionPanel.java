package es.com.cc.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.SecuritiesTransactionTransmission2;
import javax.swing.JButton;

public class OrdenTransmisionPanel extends JPanel {

	private static final long serialVersionUID = -1841391778795823646L;
	
	private boolean hideFlag = false;

	/**
	 * Create the panel.
	 */
	public OrdenTransmisionPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(998, 30));
		
		JLabel lblNewLabel_5 = new JLabel("OrdrTrnsmssn");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(35, 7, 94, 14);
		add(lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("TrnsmssnInd");
		chckbxNewCheckBox.setBounds(47, 32, 200, 23);
		add(chckbxNewCheckBox);
		
		JButton btnOcultar = new JButton("");
		btnOcultar.setBounds(10, 7, 15, 15);
		btnOcultar.setBackground(Color.RED);
		add(btnOcultar);
		btnOcultar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (hideFlag) {
					hideFlag = false;
					btnOcultar.setBackground(Color.RED);
					setPreferredSize(new Dimension(998, 30));
					
				} else {
					hideFlag = true;
					setPreferredSize(new Dimension(998, 60));
					btnOcultar.setBackground(Color.GREEN);
				}
				revalidate();
			}
		});
	}

	public SecuritiesTransactionTransmission2 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		SecuritiesTransactionTransmission2 ordTrans = factory.createSecuritiesTransactionTransmission2();
		
		return ordTrans;
	}
	
	public boolean isIncludedInGeneratedXml() {
		return hideFlag;
	}
}
