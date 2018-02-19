package es.com.cc.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import es.com.cc.core.schema.all.BusinessApplicationHeaderEnvelope;
import es.com.cc.core.schema.all.BusinessApplicationHeaderV01;
import es.com.cc.core.schema.all.BusinessDataHeaderV01;
import es.com.cc.core.schema.all.Document;
import es.com.cc.core.schema.all.FinancialInstrumentReportingTransactionReportV01;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.ReportingTransactionType1Choice1;
import es.com.cc.core.schema.all.SecuritiesTransactionReport21;
import es.com.cc.core.schema.all.SecuritiesTransactionReport41;
import es.com.cc.core.schema.all.StrictPayload;
import java.awt.FlowLayout;
import javax.swing.JSeparator;

public class EdicionXmlPanel extends JPanel {

	private static final long serialVersionUID = 8153525306985416127L;
	
	private static PrincipalPanel frame;
	private JTable tablaTransacciones;
	private NuevaTransaccionPanel nuevaTransaccionPanel;
	private HeaderPanel headerPanel;
	private Container esteContenedor;
	
	private DefaultTableModel model = new DefaultTableModel();
	private List<ReportingTransactionType1Choice1> listaTransacciones = new ArrayList<>();
	

	/**
	 * Create the panel.
	 */
	public EdicionXmlPanel(PrincipalPanel frame) {
		EdicionXmlPanel.frame = frame;
		setPreferredSize(new Dimension(1025, 700));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		cargaDatosDeLaTabla();
		
		/**
		 * ****************************************************************************************************
		 * panel1
		 */
		headerPanel = new HeaderPanel();
		add(headerPanel);
		
		/**
		 * Separador (linea y panel)
		 */
		JSeparator separator = new JSeparator();
		add(separator);
		separator.setPreferredSize(new Dimension(1000, 2));
		JPanel panelSeparador1 = new JPanel();
		panelSeparador1.setPreferredSize(new Dimension(998, 30));
		add(panelSeparador1);
		
		/**
		 * ****************************************************************************************************
		 * panel de contenido
		 */
		JPanel contenidoPanel = new JPanel();
		contenidoPanel.setBorder(null);
		contenidoPanel.setPreferredSize(new Dimension(998, 350));
		add(contenidoPanel);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setPreferredSize(new Dimension(998, 32));
		contenidoPanel.add(panel);
		
		JButton btnNewTransaction = new JButton("Nueva Transaccion");
		panel.add(btnNewTransaction);
		btnNewTransaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				muestraVentanaNuevaTransaccion();
			}
		});
		
		JButton btnCancelTransaction = new JButton("Cancelar Transaccion");
		panel.add(btnCancelTransaction);
		
		JButton btnNewButton = new JButton("Borrar Transaccion");
		panel.add(btnNewButton);
		
		tablaTransacciones = new JTable(model);
		tablaTransacciones.setPreferredSize(new Dimension(992, 196));
		
		JScrollPane scrollPane = new JScrollPane(tablaTransacciones);
		scrollPane.setPreferredSize(new Dimension(995, 200));
		contenidoPanel.add(scrollPane);
		
		/**
		 * ****************************************************************************************************
		 * botonera inferior
		 */
		
		JPanel panelSeparador2 = new JPanel();
		panelSeparador2.setPreferredSize(new Dimension(998, 40));
		add(panelSeparador2);
		JSeparator separator2 = new JSeparator();
		add(separator2);
		separator2.setPreferredSize(new Dimension(1000, 2));
		
		JPanel botonesPanel = new JPanel();
		botonesPanel.setPreferredSize(new Dimension(998, 40));
		add(botonesPanel);
		
		JButton btnGenerarXml = new JButton("Generar XML");
		botonesPanel.add(btnGenerarXml);
		btnGenerarXml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				final JFileChooser jfc = new JFileChooser();
