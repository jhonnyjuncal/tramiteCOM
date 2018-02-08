package es.com.cc.ui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JTable;

import es.com.cc.core.schema.all.PartyIdentification761;
import es.com.cc.core.schema.all.PartyIdentification791;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TablaBuyerSeller extends JPanel {
	
	private static final long serialVersionUID = 8260966023216669077L;
	
	private JTable table;
	private Vector<String> columnas = new Vector<String>(3);
	private Vector<String> valores = new Vector<String>();
	private BuyerSellerPanel panelBuyer = null;
	
	private List<PartyIdentification791> listaBuyer = new ArrayList<PartyIdentification791>();
	

	/**
	 * Create the panel.
	 */
	public TablaBuyerSeller() {
		setPreferredSize(new Dimension(730, 300));
		FlowLayout flowLayout = (FlowLayout) getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		JFrame frame = new JFrame();
		
		
		cargaTituloDeLaTabla();
		
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
						
						// hay que recojer los datos del formulario
						PartyIdentification791 buyerSeller = panelBuyer.getDatosIntroducidos();
						listaBuyer.add(buyerSeller);
						addBuyerSellerToTable(buyerSeller);
						
						frame.dispose();
					}
				});
				
				panelBuyer.getBotonCancelar().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						frame.dispose();
					}
				});
				
				frame.setBounds(300, 300, 730, 300);
				frame.setContentPane(panelBuyer);
				frame.setVisible(true);
				frame.revalidate();
			}
		});
		
		JButton btnBorrar = new JButton("Borrar");
		add(btnBorrar);
		
		table = new JTable(valores, columnas);
		table.setPreferredSize(new Dimension(707, 240));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(710, 260));
		add(scrollPane);
		
		table.setFillsViewportHeight(true);
		
	}
	
	private void cargaTituloDeLaTabla() {
		columnas.addElement("Id");
		columnas.addElement("Ciudad");
		columnas.addElement("MIC");
	}
	
	private void addBuyerSellerToTable(PartyIdentification791 buyerSeller) {
		for (PartyIdentification761 iden : buyerSeller.getAcctOwnr()) {
			valores.addElement(iden.getId().getLEI());
			valores.addElement(iden.getCtryOfBrnch());
			valores.addElement(iden.getId().getMIC());
		}
	}
	
	
	
	
	
	
}
