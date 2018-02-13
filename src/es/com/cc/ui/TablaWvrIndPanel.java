package es.com.cc.ui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import es.com.cc.core.schema.all.ReportingWaiverType1Code;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

public class TablaWvrIndPanel extends JPanel {
	
	private static final long serialVersionUID = 7667401884150498785L;
	
	private List<ReportingWaiverType1Code> listaReportingWaiver = new ArrayList<>();
	
	private JTable tableWvrInd;
	private DefaultTableModel model = new DefaultTableModel();
	
	/**
	 * Create the panel.
	 */
	public TablaWvrIndPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(730, 90));
		
		cargaColumnasDeLaTabla();
		
		/**
		 * *******************************************************************************************************
		 * panel botones
		 */
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setBounds(1, 1, 728, 33);
		add(panel);
		
		JButton btnNewButton = new JButton("Nuevo");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Borrar");
		panel.add(btnNewButton_1);
		
		tableWvrInd = new JTable(model);
		tableWvrInd.setPreferredSize(new Dimension(725, 46));
		
		JScrollPane scrollPane = new JScrollPane(tableWvrInd);
		scrollPane.setBounds(1, 36, 728, 49);
		add(scrollPane);
	}
	
	private void cargaColumnasDeLaTabla() {
		model.addColumn("WvrInd");
	}
	
	public List<ReportingWaiverType1Code> getDatosIntroducidos() {
		return listaReportingWaiver;
	}
}
