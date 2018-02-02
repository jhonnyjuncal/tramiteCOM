package es.com.cc.ui;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Transaccion extends JPanel {
	
	private static final long serialVersionUID = -7813145032830198693L;
	
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
	public Transaccion() {
		setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Transaccion");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 11, 200, 14);
		add(lblNewLabel_6);
		
		JLabel lblTraddt = new JLabel("TradDt");
		lblTraddt.setBounds(36, 35, 80, 14);
		add(lblTraddt);
		
		JLabel lblTradgcpcty = new JLabel("TradgCpcty");
		lblTradgcpcty.setBounds(391, 35, 80, 14);
		add(lblTradgcpcty);
		
		textField_4 = new JTextField();
		textField_4.setBounds(478, 32, 200, 20);
		add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(126, 32, 200, 20);
		add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setBounds(36, 60, 80, 14);
		add(lblQty);
		
		textField_6 = new JTextField();
		textField_6.setBounds(126, 57, 200, 20);
		add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDerivntnlchng = new JLabel("DerivNtnlChng");
		lblDerivntnlchng.setBounds(391, 60, 80, 14);
		add(lblDerivntnlchng);
		
		textField_7 = new JTextField();
		textField_7.setBounds(478, 57, 200, 20);
		add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblPric = new JLabel("Pric");
		lblPric.setBounds(36, 85, 80, 14);
		add(lblPric);
		
		textField_8 = new JTextField();
		textField_8.setBounds(126, 82, 200, 20);
		add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNetamt = new JLabel("NetAmt");
		lblNetamt.setBounds(391, 85, 80, 14);
		add(lblNetamt);
		
		textField_9 = new JTextField();
		textField_9.setBounds(478, 82, 200, 20);
		add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("TradVn");
		lblNewLabel_7.setBounds(36, 110, 80, 14);
		add(lblNewLabel_7);
		
		textField_10 = new JTextField();
		textField_10.setBounds(126, 107, 200, 20);
		add(textField_10);
		textField_10.setColumns(10);
	}

}
