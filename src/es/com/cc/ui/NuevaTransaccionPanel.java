package es.com.cc.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class NuevaTransaccionPanel extends JPanel {

	private static final long serialVersionUID = -5426067842782204622L;
	
	private JButton btnAceptar;
	private JButton btnCancelar;
	

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
		panelGeneral.setPreferredSize(new Dimension(730, 70));
		add(panelGeneral);
		
		
		/**
		 * ****************************************************************************************************
		 * panel JTabbedPane
		 */
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setPreferredSize(new Dimension(730, 300));
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
		panelOrdenesTransmision.setPreferredSize(new Dimension(730, 100));
		add(panelOrdenesTransmision);
		
		
		/**
		 * ****************************************************************************************************
		 * panel Transaccion
		 */
		TransaccionPanel panelTransacciones = new TransaccionPanel();
		panelTransacciones.setPreferredSize(new Dimension(730, 200));
		add(panelTransacciones);
		
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
	
	public void getDatosDeOperaciones() {
		
	}
}
