package es.com.cc.ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PrincipalPanel extends JFrame {

	private static final long serialVersionUID = -8581430981985132560L;	
	private static PrincipalPanel frame;
	
	private JPanel contentPane;
	private ValidadorPanel validadorPanel; 
	private CreacionPanel creacionPanel;
	

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
		setTitle("Validador de XML del tramite COM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);
		setBounds(300, 300, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCrearXml = new JButton("TR");
		btnCrearXml.setBounds(54, 253, 130, 23);
		contentPane.add(btnCrearXml);
		btnCrearXml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				muestraVentanaCrearXml();
			}
		});
		
		JButton btnValidarXml = new JButton("Validar TR");
		btnValidarXml.setBounds(221, 253, 130, 23);
		contentPane.add(btnValidarXml);
		btnValidarXml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				muestraVentanaValidarXml();
			}
		});
		
		JButton btnLeerRespuestaXml = new JButton("Leer respuesta");
		btnLeerRespuestaXml.setEnabled(false);
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
		creacionPanel = new CreacionPanel(frame);
		muestraPanel(creacionPanel);
	}
	
	private void muestraVentanaValidarXml() {
		validadorPanel = new ValidadorPanel(frame);
		muestraPanel(validadorPanel);
	}
	
	private void muestraVentanaLeerRespuestaXml() {
		
	}
	
	private void muestraPanel(JPanel panel) {
		PrincipalPanel.frame.getContentPane().removeAll();
		PrincipalPanel.frame.setContentPane(panel);
		PrincipalPanel.frame.revalidate();
	}
}
