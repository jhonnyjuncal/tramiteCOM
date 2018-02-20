package es.com.cc.ui;

import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class GeneralesPanel extends JPanel {
	
	private static final long serialVersionUID = 7259197554317082474L;
	
	private JTextField txIdField;
	private JTextField exctgPtyField;
	private JTextField submitgPtyField;
	private JRadioButton invstmtPtyIndTrue;
	private JRadioButton invstmtPtyIndFalse;

	/**
	 * Create the panel.
	 */
	public GeneralesPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(996, 68));
		
		JLabel lblNewLabel = new JLabel("TxId");
		lblNewLabel.setBounds(10, 11, 70, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ExctgPty");
		lblNewLabel_1.setBounds(10, 36, 70, 14);
		add(lblNewLabel_1);
		
		txIdField = new JTextField();
		txIdField.setBounds(90, 8, 350, 20);
		add(txIdField);
		txIdField.setColumns(10);
		
		exctgPtyField = new JTextField();
		exctgPtyField.setBounds(90, 33, 350, 20);
		add(exctgPtyField);
		exctgPtyField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("InvstmtPtyInd");
		lblNewLabel_2.setBounds(541, 11, 85, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SubmitgPty");
		lblNewLabel_3.setBounds(541, 36, 85, 14);
		add(lblNewLabel_3);
		
		submitgPtyField = new JTextField();
		submitgPtyField.setBounds(636, 33, 350, 20);
		add(submitgPtyField);
		submitgPtyField.setColumns(10);
		
		invstmtPtyIndTrue = new JRadioButton("Si");
		invstmtPtyIndTrue.setBounds(660, 7, 50, 23);
		add(invstmtPtyIndTrue);
		
		invstmtPtyIndFalse = new JRadioButton("No");
		invstmtPtyIndFalse.setBounds(712, 7, 50, 23);
		add(invstmtPtyIndFalse);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(invstmtPtyIndTrue);
		grupo.add(invstmtPtyIndFalse);
		
		
		// valores por defecto
		invstmtPtyIndTrue.setSelected(true);
	}
	
	public String getTxIdField() {
		return txIdField.getText();
	}

	public void setTxIdField(JTextField txIdField) {
		this.txIdField = txIdField;
	}

	public String getExctgPtyField() {
		return exctgPtyField.getText();
	}

	public void setExctgPtyField(JTextField exctgPtyField) {
		this.exctgPtyField = exctgPtyField;
	}

	public boolean getInvstmtPtyIndField() {
		if (invstmtPtyIndTrue.isSelected()) {
			return true;
		}
		return false;
	}

	public void setInvstmtPtyIndField(boolean invstmtPtyIndField) {
		if (invstmtPtyIndField) {
			invstmtPtyIndTrue.setSelected(true);
			
		} else {
			invstmtPtyIndFalse.setSelected(false);
		}
	}

	public String getSubmitgPtyField() {
		return submitgPtyField.getText();
	}

	public void setSubmitgPtyField(JTextField submitgPtyField) {
		this.submitgPtyField = submitgPtyField;
	}
}
