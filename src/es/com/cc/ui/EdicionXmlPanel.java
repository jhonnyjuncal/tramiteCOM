package es.com.cc.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import es.com.cc.core.schema.all.ActiveCurrencyAnd13DecimalAmount;
import es.com.cc.core.schema.all.AmountAndDirection61;
import es.com.cc.core.schema.all.BusinessApplicationHeaderEnvelope;
import es.com.cc.core.schema.all.BusinessApplicationHeaderV01;
import es.com.cc.core.schema.all.BusinessDataHeaderV01;
import es.com.cc.core.schema.all.Document;
import es.com.cc.core.schema.all.ESMAPositiveExcludingZeroMax18;
import es.com.cc.core.schema.all.ExecutingParty1Choice1;
import es.com.cc.core.schema.all.FinancialInstrumentAttributes3Choice1;
import es.com.cc.core.schema.all.FinancialInstrumentQuantity25Choice1;
import es.com.cc.core.schema.all.FinancialInstrumentReportingTransactionReportV01;
import es.com.cc.core.schema.all.GenericOrganisationIdentification11;
import es.com.cc.core.schema.all.GenericPersonIdentification11;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.OrganisationIdentification71;
import es.com.cc.core.schema.all.OrganisationIdentificationSchemeName1Choice;
import es.com.cc.core.schema.all.Party10Choice1;
import es.com.cc.core.schema.all.Party9Choice1;
import es.com.cc.core.schema.all.PartyIdentification421;
import es.com.cc.core.schema.all.PartyIdentification761;
import es.com.cc.core.schema.all.PartyIdentification791;
import es.com.cc.core.schema.all.PersonIdentification101;
import es.com.cc.core.schema.all.PersonIdentificationSchemeName1Choice1;
import es.com.cc.core.schema.all.PersonOrOrganisation1Choice1;
import es.com.cc.core.schema.all.PersonOrOrganisation2Choice1;
import es.com.cc.core.schema.all.RegulatoryTradingCapacity1Code;
import es.com.cc.core.schema.all.ReportingTransactionType1Choice1;
import es.com.cc.core.schema.all.SecuritiesTransaction11;
import es.com.cc.core.schema.all.SecuritiesTransactionIndicator21;
import es.com.cc.core.schema.all.SecuritiesTransactionPrice2Choice;
import es.com.cc.core.schema.all.SecuritiesTransactionPrice4Choice;
import es.com.cc.core.schema.all.SecuritiesTransactionReport41;
import es.com.cc.core.schema.all.SecuritiesTransactionTransmission2;
import es.com.cc.core.schema.all.SecurityInstrumentDescription11;
import es.com.cc.core.schema.all.SecurityInstrumentDescription131;
import es.com.cc.core.schema.all.Side5Code;
import es.com.cc.core.schema.all.StrictPayload;

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
		
		setBounds(0, 0, 725, 830);
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
		panel2.setPreferredSize(new Dimension(725, 400));
		add(panel2, BorderLayout.CENTER);
		
		table = new JTable(valores, columnas);
		table.setPreferredSize(new Dimension(715, 270));
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
		scrollPane.setPreferredSize(new Dimension(720, 300));
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
		ObjectFactory fac = new ObjectFactory();
		
		/**
		 * Cabecera
		 */
		OrganisationIdentificationSchemeName1Choice fromSchema = fac.createOrganisationIdentificationSchemeName1Choice();
		if (headerPanel.getFromSchema() == 0) {
			fromSchema.setCd(headerPanel.getFromPytryCdTextField());
			
		} else {
			fromSchema.setPrtry(headerPanel.getFromPytryCdTextField());
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
		
		
		
		OrganisationIdentificationSchemeName1Choice toSchema = fac.createOrganisationIdentificationSchemeName1Choice();
		if (headerPanel.getToSchema() == 0) {
			toSchema.setCd(headerPanel.getToPytryCdTextField());
			
		} else {
			toSchema.setPrtry(headerPanel.getToPytryCdTextField());
		}
		
		GenericOrganisationIdentification11 toGenericOrg = fac.createGenericOrganisationIdentification11();
		toGenericOrg.setSchmeNm(toSchema);
		toGenericOrg.setId(headerPanel.getToIdTextField());
		
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
		header.setBizMsgIdr(headerPanel.getBizMsgIdrTextField());
		header.setMsgDefIdr(headerPanel.getMsgDefIdrTextField());
		
		String creDtTextField = headerPanel.getCreDtTextField();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(new Date());
		XMLGregorianCalendar xmlCalendar = null;
		
		try {
			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
			
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		header.setCreDt(xmlCalendar);
		
		JAXBElement<BusinessApplicationHeaderV01> appHdr = fac.createAppHdr(header);
		
		BusinessApplicationHeaderEnvelope p1 = fac.createBusinessApplicationHeaderEnvelope();
		p1.setAny(appHdr);
		
		
		
		
		/**
		 * Contenido
		 */
		PersonOrOrganisation1Choice1 pChoice1 = fac.createPersonOrOrganisation1Choice1();
		pChoice1.setLEI("LEI_DE_LA_EMPRESA");
		
		PartyIdentification761 acctOwn = fac.createPartyIdentification761();
		acctOwn.setId(pChoice1);
		acctOwn.setCtryOfBrnch("ES");
		
		GregorianCalendar calendar2 = new GregorianCalendar();
		calendar2.setTime(new Date());
		XMLGregorianCalendar xmlCalendar2 = null;
		
		try {
			xmlCalendar2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar2);
			
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PersonIdentificationSchemeName1Choice1 prsnIdChoice = fac.createPersonIdentificationSchemeName1Choice1();
		prsnIdChoice.setCd("LEI");
		
		GenericPersonIdentification11 genericPersn = fac.createGenericPersonIdentification11();
		genericPersn.setId("IDENTIFICADOR");
		genericPersn.setSchmeNm(prsnIdChoice);
		
		PersonIdentification101 pi2 = fac.createPersonIdentification101();
		pi2.setNm("NOMBRE");
		pi2.setFrstNm("APELLIDO");
		pi2.setBirthDt(xmlCalendar2);
		pi2.setOthr(genericPersn);
		
		PersonOrOrganisation2Choice1 dcsnMark = fac.createPersonOrOrganisation2Choice1();
		dcsnMark.setLEI("LEI_DE_LA_EMPRESA");
		dcsnMark.setPrsn(pi2);
		
		PartyIdentification791 buyer = fac.createPartyIdentification791();
		buyer.getAcctOwnr().add(acctOwn);
		buyer.getDcsnMakr().add(dcsnMark);
		
		SecuritiesTransactionTransmission2 ordTrans = fac.createSecuritiesTransactionTransmission2();
		ordTrans.setTrnsmssnInd(true);
//		ordTrans.setTrnsmttgBuyr();
//		ordTrans.setTrnsmttgSellr();
		
		GregorianCalendar calendar3 = new GregorianCalendar();
		calendar3.setTime(new Date());
		XMLGregorianCalendar xmlCalendar3 = null;
		
		try {
			xmlCalendar3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar3);
			
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ESMAPositiveExcludingZeroMax18 nmnVal = fac.createESMAPositiveExcludingZeroMax18();
		nmnVal.setValue(BigDecimal.ONE);
		nmnVal.setCcy("EUR");
		
		FinancialInstrumentQuantity25Choice1 qty = fac.createFinancialInstrumentQuantity25Choice1();
		qty.setUnit(BigDecimal.TEN);
		qty.setNmnlVal(nmnVal);
		qty.setMntryVal(nmnVal);
		
		ActiveCurrencyAnd13DecimalAmount amount = fac.createActiveCurrencyAnd13DecimalAmount();
		amount.setValue(BigDecimal.TEN);
		amount.setCcy("USD");
		
		AmountAndDirection61 monto = fac.createAmountAndDirection61();
		monto.setAmt(amount);
		monto.setSgn(true);
		
		SecuritiesTransactionPrice2Choice pricChoice = fac.createSecuritiesTransactionPrice2Choice();
		pricChoice.setMntryVal(monto);
		
		SecuritiesTransactionPrice4Choice precio = fac.createSecuritiesTransactionPrice4Choice();
		precio.setPric(pricChoice);
//		precio.setNoPric();
		
		SecuritiesTransaction11 transa = fac.createSecuritiesTransaction11();
		transa.setTradDt(xmlCalendar3);
		transa.setTradgCpcty(RegulatoryTradingCapacity1Code.DEAL);
		transa.setQty(qty);
		transa.setPric(precio);
		transa.setTradVn("TRADVN");
		transa.setCtryOfBrnch("UK");
		
		SecurityInstrumentDescription11 secu2 = fac.createSecurityInstrumentDescription11();
		secu2.setId("id_lo_que_sea");
		secu2.setFullNm("nombre completo");
		secu2.setClssfctnTp("tipo_clasificacion");
		secu2.setNtnlCcy("ntnl_ccy");
		
		SecurityInstrumentDescription131 secu1 = fac.createSecurityInstrumentDescription131();
//		secu1.setDebtInstrmAttrbts();
//		secu1.setDerivInstrmAttrbts();
		secu1.setFinInstrmGnlAttrbts(secu2);
		
		FinancialInstrumentAttributes3Choice1 finInst = fac.createFinancialInstrumentAttributes3Choice1();
		finInst.setId("identificador");
		finInst.setOthr(secu1);
		
		ExecutingParty1Choice1 partyChoice = fac.createExecutingParty1Choice1();
//		partyChoice.setClnt();
		partyChoice.setAlgo("ALGORITMO");
//		partyChoice.setPrsn();
		
		SecuritiesTransactionIndicator21 secu3 = fac.createSecuritiesTransactionIndicator21();
		secu3.setRskRdcgTx(true);
		secu3.setSctiesFincgTxInd(false);
		secu3.setShrtSellgInd(Side5Code.SSEX);
		
		SecuritiesTransactionReport41 txNew = fac.createSecuritiesTransactionReport41();
		txNew.setTxId("0000001");
		txNew.setExctgPty("00000111111");
		txNew.setInvstmtPtyInd(false);
		txNew.setSubmitgPty("4444444");
		txNew.setBuyr(buyer);
		txNew.setSellr(buyer);
		txNew.setOrdrTrnsmssn(ordTrans);
		txNew.setTx(transa);
		txNew.setFinInstrm(finInst);
		txNew.setExctgPrsn(partyChoice);
		txNew.setAddtlAttrbts(secu3);
		
		
		ReportingTransactionType1Choice1 tx = fac.createReportingTransactionType1Choice1();
		tx.setNew(txNew);
		
		FinancialInstrumentReportingTransactionReportV01 finIns = fac.createFinancialInstrumentReportingTransactionReportV01();
		finIns.getTx().add(tx);
		
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
	
}
