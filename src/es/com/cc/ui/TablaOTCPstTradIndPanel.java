package es.com.cc.ui;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import es.com.cc.core.schema.all.ReportingWaiverType3Code;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class TablaOTCPstTradIndPanel extends JPanel {

	private static final long serialVersionUID = -8031784517907652923L;
	
	private List<ReportingWaiverType3Code> listReportingWaiver = new ArrayList<>();
	
	private JTable table;
	private DefaultTableModel model = new DefaultTableModel();
	
	/**
	 * Create the panel.
	 */
	public TablaOTCPstTradIndPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(730, 127));
		
		cargaColumnasDelModelo();
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setBounds(1, 1, 728, 30);
		add(panel);
		
		JButton btnNewButton = new JButton("Nuevo");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Borrar");
		panel.add(btnNewButton_1);
		
		table = new JTable(model);
		table.setPreferredSize(new Dimension(725, 82));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(1, 35, 728, 85);
		add(scrollPane);
		

	}
	
	private void cargaColumnasDelModelo() {
		model.addColumn("OTCPstTradInd");
	}
	
	public List<ReportingWaiverType3Code> getDatosIntroducidos() {
		return listReportingWaiver;
	}
}
