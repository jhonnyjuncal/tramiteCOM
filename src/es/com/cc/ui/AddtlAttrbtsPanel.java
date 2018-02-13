package es.com.cc.ui;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.SecuritiesTransactionIndicator21;

public class AddtlAttrbtsPanel extends JPanel {

	private static final long serialVersionUID = -1919675164855167497L;
	
	private TablaWvrIndPanel tablaPanelWvrInd;
	private ShrtSellgIndPanel panelShrtSellgInd;
	private TablaOTCPstTradIndPanel tablaPanelOTCPstTradInd;
	private JPanel panelRskRdcgTx;
	private JLabel lblNewLabel_1;
	private JRadioButton radioRskRdcgTxSi;
	private JRadioButton radioRskRdcgTxNo;
	private JPanel panelSctiesFincgTxInd;
	private JLabel lblSctiesfincgtxind;
	private JRadioButton radioSctiesFincgTxIndSi;
	private JRadioButton radioSctiesFincgTxIndNo;

	/**
	 * Create the panel.
	 */
	public AddtlAttrbtsPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(730, 385));
		
		JLabel lblNewLabel = new JLabel("AddtlAttrbts");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(1, 1, 102, 14);
		add(lblNewLabel);
		
		/**
		 * *************************************************************************************************************
		 * panel tablaPanelWvrInd
		 */
		tablaPanelWvrInd = new TablaWvrIndPanel();
		tablaPanelWvrInd.setBounds(1, 26, 728, 100);
		add(tablaPanelWvrInd);
		
		/**
		 * *************************************************************************************************************
		 * panel panelShrtSellgInd
		 */
		panelShrtSellgInd = new ShrtSellgIndPanel();
		panelShrtSellgInd.setBounds(1, 128, 728, 35);
		add(panelShrtSellgInd);
		
		/**
		 * *************************************************************************************************************
		 * panel tablaPanelOTCPstTradInd
		 */
		tablaPanelOTCPstTradInd = new TablaOTCPstTradIndPanel();
		tablaPanelOTCPstTradInd.setBounds(1, 165, 729, 139);
		add(tablaPanelOTCPstTradInd);
		
		/**
		 * *************************************************************************************************************
		 * panel RskRdcgTx
		 */
		panelRskRdcgTx = new JPanel();
		panelRskRdcgTx.setBounds(1, 304, 728, 35);
		add(panelRskRdcgTx);
		panelRskRdcgTx.setLayout(null);
		
		lblNewLabel_1 = new JLabel("RskRdcgTx");
		lblNewLabel_1.setBounds(10, 11, 90, 14);
		panelRskRdcgTx.add(lblNewLabel_1);
		
		radioRskRdcgTxSi = new JRadioButton("Si");
		radioRskRdcgTxSi.setBounds(145, 7, 55, 23);
		panelRskRdcgTx.add(radioRskRdcgTxSi);
		
		radioRskRdcgTxNo = new JRadioButton("No");
		radioRskRdcgTxNo.setBounds(202, 7, 55, 23);
		panelRskRdcgTx.add(radioRskRdcgTxNo);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioRskRdcgTxSi);
		group.add(radioRskRdcgTxNo);
		
		/**
		 * *************************************************************************************************************
		 * panel SctiesFincgTxInd
		 */
		panelSctiesFincgTxInd = new JPanel();
		panelSctiesFincgTxInd.setLayout(null);
		panelSctiesFincgTxInd.setBounds(1, 343, 728, 35);
		add(panelSctiesFincgTxInd);
		
		lblSctiesfincgtxind = new JLabel("SctiesFincgTxInd");
		lblSctiesfincgtxind.setBounds(10, 11, 90, 14);
		panelSctiesFincgTxInd.add(lblSctiesfincgtxind);
		
		radioSctiesFincgTxIndSi = new JRadioButton("Si");
		radioSctiesFincgTxIndSi.setBounds(145, 7, 55, 23);
		panelSctiesFincgTxInd.add(radioSctiesFincgTxIndSi);
		
		radioSctiesFincgTxIndNo = new JRadioButton("No");
		radioSctiesFincgTxIndNo.setBounds(202, 7, 55, 23);
		panelSctiesFincgTxInd.add(radioSctiesFincgTxIndNo);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(radioSctiesFincgTxIndSi);
		group2.add(radioSctiesFincgTxIndNo);
	}
	
	public SecuritiesTransactionIndicator21 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		
		SecuritiesTransactionIndicator21 transInd = factory.createSecuritiesTransactionIndicator21();
		transInd.getWvrInd().addAll(tablaPanelWvrInd.getDatosIntroducidos());
		transInd.setShrtSellgInd(panelShrtSellgInd.getDatosIntroducidos());
		transInd.getOTCPstTradInd().addAll(tablaPanelOTCPstTradInd.getDatosIntroducidos());
		
		if (radioRskRdcgTxSi.isSelected()) {
			transInd.setRskRdcgTx(true);
			
		} else if (radioRskRdcgTxNo.isSelected()) {
			transInd.setRskRdcgTx(false);
		}
		
		if (radioSctiesFincgTxIndSi.isSelected()) {
			transInd.setSctiesFincgTxInd(true);
			
		} else if (radioSctiesFincgTxIndNo.isSelected()) {
			transInd.setSctiesFincgTxInd(false);
		}
		
		return transInd;
	}
}
