package es.com.cc.ui;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;

public class OperacionesPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public OperacionesPanel() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);

	}

}
