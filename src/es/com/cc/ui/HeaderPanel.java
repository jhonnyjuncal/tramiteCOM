package es.com.cc.ui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;

public class HeaderPanel extends JPanel {

	private static final long serialVersionUID = -169220978179044134L;
	
	private JTextField fromIdTextField;
	private JTextField fromPytryTextField;
	private JTextField toIdTextField;
	private JTextField toPytryTextField;
	private JTextField bizMsgIdrTextField;
	private JTextField msgDefIdrTextField;
	private JTextField creDtTextField;
	private JComboBox fromSchema;
	private JComboBox toSchema

	/**
	 * Create the panel.
	 */
	public HeaderPanel() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setPreferredSize(new Dimension(730, 200));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(54, 36, 46, 14);
		add(lblNewLabel);
		
		fromIdTextField = new JTextField();
		fromIdTextField.setBounds(110, 33, 200, 20);
		add(fromIdTextField);
		fromIdTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Prtry");
		lblNewLabel_1.setBounds(54, 83, 46, 14);
		add(lblNewLabel_1);
		
		fromPytryTextField = new JTextField();
		fromPytryTextField.setBounds(110, 80, 200, 20);
		add(fromPytryTextField);
		fromPytryTextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("FROM");
		lblNewLabel_2.setBounds(10, 11, 46, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("TO");
		lblNewLabel_3.setBounds(356, 11, 46, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Id");
		lblNewLabel_4.setBounds(384, 36, 46, 14);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Prtry");
		lblNewLabel_5.setBounds(384, 83, 46, 14);
		add(lblNewLabel_5);
		
		toIdTextField = new JTextField();
		toIdTextField.setBounds(440, 33, 200, 20);
		add(toIdTextField);
		toIdTextField.setColumns(10);
		
		toPytryTextField = new JTextField();
		toPytryTextField.setBounds(440, 80, 200, 20);
		add(toPytryTextField);
		toPytryTextField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("BizMsgIdr");
		lblNewLabel_6.setBounds(10, 133, 69, 14);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("MsgDefIdr");
		lblNewLabel_7.setBounds(384, 133, 69, 14);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("CreDt");
		lblNewLabel_8.setBounds(10, 158, 69, 14);
		add(lblNewLabel_8);
		
		bizMsgIdrTextField = new JTextField();
		bizMsgIdrTextField.setBounds(89, 130, 200, 20);
		add(bizMsgIdrTextField);
		bizMsgIdrTextField.setColumns(10);
		
		msgDefIdrTextField = new JTextField();
		msgDefIdrTextField.setBounds(440, 130, 200, 20);
		add(msgDefIdrTextField);
		msgDefIdrTextField.setColumns(10);
		
		creDtTextField = new JTextField();
		creDtTextField.setBounds(89, 155, 200, 20);
		add(creDtTextField);
		creDtTextField.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Schema");
		lblNewLabel_9.setBounds(54, 61, 46, 14);
		add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Schema");
		lblNewLabel_10.setBounds(384, 61, 46, 14);
		add(lblNewLabel_10);
		
		fromSchema = new JComboBox();
		fromSchema.setBounds(110, 58, 200, 20);
		add(fromSchema);
		
		toSchema = new JComboBox();
		toSchema.setBounds(440, 58, 200, 20);
		add(toSchema);
	}
	
	public String getBizMsgIdrTextField() {
		return bizMsgIdrTextField.getText();
	}
	
	public String getMsgDefIdrTextField() {
		return msgDefIdrTextField.getText();
	}
	
	public String getCreDtTextField() {
		return creDtTextField.getText();
	}
	
	public String getFromIdTextField() {
		return fromIdTextField.getText();
	}
	
	public String getFromPytryTextField() {
		return fromPytryTextField.getText();
	}
	
	public int getFromSchema() {
		return fromSchema.getSelectedIndex();
	}
	
	public int getToSchema() {
		return toSchema.getSelectedIndex();
	}
}
