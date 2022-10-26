package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.TextPrompt;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {


	private JPanel contentPanePrincipal;
	private JTextField textFieldUsuario;
	private JPasswordField passwordFieldPass;


	/**
	 * Create the frame.
	 */
	public Principal() {
		
		setTitle("Nuevo usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		setLocationRelativeTo(null);
		
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
		
		JLabel lblAdm = new JLabel("INICIAR SESION");
		lblAdm.setForeground(new Color(255, 255, 255));
		lblAdm.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblAdm.setBounds(28, 11, 407, 22);
		
		
		panelArriba.add(lblAdm);
		contentPanePrincipal.add(panelArriba);
		
		

		// TEXTFIELDS
		
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldUsuario.setColumns(10);
		textFieldUsuario.setBounds(440, 250, 200, 35);
	
	
		contentPanePrincipal.add(textFieldUsuario);
		
		
		
		// PASSWORDFIELDS
		
		
		passwordFieldPass = new JPasswordField();
		passwordFieldPass.setFont(new Font("Dialog", Font.PLAIN, 14));
		passwordFieldPass.setBounds(440, 320, 200, 35);
		
		contentPanePrincipal.add(passwordFieldPass);
		
		
		
		
		//BUTTONS
		
		JButton btnConfirmar = new JButton("Confirmar");
	
		btnConfirmar.setBounds(808, 625, 200, 35);
		btnConfirmar.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnConfirmar.setBackground(new Color(69,69,69));
		btnConfirmar.setForeground(new Color(255, 255, 255));
		
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu guiMenu = new Menu();
				guiMenu.setVisible(true);
				dispose();
			}
		});
		
		
		contentPanePrincipal.add(btnConfirmar);
		


		//PLACEHOLDERS

		TextPrompt placeHolderUsuario= new TextPrompt ("Usuario",textFieldUsuario);
		TextPrompt placeHolderPass= new TextPrompt ("Password",passwordFieldPass);

	
		
	}
}
