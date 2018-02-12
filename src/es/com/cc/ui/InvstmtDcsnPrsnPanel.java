package es.com.cc.ui;

import javax.swing.JPanel;
import es.com.cc.core.schema.all.InvestmentParty1Choice1;
import es.com.cc.core.schema.all.ObjectFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class InvstmtDcsnPrsnPanel extends JPanel {

	private static final long serialVersionUID = -8627213700627628336L;
	
	private JTextField algoField;
	private JRadioButton radioAlgo;
	private JRadioButton radioPrsn;
	
	private JPanel panelAlgoritmo;
	private PersonaPanel2 panelPersona;
	

	/**
	 * Create the panel.
	 */
	public InvstmtDcsnPrsnPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(450, 190));
		
		JLabel lblInvstmtdcsnprsn = new JLabel("InvstmtDcsnPrsn");
		lblInvstmtdcsnprsn.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInvstmtdcsnprsn.setBounds(10, 11, 106, 14);
		add(lblInvstmtdcsnprsn);
		
		JPanel panelRadios = new JPanel();
		panelRadios.setBounds(10, 36, 430, 29);
		add(panelRadios);
		
		radioAlgo = new JRadioButton("Algoritmo");
		panelRadios.add(radioAlgo);
		radioAlgo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanel(0);
			}
		});
		
		radioPrsn = new JRadioButton("Persona");
		panelRadios.add(radioPrsn);
		radioPrsn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanel(1);
			}
		});
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(radioAlgo);
		grupo.add(radioPrsn);
		
		/**
		 * ***********************************************************************************
		 * panel Algoritmo
		 */
		panelAlgoritmo = new JPanel();
		panelAlgoritmo.setBounds(10, 76, 430, 100);
		add(panelAlgoritmo);
		panelAlgoritmo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Algoritmo");
		lblNewLabel.setBounds(10, 11, 80, 14);
		panelAlgoritmo.add(lblNewLabel);
		
		algoField = new JTextField();
		algoField.setBounds(100, 8, 200, 20);
		panelAlgoritmo.add(algoField);
		algoField.setColumns(10);
		
		/**
		 * ***********************************************************************************
		 * panel Persona
		 */
		panelPersona = new PersonaPanel2();
		panelPersona.setBounds(10, 76, 430, 100);
		add(panelPersona);
		
		
		// valores por defecto
		radioAlgo.setSelected(true);
	}
	
	public InvestmentParty1Choice1 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		
		InvestmentParty1Choice1 invest = factory.createInvestmentParty1Choice1();
		if (radioAlgo.isSelected()) {
			invest.setAlgo(algoField.getText());
			
		} else if (radioPrsn.isSelected()) {
			invest.setPrsn(panelPersona.getDatosIntroducidos());
		}
		
		return invest;
	}
	
	private void muestraPanel(int position) {
		switch(position) {
			case 0:
				panelAlgoritmo.setVisible(true);
				panelPersona.setVisible(false);
				break;
			case 1:
				panelAlgoritmo.setVisible(false);
				panelPersona.setVisible(true);
				break;
			
		}
	}
}
