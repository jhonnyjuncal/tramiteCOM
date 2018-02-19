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
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

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
	private JLabel lblNewLabel_1;
	
	private boolean hideFlag = false;

	/**
	 * Create the panel.
	 */
	public ExctgPrsnPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(996, 30));
		
		lblNewLabel_1 = new JLabel("ExctgPrsn");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(35, 7, 133, 14);
		add(lblNewLabel_1);
		
		JPanel panelRadios = new JPanel();
		panelRadios.setBounds(1, 33, 994, 28);
		add(panelRadios);
		
		radioPrsn = new JRadioButton("Prsn");
		panelRadios.add(radioPrsn);
		radioPrsn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanel(0);
			}
		});
		
		radioClnt = new JRadioButton("Clnt");
		panelRadios.add(radioClnt);
		radioClnt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanel(1);
			}
		});
		
		radioAlgo = new JRadioButton("Algo");
		panelRadios.add(radioAlgo);
		radioAlgo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanel(2);
			}
		});
		
		panelPersona = new PersonaPanel2();
		panelPersona.setBounds(1, 65, 994, 100);
		add(panelPersona);
		
		panelCliente = new ClientPanel();
		panelCliente.setBounds(1, 65, 994, 100);
		add(panelCliente);
		
		panelAlgoritmo = new JPanel();
		panelAlgoritmo.setBounds(1, 65, 994, 100);
		panelAlgoritmo.setLayout(null);
		add(panelAlgoritmo);
		
		lblNewLabel = new JLabel("Algoritmo");
		lblNewLabel.setBounds(10, 11, 80, 14);
		panelAlgoritmo.add(lblNewLabel);
		
		algoField = new JTextField();
		algoField.setBounds(100, 8, 200, 20);
		panelAlgoritmo.add(algoField);
		algoField.setColumns(10);
		
		JButton btnOcultar = new JButton("");
		btnOcultar.setBackground(Color.RED);
		btnOcultar.setBounds(10, 7, 15, 15);
		add(btnOcultar);
		btnOcultar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (hideFlag) {
					hideFlag = false;
					btnOcultar.setBackground(Color.RED);
					setPreferredSize(new Dimension(996, 30));
					
				} else {
					hideFlag = true;
					setPreferredSize(new Dimension(996, 170));
					btnOcultar.setBackground(Color.GREEN);
				}
				revalidate();
			}
		});
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
				panelPersona.setVisible(true);
				panelCliente.setVisible(false);
				panelAlgoritmo.setVisible(false);
				break;
			case 1:
				panelPersona.setVisible(false);
				panelCliente.setVisible(true);
				panelAlgoritmo.setVisible(false);
				break;
			case 2:
				panelPersona.setVisible(false);
				panelCliente.setVisible(false);
				panelAlgoritmo.setVisible(true);
				break;
		}
	}
	
	public boolean isIncludedInGeneratedXml() {
		return hideFlag;
	}
}
