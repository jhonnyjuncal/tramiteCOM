package es.com.cc.ui;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Font;

public class NuevaTransaccionPanel extends JPanel {

	private static final long serialVersionUID = -5426067842782204622L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Create the panel.
	 */
	public NuevaTransaccionPanel() {
		setBounds(0, 0, 730, 830);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		/**
		 * ****************************************************************************************************
		 * panel1
		 */
		JPanel panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(730, 70));
		add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TxId");
		lblNewLabel.setBounds(10, 11, 46, 14);
		panel1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ExctgPty");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		panel1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(66, 8, 200, 20);
		panel1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 33, 200, 20);
		panel1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("InvstmtPtyInd");
		lblNewLabel_2.setBounds(350, 11, 85, 14);
		panel1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(445, 8, 200, 20);
		panel1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("SubmitgPty");
		lblNewLabel_3.setBounds(350, 36, 85, 14);
		panel1.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(445, 33, 200, 20);
		panel1.add(textField_3);
		textField_3.setColumns(10);
		
		
		
		/**
		 * ****************************************************************************************************
		 * panel2
		 */
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setPreferredSize(new Dimension(730, 300));
		add(tabbedPane);
		
		JPanel panel2_1 = new JPanel();
		panel2_1.setLayout(null);
		
		tabbedPane.addTab("Buyer", null, panel2_1, null);
		
		JLabel lblTipoBuyer = new JLabel("Tipo Buyer");
		lblTipoBuyer.setBounds(10, 11, 51, 14);
		panel2_1.add(lblTipoBuyer);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(71, 8, 205, 20);
		panel2_1.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 39, 692, 222);
		panel2_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("AcctOwnr");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 11, 85, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblDcsnmakr = new JLabel("DcsnMakr");
		lblDcsnmakr.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDcsnmakr.setBounds(10, 94, 85, 14);
		panel.add(lblDcsnmakr);
		
		
		JPanel panel2_2 = new JPanel();
		tabbedPane.addTab("Seller", null, panel2_2, null);
		
		
		/**
		 * ****************************************************************************************************
		 * panel3
		 */
		JPanel panel3 = new JPanel();
		panel3.setPreferredSize(new Dimension(730, 100));
		add(panel3);
		panel3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("OrdrTrnsmssn");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 11, 94, 14);
		panel3.add(lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("TrnsmssnInd");
		chckbxNewCheckBox.setBounds(47, 32, 200, 23);
		panel3.add(chckbxNewCheckBox);
		
		
		/**
		 * ****************************************************************************************************
		 * panel4
		 */
		JPanel panel4 = new JPanel();
		panel4.setPreferredSize(new Dimension(730, 200));
		add(panel4);
		panel4.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Transaccion");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 11, 200, 14);
		panel4.add(lblNewLabel_6);
		
		JLabel lblTraddt = new JLabel("TradDt");
		lblTraddt.setBounds(36, 35, 80, 14);
		panel4.add(lblTraddt);
		
		JLabel lblTradgcpcty = new JLabel("TradgCpcty");
		lblTradgcpcty.setBounds(391, 35, 80, 14);
		panel4.add(lblTradgcpcty);
		
		textField_4 = new JTextField();
		textField_4.setBounds(478, 32, 200, 20);
		panel4.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(126, 32, 200, 20);
		panel4.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setBounds(36, 60, 80, 14);
		panel4.add(lblQty);
		
		textField_6 = new JTextField();
		textField_6.setBounds(126, 57, 200, 20);
		panel4.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDerivntnlchng = new JLabel("DerivNtnlChng");
		lblDerivntnlchng.setBounds(391, 60, 80, 14);
		panel4.add(lblDerivntnlchng);
		
		textField_7 = new JTextField();
		textField_7.setBounds(478, 57, 200, 20);
		panel4.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblPric = new JLabel("Pric");
		lblPric.setBounds(36, 85, 80, 14);
		panel4.add(lblPric);
		
		textField_8 = new JTextField();
		textField_8.setBounds(126, 82, 200, 20);
		panel4.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNetamt = new JLabel("NetAmt");
		lblNetamt.setBounds(391, 85, 80, 14);
		panel4.add(lblNetamt);
		
		textField_9 = new JTextField();
		textField_9.setBounds(478, 82, 200, 20);
		panel4.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("TradVn");
		lblNewLabel_7.setBounds(36, 110, 80, 14);
		panel4.add(lblNewLabel_7);
		
		textField_10 = new JTextField();
		textField_10.setBounds(126, 107, 200, 20);
		panel4.add(textField_10);
		textField_10.setColumns(10);
		
	}
}
