package es.com.cc.ui;

import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import es.com.cc.core.schema.all.GenericPersonIdentification11;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.PersonIdentification101;
import es.com.cc.core.schema.all.PersonIdentificationSchemeName1Choice1;
import es.com.cc.core.util.DateUtil;

public class PersonaPanel extends JPanel {

	private static final long serialVersionUID = -5585239586552794691L;
	
	private JTextField txtFrstnmfield;
	private JTextField txtNmfield;
	private JTextField txtBirthdtfield;
	private JTextField idField;
	private JTextField cdOrPrtryField;
	private JComboBox<String> schmeNmCombo;

	/**
	 * Create the panel.
	 */
	public PersonaPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(988, 58));
		
		JLabel lblNewLabel = new JLabel("FrstNm");
		lblNewLabel.setBounds(10, 11, 66, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nm");
		lblNewLabel_1.setBounds(343, 11, 63, 14);
		add(lblNewLabel_1);
		
		JLabel lblBirthdt = new JLabel("BirthDt");
		lblBirthdt.setBounds(343, 36, 63, 14);
		add(lblBirthdt);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 36, 66, 14);
		add(lblId);
		
		JLabel lblSchmenm = new JLabel("SchmeNm");
		lblSchmenm.setBounds(691, 11, 77, 14);
		add(lblSchmenm);
		
		txtFrstnmfield = new JTextField();
		txtFrstnmfield.setBounds(86, 8, 200, 20);
		add(txtFrstnmfield);
		txtFrstnmfield.setColumns(10);
		
		txtNmfield = new JTextField();
		txtNmfield.setBounds(416, 8, 200, 20);
		add(txtNmfield);
		txtNmfield.setColumns(10);
		
		txtBirthdtfield = new JTextField();
		txtBirthdtfield.setBounds(416, 33, 200, 20);
		add(txtBirthdtfield);
		txtBirthdtfield.setColumns(10);
		
		idField = new JTextField();
		idField.setBounds(86, 33, 200, 20);
		add(idField);
		idField.setColumns(10);
		
		schmeNmCombo = new JComboBox<String>();
		schmeNmCombo.setBounds(778, 8, 200, 20);
		add(schmeNmCombo);
		
		cdOrPrtryField = new JTextField();
		cdOrPrtryField.setBounds(778, 33, 200, 20);
		add(cdOrPrtryField);
		cdOrPrtryField.setColumns(10);
	}
	
	public PersonIdentification101 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		
		GenericPersonIdentification11 genericPersn = factory.createGenericPersonIdentification11();
		genericPersn.setId(idField.getText());
		
		// segun seleccion del combo
		PersonIdentificationSchemeName1Choice1 personIdentificacion = factory.createPersonIdentificationSchemeName1Choice1();
		if (schmeNmCombo.getSelectedIndex() == 0) {
			personIdentificacion.setCd(cdOrPrtryField.getText());
			genericPersn.setSchmeNm(personIdentificacion);
			
		} else if (schmeNmCombo.getSelectedIndex() == 1) {
			personIdentificacion.setPrtry(cdOrPrtryField.getText());
			genericPersn.setSchmeNm(personIdentificacion);
		}
		
		PersonIdentification101 p101 = factory.createPersonIdentification101();
		p101.setNm(txtNmfield.getText());
		p101.setFrstNm(txtFrstnmfield.getText());
		p101.setBirthDt(DateUtil.convertToXmlGregorianCalendar(txtBirthdtfield.getText()));
		p101.setOthr(genericPersn);
		
		return p101;
	}
}
