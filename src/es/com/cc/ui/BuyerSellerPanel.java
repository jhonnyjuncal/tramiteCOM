package es.com.cc.ui;

import java.awt.Font;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import es.com.cc.core.schema.all.GenericPersonIdentification11;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.PartyIdentification761;
import es.com.cc.core.schema.all.PartyIdentification791;
import es.com.cc.core.schema.all.PersonIdentification101;
import es.com.cc.core.schema.all.PersonIdentificationSchemeName1Choice1;
import es.com.cc.core.schema.all.PersonOrOrganisation1Choice1;
import es.com.cc.core.schema.all.PersonOrOrganisation2Choice1;

import javax.swing.JButton;

public class BuyerSellerPanel extends JPanel {

	private static final long serialVersionUID = -9187935108462518636L;
	
	private JTextField acctOwnrId;
	private JTextField ctryOfBrnch;
	private JButton btnAceptar;
	private JButton btnCancelar;
	

	/**
	 * Create the panel.
	 */
	public BuyerSellerPanel() {
		setLayout(null);
		
		JLabel lblTipoBuyer = new JLabel();
		lblTipoBuyer.setText("Tipo");
		lblTipoBuyer.setBounds(10, 11, 110, 14);
		add(lblTipoBuyer);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(130, 8, 205, 20);
		add(comboBox);
		
		/**
		 * primer panel
		 */
		JPanel datosPanel = new JPanel();
		datosPanel.setBounds(10, 39, 692, 430);
		add(datosPanel);
		datosPanel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("AcctOwnr");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 11, 85, 14);
		datosPanel.add(lblNewLabel_4);
		
		JLabel lblDcsnmakr = new JLabel("DcsnMakr");
		lblDcsnmakr.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDcsnmakr.setBounds(10, 220, 85, 14);
		datosPanel.add(lblDcsnmakr);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(35, 36, 46, 14);
		datosPanel.add(lblId);
		
		JLabel lblNewLabel = new JLabel("CtryOfBrnch");
		lblNewLabel.setBounds(384, 36, 75, 14);
		datosPanel.add(lblNewLabel);
		
		acctOwnrId = new JTextField();
		acctOwnrId.setBounds(91, 33, 200, 20);
		datosPanel.add(acctOwnrId);
		acctOwnrId.setColumns(10);
		
		ctryOfBrnch = new JTextField();
		ctryOfBrnch.setBounds(469, 33, 200, 20);
		datosPanel.add(ctryOfBrnch);
		ctryOfBrnch.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("LEI");
		rdbtnNewRadioButton.setBounds(103, 71, 109, 23);
		datosPanel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Prsn");
		rdbtnNewRadioButton_1.setBounds(325, 71, 109, 23);
		datosPanel.add(rdbtnNewRadioButton_1);
		
		PersonaPanel panelPersona = new PersonaPanel();
		panelPersona.setBounds(10, 305, 672, 100);
		datosPanel.add(panelPersona);
		panelPersona.setLayout(null);
		
		JRadioButton rdbtnMic = new JRadioButton("MIC");
		rdbtnMic.setBounds(214, 71, 109, 23);
		datosPanel.add(rdbtnMic);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Intl");
		rdbtnNewRadioButton_2.setBounds(436, 71, 109, 23);
		datosPanel.add(rdbtnNewRadioButton_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 491, 692, 38);
		add(panel);
		
		btnAceptar = new JButton("Aceptar");
		panel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		panel.add(btnCancelar);
	}
	
	public JButton getBotonAceptar() {
		return this.btnAceptar;
	}
	
	public JButton getBotonCancelar() {
		return this.btnCancelar;
	}
	
	public PartyIdentification791 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		
		PersonOrOrganisation1Choice1 pChoice1 = factory.createPersonOrOrganisation1Choice1();
		pChoice1.setLEI(acctOwnrId.getText());
		
		PartyIdentification761 acctOwn = factory.createPartyIdentification761();
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
		
		PersonIdentificationSchemeName1Choice1 prsnIdChoice = factory.createPersonIdentificationSchemeName1Choice1();
		prsnIdChoice.setCd("LEI");
		
		GenericPersonIdentification11 genericPersn = factory.createGenericPersonIdentification11();
		genericPersn.setId("IDENTIFICADOR");
		genericPersn.setSchmeNm(prsnIdChoice);
		
		PersonIdentification101 pi2 = factory.createPersonIdentification101();
		pi2.setNm("NOMBRE");
		pi2.setFrstNm("APELLIDO");
		pi2.setBirthDt(xmlCalendar2);
		pi2.setOthr(genericPersn);
		
		PersonOrOrganisation2Choice1 dcsnMark = factory.createPersonOrOrganisation2Choice1();
		dcsnMark.setLEI("LEI_DE_LA_EMPRESA");
		dcsnMark.setPrsn(pi2);
		
		PartyIdentification791 buyerSeller = factory.createPartyIdentification791();
		buyerSeller.getAcctOwnr().add(acctOwn);
		buyerSeller.getDcsnMakr().add(dcsnMark);
		
		return buyerSeller;
	}
}
