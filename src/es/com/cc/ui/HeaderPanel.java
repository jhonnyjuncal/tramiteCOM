package es.com.cc.ui;

import java.awt.Dimension;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import es.com.cc.core.schema.all.BusinessApplicationHeaderV01;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.util.DateUtil;

public class HeaderPanel extends JPanel {

	private static final long serialVersionUID = -169220978179044134L;
	
	private JTextField bizMsgIdrTextField1;
	private JTextField msgDefIdrTextField;
	
	private FromToPanel panelFrom;
	private FromToPanel panelTo;
	private JTextField bizMsgIdrTextField2;
	private JTextField bizMsgIdrTextField3;
	private JTextField bizMsgIdrTextField4;
	private JFormattedTextField creDtTextField;
	
	/**
	 * Create the panel.
	 */
	public HeaderPanel() {
		setBorder(null);
		setPreferredSize(new Dimension(1000, 160));
		setLayout(null);
		
		panelFrom = new FromToPanel("FROM");
		panelFrom.setLocation(1, 1);
		panelFrom.setSize(498, 80);
		add(panelFrom);
		
		panelTo = new FromToPanel("TO");
		panelTo.setLocation(500, 1);
		panelTo.setSize(498, 80);
		add(panelTo);
		
		JLabel lblNewLabel_6 = new JLabel("BizMsgIdr");
		lblNewLabel_6.setBounds(11, 103, 69, 14);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("MsgDefIdr");
		lblNewLabel_7.setBounds(691, 103, 60, 14);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("CreDt");
		lblNewLabel_8.setBounds(11, 128, 69, 14);
		add(lblNewLabel_8);
		
		bizMsgIdrTextField1 = new JTextField();
		bizMsgIdrTextField1.setBounds(90, 100, 200, 20);
		add(bizMsgIdrTextField1);
		bizMsgIdrTextField1.setColumns(10);
		
		msgDefIdrTextField = new JTextField();
		msgDefIdrTextField.setText("auth.016.001.01");
		msgDefIdrTextField.setBounds(778, 100, 200, 20);
		add(msgDefIdrTextField);
		msgDefIdrTextField.setColumns(10);
		
		bizMsgIdrTextField2 = new JTextField();
		bizMsgIdrTextField2.setText("TRA");
		bizMsgIdrTextField2.setBounds(304, 100, 30, 20);
		add(bizMsgIdrTextField2);
		bizMsgIdrTextField2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("_");
		lblNewLabel.setBounds(293, 103, 10, 14);
		add(lblNewLabel);
		
		JLabel label = new JLabel("_");
		label.setBounds(337, 103, 10, 14);
		add(label);
		
		bizMsgIdrTextField3 = new JTextField();
		bizMsgIdrTextField3.setBounds(347, 100, 86, 20);
		add(bizMsgIdrTextField3);
		bizMsgIdrTextField3.setColumns(10);
		
		bizMsgIdrTextField4 = new JTextField();
		bizMsgIdrTextField4.setBounds(445, 100, 36, 20);
		add(bizMsgIdrTextField4);
		bizMsgIdrTextField4.setColumns(10);
		
		JLabel label_1 = new JLabel("-");
		label_1.setBounds(436, 103, 10, 14);
		add(label_1);
		
		try {
			MaskFormatter dateMask = new MaskFormatter("####-##-##T##:##:######Z");
			creDtTextField = new JFormattedTextField(dateMask);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		creDtTextField.setBounds(90, 125, 200, 20);
		add(creDtTextField);
	}
	
	public BusinessApplicationHeaderV01 getDatosIntroducidos() {
		ObjectFactory fac = new ObjectFactory();
		
		BusinessApplicationHeaderV01 header = fac.createBusinessApplicationHeaderV01();
		header.setFr(panelFrom.getDatosIntroducidos());
		header.setTo(panelTo.getDatosIntroducidos());
		header.setBizMsgIdr(bizMsgIdrTextField1.getText());
		header.setMsgDefIdr(msgDefIdrTextField.getText());
		header.setCreDt(DateUtil.convertToXmlGregorianCalendar(creDtTextField.getText()));
		
		return header;
	}
}
