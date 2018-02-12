package es.com.cc.ui;

import javax.swing.JPanel;

import es.com.cc.core.schema.all.GenericPersonIdentification11;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.PersonIdentification121;
import es.com.cc.core.schema.all.PersonIdentificationSchemeName1Choice1;
import es.com.cc.core.util.CountryUtils;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonaPanel2 extends JPanel {

	private static final long serialVersionUID = -3786671074594292193L;
	
	private JTextField idField;
	private JTextField prtryField;
	private JComboBox<String> paisesComboBox;
	private JRadioButton radioCd;
	private JRadioButton radioPrtry;
	private JComboBox<String> cdComboBox;
	
	private JPanel panelCd;
	private JPanel panelPrtry;
	
	

	/**
	 * Create the panel.
	 */
	public PersonaPanel2() {
		setLayout(null);
		setPreferredSize(new Dimension(430, 100));
		
		JLabel lblNewLabel = new JLabel("CtryOfBrnch");
		lblNewLabel.setBounds(10, 11, 80, 14);
		add(lblNewLabel);
		
		paisesComboBox = new JComboBox<String>();
		paisesComboBox.setBounds(100, 8, 80, 20);
		add(paisesComboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		add(lblNewLabel_1);
		
		idField = new JTextField();
		idField.setBounds(100, 33, 200, 20);
		add(idField);
		idField.setColumns(10);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel.setBounds(10, 61, 121, 30);
		add(panel);
		
		radioCd = new JRadioButton("Cd");
		panel.add(radioCd);
		radioCd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanel(0);
			}
		});
		
		radioPrtry = new JRadioButton("Prtry");
		panel.add(radioPrtry);
		radioPrtry.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanel(1);
			}
		});
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioCd);
		group.add(radioPrtry);
		
		/**
		 * ****************************************************************************************************************
		 * panel Prtry
		 */
		panelPrtry = new JPanel();
		panelPrtry.setBounds(162, 61, 258, 30);
		add(panelPrtry);
		panelPrtry.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Prtry");
		lblNewLabel_2.setBounds(10, 8, 60, 14);
		panelPrtry.add(lblNewLabel_2);
		
		prtryField = new JTextField();
		prtryField.setBounds(80, 5, 168, 20);
		panelPrtry.add(prtryField);
		prtryField.setColumns(10);
		
		/**
		 * ****************************************************************************************************************
		 * Panel Cd
		 */
		panelCd = new JPanel();
		panelCd.setLayout(null);
		panelCd.setBounds(162, 61, 258, 30);
		add(panelCd);
		
		JLabel lblCd = new JLabel("Cd");
		lblCd.setBounds(10, 8, 60, 14);
		panelCd.add(lblCd);
		
		cdComboBox = new JComboBox<String>();
		cdComboBox.setBounds(80, 5, 168, 20);
		panelCd.add(cdComboBox);
		cdComboBox.addItem("NIDN");
		cdComboBox.addItem("CCPT");

	}
	
	public PersonIdentification121 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		
		PersonIdentificationSchemeName1Choice1 choice = factory.createPersonIdentificationSchemeName1Choice1();
		
		if (radioCd.isSelected()) {
			if (cdComboBox.getSelectedIndex() == 0) {
				choice.setCd("NIDN");
				
			} else if (cdComboBox.getSelectedIndex() == 1) {
				choice.setCd("CCPT");
			}
			
		} else if (radioPrtry.isSelected()) {
			choice.setPrtry(prtryField.getText());
		}
		
		GenericPersonIdentification11 genericPerson = factory.createGenericPersonIdentification11();
		genericPerson.setId(idField.getText());
		genericPerson.setSchmeNm(choice);
		PersonIdentification121 person = factory.createPersonIdentification121();
		person.setCtryOfBrnch(CountryUtils.getSelectedCountry(paisesComboBox.getSelectedIndex()));
		person.setOthr(genericPerson);
		
		return person;
	}
	
	private void muestraPanel(int position) {
		switch (position) {
			case 0:
				panelCd.setVisible(true);
				panelPrtry.setVisible(false);
				break;
			case 1:
				panelCd.setVisible(false);
				panelPrtry.setVisible(true);
				break;
		}
	}
}
