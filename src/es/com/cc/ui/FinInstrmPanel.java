package es.com.cc.ui;

import javax.swing.JPanel;

import es.com.cc.core.schema.all.BasketDescription3;
import es.com.cc.core.schema.all.DebtInstrument4;
import es.com.cc.core.schema.all.DerivativeInstrument61;
import es.com.cc.core.schema.all.FinancialInstrument58;
import es.com.cc.core.schema.all.FinancialInstrumentAttributes3Choice1;
import es.com.cc.core.schema.all.FinancialInstrumentIdentification7Choice;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.SecurityInstrumentDescription11;
import es.com.cc.core.schema.all.SecurityInstrumentDescription131;
import es.com.cc.core.schema.all.UnderlyingIdentification2Choice1;
import es.com.cc.core.util.DateUtil;

import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.Color;

public class FinInstrmPanel extends JPanel {

	private static final long serialVersionUID = -7675983769071963487L;
	
	private JTextField idField;
	private JTextField idGnlField;
	private JTextField fullNmGnlField;
	private JTextField clssfctnTpGnlField;
	private JTextField ntnlCcyGnlField;
	private JTextField mtrtyDtField;
	private JTextField XpryDtField;
	private JTextField pricMltplrField;
	
	private boolean hideFlag = true;

	/**
	 * Create the panel.
	 */
	public FinInstrmPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(715, 410));
		
		JLabel lblNewLabel = new JLabel("FinInstrm");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(35, 7, 94, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id");
		lblNewLabel_1.setBounds(10, 119, 46, 14);
		add(lblNewLabel_1);
		
		idField = new JTextField();
		idField.setBounds(66, 116, 200, 20);
		add(idField);
		idField.setColumns(10);
		
		JPanel panelFinInstrmGnlAttrbts = new JPanel();
		panelFinInstrmGnlAttrbts.setBounds(10, 147, 695, 56);
		add(panelFinInstrmGnlAttrbts);
		panelFinInstrmGnlAttrbts.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Id");
		lblNewLabel_2.setBounds(1, 4, 46, 14);
		panelFinInstrmGnlAttrbts.add(lblNewLabel_2);
		
		idGnlField = new JTextField();
		idGnlField.setBounds(57, 1, 200, 20);
		panelFinInstrmGnlAttrbts.add(idGnlField);
		idGnlField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("FullNm");
		lblNewLabel_3.setBounds(331, 4, 46, 14);
		panelFinInstrmGnlAttrbts.add(lblNewLabel_3);
		
		fullNmGnlField = new JTextField();
		fullNmGnlField.setBounds(387, 1, 200, 20);
		panelFinInstrmGnlAttrbts.add(fullNmGnlField);
		fullNmGnlField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("ClssfctnTp");
		lblNewLabel_4.setBounds(1, 30, 46, 14);
		panelFinInstrmGnlAttrbts.add(lblNewLabel_4);
		
		clssfctnTpGnlField = new JTextField();
		clssfctnTpGnlField.setBounds(57, 27, 200, 20);
		panelFinInstrmGnlAttrbts.add(clssfctnTpGnlField);
		clssfctnTpGnlField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("NtnlCcy");
		lblNewLabel_5.setBounds(331, 30, 46, 14);
		panelFinInstrmGnlAttrbts.add(lblNewLabel_5);
		
		ntnlCcyGnlField = new JTextField();
		ntnlCcyGnlField.setBounds(387, 27, 200, 20);
		panelFinInstrmGnlAttrbts.add(ntnlCcyGnlField);
		ntnlCcyGnlField.setColumns(10);
		
		JPanel panelDebtInstrmAttrbts = new JPanel();
		panelDebtInstrmAttrbts.setBounds(10, 214, 695, 30);
		add(panelDebtInstrmAttrbts);
		panelDebtInstrmAttrbts.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("MtrtyDt");
		lblNewLabel_6.setBounds(1, 4, 53, 14);
		panelDebtInstrmAttrbts.add(lblNewLabel_6);
		
		mtrtyDtField = new JTextField();
		mtrtyDtField.setBounds(57, 1, 200, 20);
		panelDebtInstrmAttrbts.add(mtrtyDtField);
		mtrtyDtField.setColumns(10);
		
		JPanel panelDerivInstrmAttrbts = new JPanel();
		panelDerivInstrmAttrbts.setBounds(10, 255, 695, 143);
		add(panelDerivInstrmAttrbts);
		panelDerivInstrmAttrbts.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("XpryDt");
		lblNewLabel_7.setBounds(1, 4, 46, 14);
		panelDerivInstrmAttrbts.add(lblNewLabel_7);
		
		XpryDtField = new JTextField();
		XpryDtField.setBounds(57, 1, 200, 20);
		panelDerivInstrmAttrbts.add(XpryDtField);
		XpryDtField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("PricMltplr");
		lblNewLabel_8.setBounds(331, 4, 46, 14);
		panelDerivInstrmAttrbts.add(lblNewLabel_8);
		
		pricMltplrField = new JTextField();
		pricMltplrField.setBounds(387, 1, 200, 20);
		panelDerivInstrmAttrbts.add(pricMltplrField);
		pricMltplrField.setColumns(10);
		
		JButton btnOcultar = new JButton("");
		btnOcultar.setBackground(Color.GREEN);
		btnOcultar.setBounds(10, 7, 15, 15);
		add(btnOcultar);
		btnOcultar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (hideFlag) {
					hideFlag = false;
					btnOcultar.setBackground(Color.RED);
					setPreferredSize(new Dimension(998, 30));
					
				} else {
					hideFlag = true;
					setPreferredSize(new Dimension(998, 410));
					btnOcultar.setBackground(Color.GREEN);
				}
				revalidate();
			}
		});

	}
	
	public FinancialInstrumentAttributes3Choice1 getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		
		SecurityInstrumentDescription11 secFinInst = factory.createSecurityInstrumentDescription11();
		secFinInst.setId(idGnlField.getText());
		secFinInst.setFullNm(fullNmGnlField.getText());
		secFinInst.setClssfctnTp(clssfctnTpGnlField.getText());
		secFinInst.setNtnlCcy(ntnlCcyGnlField.getText());
		
		DebtInstrument4 debt = factory.createDebtInstrument4();
		debt.setMtrtyDt(DateUtil.convertToXmlGregorianCalendar(mtrtyDtField.getText()));
		
