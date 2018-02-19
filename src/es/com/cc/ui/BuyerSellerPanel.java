package es.com.cc.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import es.com.cc.core.schema.all.InternalPartyRole1Code;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.PartyIdentification761;
import es.com.cc.core.schema.all.PartyIdentification791;
import es.com.cc.core.schema.all.PersonOrOrganisation1Choice1;
import es.com.cc.core.schema.all.PersonOrOrganisation2Choice1;

public class BuyerSellerPanel extends JPanel {

	private static final long serialVersionUID = -9187935108462518636L;
	
	private JTextField acctOwnrIdField;
	private JTextField ctryOfBrnch;
	
	private LEIPanel panelLEI;
	private MICPanel panelMIC;
	private PersonaPanel panelPersona;
	private IntlPanel panelIntl;
	private DcsnMakrPanel panelDcsnMakr;
	
	private JRadioButton radioLEI;
	private JRadioButton radioMIC;
	private JRadioButton radioPrsn;
	private JRadioButton radioIntl;
	
	private boolean hideFlag = false;
	private JPanel panelRadios;
	private JButton btnOcultar;

	/**
	 * Create the panel.
	 */
	public BuyerSellerPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(994, 293));
		
		JLabel lblNewLabel_4 = new JLabel("AcctOwnr");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(36, 11, 85, 14);
		add(lblNewLabel_4);
		
		JLabel lblDcsnmakr = new JLabel("DcsnMakr");
		lblDcsnmakr.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDcsnmakr.setBounds(34, 171, 85, 14);
		add(lblDcsnmakr);
		
		btnOcultar = new JButton("");
		btnOcultar.setBounds(8, 171, 15, 15);
		add(btnOcultar);
		btnOcultar.setBackground(Color.RED);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(35, 36, 46, 14);
		add(lblId);
		
		JLabel lblNewLabel = new JLabel("CtryOfBrnch");
		lblNewLabel.setBounds(384, 36, 75, 14);
		add(lblNewLabel);
		
		acctOwnrIdField = new JTextField();
		acctOwnrIdField.setBounds(91, 33, 200, 20);
		add(acctOwnrIdField);
		acctOwnrIdField.setColumns(10);
		
		ctryOfBrnch = new JTextField();
		ctryOfBrnch.setBounds(469, 33, 200, 20);
		add(ctryOfBrnch);
		ctryOfBrnch.setColumns(10);
		
		panelRadios = new JPanel();
		panelRadios.setBounds(1, 70, 990, 30);
		add(panelRadios);
		
		radioLEI = new JRadioButton("LEI");
		radioLEI.setPreferredSize(new Dimension(100, 22));
		panelRadios.add(radioLEI);
		radioLEI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				muestraPanelId(0);
			}
		});
		
		radioMIC = new JRadioButton("MIC");
		radioMIC.setPreferredSize(new Dimension(100, 22));
		panelRadios.add(radioMIC);
		radioMIC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				muestraPanelId(1);
			}
		});
		
		radioPrsn = new JRadioButton("Prsn");
		radioPrsn.setPreferredSize(new Dimension(100, 22));
		panelRadios.add(radioPrsn);
		radioPrsn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				muestraPanelId(2);
			}
		});
		
		radioIntl = new JRadioButton("Intl");
		radioIntl.setPreferredSize(new Dimension(100, 22));
		panelRadios.add(radioIntl);
		radioIntl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				muestraPanelId(3);
			}
		});
		
		//Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();
	    group.add(radioLEI);
	    group.add(radioMIC);
	    group.add(radioPrsn);
	    group.add(radioIntl);
	    
		panelLEI = new LEIPanel();
		panelLEI.setBounds(1, 101, 990, 59);
		add(panelLEI);
		panelLEI.setLayout(null);
		panelLEI.setVisible(false);
		
		panelMIC = new MICPanel();
		panelMIC.setBounds(1, 101, 990, 59);
		add(panelMIC);
		panelMIC.setLayout(null);
		panelMIC.setVisible(false);
		
		panelPersona = new PersonaPanel();
		panelPersona.setBounds(1, 101, 990, 59);
		add(panelPersona);
		panelPersona.setLayout(null);
		panelPersona.setVisible(false);
		
		panelIntl = new IntlPanel();
		panelIntl.setBounds(1, 101, 990, 59);
		add(panelIntl);
		panelIntl.setLayout(null);
		panelIntl.setVisible(false);
		
		panelDcsnMakr = new DcsnMakrPanel();
		panelDcsnMakr.setBounds(1, 196, 992, 93);
		add(panelDcsnMakr);
		
		// valores por defecto
		radioPrsn.setSelected(true);
		muestraPanelId(2);
	}
	
	public PartyIdentification791 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		PartyIdentification791 buyerSeller = factory.createPartyIdentification791();
		
		// acctOwn
		//*********************************************************************************************************
		PersonOrOrganisation1Choice1 pChoice1 = factory.createPersonOrOrganisation1Choice1();
		
		if (radioLEI.isSelected()) {
			pChoice1.setLEI(acctOwnrIdField.getText());
			
		} else if (radioMIC.isSelected()) {
			pChoice1.setMIC(acctOwnrIdField.getText());
			
		} else if (radioPrsn.isSelected()) {
			pChoice1.setPrsn(panelPersona.getDatosIntroducidos());
			
		} else if (radioIntl.isSelected()) {
			pChoice1.setIntl(InternalPartyRole1Code.INTC);
		}
		
		PartyIdentification761 acctOwn = factory.createPartyIdentification761();
		acctOwn.setId(pChoice1);
		acctOwn.setCtryOfBrnch(ctryOfBrnch.getText());
		buyerSeller.getAcctOwnr().add(acctOwn);
		
		// dcsnMark
		//*********************************************************************************************************
		PersonOrOrganisation2Choice1 dcsnMakr = panelDcsnMakr.getDatosIntroducidos();
		buyerSeller.getDcsnMakr().add(dcsnMakr);
		
		return buyerSeller;
	}
	
	private void muestraPanelId(int opcion) {
		switch(opcion) {
			case 0:
				panelLEI.setVisible(true);
				panelMIC.setVisible(false);
				panelPersona.setVisible(false);
				panelIntl.setVisible(false);
				break;
			case 1:
				panelLEI.setVisible(false);
				panelMIC.setVisible(true);
				panelPersona.setVisible(false);
				panelIntl.setVisible(false);
				break;
			case 2:
				panelLEI.setVisible(false);
				panelMIC.setVisible(false);
				panelPersona.setVisible(true);
				panelIntl.setVisible(false);
				break;
			case 3:
				panelLEI.setVisible(false);
				panelMIC.setVisible(false);
				panelPersona.setVisible(false);
				panelIntl.setVisible(true);
				break;
		}
	}
	
	public JButton getBotonColapsoPanel() {
		return btnOcultar;
	}
	
	public void cambiaFlag() {
		if (hideFlag) {
			hideFlag = false;
			btnOcultar.setBackground(Color.RED);
			
		} else {
			hideFlag = true;
			btnOcultar.setBackground(Color.GREEN);
		}
		
		revalidate();
	}
	
	public boolean getFlagValue() {
		return hideFlag;
	}
}
