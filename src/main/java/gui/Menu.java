package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



















import util.TextPrompt;

public class Menu extends JFrame {

	private JPanel contentPanePrincipal;
	
	/**
	 * Create the frame.
	 */
	public Menu() {
		
		setTitle("Menu principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		setLocationRelativeTo(null);
		repaint();
		
		
		contentPanePrincipal = new JPanel();
		contentPanePrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanePrincipal.setLayout(null);
		contentPanePrincipal.setBackground(new Color(239,239,239));
		
		setContentPane(contentPanePrincipal);
		
		
		// PANELES PARA DESIGN
		
		JPanel panelArriba = new JPanel();
		panelArriba.setBackground(new Color(69,69,69));
		panelArriba.setBounds(0, 28, 1064, 44);
		panelArriba.setLayout(null);
		
		JLabel lblAdm = new JLabel("MENU PRINCIPAL");
		lblAdm.setForeground(new Color(255, 255, 255));
		lblAdm.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblAdm.setBounds(28, 11, 185, 22);
		
		
		panelArriba.add(lblAdm);
		contentPanePrincipal.add(panelArriba);
		
		
		
		
		//BUTTONS
		
		JButton btnNuevaLicencia = new JButton("Nueva licencia");
		btnNuevaLicencia.setBounds(440, 200, 200, 40);
		btnNuevaLicencia.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNuevaLicencia.setBackground(new Color(69,69,69));
		btnNuevaLicencia.setForeground(new Color(255, 255, 255));
		
		contentPanePrincipal.add(btnNuevaLicencia);
		
		JButton btnLicencias = new JButton("Licencias");
		btnLicencias.setForeground(Color.WHITE);
		btnLicencias.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnLicencias.setBackground(new Color(69, 69, 69));
		btnLicencias.setBounds(440, 500, 200, 40);
		contentPanePrincipal.add(btnLicencias);
		
		JButton btnNuevoT = new JButton("Nuevo titular");
		btnNuevoT.setForeground(Color.WHITE);
		btnNuevoT.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnNuevoT.setBackground(new Color(69, 69, 69));
		btnNuevoT.setBounds(440, 300, 200, 40);
		contentPanePrincipal.add(btnNuevoT);
		
		JButton btnModificarT = new JButton("Modificar titular");
		btnModificarT.setForeground(Color.WHITE);
		btnModificarT.setFont(new Font("Dialog", Font.PLAIN, 20));
		btnModificarT.setBackground(new Color(69, 69, 69));
		btnModificarT.setBounds(440, 400, 200, 40);
		contentPanePrincipal.add(btnModificarT);
		
		
		//BUTTON ACTIONS

		
		btnNuevaLicencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EmitirLicencia jFrameEmitirLicencia = new EmitirLicencia();
				jFrameEmitirLicencia.setVisible(true);
				dispose();
			}
		});
		
		
		
		btnNuevoT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AltaTitular jFrameAltaTitular = new AltaTitular();
				jFrameAltaTitular.setVisible(true);
				dispose();
			}
		});
		
	
	}

}
