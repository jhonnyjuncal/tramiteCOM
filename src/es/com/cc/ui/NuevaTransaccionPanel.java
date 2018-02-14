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
	private TablaBuyerSeller tablaBuyer;
	private TablaBuyerSeller tablaSeller;
	private BuyerSellerPanel panelBuyer = new BuyerSellerPanel();
	private BuyerSellerPanel panelSeller = new BuyerSellerPanel();
	private OrdenTransmisionPanel panelOrdenTransmision;
	private TablaTransactionPanel tablaTransaction;
	private TransaccionPanel panelTransaccion;
	private FinInstrmPanel panelFinInstrm;
	private InvstmtDcsnPrsnPanel panelInvstmtDcsnPrsn;
	private ExctgPrsnPanel panelExctgPrsn;
	private AddtlAttrbtsPanel panelAddtlAttrbts;

	/**
	 * Create the panel.
	 */
	public NuevaTransaccionPanel() {
		setBounds(0, 0, 1000, 800);
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
		tabbedPane.setPreferredSize(new Dimension(998, 250));
		add(tabbedPane);
		tabbedPane.addTab("Buyer", null, panelBuyer, null);
		tabbedPane.addTab("Seller", null, panelSeller, null);
		
		/**
		 * ****************************************************************************************************
		 * panel OrdenTransmision
		 */
		panelOrdenTransmision = new OrdenTransmisionPanel();
		panelOrdenTransmision.setPreferredSize(new Dimension(998, 60));
		add(panelOrdenTransmision);
		
		/**
		 * ****************************************************************************************************
		 * panel Transaccion
		 */
		panelTransaccion = new TransaccionPanel();
		panelTransaccion.setPreferredSize(new Dimension(998, 320));
		add(panelTransaccion);
		
		/**
		 * ****************************************************************************************************
		 * FinInstrm
		 */
		panelFinInstrm = new FinInstrmPanel();
		panelFinInstrm.setPreferredSize(new Dimension(998, 100));
		add(panelFinInstrm);
		
		/**
		 * ****************************************************************************************************
		 * InvstmtDcsnPrsn
		 */
		panelInvstmtDcsnPrsn = new InvstmtDcsnPrsnPanel();
		panelInvstmtDcsnPrsn.setPreferredSize(new Dimension(998, 100));
		add(panelInvstmtDcsnPrsn);
		
		/**
		 * ****************************************************************************************************
		 * ExctgPrsn
		 */
		panelExctgPrsn = new ExctgPrsnPanel();
		panelExctgPrsn.setPreferredSize(new Dimension(998, 140));
		add(panelExctgPrsn);
		
		/**
		 * ****************************************************************************************************
		 * AddtlAttrbts
		 */
		panelAddtlAttrbts = new AddtlAttrbtsPanel();
		panelAddtlAttrbts.setPreferredSize(new Dimension(998, 100));
		add(panelAddtlAttrbts);
		
		/**
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
		secTranReport.setTxId(panelGeneral.getTxIdField());
		secTranReport.setExctgPty(panelGeneral.getExctgPtyField());
		secTranReport.setInvstmtPtyInd(panelGeneral.getInvstmtPtyIndField());
		secTranReport.setSubmitgPty(panelGeneral.getSubmitgPtyField());
		secTranReport.setBuyr(tablaBuyer.getDatosIntroducidos());
		secTranReport.setSellr(tablaSeller.getDatosIntroducidos());
		secTranReport.setOrdrTrnsmssn(panelOrdenTransmision.getDatosIntroducidos());
		secTranReport.setTx(tablaTransaction.getDatosIntroducidos());
		secTranReport.setFinInstrm(panelFinInstrm.getDatosIntroducidos());
		secTranReport.setInvstmtDcsnPrsn(panelInvstmtDcsnPrsn.getDatosIntroducidos());
		secTranReport.setExctgPrsn(panelExctgPrsn.getDatosIntroducidos());
		secTranReport.setAddtlAttrbts(panelAddtlAttrbts.getDatosIntroducidos());
		
		ReportingTransactionType1Choice1 resp = factory.createReportingTransactionType1Choice1();
		resp.setNew(secTranReport);
		
		return resp;
	}
}