//		FinancialInstrument58 finInst58 = factory.createFinancialInstrument58();
//		finInst58.setISIN();
//		finInst58.setNm();
//		
//		BasketDescription3 basket = factory.createBasketDescription3();
//		basket.getIndx().add(finInst58);
//		basket.getISIN().add();
//		
//		FinancialInstrumentIdentification7Choice finChoice = factory.createFinancialInstrumentIdentification7Choice();
//		finChoice.setBskt();
//		finChoice.setSngl();
//		
//		UnderlyingIdentification2Choice1 underIdent = factory.createUnderlyingIdentification2Choice1();
//		underIdent.setOthr(finChoice);
//		underIdent.setSwp();
		
		DerivativeInstrument61 deriv = factory.createDerivativeInstrument61();
		deriv.setXpryDt(DateUtil.convertToXmlGregorianCalendar(XpryDtField.getText()));
		deriv.setPricMltplr(new BigDecimal(pricMltplrField.getText()));
//		deriv.setUndrlygInstrm(underIdent);
//		deriv.setOptnTp();
//		deriv.setStrkPric();
//		deriv.setOptnExrcStyle();
//		deriv.setDlvryTp();
//		deriv.setAsstClssSpcfcAttrbts();
		
		
		SecurityInstrumentDescription131 secInst = factory.createSecurityInstrumentDescription131();
		secInst.setFinInstrmGnlAttrbts(secFinInst);
		secInst.setDebtInstrmAttrbts(debt);
		secInst.setDerivInstrmAttrbts(deriv);
		
		FinancialInstrumentAttributes3Choice1 finInst = factory.createFinancialInstrumentAttributes3Choice1();
		finInst.setId(idField.getText());
		finInst.setOthr(secInst);
		
		return finInst;
	}
}
