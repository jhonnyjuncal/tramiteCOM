package es.com.cc.ui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
	private JButton btnAceptar;
	private JButton btnCancelar;
	
	private LEIPanel panelLEI;
	private MICPanel panelMIC;
	private PersonaPanel panelPersona;
	private IntlPanel panelIntl;
	
	private JRadioButton radioLEI;
	private JRadioButton radioMIC;
	private JRadioButton radioPrsn;
	private JRadioButton radioIntl;
	
	private DcsnMakrPanel panelDcsnMakr;
	private JCheckBox chckbxActivarDcsnMakr;

	/**
	 * Create the panel.
	 */
	public BuyerSellerPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(710, 500));
		
		/**
		 * primer panel
		 */
		JPanel datosPanel = new JPanel();
		datosPanel.setBounds(0, 0, 711, 430);
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
		
		acctOwnrIdField = new JTextField();
		acctOwnrIdField.setBounds(91, 33, 200, 20);
		datosPanel.add(acctOwnrIdField);
		acctOwnrIdField.setColumns(10);
		
		ctryOfBrnch = new JTextField();
		ctryOfBrnch.setBounds(469, 33, 200, 20);
		datosPanel.add(ctryOfBrnch);
		ctryOfBrnch.setColumns(10);
		
		radioLEI = new JRadioButton("LEI");
		radioLEI.setBounds(133, 71, 109, 23);
		datosPanel.add(radioLEI);
		radioLEI.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanelId(0);
			}
		});
		
		radioMIC = new JRadioButton("MIC");
		radioMIC.setBounds(244, 71, 109, 23);
		datosPanel.add(radioMIC);
		radioMIC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanelId(1);
			}
		});
		
		radioPrsn = new JRadioButton("Prsn");
		radioPrsn.setBounds(355, 71, 109, 23);
		datosPanel.add(radioPrsn);
		radioPrsn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanelId(2);
			}
		});
		
		
		radioIntl = new JRadioButton("Intl");
		radioIntl.setBounds(466, 71, 109, 23);
		datosPanel.add(radioIntl);
		radioIntl.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanelId(3);
			}
		});
		
		//Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();
	    group.add(radioLEI);
	    group.add(radioPrsn);
	    group.add(radioMIC);
	    group.add(radioIntl);
	    
		panelLEI = new LEIPanel();
		panelLEI.setBounds(10, 101, 691, 100);
		datosPanel.add(panelLEI);
		panelLEI.setLayout(null);
		panelLEI.setVisible(false);
		
		panelMIC = new MICPanel();
		panelMIC.setBounds(10, 101, 691, 100);
		datosPanel.add(panelMIC);
		panelMIC.setLayout(null);
		panelMIC.setVisible(false);
		
		panelPersona = new PersonaPanel();
		panelPersona.setBounds(10, 101, 691, 100);
		datosPanel.add(panelPersona);
		panelPersona.setLayout(null);
		panelPersona.setVisible(false);
		
		panelIntl = new IntlPanel();
		panelIntl.setBounds(10, 101, 691, 100);
		datosPanel.add(panelIntl);
		panelIntl.setLayout(null);
		panelIntl.setVisible(false);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBounds(10, 457, 692, 38);
		add(panelBotones);
		
		btnAceptar = new JButton("Aceptar");
		panelBotones.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		panelBotones.add(btnCancelar);
		
		panelDcsnMakr = new DcsnMakrPanel();
		panelDcsnMakr.setBounds(10, 245, 691, 174);
		datosPanel.add(panelDcsnMakr);
		panelDcsnMakr.setPreferredSize(new Dimension(691, 174));
		panelDcsnMakr.setVisible(false);
		
		chckbxActivarDcsnMakr = new JCheckBox("activar");
		chckbxActivarDcsnMakr.setBounds(101, 216, 97, 23);
		datosPanel.add(chckbxActivarDcsnMakr);
		chckbxActivarDcsnMakr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (chckbxActivarDcsnMakr.isSelected()) {
					panelDcsnMakr.setVisible(true);
					
				} else {
					panelDcsnMakr.setVisible(false);
				}
			}
		});
		
		
		// valores por defecto
		radioLEI.setSelected(true);
	}
	
	public JButton getBotonAceptar() {
		return this.btnAceptar;
	}
	
	public JButton getBotonCancelar() {
		return this.btnCancelar;
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
		if (chckbxActivarDcsnMakr.isSelected()) {
			PersonOrOrganisation2Choice1 dcsnMakr = panelDcsnMakr.getDatosIntroducidos();
			buyerSeller.getDcsnMakr().add(dcsnMakr);
		}
		
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
}
