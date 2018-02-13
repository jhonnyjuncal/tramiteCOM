package es.com.cc.ui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import es.com.cc.core.schema.all.ExecutingParty1Choice1;
import es.com.cc.core.schema.all.NoReasonCode;
import es.com.cc.core.schema.all.ObjectFactory;

public class ExctgPrsnPanel extends JPanel {

	private static final long serialVersionUID = 691673078702959719L;
	
	private JRadioButton radioAlgo;
	private JRadioButton radioClnt;
	private JRadioButton radioPrsn;
	
	private PersonaPanel2 panelPersona;
	private ClientPanel panelCliente;
	private JPanel panelAlgoritmo;
	private JLabel lblNewLabel;
	private JTextField algoField;

	/**
	 * Create the panel.
	 */
	public ExctgPrsnPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(728, 136));
		
		JPanel panel = new JPanel();
		panel.setBounds(1, 1, 726, 28);
		add(panel);
		
		radioPrsn = new JRadioButton("Prsn");
		panel.add(radioPrsn);
		radioPrsn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanel(0);
			}
		});
		
		radioClnt = new JRadioButton("Clnt");
		panel.add(radioClnt);
		radioClnt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanel(1);
			}
		});
		
		radioAlgo = new JRadioButton("Algo");
		panel.add(radioAlgo);
		radioAlgo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanel(2);
			}
		});
		
		panelPersona = new PersonaPanel2();
		panelPersona.setBounds(1, 31, 430, 100);
		add(panelPersona);
		
		panelCliente = new ClientPanel();
		panelCliente.setBounds(1, 31, 430, 100);
		add(panelCliente);
		
		panelAlgoritmo = new JPanel();
		panelAlgoritmo.setBounds(1, 31, 430, 100);
		add(panelAlgoritmo);
		panelAlgoritmo.setLayout(null);
		
		lblNewLabel = new JLabel("Algoritmo");
		lblNewLabel.setBounds(10, 11, 80, 14);
		panelAlgoritmo.add(lblNewLabel);
		
		algoField = new JTextField();
		algoField.setBounds(100, 8, 200, 20);
		panelAlgoritmo.add(algoField);
		algoField.setColumns(10);
	}
	
	public ExecutingParty1Choice1 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		
		ExecutingParty1Choice1 executingParty = factory.createExecutingParty1Choice1();
		if (radioAlgo.isSelected()) {
			executingParty.setAlgo(algoField.getText());
			
		} else if (radioClnt.isSelected()) {
			executingParty.setClnt(NoReasonCode.NORE);
			
		} else if (radioPrsn.isSelected()) {
			executingParty.setPrsn(panelPersona.getDatosIntroducidos());
		}
		return executingParty;
	}
	
	private void muestraPanel(int position) {
		switch (position) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
		}
	}
}
