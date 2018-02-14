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
	private JPanel panelBsisPts;
	private JPanel panelMntryVal;
	private JPanel panelPctg;
	private JPanel panelYld;
	
	private JTextField bsisPtsField;
	private JTextField mntryValValueField;
	private JTextField npCcyField;
	private JTextField ptgField;
	private JTextField yldField;
	
	private JRadioButton radioPrice;
	private JRadioButton radioNoPrice;
	private JRadioButton radioBsisPts;
	private JRadioButton radioMntryVal;
	private JRadioButton radioPctg;
	private JRadioButton radioYld;
	private JComboBox mntryValCcyComboBox;
	
	/**
	 * Create the panel.
	 */
	public PrecioPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(299, 118));
		
		JPanel panelRadios = new JPanel();
		panelRadios.setBounds(1, 1, 298, 30);
		add(panelRadios);
		
		radioPrice = new JRadioButton("Price");
		panelRadios.add(radioPrice);
		radioPrice.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panelPrecio.setVisible(true);
				panelNoPrecio.setVisible(false);
			}
		});
		
		radioNoPrice = new JRadioButton("No Price");
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
		panelPrecio.setBounds(1, 29, 298, 88);
		add(panelPrecio);
		panelPrecio.setLayout(null);
		
		JPanel panelPrecioRadios = new JPanel();
		panelPrecioRadios.setBounds(1, 0, 297, 30);
		panelPrecio.add(panelPrecioRadios);
		
		radioBsisPts = new JRadioButton("BsisPts");
		panelPrecioRadios.add(radioBsisPts);
		radioBsisPts.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanelTipoPrecio(0);
			}
		});
		
		radioMntryVal = new JRadioButton("MntryVal");
		panelPrecioRadios.add(radioMntryVal);
		radioMntryVal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanelTipoPrecio(1);
			}
		});
		
		radioPctg = new JRadioButton("Pctg");
		panelPrecioRadios.add(radioPctg);
		radioPctg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				muestraPanelTipoPrecio(2);
			}
		});
		
		radioYld = new JRadioButton("Yld");
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
//		panelBsisPts = new JPanel();
//		panelBsisPts.setBounds(0, 30, 297, 58);
//		panelPrecio.add(panelBsisPts);
//		panelBsisPts.setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("BsisPts");
//		lblNewLabel.setBounds(10, 11, 80, 14);
//		panelBsisPts.add(lblNewLabel);
//		
//		bsisPtsField = new JTextField();
//		bsisPtsField.setBounds(100, 8, 180, 20);
//		panelBsisPts.add(bsisPtsField);
//		bsisPtsField.setColumns(10);
		
		/**
		 * panelMntryVal
		 */
		panelMntryVal = new JPanel();
		panelMntryVal.setBounds(0, 30, 297, 58);
		panelPrecio.add(panelMntryVal);
		panelMntryVal.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("Sign");
		lblNewLabel1.setBounds(10, 11, 45, 14);
		panelMntryVal.add(lblNewLabel1);
		
		JComboBox<String> signComboBox = new JComboBox<String>();
		signComboBox.setBounds(55, 8, 70, 20);
		panelMntryVal.add(signComboBox);
		signComboBox.addItem("Si");
		signComboBox.addItem("No");
		
		JLabel lblNewLabel_1 = new JLabel("Currency");
		lblNewLabel_1.setBounds(150, 11, 55, 14);
		panelMntryVal.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Valor");
		lblNewLabel_2.setBounds(10, 36, 45, 14);
		panelMntryVal.add(lblNewLabel_2);
		
		mntryValValueField = new JTextField();
		mntryValValueField.setBounds(55, 33, 230, 20);
		panelMntryVal.add(mntryValValueField);
		mntryValValueField.setColumns(10);
		
		mntryValCcyComboBox = new JComboBox();
		mntryValCcyComboBox.setBounds(215, 8, 70, 20);
		panelMntryVal.add(mntryValCcyComboBox);
		
		
		/**
		 * panelPctg
		 */
//		panelPctg = new JPanel();
//		panelPctg.setBounds(0, 30, 297, 58);
//		panelPrecio.add(panelPctg);
//		panelPctg.setLayout(null);
//		
//		JLabel lblNewLabel2 = new JLabel("Pctg");
//		lblNewLabel2.setBounds(10, 11, 80, 14);
//		panelPctg.add(lblNewLabel2);
//		
//		ptgField = new JTextField();
//		ptgField.setBounds(100, 8, 180, 20);
//		panelPctg.add(ptgField);
//		ptgField.setColumns(10);
		
		
		/**
		 * panelPctg
		 */
//		panelYld = new JPanel();
//		panelYld.setBounds(0, 30, 297, 60);
//		panelPrecio.add(panelYld);
//		panelYld.setLayout(null);
//		
//		JLabel lblNewLabel3 = new JLabel("Yld");
//		lblNewLabel3.setBounds(10, 11, 80, 14);
//		panelYld.add(lblNewLabel3);
//		
//		yldField = new JTextField();
//		yldField.setBounds(100, 8, 180, 20);
//		panelYld.add(yldField);
//		yldField.setColumns(10);
		
		
		/**
		 * ******************************************************************************************
		 * panel de no precio
		 */
		panelNoPrecio = new JPanel();
		panelNoPrecio.setBounds(1, 29, 298, 88);
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
		
		// valores por defecto
		
		radioPrice.setSelected(true);
	}
	
	public SecuritiesTransactionPrice4Choice getDatosIntroducidos() {
		ObjectFactory factory = new ObjectFactory();
		SecuritiesTransactionPrice4Choice secTran = factory.createSecuritiesTransactionPrice4Choice();
		
		
		
		return secTran;
	}
	
	private void muestraPanelTipoPrecio(int posicion) {
		switch (posicion) {
			case 0:
				panelBsisPts.setVisible(true);
				panelMntryVal.setVisible(false);
				panelPctg.setVisible(false);
				panelYld.setVisible(false);
				break;
			case 1:
				panelBsisPts.setVisible(false);
				panelMntryVal.setVisible(true);
				panelPctg.setVisible(false);
				panelYld.setVisible(false);
				break;
			case 2:
				panelBsisPts.setVisible(false);
				panelMntryVal.setVisible(false);
				panelPctg.setVisible(true);
				panelYld.setVisible(false);
				break;
			case 3:
				panelBsisPts.setVisible(false);
				panelMntryVal.setVisible(false);
				panelPctg.setVisible(false);
				panelYld.setVisible(true);
				break;
		}
	}
}
