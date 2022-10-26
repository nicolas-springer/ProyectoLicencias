package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.TextPrompt;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class AltaUsuario extends JFrame {

	private JPanel contentPanePrincipal;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldNumeroDoc;
	private JTextField textFieldEmail;
	private JTextField textFieldUsuario;
	private JPasswordField passwordFieldPass;

	
	/**
	 * Create the frame.
	 */
	public AltaUsuario() {
		
		
		setTitle("Nuevo usuario");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
		JPanel panelAbajo = new JPanel();
		panelAbajo.setLayout(null);
		panelAbajo.setBackground(new Color(69, 69, 69));
		panelAbajo.setBounds(0, 422, 1064, 44);
		
		JLabel lblAdm = new JLabel("DATOS DEL PERSONAL ADMINISTRATIVO");
		lblAdm.setForeground(new Color(255, 255, 255));
		lblAdm.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblAdm.setBounds(28, 11, 407, 22);
		
		
		JLabel lblUsuario = new JLabel("DATOS DE USUARIO");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblUsuario.setBounds(28, 11, 221, 22);
		
		
		panelAbajo.add(lblUsuario);
		panelArriba.add(lblAdm);
		contentPanePrincipal.add(panelAbajo);
		contentPanePrincipal.add(panelArriba);
		
		

		// TEXTFIELDS
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldNombre.setBounds(117, 101, 200, 35);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(388, 101, 200, 35);
		
		textFieldNumeroDoc = new JTextField();
		textFieldNumeroDoc.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldNumeroDoc.setColumns(10);
		textFieldNumeroDoc.setBounds(388, 175, 200, 35);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(117, 253, 200, 35);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldUsuario.setColumns(10);
		textFieldUsuario.setBounds(117, 505, 200, 35);
	
		
		contentPanePrincipal.add(textFieldEmail);
		contentPanePrincipal.add(textFieldApellido);
		contentPanePrincipal.add(textFieldNumeroDoc);
		contentPanePrincipal.add(textFieldNombre);
		contentPanePrincipal.add(textFieldUsuario);
		
		
		
		// PASSWORDFIELDS
		
		
		passwordFieldPass = new JPasswordField();
		passwordFieldPass.setFont(new Font("Dialog", Font.PLAIN, 14));
		passwordFieldPass.setBounds(388, 505, 200, 35);
		
		contentPanePrincipal.add(passwordFieldPass);
		
		
		//COMBOBOXS
		
		
		JComboBox comboBoxDocumento = new JComboBox();
		comboBoxDocumento.setBackground(new Color(255, 255, 255));
		comboBoxDocumento.setFont(new Font("Dialog", Font.PLAIN, 14));
		comboBoxDocumento.setBounds(117, 173, 100, 35);
		comboBoxDocumento.setModel(new DefaultComboBoxModel(new String[] { "DNI", "LE", "LC", "PASAPORTE", "OTRO" }));
		
		contentPanePrincipal.add(comboBoxDocumento);
		
		
		//BUTTONS
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(808, 625, 200, 35);
		btnConfirmar.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnConfirmar.setBackground(new Color(69,69,69));
		btnConfirmar.setForeground(new Color(255, 255, 255));
		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnVolver.setBounds(36, 625, 200, 35);
		btnVolver.setBackground(new Color(69,69,69));
		btnVolver.setForeground(new Color(255, 255, 255));
		
		contentPanePrincipal.add(btnVolver);
		contentPanePrincipal.add(btnConfirmar);
		
		
		// CALENDAR
		
		
		JLabel lblNewLabel_2 = new JLabel("CALENDARIO");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(449, 263, 123, 54);
		contentPanePrincipal.add(lblNewLabel_2);


		//PLACEHOLDERS
		
		TextPrompt placeHolderNombre = new TextPrompt ("Nombre",textFieldNombre);
		TextPrompt placeHolderApellido = new TextPrompt ("Apellido",textFieldApellido);
		TextPrompt placeHolderEmail = new TextPrompt ("Email",textFieldEmail);
		TextPrompt placeHolderNumeroDoc= new TextPrompt ("Numero de documento",textFieldNumeroDoc);
		TextPrompt placeHolderUsuario= new TextPrompt ("Usuario",textFieldUsuario);
		TextPrompt placeHolderPass= new TextPrompt ("Contraseña",passwordFieldPass);
		
		
	}
}
