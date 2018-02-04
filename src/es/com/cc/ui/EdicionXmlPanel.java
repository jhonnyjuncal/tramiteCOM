package es.com.cc.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import org.xml.sax.SAXException;

import es.com.cc.core.schema.all.BusinessApplicationHeaderEnvelope;
import es.com.cc.core.schema.all.BusinessApplicationHeaderV01;
import es.com.cc.core.schema.all.BusinessDataHeaderV01;
import es.com.cc.core.schema.all.Document;
import es.com.cc.core.schema.all.GenericOrganisationIdentification11;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.OrganisationIdentification71;
import es.com.cc.core.schema.all.OrganisationIdentificationSchemeName1Choice;
import es.com.cc.core.schema.all.Party10Choice1;
import es.com.cc.core.schema.all.Party9Choice1;
import es.com.cc.core.schema.all.PartyIdentification421;
import es.com.cc.core.schema.all.StrictPayload;
//import es.com.cc.core.schema.envio.BusinessApplicationHeader11;
//import es.com.cc.core.schema.envio.BusinessApplicationHeaderEnvelope;
//import es.com.cc.core.schema.envio.BusinessApplicationHeaderV01;
//import es.com.cc.core.schema.envio.BusinessDataHeaderV01;
//import es.com.cc.core.schema.envio.Document;
//import es.com.cc.core.schema.envio.FinancialInstrumentReportingTransactionReportV01;
//import es.com.cc.core.schema.envio.GenericOrganisationIdentification11;
//import es.com.cc.core.schema.envio.ObjectFactory;
//import es.com.cc.core.schema.envio.OrganisationIdentification71;
//import es.com.cc.core.schema.envio.OrganisationIdentificationSchemeName1Choice;
//import es.com.cc.core.schema.envio.Party10Choice1;
//import es.com.cc.core.schema.envio.Party9Choice1;
//import es.com.cc.core.schema.envio.PartyIdentification421;
//import es.com.cc.core.schema.envio.ReportingTransactionType1Choice1;
//import es.com.cc.core.schema.envio.SecuritiesTransactionReport41;
//import es.com.cc.core.schema.envio.StrictPayload;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;

public class EdicionXmlPanel extends JPanel {

	private static final long serialVersionUID = 8153525306985416127L;
	
	private static PrincipalPanel frame;
	private JTable table;
	private NuevaTransaccionPanel nuevaTransaccionPanel;
	private HeaderPanel headerPanel;
	
	private static String[] columnas = new String[] {
			"Tipo", "Valor1", "Valor2", "Valor3" };
	private static Object[][] valores = new Object[][] {
			{"Cancelacion", "valor1", "valor2", "valor3"},
			{"Nueva",       "valor1", "valor2", "valor3"}
	};
	

