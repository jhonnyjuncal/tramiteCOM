package es.com.cc.ui;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import es.com.cc.core.schema.all.ObjectFactory;
import es.com.cc.core.schema.all.SecuritiesTransactionPrice4Choice;
import javax.swing.JComboBox;

public class PrecioPanel extends JPanel {

	private static final long serialVersionUID = 5648339491050174064L;
	
	private JPanel panelPrecio;
	private JPanel panelNoPrecio;
	private JTextField bsisPtsField;
	private JTextField mntryValCcyField;
	private JTextField mntryValValueField;
	private JTextField npCcyField;
	private JTextField ptgField;
	private JTextField yldField;
	
	
	
	
	
	

	/**
	 * Create the panel.
	 */
	public PrecioPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(350, 120));
		
		JPanel panelRadios = new JPanel();
		panelRadios.setBounds(0, 0, 350, 30);
		add(panelRadios);
		
		JRadioButton radioPrice = new JRadioButton("Price");
		panelRadios.add(radioPrice);
		radioPrice.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelPrecio.setVisible(true);
				panelNoPrecio.setVisible(false);
			}
		});
		
		JRadioButton radioNoPrice = new JRadioButton("No Price");
		panelRadios.add(radioNoPrice);
		radioNoPrice.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelPrecio.setVisible(false);
				panelNoPrecio.setVisible(true);
			}
		});
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(radioPrice);
		grupo1.add(radioNoPrice);
		
		/**
		 * ******************************************************************************************
		 * panel de precio
		 */
		panelPrecio = new JPanel();
		panelPrecio.setBounds(0, 29, 350, 90);
		add(panelPrecio);
		panelPrecio.setLayout(null);
		
		JPanel panelPrecioRadios = new JPanel();
		panelPrecioRadios.setBounds(0, 0, 350, 30);
		panelPrecio.add(panelPrecioRadios);
		
		JRadioButton radioBsisPts = new JRadioButton("BsisPts");
		panelPrecioRadios.add(radioBsisPts);
		radioBsisPts.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanelTipoPrecio(0);
			}
		});
		
		JRadioButton radioMntryVal = new JRadioButton("MntryVal");
		panelPrecioRadios.add(radioMntryVal);
		radioMntryVal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanelTipoPrecio(1);
			}
		});
		
		JRadioButton radioPctg = new JRadioButton("Pctg");
		panelPrecioRadios.add(radioPctg);
		radioPctg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanelTipoPrecio(2);
			}
		});
		
		JRadioButton radioYld = new JRadioButton("Yld");
		panelPrecioRadios.add(radioYld);
		radioYld.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanelTipoPrecio(3);
			}
		});
		
		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(radioBsisPts);
		grupo2.add(radioMntryVal);
		grupo2.add(radioPctg);
		grupo2.add(radioYld);
		
		/**
		 * panelBsisPts
		 */
		JPanel panelBsisPts = new JPanel();
		panelBsisPts.setBounds(0, 30, 350, 60);
		panelPrecio.add(panelBsisPts);
		panelBsisPts.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BsisPts");
		lblNewLabel.setBounds(10, 11, 80, 14);
		panelBsisPts.add(lblNewLabel);
		
		bsisPtsField = new JTextField();
		bsisPtsField.setBounds(100, 8, 200, 20);
		panelBsisPts.add(bsisPtsField);
		bsisPtsField.setColumns(10);
		
		/**
		 * panelMntryVal
		 */
		JPanel panelMntryVal = new JPanel();
		panelMntryVal.setBounds(0, 30, 350, 60);
		panelPrecio.add(panelMntryVal);
		panelMntryVal.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("Sign");
		lblNewLabel1.setBounds(10, 11, 55, 14);
		panelMntryVal.add(lblNewLabel1);
		
		JComboBox<String> signComboBox = new JComboBox<String>();
		signComboBox.setBounds(81, 8, 86, 20);
		panelMntryVal.add(signComboBox);
		signComboBox.addItem("Si");
		signComboBox.addItem("No");
		
		JLabel lblNewLabel_1 = new JLabel("Currency");
		lblNewLabel_1.setBounds(10, 36, 64, 14);
		panelMntryVal.add(lblNewLabel_1);
		
		mntryValCcyField = new JTextField();
		mntryValCcyField.setBounds(81, 33, 86, 20);
		panelMntryVal.add(mntryValCcyField);
		mntryValCcyField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Valor");
		lblNewLabel_2.setBounds(194, 36, 46, 14);
		panelMntryVal.add(lblNewLabel_2);
		
		mntryValValueField = new JTextField();
		mntryValValueField.setBounds(250, 33, 86, 20);
		panelMntryVal.add(mntryValValueField);
		mntryValValueField.setColumns(10);
		
		
		/**
		 * panelPctg
		 */
		JPanel panelPctg = new JPanel();
		panelPctg.setBounds(0, 30, 350, 60);
		panelPrecio.add(panelPctg);
		panelPctg.setLayout(null);
		
		JLabel lblNewLabel2 = new JLabel("Pctg");
		lblNewLabel2.setBounds(10, 11, 80, 14);
		panelPctg.add(lblNewLabel2);
		
		ptgField = new JTextField();
		ptgField.setBounds(100, 8, 200, 20);
		panelPctg.add(ptgField);
		ptgField.setColumns(10);
		
		
		/**
		 * panelPctg
		 */
		JPanel panelYld = new JPanel();
		panelYld.setBounds(0, 30, 350, 60);
		panelPrecio.add(panelYld);
		panelYld.setLayout(null);
		
		JLabel lblNewLabel3 = new JLabel("Yld");
		lblNewLabel3.setBounds(10, 11, 80, 14);
		panelYld.add(lblNewLabel3);
		
		yldField = new JTextField();
		yldField.setBounds(100, 8, 200, 20);
		panelYld.add(yldField);
		yldField.setColumns(10);
		
		
		/**
		 * ******************************************************************************************
		 * panel de no precio
		 */
		panelNoPrecio = new JPanel();
		panelNoPrecio.setBounds(0, 29, 350, 90);
		add(panelNoPrecio);
		panelNoPrecio.setLayout(null);
		
		JLabel lblNewLabel4 = new JLabel("Ccy");
		lblNewLabel4.setBounds(10, 11, 46, 14);
		panelNoPrecio.add(lblNewLabel4);
		
		npCcyField = new JTextField();
		npCcyField.setBounds(66, 8, 200, 20);
		panelNoPrecio.add(npCcyField);
		npCcyField.setColumns(10);
		
		JLabel lblNewLabel5 = new JLabel("Pdg");
		lblNewLabel5.setBounds(10, 36, 46, 14);
		panelNoPrecio.add(lblNewLabel5);
		
		JComboBox<String> pdgComboBox = new JComboBox<String>();
		pdgComboBox.setBounds(66, 33, 200, 20);
		panelNoPrecio.add(pdgComboBox);
		pdgComboBox.addItem("NOAP");
		pdgComboBox.addItem("PNDG");
		
		
	}
	
	public SecuritiesTransactionPrice4Choice getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		SecuritiesTransactionPrice4Choice secTran = factory.createSecuritiesTransactionPrice4Choice();
		
		
		
		return secTran;
	}
	
	private void muestraPanelTipoPrecio(int posicion) {
		switch (posicion) {
			case 0:
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
		}
	}
}
