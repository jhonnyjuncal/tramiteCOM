package es.com.cc.ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class PrincipalPanel extends JFrame {

	private static final long serialVersionUID = -8581430981985132560L;	
	private static PrincipalPanel frame;
	
	private JPanel contentPane;
	private ValidadorPanel validadorPanel; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new PrincipalPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrincipalPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCrearXml = new JButton("Crear XML");
		btnCrearXml.setBounds(54, 253, 130, 23);
		contentPane.add(btnCrearXml);
		btnCrearXml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				muestraVentanaCrearXml();
			}
		});
		
		JButton btnValidarXml = new JButton("Validar XML");
		btnValidarXml.setBounds(222, 253, 130, 23);
		contentPane.add(btnValidarXml);
		btnValidarXml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				muestraVentanaValidarXml();
			}
		});
		
		JButton btnLeerRespuestaXml = new JButton("Leer respuesta XML");
		btnLeerRespuestaXml.setBounds(385, 253, 130, 23);
		contentPane.add(btnLeerRespuestaXml);
		btnLeerRespuestaXml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				muestraVentanaLeerRespuestaXml();
			}
		});
	}
	
	private void muestraVentanaCrearXml() {
		
	}
	
	private void muestraVentanaValidarXml() {
		validadorPanel = new ValidadorPanel();
		
		frame.getContentPane().removeAll();
		frame.setContentPane(validadorPanel);
		frame.revalidate();
	}
	
	private void muestraVentanaLeerRespuestaXml() {
		
	}
}