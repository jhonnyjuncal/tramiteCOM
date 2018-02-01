package es.com.cc.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EdicionXmlPanel extends JPanel {

	private static final long serialVersionUID = 8153525306985416127L;
	
	private static PrincipalPanel frame;
	
	private static String[] columnas = new String[] {
			"Tipo", "Valor1", "Valor2", "Valor3" };
	private static Object[][] valores = new Object[][] {
			{"Cancelacion", "valor1", "valor2", "valor3"},
			{"Nueva",       "valor1", "valor2", "valor3"}
	};
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private NuevaTransaccionPanel nuevaTransaccionPanel;
	
	

	/**
	 * Create the panel.
	 */
	public EdicionXmlPanel(PrincipalPanel frame) {
		EdicionXmlPanel.frame = frame;
		
		setBounds(0, 0, 730, 830);
		setLayout(new BorderLayout(0, 0));
		
		
		/**
		 * ****************************************************************************************************
		 * panel1
		 */
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel1.setPreferredSize(new Dimension(730, 200));
		panel1.setLayout(null);
		add(panel1, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(54, 36, 46, 14);
		panel1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(110, 33, 200, 20);
		panel1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Prtry");
		lblNewLabel_1.setBounds(54, 61, 46, 14);
		panel1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(110, 58, 200, 20);
		panel1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FROM");
		lblNewLabel_2.setBounds(10, 11, 46, 14);
		panel1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setBounds(356, 11, 46, 14);
		panel1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Id");
		lblNewLabel_4.setBounds(384, 36, 46, 14);
		panel1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Prtry");
		lblNewLabel_5.setBounds(384, 61, 46, 14);
		panel1.add(lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(440, 33, 200, 20);
		panel1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(440, 58, 200, 20);
		panel1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("BizMsgIdr");
		lblNewLabel_6.setBounds(10, 108, 69, 14);
		panel1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("MsgDefIdr");
		lblNewLabel_7.setBounds(10, 133, 69, 14);
		panel1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("CreDt");
		lblNewLabel_8.setBounds(10, 158, 69, 14);
		panel1.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(89, 105, 200, 20);
		panel1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(89, 130, 200, 20);
		panel1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(89, 155, 200, 20);
		panel1.add(textField_6);
		textField_6.setColumns(10);
		
		
		/**
		 * ****************************************************************************************************
		 * panel2
		 */
		JPanel panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(730, 400));
		add(panel2, BorderLayout.CENTER);
		
		table = new JTable(valores, columnas);
		table.setPreferredSize(new Dimension(730, 400));
		table.getTableHeader().setVisible(true);
		
		JButton btnNewButton = new JButton("Nueva Transaccion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				muestraVentanaNuevaOperacion();
			}
		});
		panel2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar Transaccion");
		panel2.add(btnNewButton_1);
		panel2.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(730, 400));
		panel2.add(scrollPane);
	}
	
	private void muestraVentanaNuevaOperacion() {
		nuevaTransaccionPanel = new NuevaTransaccionPanel();
		muestraPanel(nuevaTransaccionPanel);
	}
	
	private void muestraPanel(JPanel panel) {
		frame.getContentPane().removeAll();
		frame.setContentPane(panel);
		frame.revalidate();
	}
}
