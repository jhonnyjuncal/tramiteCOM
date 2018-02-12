package es.com.cc.ui;

import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.border.LineBorder;
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

public class EdicionXmlPanel extends JPanel {

	private static final long serialVersionUID = 8153525306985416127L;
	
	private static PrincipalPanel frame;
	private JTable tablaTransacciones;
	private NuevaTransaccionPanel nuevaTransaccionPanel;
	private HeaderPanel headerPanel;
	
	private DefaultTableModel model = new DefaultTableModel();
	private List<ReportingTransactionType1Choice1> listaTransacciones = new ArrayList<>();

	/**
	 * Create the panel.
	 */
	public EdicionXmlPanel(PrincipalPanel frame) {
		EdicionXmlPanel.frame = frame;
		
		setBounds(0, 0, 760, 830);
		setLayout(new BorderLayout(0, 0));
		
		
		/**
		 * ****************************************************************************************************
		 * panel1
		 */
		headerPanel = new HeaderPanel();
		add(headerPanel, BorderLayout.NORTH);
		
		
		/**
		 * ****************************************************************************************************
		 * panel2
		 */
		JPanel contenidoPanel = new JPanel();
		contenidoPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		contenidoPanel.setPreferredSize(new Dimension(725, 400));
		add(contenidoPanel, BorderLayout.CENTER);
		
		cargaColumnasDeLaTabla();
		
		tablaTransacciones = new JTable(model);
		tablaTransacciones.setPreferredSize(new Dimension(690, 196));
		tablaTransacciones.getTableHeader().setVisible(true);
		
		JButton btnNewButton = new JButton("Nueva Transaccion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				muestraVentanaNuevaTransaccion();
			}
		});
		contenidoPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar Transaccion");
		contenidoPanel.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane(tablaTransacciones);
		scrollPane.setPreferredSize(new Dimension(700, 200));
		contenidoPanel.add(scrollPane);
		
		JPanel botonesPanel = new JPanel();
		add(botonesPanel, BorderLayout.SOUTH);
		
		JButton btnGenerarXml = new JButton("Generar XML");
		botonesPanel.add(btnGenerarXml);
		btnGenerarXml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
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
		botonesPanel.add(btnSalir);
		
		
	}
	
	private void muestraVentanaNuevaTransaccion() {
		nuevaTransaccionPanel = new NuevaTransaccionPanel();
		
		nuevaTransaccionPanel.getBotonAceptar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReportingTransactionType1Choice1 result = nuevaTransaccionPanel.getDatosDeOperaciones();
				listaTransacciones.add(result);
				addTransactionToTable(result);
			}
		});
		
		nuevaTransaccionPanel.getBotonCancelar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanel(nuevaTransaccionPanel);
			}
		});
		
		muestraPanel(nuevaTransaccionPanel);
	}
	
	private void muestraPanel(JPanel panel) {
		frame.getContentPane().removeAll();
		frame.setContentPane(panel);
		frame.revalidate();
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
	
	private void cargaColumnasDeLaTabla() {
		model.addColumn("Tipo");
		model.addColumn("TxId");
		model.addColumn("SubmitgPty");
		model.addColumn("ExctgPty");
	}
}
