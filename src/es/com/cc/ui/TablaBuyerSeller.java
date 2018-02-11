package es.com.cc.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import es.com.cc.core.schema.all.PartyIdentification761;
import es.com.cc.core.schema.all.PartyIdentification791;

public class TablaBuyerSeller extends JPanel {
	
	private static final long serialVersionUID = 8260966023216669077L;
	
	private JTable tablaBuyerSeller;
//	private Vector<String> columnas = new Vector<String>(3);
//	private Vector<String> valores = new Vector<String>();
	private BuyerSellerPanel panelBuyer = null;
	private DefaultTableModel model = new DefaultTableModel();;
	
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
				
				frame.setBounds(300, 300, 730, 540);
				frame.setContentPane(panelBuyer);
				frame.setVisible(true);
				frame.revalidate();
			}
		});
		
		JButton btnBorrar = new JButton("Borrar");
		add(btnBorrar);
		btnBorrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				removeBuyerSellerFromTable();
			}
		});
		
		tablaBuyerSeller = new JTable(model);
		tablaBuyerSeller.setPreferredSize(new Dimension(707, 240));
		
		JScrollPane scrollPane = new JScrollPane(tablaBuyerSeller);
		scrollPane.setPreferredSize(new Dimension(710, 260));
		add(scrollPane);
		
		tablaBuyerSeller.setFillsViewportHeight(true);
		
	}
	
	private void cargaTituloDeLaTabla() {
		model.addColumn("Id");
		model.addColumn("Ciudad");
		model.addColumn("MIC");
	}
	
	private void addBuyerSellerToTable(PartyIdentification791 buyerSeller) {
		for (PartyIdentification761 iden : buyerSeller.getAcctOwnr()) {
			model.addRow(new Object[] {iden.getId().getLEI(), iden.getCtryOfBrnch(), iden.getId().getMIC()});
		}
	}
	
	private void removeBuyerSellerFromTable() {
		model.removeRow(tablaBuyerSeller.getSelectedRow());
	}
}
