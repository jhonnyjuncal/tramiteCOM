package es.com.cc.ui;

import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import es.com.cc.core.schema.all.GenericOrganisationIdentification11;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.OrganisationIdentification71;
import es.com.cc.core.schema.all.OrganisationIdentificationSchemeName1Choice;
import es.com.cc.core.schema.all.Party10Choice1;
import es.com.cc.core.schema.all.Party9Choice1;
import es.com.cc.core.schema.all.PartyIdentification421;
import java.awt.Font;

public class FromToPanel extends JPanel {

	private static final long serialVersionUID = 1411591932117410734L;
	
	private JTextField idTextField;
	private JTextField pytryTextField;
	private JComboBox<String> schemaComboBox;
	
	private static final String[] COMBO_VALUES = {"Cd", "Prtry"};
	
	/**
	 * Create the panel.
	 */
	public FromToPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(300, 110));
		
		JLabel lblNewLabel_2 = new JLabel("FROM");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(3, 3, 50, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(20, 30, 70, 14);
		add(lblNewLabel);
		
		idTextField = new JTextField();
		idTextField.setBounds(90, 27, 200, 20);
		add(idTextField);
		idTextField.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Schema");
		lblNewLabel_9.setBounds(20, 55, 60, 14);
		add(lblNewLabel_9);
		
		schemaComboBox = new JComboBox<String>();
		schemaComboBox.addItem(COMBO_VALUES[0]);
		schemaComboBox.addItem(COMBO_VALUES[1]);
		schemaComboBox.setBounds(90, 52, 200, 20);
		add(schemaComboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Prtry");
		lblNewLabel_1.setBounds(20, 80, 24, 14);
		add(lblNewLabel_1);
		
		pytryTextField = new JTextField();
		pytryTextField.setBounds(90, 77, 200, 20);
		add(pytryTextField);
		pytryTextField.setColumns(10);
	}
	
	public Party9Choice1 getDatosIntroducidos() {
		ObjectFactory fac = new ObjectFactory();
		
		OrganisationIdentificationSchemeName1Choice fromSchema = fac.createOrganisationIdentificationSchemeName1Choice();
		if (schemaComboBox.getSelectedIndex() == 0) {
			fromSchema.setCd(pytryTextField.getText());
			
		} else {
			fromSchema.setPrtry(pytryTextField.getText());
		}
		
		GenericOrganisationIdentification11 fromGenericOrg = fac.createGenericOrganisationIdentification11();
		fromGenericOrg.setId(idTextField.getText());
		fromGenericOrg.setSchmeNm(fromSchema);
		
		OrganisationIdentification71 fromOrgaId = fac.createOrganisationIdentification71();
		fromOrgaId.setOthr(fromGenericOrg);
		
		Party10Choice1 fromChoice = fac.createParty10Choice1();
		fromChoice.setOrgId(fromOrgaId);
		
		PartyIdentification421 fromOrgId = fac.createPartyIdentification421();
		fromOrgId.setId(fromChoice);
		
		Party9Choice1 data = fac.createParty9Choice1();
		data.setOrgId(fromOrgId);
		
		return data;
	}
}
