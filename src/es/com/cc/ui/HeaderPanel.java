package es.com.cc.ui;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import es.com.cc.core.schema.all.BusinessApplicationHeaderV01;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.util.DateUtil;

public class HeaderPanel extends JPanel {

	private static final long serialVersionUID = -169220978179044134L;
	
	private JTextField bizMsgIdrTextField;
	private JTextField msgDefIdrTextField;
	private JTextField creDtTextField;
	
	private FromToPanel panelFrom;
	private FromToPanel panelTo;
	
	/**
	 * Create the panel.
	 */
	public HeaderPanel() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setPreferredSize(new Dimension(720, 182));
		setLayout(null);
		
		panelFrom = new FromToPanel();
		panelFrom.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelFrom.setLocation(2, 2);
		panelFrom.setSize(356, 108);
		add(panelFrom);
		
		panelTo = new FromToPanel();
		panelTo.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTo.setLocation(362, 2);
		panelTo.setSize(356, 108);
		add(panelTo);
		
		JLabel lblNewLabel_6 = new JLabel("BizMsgIdr");
		lblNewLabel_6.setBounds(12, 121, 69, 14);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("MsgDefIdr");
		lblNewLabel_7.setBounds(384, 146, 60, 14);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("CreDt");
		lblNewLabel_8.setBounds(12, 146, 69, 14);
		add(lblNewLabel_8);
		
		bizMsgIdrTextField = new JTextField();
		bizMsgIdrTextField.setBounds(91, 118, 563, 20);
		add(bizMsgIdrTextField);
		bizMsgIdrTextField.setColumns(10);
		
		msgDefIdrTextField = new JTextField();
		msgDefIdrTextField.setBounds(454, 143, 200, 20);
		add(msgDefIdrTextField);
		msgDefIdrTextField.setColumns(10);
		
		creDtTextField = new JTextField();
		creDtTextField.setBounds(91, 143, 200, 20);
		add(creDtTextField);
		creDtTextField.setColumns(10);
	}
	
	public BusinessApplicationHeaderV01 getDatosIntroducidos() {
		ObjectFactory fac = new ObjectFactory();
		
		BusinessApplicationHeaderV01 header = fac.createBusinessApplicationHeaderV01();
		header.setFr(panelFrom.getDatosIntroducidos());
		header.setTo(panelTo.getDatosIntroducidos());
		header.setBizMsgIdr(bizMsgIdrTextField.getText());
		header.setMsgDefIdr(msgDefIdrTextField.getText());
		header.setCreDt(DateUtil.convertToXmlGregorianCalendar(creDtTextField.getText()));
		
		return header;
	}
}
