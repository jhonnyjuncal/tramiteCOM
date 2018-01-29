package es.com.cc.ui;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class EdicionXmlPanel extends JPanel {

	private static final long serialVersionUID = 8153525306985416127L;
	
	private static PrincipalPanel frame;
	
	private static String[] columnas = new String[] {"Tipo, Valor1, Valor2, Valor3" };
	private static Object[][] valores = new Object[][] {
		{"Cancelacion", "valor1", "valor2", "valor3"},
		{"Nueva", "valor1", "valor2", "valor3"}
	};
	private JTable table;
	private JTable table_1;

	/**
	 * Create the panel.
	 */
	public EdicionXmlPanel(PrincipalPanel frame) {
		EdicionXmlPanel.frame = frame;
		
		setBounds(0, 0, 580, 831);
		setLayout(null);
		
		JButton btnGuardar = new JButton("Save");
		btnGuardar.setBounds(102, 11, 89, 23);
		add(btnGuardar);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setBounds(239, 11, 89, 23);
		add(btnLoad);
		
		JButton btnNewButton = new JButton("Show XML");
		btnNewButton.setBounds(348, 11, 115, 23);
		add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Transacciones");
		lblNewLabel.setBounds(38, 201, 393, 14);
		add(lblNewLabel);
		
		table_1 = new JTable();
		table_1.setBackground(Color.ORANGE);
		table_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Valor3", "Valor2", "Valor1", "Tipo"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.setBorder(new LineBorder(Color.RED, 3, true));
		table_1.setBounds(38, 385, 425, -116);
		add(table_1);
		
		
	}
}
