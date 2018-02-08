package es.com.cc.ui;

import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.datatype.XMLGregorianCalendar;

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
		setPreferredSize(new Dimension(691, 100));
		
		JLabel lblNewLabel = new JLabel("FrstNm");
		lblNewLabel.setBounds(10, 11, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nm");
		lblNewLabel_1.setBounds(353, 11, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblBirthdt = new JLabel("BirthDt");
		lblBirthdt.setBounds(10, 36, 46, 14);
		add(lblBirthdt);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(10, 61, 46, 14);
		add(lblId);
		
		JLabel lblSchmenm = new JLabel("SchmeNm");
		lblSchmenm.setBounds(353, 36, 46, 14);
		add(lblSchmenm);
		
		txtFrstnmfield = new JTextField();
		txtFrstnmfield.setBounds(66, 8, 200, 20);
		add(txtFrstnmfield);
		txtFrstnmfield.setColumns(10);
		
		txtNmfield = new JTextField();
		txtNmfield.setBounds(409, 8, 200, 20);
		add(txtNmfield);
		txtNmfield.setColumns(10);
		
		txtBirthdtfield = new JTextField();
		txtBirthdtfield.setBounds(66, 33, 200, 20);
		add(txtBirthdtfield);
		txtBirthdtfield.setColumns(10);
		
		idField = new JTextField();
		idField.setBounds(66, 58, 200, 20);
		add(idField);
		idField.setColumns(10);
		
		schmeNmCombo = new JComboBox<String>();
		schmeNmCombo.setBounds(409, 33, 200, 20);
		add(schmeNmCombo);
		
		cdOrPrtryField = new JTextField();
		cdOrPrtryField.setBounds(409, 58, 200, 20);
		add(cdOrPrtryField);
		cdOrPrtryField.setColumns(10);
	}
	
	public String getNmFieldValue() {
		return this.txtNmfield.getText();
	}
	
	public String getFrstnmFieldValue() {
		return this.txtFrstnmfield.getText();
	}
	
	public XMLGregorianCalendar getBirthdtFieldValue() {
		return DateUtil.convertToXmlGregorianCalendar(this.txtBirthdtfield.getText());
	}
	
	public String getIdFieldValue() {
		return this.idField.getText();
	}
	
	public String getCdOrPrtryFieldValue() {
		return this.cdOrPrtryField.getText();
	}
	
	public int getSchmeNmComboSelectedValue() {
		return this.schmeNmCombo.getSelectedIndex();
	}
	
	public PersonIdentification101 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		
		GenericPersonIdentification11 genericPersn = factory.createGenericPersonIdentification11();
		genericPersn.setId(getIdFieldValue());
		
		// segun seleccion del combo
		PersonIdentificationSchemeName1Choice1 personIdentificacion = factory.createPersonIdentificationSchemeName1Choice1();
		if (getSchmeNmComboSelectedValue() == 0) {
			personIdentificacion.setCd(getCdOrPrtryFieldValue());
			genericPersn.setSchmeNm(personIdentificacion);
			
		} else if (getSchmeNmComboSelectedValue() == 1) {
			personIdentificacion.setPrtry(getCdOrPrtryFieldValue());
			genericPersn.setSchmeNm(personIdentificacion);
		}
		
		PersonIdentification101 p101 = factory.createPersonIdentification101();
		p101.setNm(getNmFieldValue());
		p101.setFrstNm(getFrstnmFieldValue());
		p101.setBirthDt(getBirthdtFieldValue());
		p101.setOthr(genericPersn);
		
		return p101;
	}
}