//				String path = null;
//				int returnValue = jfc.showOpenDialog(null);
//				
//				if (returnValue == JFileChooser.APPROVE_OPTION) {
//					File selectedFile = jfc.getSelectedFile();
//					path = selectedFile.getAbsolutePath();
//				}
//				
//				if (path != null) {
//					generaXml(path);
//				}
				
				generaXml("");
			}
		});
		
		JButton btnBorrarDatos = new JButton("Borrar Datos");
		botonesPanel.add(btnBorrarDatos);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		botonesPanel.add(btnSalir);
	}
	
	private void muestraVentanaNuevaTransaccion() {
		EdicionXmlPanel.frame.setBounds(200, 100, 1025, 900);
		nuevaTransaccionPanel = new NuevaTransaccionPanel();
		
		nuevaTransaccionPanel.getBotonAceptar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ReportingTransactionType1Choice1 result = nuevaTransaccionPanel.getDatosDeOperaciones();
				listaTransacciones.add(result);
				addTransactionToTable(result);
				
				muestraPanelEdicionXml();
			}
		});
		
		nuevaTransaccionPanel.getBotonCancelar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				muestraPanelEdicionXml();
			}
		});
		
		muestraPanel(nuevaTransaccionPanel);
	}
	
	private void muestraPanel(JPanel panel) {
		esteContenedor = new Container();
		for (Component comp : EdicionXmlPanel.frame.getContentPane().getComponents()) {
			esteContenedor.add(comp);
		}
		
		EdicionXmlPanel.frame.getContentPane().removeAll();
		EdicionXmlPanel.frame.setContentPane(panel);
		EdicionXmlPanel.frame.revalidate();
	}
	
	private void muestraPanelEdicionXml() {
		EdicionXmlPanel.frame.getContentPane().removeAll();
		EdicionXmlPanel.frame.setContentPane(esteContenedor);
		EdicionXmlPanel.frame.revalidate();
		
		actualizaDatosEnPantalla();
	}
	
	private void addTransactionToTable(ReportingTransactionType1Choice1 report) {
		if (report.getNew() != null) {
			SecuritiesTransactionReport41 newTransaction = report.getNew();
			model.addRow(new Object[] {"Nueva", newTransaction.getTxId(), newTransaction.getSubmitgPty(), newTransaction.getExctgPty()});
		}
		
		if (report.getCxl() != null) {
			SecuritiesTransactionReport21 cxlTransaction = report.getCxl();
			model.addRow(new Object[] {"Cancelación", cxlTransaction.getTxId(), cxlTransaction.getSubmitgPty(), cxlTransaction.getExctgPty()});
		}
	}
	
	private void generaXml(String path) {
		ObjectFactory fac = new ObjectFactory();
		
		/**
		 * Cabecera
		 */
		JAXBElement<BusinessApplicationHeaderV01> appHdr = fac.createAppHdr(headerPanel.getDatosIntroducidos());
		BusinessApplicationHeaderEnvelope p1 = fac.createBusinessApplicationHeaderEnvelope();
		p1.setAny(appHdr);
		
		/**
		 * Contenido
		 */
		FinancialInstrumentReportingTransactionReportV01 finIns = fac.createFinancialInstrumentReportingTransactionReportV01();
		finIns.getTx().addAll(listaTransacciones);
		Document doc = fac.createDocument();
		doc.setFinInstrmRptgTxRpt(finIns);
		JAXBElement<Document> documentRoot = fac.createDocument(doc);
		StrictPayload p2 = fac.createStrictPayload();
		p2.setAny(documentRoot);
		
		/**
		 * Union de la cabecera y el contenido
		 */
		BusinessDataHeaderV01 dataHeader = fac.createBusinessDataHeaderV01();
		dataHeader.setHdr(p1);
		dataHeader.setPyld(p2);
		JAXBElement<BusinessDataHeaderV01> element = fac.createBizData(dataHeader);
		
		/**
		 * escritura del fichero en disco
		 */
		try {
			JAXBContext jc = JAXBContext.newInstance("es.com.cc.core.schema.all");
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			path = "C:\\prueba_xml_tramite_COM.xml";
	        marshaller.marshal(element, new File(path));
	        
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	private void cargaDatosDeLaTabla() {
		cargaColumnasDeLaTabla();
		
		for (ReportingTransactionType1Choice1 op : listaTransacciones) {
			addTransactionToTable(op);
		}
	}
	
	private void cargaColumnasDeLaTabla() {
		model.addColumn("Tipo");
		model.addColumn("TxId");
		model.addColumn("SubmitgPty");
		model.addColumn("ExctgPty");
	}
	
	private void actualizaDatosEnPantalla() {
		
	}
}
