package es.com.cc.ui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TablaBuyerSeller extends JPanel {
	
	private static final long serialVersionUID = 8260966023216669077L;
	
	private JTable table;
	private Vector<String> columnas = new Vector<String>(3);
	private Vector<String> valores = new Vector<String>();
	private BuyerSellerPanel panelBuyer = null;
	

	/**
	 * Create the panel.
	 */
	public TablaBuyerSeller() {
		setPreferredSize(new Dimension(730, 300));
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		cargaValoresDeLaTabla();
		
		JButton btnNuevo = new JButton("Nuevo");
		add(btnNuevo);
		btnNuevo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelBuyer = new BuyerSellerPanel();
				panelBuyer.getBotonAceptar().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				
				panelBuyer.getBotonCancelar().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				
				JFrame frame = new JFrame();
				frame.setBounds(300, 300, 710, 350);
				frame.setVisible(true);
				frame.setContentPane(panelBuyer);
				frame.revalidate();
			}
		});
		
		JButton btnBorrar = new JButton("Borrar");
		add(btnBorrar);
		
		table = new JTable(valores, columnas);
		table.setPreferredSize(new Dimension(720, 250));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(720, 260));
		add(scrollPane);
		
		table.setFillsViewportHeight(true);
		
	}
	
	private void cargaValoresDeLaTabla() {
		columnas.addElement("Id");
		columnas.addElement("Ciudad");
		columnas.addElement("Tipo");
	}

}
