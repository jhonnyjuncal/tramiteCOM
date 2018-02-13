package es.com.cc.ui;

import java.awt.Dimension;
import javax.swing.JPanel;
import es.com.cc.core.schema.all.Side5Code;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class ShrtSellgIndPanel extends JPanel {

	private static final long serialVersionUID = 8864776181703074494L;
	
	private JComboBox<String> shrtSellgIndComboBox;
	
	/**
	 * Create the panel.
	 */
	public ShrtSellgIndPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(730, 35));
		
		JLabel lblNewLabel = new JLabel("ShrtSellgInd");
		lblNewLabel.setBounds(10, 11, 100, 14);
		add(lblNewLabel);
		
		JComboBox<String> shrtSellgIndComboBox = new JComboBox<String>();
		shrtSellgIndComboBox.setBounds(120, 8, 100, 20);
		add(shrtSellgIndComboBox);
		shrtSellgIndComboBox.addItem("SELL");
		shrtSellgIndComboBox.addItem("SESH");
		shrtSellgIndComboBox.addItem("SSEX");
		shrtSellgIndComboBox.addItem("UNDI");
	}
	
	public Side5Code getDatosIntroducidos() {
		Side5Code sell = null;
		switch (shrtSellgIndComboBox.getSelectedIndex()) {
			case 0:
				sell = Side5Code.SELL;
				break;
			case 1:
				sell = Side5Code.SESH;
				break;
			case 2:
				sell = Side5Code.SSEX;
				break;
			case 3:
				sell = Side5Code.UNDI;
				break;
		}
		return sell;
	}
}
