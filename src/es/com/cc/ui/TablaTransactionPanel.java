package es.com.cc.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TablaTransactionPanel extends JPanel {

	private static final long serialVersionUID = -4765970757932015496L;
	
	private JTable table;
	private Vector<String> columnas = new Vector<String>(3);
	private Vector<String> valores = new Vector<String>();
	
	private TransaccionPanel panelTransaccion;
	
	/**
	 * Create the panel.
	 */
	public TablaTransactionPanel() {
		FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		setLayout(flowLayout);
		setPreferredSize(new Dimension(720, 260));
		
		JFrame frame = new JFrame();
		
		
		cargaValoresTabla();
		
		JButton btnNewButton = new JButton("Nuevo");
		add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelTransaccion = new TransaccionPanel();
				
				panelTransaccion.getBotonAceptar().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						panelTransaccion.getDatosIntroducidos();
					}
				});
				
				panelTransaccion.getBotonCancelar().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				
				frame.setBounds(300, 300, 710, 350);
				frame.setVisible(true);
				frame.setContentPane(panelTransaccion);
				frame.revalidate();
			}
		});
		
		JButton btnDeleteButton = new JButton("Borrar");
		add(btnDeleteButton);
		btnDeleteButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		table = new JTable(valores, columnas);
		table.setPreferredSize(new Dimension(705, 210));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(710, 215));
		add(scrollPane);
	}
	
	private void cargaValoresTabla() {
		columnas.add("TradDt");
		columnas.add("TradgCpcty");
		columnas.add("TradVn");
		columnas.add("DerivNtnlChng");
	}
}
