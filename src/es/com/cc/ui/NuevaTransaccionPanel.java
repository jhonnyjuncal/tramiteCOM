package es.com.cc.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.ReportingTransactionType1Choice1;
import es.com.cc.core.schema.all.SecuritiesTransactionReport41;

public class NuevaTransaccionPanel extends JPanel {

	private static final long serialVersionUID = -5426067842782204622L;
	
	private JButton btnAceptar;
	private JButton btnCancelar;
	
	private GeneralesPanel panelGeneral;
	private BuyerSellerPanel panelBuyer = new BuyerSellerPanel();
	private BuyerSellerPanel panelSeller = new BuyerSellerPanel();
	private OrdenTransmisionPanel panelOrdenTransmision;
	private TransaccionPanel panelTransaccion;
	private FinInstrmPanel panelFinInstrm;
	private InvstmtDcsnPrsnPanel panelInvstmtDcsnPrsn;
	private ExctgPrsnPanel panelExctgPrsn;
	private AddtlAttrbtsPanel panelAddtlAttrbts;
	private JPanel panelSeparador;

	/**
	 * Create the panel.
	 */
	public NuevaTransaccionPanel() {
		setBounds(0, 0, 1025, 865);
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		/**
		 * ****************************************************************************************************
		 * panel generalesPanel
		 */
		panelGeneral = new GeneralesPanel();
		panelGeneral.setPreferredSize(new Dimension(998, 70));
		add(panelGeneral);
		
		/**
		 * ****************************************************************************************************
		 * panel vendedores y compradores
		 */
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setPreferredSize(new Dimension(998, 270));
		add(tabbedPane);
		
		tabbedPane.addTab("Buyer", null, panelBuyer, null);
		tabbedPane.addTab("Seller", null, panelSeller, null);
		
		/**
		 * ****************************************************************************************************
		 * panel OrdenTransmision
		 */
		panelOrdenTransmision = new OrdenTransmisionPanel();
		panelOrdenTransmision.setPreferredSize(new Dimension(998, 30));
		add(panelOrdenTransmision);
		
		/**
		 * ****************************************************************************************************
		 * panel Transaccion
		 */
		panelTransaccion = new TransaccionPanel();
		panelTransaccion.setPreferredSize(new Dimension(998, 235));
		add(panelTransaccion);
		
		/**
		 * ****************************************************************************************************
		 * FinInstrm
		 */
		panelFinInstrm = new FinInstrmPanel();
		panelFinInstrm.setPreferredSize(new Dimension(998, 30));
		add(panelFinInstrm);
		
		/**
		 * ****************************************************************************************************
		 * InvstmtDcsnPrsn
		 */
		panelInvstmtDcsnPrsn = new InvstmtDcsnPrsnPanel();
		panelInvstmtDcsnPrsn.setPreferredSize(new Dimension(998, 30));
		add(panelInvstmtDcsnPrsn);
		
		/**
		 * ****************************************************************************************************
		 * ExctgPrsn
		 */
		panelExctgPrsn = new ExctgPrsnPanel();
		panelExctgPrsn.setPreferredSize(new Dimension(998, 30));
		add(panelExctgPrsn);
		
		/**
		 * ****************************************************************************************************
		 * AddtlAttrbts
		 */
		panelAddtlAttrbts = new AddtlAttrbtsPanel();
		panelAddtlAttrbts.setPreferredSize(new Dimension(998, 30));
		add(panelAddtlAttrbts);
		
		
		/**
		 * ****************************************************************************************************
		 * panel separador
		 */
		panelSeparador = new JPanel();
		panelSeparador.setPreferredSize(new Dimension(998, 50));
		add(panelSeparador);
		
		
		/**
		 * ****************************************************************************************************
		 * botonera inferior
		 */
		JPanel panelBotones = new JPanel();
		panelBotones.setPreferredSize(new Dimension(998, 35));
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
		SecuritiesTransactionReport41 secTranReport = factory.createSecuritiesTransactionReport41();
		
		// Panel General
		secTranReport.setTxId(panelGeneral.getTxIdField());
		secTranReport.setExctgPty(panelGeneral.getExctgPtyField());
		secTranReport.setInvstmtPtyInd(panelGeneral.getInvstmtPtyIndField());
		secTranReport.setSubmitgPty(panelGeneral.getSubmitgPtyField());
		
		// tabbed Pane
		secTranReport.setBuyr(panelBuyer.getDatosIntroducidos());
		secTranReport.setSellr(panelSeller.getDatosIntroducidos());
		
		// panel OrdrTrnsmssn
		if (panelOrdenTransmision.isIncludedInGeneratedXml()) {
			secTranReport.setOrdrTrnsmssn(panelOrdenTransmision.getDatosIntroducidos());
		}
		
		// panel de Datos de la Transaccion
		secTranReport.setTx(panelTransaccion.getDatosIntroducidos());
		
		// panel FinInstrm 
		if (panelFinInstrm.isIncludedInGeneratedXml()) {
			secTranReport.setFinInstrm(panelFinInstrm.getDatosIntroducidos());
		}
		
		// panel InvstmtDcsnPrsn
		if (panelInvstmtDcsnPrsn.isIncludedInGeneratedXml()) {
			secTranReport.setInvstmtDcsnPrsn(panelInvstmtDcsnPrsn.getDatosIntroducidos());
		}
		
		// panel ExctgPrsn
		if (panelExctgPrsn.isIncludedInGeneratedXml()) {
			secTranReport.setExctgPrsn(panelExctgPrsn.getDatosIntroducidos());
		}
		
		// panel AddtlAttrbts
		if (panelAddtlAttrbts.isIncludedInGeneratedXml()) {
			secTranReport.setAddtlAttrbts(panelAddtlAttrbts.getDatosIntroducidos());
		}
		
		ReportingTransactionType1Choice1 resp = factory.createReportingTransactionType1Choice1();
		resp.setNew(secTranReport);
		
		return resp;
	}
}