	/**
	 * Create the panel.
	 */
	public EdicionXmlPanel(PrincipalPanel frame) {
		EdicionXmlPanel.frame = frame;
		
		setBounds(0, 0, 730, 830);
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
		JPanel panel2 = new JPanel();
		panel2.setPreferredSize(new Dimension(630, 400));
		add(panel2, BorderLayout.CENTER);
		
		table = new JTable(valores, columnas);
		table.setPreferredSize(new Dimension(730, 400));
		table.getTableHeader().setVisible(true);
		
		JButton btnNewButton = new JButton("Nueva Transaccion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				muestraVentanaNuevaOperacion();
			}
		});
		panel2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar Transaccion");
		panel2.add(btnNewButton_1);
		panel2.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(730, 400));
		panel2.add(scrollPane);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		JButton btnGenerarXml = new JButton("Generar XML");
		panel.add(btnGenerarXml);
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
		
		
		JButton btnNewButton_3 = new JButton("Borrar Datos");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Salir");
		panel.add(btnNewButton_4);
	}
	
	private void muestraVentanaNuevaOperacion() {
		nuevaTransaccionPanel = new NuevaTransaccionPanel();
		muestraPanel(nuevaTransaccionPanel);
	}
	
	private void muestraPanel(JPanel panel) {
		frame.getContentPane().removeAll();
		frame.setContentPane(panel);
		frame.revalidate();
	}
	
	private void generaXml(String path) {
//		ObjectFactory objFac = new ObjectFactory();
//		
//		/**
//		 * FROM
//		 */
//		OrganisationIdentificationSchemeName1Choice fromOrgIdChoice = objFac.createOrganisationIdentificationSchemeName1Choice();
//		fromOrgIdChoice.setCd("NDID");
//		
//		GenericOrganisationIdentification11 fromOrgId11 = objFac.createGenericOrganisationIdentification11();
//		fromOrgId11.setId("jhonny1");
//		fromOrgId11.setSchmeNm(fromOrgIdChoice);
//		
//		OrganisationIdentification71 fromOI = objFac.createOrganisationIdentification71();
//		fromOI.setOthr(fromOrgId11);
//		
//		Party10Choice1 fromPartyId = objFac.createParty10Choice1();
//		fromPartyId.setOrgId(fromOI);
//		
//		PartyIdentification421 fromOrgId = objFac.createPartyIdentification421();
//		fromOrgId.setId(fromPartyId);
//		
//		Party9Choice1 fromValue = objFac.createParty9Choice1();
//		fromValue.setOrgId(fromOrgId);
//		
//		
//		/**
//		 * TO
//		 */
//		OrganisationIdentificationSchemeName1Choice toOrgIdChoice = objFac.createOrganisationIdentificationSchemeName1Choice();
//		toOrgIdChoice.setCd("LEI");
//		
//		GenericOrganisationIdentification11 toOrgId11 = objFac.createGenericOrganisationIdentification11();
//		toOrgId11.setId("jhonny2");
//		toOrgId11.setSchmeNm(toOrgIdChoice);
//		
//		OrganisationIdentification71 toOI = objFac.createOrganisationIdentification71();
//		toOI.setOthr(toOrgId11);
//		
//		Party10Choice1 toPartyId = objFac.createParty10Choice1();
//		toPartyId.setOrgId(toOI);
//		
//		PartyIdentification421 toOrgId = objFac.createPartyIdentification421();
//		toOrgId.setId(toPartyId);
//		
//		Party9Choice1 toValue = objFac.createParty9Choice1();
//		toValue.setOrgId(toOrgId);
//		
//		
//		
//		
//		BusinessApplicationHeaderV01 header = objFac.createBusinessApplicationHeaderV01();
//		header.setFr(fromValue);
//		header.setTo(toValue);
//		header.setBizMsgIdr(header.getBizMsgIdr());
//		header.setMsgDefIdr(header.getMsgDefIdr());
//		header.setCreDt(header.getCreDt());
//		JAXBElement<BusinessApplicationHeaderV01> appHdrNode = objFac.createAppHdr(header);
//		
//		SecuritiesTransactionReport41 txNew = objFac.createSecuritiesTransactionReport41();
//		txNew.setTxId("txtxtx01");
//		txNew.setExctgPty("excgexcg01");
//		txNew.setInvstmtPtyInd(true);
//		txNew.setSubmitgPty("0101010101");
////		txNew.setBuyr();
////		txNew.setSellr();
////		txNew.setOrdrTrnsmssn();
////		txNew.setTx();
////		txNew.setFinInstrm();
////		txNew.setExctgPrsn();
////		txNew.setAddtlAttrbts();
//		
//		
//		ReportingTransactionType1Choice1 nuevaOperacion = objFac.createReportingTransactionType1Choice1();
//		nuevaOperacion.setNew(txNew);
//		
//		FinancialInstrumentReportingTransactionReportV01 finIns = objFac.createFinancialInstrumentReportingTransactionReportV01();
//		finIns.getTx().add(nuevaOperacion);
//		
//		
//		Document documentValue = objFac.createDocument();
//		documentValue.setFinInstrmRptgTxRpt(finIns);
//		
//		StrictPayload pyldValue = objFac.createStrictPayload();
//		pyldValue.setAny(documentValue);
//		
//		BusinessApplicationHeaderEnvelope hdrValue = objFac.createBusinessApplicationHeaderEnvelope();
//		hdrValue.setAny(appHdrNode);
//		
//		
//		BusinessDataHeaderV01 bizDataValue = objFac.createBusinessDataHeaderV01();
//		bizDataValue.setHdr(hdrValue);
//		bizDataValue.setPyld(pyldValue);
//		
//		
//		JAXBElement<BusinessDataHeaderV01> bizDataNode = objFac.createBizData(bizDataValue);
//		JAXBElement<Document> documentNode = objFac.createDocument(documentValue);
		
		
		
		
		ObjectFactory fac = new ObjectFactory();
		
		/**
		 * Cabecera
		 */
		OrganisationIdentificationSchemeName1Choice fromSchema = fac.createOrganisationIdentificationSchemeName1Choice();
		if (headerPanel.getFromSchema() == 0) {
			fromSchema.setCd(headerPanel.getFromPytryTextField());
			
		} else {
			fromSchema.setPrtry(headerPanel.getToPytryTextField());
		}
		
		GenericOrganisationIdentification11 fromGenericOrg = fac.createGenericOrganisationIdentification11();
		fromGenericOrg.setId(headerPanel.getFromIdTextField());
		fromGenericOrg.setSchmeNm(fromSchema);
		
		OrganisationIdentification71 fromOrgaId = fac.createOrganisationIdentification71();
		fromOrgaId.setOthr(fromGenericOrg);
		
		Party10Choice1 fromChoice = fac.createParty10Choice1();
		fromChoice.setOrgId(fromOrgaId);
		
		PartyIdentification421 fromOrgId = fac.createPartyIdentification421();
		fromOrgId.setId(fromChoice);
		
		Party9Choice1 from = fac.createParty9Choice1();
		from.setOrgId(fromOrgId);
		
		
		
		GenericOrganisationIdentification11 toGenericOrg = fac.createGenericOrganisationIdentification11();
		toGenericOrg.setId();
		toGenericOrg.setSchmeNm();
		
		OrganisationIdentification71 toOrgaId = fac.createOrganisationIdentification71();
		toOrgaId.setOthr(toGenericOrg);
		
		Party10Choice1 toChoice = fac.createParty10Choice1();
		toChoice.setOrgId(toOrgaId);
		
		PartyIdentification421 toOrgId = fac.createPartyIdentification421();
		toOrgId.setId(toChoice);
		
		Party9Choice1 to = fac.createParty9Choice1();
		to.setOrgId(toOrgId);
		
		
		BusinessApplicationHeaderV01 header = fac.createBusinessApplicationHeaderV01();
		header.setFr(from);
		header.setTo(to);
		header.setBizMsgIdr("000000001");
		header.setMsgDefIdr("000000002");
//		header.setCreDt();
		
		JAXBElement<BusinessApplicationHeaderV01> appHdr = fac.createAppHdr(header);
		
		BusinessApplicationHeaderEnvelope p1 = fac.createBusinessApplicationHeaderEnvelope();
		p1.setAny(appHdr);
		
		
		
		
		/**
		 * Contenido
		 */
		Document doc = fac.createDocument();
		
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
		
		
		
		
		try {
			JAXBContext jc = JAXBContext.newInstance("es.com.cc.core.schema.all");
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			path = "C:\\Users\\JHONNY\\Desktop\\prueba_xml_tramite_COM.xml";
	        marshaller.marshal(element, new File(path));
	        
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		/**
		 * part 1
		 */
//		es.com.cc.core.schema.part1.ObjectFactory factory1 = new es.com.cc.core.schema.part1.ObjectFactory();
//		
//		es.com.cc.core.schema.part1.Document document = factory1.createDocument();
//		
//		JAXBElement<es.com.cc.core.schema.part1.Document> rootDocument = factory1.createDocument(document);
		
		
		
		
		
		
		
		
		
		
		/**
		 * uso el paquete "part2"
		 */
//		es.com.cc.core.schema.part2.ObjectFactory factory2 = new es.com.cc.core.schema.part2.ObjectFactory();
//		
//		es.com.cc.core.schema.part2.BusinessApplicationHeaderV01 p2AppHdr = factory2.createBusinessApplicationHeaderV01();
//		
//		p2AppHdr.setFr(factory2.createParty9Choice1());
//		p2AppHdr.setTo(factory2.createParty9Choice1());
//		p2AppHdr.setBizMsgIdr("111111");
//		p2AppHdr.setMsgDefIdr("33333333333");
//		
//		
//		JAXBElement<es.com.cc.core.schema.part2.BusinessApplicationHeaderV01> headerValue = factory2.createAppHdr(p2AppHdr);
		
		
		
		
		
		
		
		/**
		 * part3
		 */
		
		
		
//		try {
//			path = "C:\\Users\\JHONNY\\Desktop\\prueba_xml_tramite_COM.xml";
//			JAXBContext jc = JAXBContext.newInstance("es.com.cc.core.schema.part2");
//			Marshaller marshaller = jc.createMarshaller();
//			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//			
//	        marshaller.marshal(rootElement, new File(path));
//			
//		} catch (JAXBException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
//		StringWriter p1 = convertElementPackage1(rootDocument);
//		StringWriter p2 = convertElementPackage2(headerValue);
//		convertElementPackage3(p1, p2);
	}
	
	
	
	
	
	private StringWriter convertElementPackage1(JAXBElement<es.com.cc.core.schema.part1.Document> element) {
	    try {
			JAXBContext jc = JAXBContext.newInstance("es.com.cc.core.schema.part1");
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter str = new StringWriter();
	        marshaller.marshal(element, System.out);
	        
	        return str;
	        
	    } catch(JAXBException e) {
	    	e.printStackTrace();
	    }
	    return null;
	}
	
	private StringWriter convertElementPackage2(JAXBElement<es.com.cc.core.schema.part2.BusinessApplicationHeaderV01> element) {
	    try {
			JAXBContext jc = JAXBContext.newInstance("es.com.cc.core.schema.part2");
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter str = new StringWriter();
	        marshaller.marshal(element, System.out);
	        
	        return str;
	        
	    } catch(JAXBException e) {
	    	e.printStackTrace();
	    }
	    return null;
	}
	
	private void convertElementPackage3(StringWriter p1, StringWriter p2) {
	    try {
	    	es.com.cc.core.schema.part3.ObjectFactory factory3 = new es.com.cc.core.schema.part3.ObjectFactory();
			
			es.com.cc.core.schema.part3.BusinessApplicationHeaderEnvelope p3HdrValue = factory3.createBusinessApplicationHeaderEnvelope();
			p3HdrValue.setAny(p1);
			
			es.com.cc.core.schema.part3.StrictPayload p3Strict = factory3.createStrictPayload();
			p3Strict.setAny(p2);
			
			es.com.cc.core.schema.part3.BusinessDataHeaderV01 p3BizDataValue = factory3.createBusinessDataHeaderV01();
			p3BizDataValue.setHdr(p3HdrValue);
			p3BizDataValue.setPyld(p3Strict);
			
			JAXBElement<es.com.cc.core.schema.part3.BusinessDataHeaderV01> rootElement = factory3.createBizData(p3BizDataValue);
	    	
	    	
			JAXBContext jc = JAXBContext.newInstance("es.com.cc.core.schema.part3");
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			String path = "C:\\Users\\JHONNY\\Desktop\\prueba_xml_tramite_COM.xml";
	        marshaller.marshal(rootElement, System.out);
	        
	    } catch(JAXBException e) {
	    	e.printStackTrace();
	    }
	}
}
