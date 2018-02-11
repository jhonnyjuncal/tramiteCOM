package es.com.cc.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.ReportingTransactionType1Choice1;

public class NuevaTransaccionPanel extends JPanel {

	private static final long serialVersionUID = -5426067842782204622L;
	
	private JButton btnAceptar;
	private JButton btnCancelar;
	
	private ActionListener buyerListener;
	private ActionListener sellerListener;

	/**
	 * Create the panel.
	 */
	public NuevaTransaccionPanel() {
		setBounds(0, 0, 730, 830);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		/**
		 * ****************************************************************************************************
		 * panel generalesPanel
		 */
		GeneralesPanel panelGeneral = new GeneralesPanel();
		panelGeneral.setPreferredSize(new Dimension(715, 70));
		add(panelGeneral);
		
		
		/**
		 * ****************************************************************************************************
		 * panel usuarios y compradores
		 */
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setPreferredSize(new Dimension(715, 250));
		add(tabbedPane);
		
		TablaBuyerSeller tablaBuyer = new TablaBuyerSeller();
		TablaBuyerSeller tablaSeller = new TablaBuyerSeller();
		
		tabbedPane.addTab("Buyer", null, tablaBuyer, null);
		tabbedPane.addTab("Seller", null, tablaSeller, null);
		
		/**
		 * ****************************************************************************************************
		 * panel OrdenTransmision
		 */
		OrdenTransmisionPanel panelOrdenesTransmision = new OrdenTransmisionPanel();
		panelOrdenesTransmision.setPreferredSize(new Dimension(715, 100));
		add(panelOrdenesTransmision);
		
		/**
		 * ****************************************************************************************************
		 * panel Transaccion
		 */
		TablaTransactionPanel tablaTransaction = new TablaTransactionPanel();
		tablaTransaction.setPreferredSize(new Dimension(715, 200));
		add(tablaTransaction);
		
		
		/**
		 * ****************************************************************************************************
		 * FinInstrm
		 */
		
		
		/**
		 * ****************************************************************************************************
		 * InvstmtDcsnPrsn
		 */
		
		
		/**
		 * ****************************************************************************************************
		 * ExctgPrsn
		 */
		
		
		/**
		 * ****************************************************************************************************
		 * AddtlAttrbts
		 */
		
		
		/**
		 * botonera inferior
		 */
		JPanel panelBotones = new JPanel();
		add(panelBotones);
		
		btnAceptar = new JButton("Aceptar");
		panelBotones.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		panelBotones.add(btnCancelar);
		
		
		
	}
	
	public JButton getBotonAceptar() {
		return btnAceptar;
	}
	
	public JButton getBotonCancelar() {
		return btnCancelar;
	}
	
	public ReportingTransactionType1Choice1 getDatosDeOperaciones() {
		ObjectFactory factory = new ObjectFactory();
		
		
		ReportingTransactionType1Choice1 resp = factory.createReportingTransactionType1Choice1();
		resp.setCxl();
		resp.setNew();
		
		return resp;
	}
}
