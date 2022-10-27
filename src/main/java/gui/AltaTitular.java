package gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import org.apache.commons.validator.routines.EmailValidator;


import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import util.TextPrompt;

import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class AltaTitular extends JFrame {

	private JPanel contentPanePrincipal;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textFieldEmail;
	private JTextField textFieldNumeroDoc;
	private JTextField textFieldCuil;
	private JTextField textFieldPais;
	private JTextField textFieldProvincia;
	private JTextField textFieldCiudad;
	private JTextField textFieldNumero;
	private JTextField textFieldCalle;
	private JTextField textFieldPiso;
	private JTextField textFieldDto;
	private String mensajeError;

	/**
	 * Create the frame.
	 */
	public AltaTitular() {
		

		setTitle("Nuevo titular");
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
		
		JPanel panelFoto = new JPanel();
		panelFoto.setBounds(813, 100, 206, 172);
		panelFoto.setBackground(new Color(69,69,69));
		
		JLabel lblAdm = new JLabel("DATOS DEL TITULAR");
		lblAdm.setForeground(new Color(255, 255, 255));
		lblAdm.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblAdm.setBounds(28, 11, 407, 22);
		panelArriba.add(lblAdm);
		
		
		contentPanePrincipal.add(panelFoto);
		panelFoto.setLayout(null);
		
		JLabel lblFoto = new JLabel("");
		lblFoto.setBounds(0, 0, 206, 172);
		panelFoto.add(lblFoto);
		contentPanePrincipal.add(panelArriba);
		
		
		// TEXTFIELDS
		
		textFieldNombre = new JTextField();
		textFieldNombre.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldNombre.setBounds(70, 100, 200, 35);
		textFieldNombre.setColumns(10);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(390, 100, 200, 35);
		
		textFieldNumeroDoc = new JTextField();
		textFieldNumeroDoc.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldNumeroDoc.setColumns(10);
		textFieldNumeroDoc.setBounds(390, 160, 200, 35);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(390, 220, 200, 35);
		
		textFieldCuil = new JTextField();
		textFieldCuil.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldCuil.setColumns(10);
		textFieldCuil.setBounds(70, 220, 200, 35);
		
		textFieldPais = new JTextField();
		textFieldPais.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldPais.setColumns(10);
		textFieldPais.setBounds(70, 340, 200, 35);
		
		textFieldProvincia = new JTextField();
		textFieldProvincia.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldProvincia.setColumns(10);
		textFieldProvincia.setBounds(390, 340, 200, 35);
		
		textFieldCiudad = new JTextField();
		textFieldCiudad.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldCiudad.setColumns(10);
		textFieldCiudad.setBounds(70, 400, 200, 35);
		
		textFieldNumero = new JTextField();
		textFieldNumero.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldNumero.setColumns(10);
		textFieldNumero.setBounds(70, 460, 100, 35);
		
		textFieldCalle = new JTextField();
		textFieldCalle.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldCalle.setColumns(10);
		textFieldCalle.setBounds(390, 400, 200, 35);
		
		textFieldPiso = new JTextField();
		textFieldPiso.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldPiso.setColumns(10);
		textFieldPiso.setBounds(280, 460, 100, 35);
		
		textFieldDto = new JTextField();
		textFieldDto.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldDto.setColumns(10);
		textFieldDto.setBounds(490, 460, 100, 35);
		
	
		
		contentPanePrincipal.add(textFieldEmail);
		contentPanePrincipal.add(textFieldApellido);
		contentPanePrincipal.add(textFieldNumeroDoc);
		contentPanePrincipal.add(textFieldNombre);
		contentPanePrincipal.add(textFieldCuil);
		contentPanePrincipal.add(textFieldPiso);
		contentPanePrincipal.add(textFieldDto);
		contentPanePrincipal.add(textFieldCalle);
		contentPanePrincipal.add(textFieldNumero);
		contentPanePrincipal.add(textFieldCiudad);
		contentPanePrincipal.add(textFieldProvincia);
		contentPanePrincipal.add(textFieldPais);
		
		
		//COMBOBOXS
		
		
		JComboBox comboBoxDocumento = new JComboBox();
		comboBoxDocumento.setBackground(new Color(255, 255, 255));
		comboBoxDocumento.setFont(new Font("Dialog", Font.PLAIN, 14));
		comboBoxDocumento.setBounds(70, 160, 100, 35);
		comboBoxDocumento.setModel(new DefaultComboBoxModel(new String[] { "DNI", "LE", "LC", "PASAPORTE", "OTRO" }));
		
		
		JComboBox comboBoxSexo = new JComboBox();
		comboBoxSexo.setFont(new Font("Dialog", Font.PLAIN, 14));
		comboBoxSexo.setBackground(Color.WHITE);
		comboBoxSexo.setBounds(70, 280, 100, 35);
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] { "Masculino", "Femenino", "No indica" }));
		
		contentPanePrincipal.add(comboBoxSexo);
		contentPanePrincipal.add(comboBoxDocumento);
		
		
		//BUTTONS
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(813, 612, 200, 35);
		btnConfirmar.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnConfirmar.setBackground(new Color(69,69,69));
		btnConfirmar.setForeground(new Color(255, 255, 255));
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnVolver.setBounds(38, 612, 200, 35);
		btnVolver.setBackground(new Color(69,69,69));
		btnVolver.setForeground(new Color(255, 255, 255));
		
		JButton btnFoto = new JButton("Subir imagen");
		
		
		btnFoto.setForeground(Color.WHITE);
		btnFoto.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnFoto.setBackground(new Color(69, 69, 69));
		btnFoto.setBounds(813, 294, 200, 35);
		
		
		contentPanePrincipal.add(btnFoto);
		contentPanePrincipal.add(btnVolver);
		contentPanePrincipal.add(btnConfirmar);
		
		
		// CALENDAR
		
		
		JLabel lblNewLabel_2 = new JLabel("CALENDARIO");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(437, 266, 123, 54);
		contentPanePrincipal.add(lblNewLabel_2);


		//PLACEHOLDERS
		
		TextPrompt placeHolderNombre = new TextPrompt ("Nombre",textFieldNombre);
		TextPrompt placeHolderApellido = new TextPrompt ("Apellido",textFieldApellido);
		TextPrompt placeHolderEmail = new TextPrompt ("Email",textFieldEmail);
		TextPrompt placeHolderNumeroDoc= new TextPrompt ("Numero de documento",textFieldNumeroDoc);
		TextPrompt placeHolderPais= new TextPrompt ("Pais",textFieldPais);
		TextPrompt placeHolderCiudad= new TextPrompt ("Ciudad",textFieldCiudad);
		TextPrompt placeHolderProvincia= new TextPrompt ("Provincia",textFieldProvincia);
		TextPrompt placeHolderNumero= new TextPrompt ("Numero",textFieldNumero);
		TextPrompt placeHolderCalle= new TextPrompt ("Calle",textFieldCalle);
		TextPrompt placeHolderCuil= new TextPrompt ("Cuil",textFieldCuil);
		TextPrompt placeHolderDepto= new TextPrompt ("Dpto",textFieldDto);
		TextPrompt placeHolderPiso= new TextPrompt ("Piso",textFieldPiso);
		
		//CHECKBOXS
		
		JCheckBox chckbxDonante = new JCheckBox("Donante");
		chckbxDonante.setFont(new Font("Dialog", Font.PLAIN, 14));
		chckbxDonante.setBounds(73, 525, 97, 23);
		
		contentPanePrincipal.add(chckbxDonante);
		
		JComboBox comboBoxDocumento_1 = new JComboBox();
		comboBoxDocumento_1.setModel(new DefaultComboBoxModel(new String[] {"Grupo Sanguineo", "A", "B", "AB", "0"}));
		comboBoxDocumento_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		comboBoxDocumento_1.setBackground(Color.WHITE);
		comboBoxDocumento_1.setBounds(256, 519, 152, 35);
		contentPanePrincipal.add(comboBoxDocumento_1);
		
		JComboBox comboBoxDocumento_1_1 = new JComboBox();
		comboBoxDocumento_1_1.setModel(new DefaultComboBoxModel(new String[] {"Factor RH", "+", "-"}));
		comboBoxDocumento_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		comboBoxDocumento_1_1.setBackground(Color.WHITE);
		comboBoxDocumento_1_1.setBounds(490, 519, 100, 35);
		contentPanePrincipal.add(comboBoxDocumento_1_1);
		
		
		//UTIL PARA IMAGE
		
		
		//MSJ
		
	
		
		//BUTTON ACTIONS

		
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu jFrameMenu = new Menu();
				jFrameMenu.setVisible(true);
				dispose();
			}
		});
		
		
		btnFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JFileChooser imagen = new JFileChooser();
				imagen.setMultiSelectionEnabled(false);
				
				if (imagen.showOpenDialog(contentPanePrincipal) == JFileChooser.APPROVE_OPTION){
				//	rsdragdropfiles.RSDragDropFiles.setCopiar(imagen.getSelectedFile().toString(), "");
					ImageIcon imageIconNoEscalada = new ImageIcon(imagen.getSelectedFile().toString());
					Image imageNoEscalada = imageIconNoEscalada.getImage();
					ImageIcon imageIconEscalada = new ImageIcon(imageNoEscalada.getScaledInstance(lblFoto.getWidth(),lblFoto.getHeight(),Image.SCALE_DEFAULT));
					lblFoto.setIcon(imageIconEscalada);
					lblFoto.repaint();
				}
				
				//
			}
		});
	
		
		btnConfirmar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				

				if(validar()) {
					
					JOptionPane.showMessageDialog(null, "Datos cargados correctamente");;
				}
				
				
			}
		});
		
		
		
		
	}
	
	
	private Boolean validar() {

		if 	    (  textFieldApellido.getText().isEmpty() 
				|| textFieldNombre.getText().isEmpty() 
				|| !verificarDNI(textFieldNumeroDoc.getText().toString())
				|| !EmailValidator.getInstance().isValid(textFieldEmail.getText().toString())
				|| textFieldCuil.getText().isEmpty()
				|| textFieldPais.getText().isEmpty()
				|| textFieldProvincia.getText().isEmpty()
				|| textFieldCiudad.getText().isEmpty()
				|| textFieldNumero.getText().isEmpty()
				|| textFieldCalle.getText().isEmpty()
				) {
		
			if (textFieldApellido.getText().isEmpty()) {
				textFieldApellido.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
			} 
			else {
				textFieldApellido.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
				
			}

			if (textFieldNombre.getText().isEmpty()) {
			textFieldNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		
			}
			else {
			textFieldNombre.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		
			}

			if (!verificarDNI(textFieldNumeroDoc.getText().toString()) ) {
			textFieldNumeroDoc.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
			}
			else {
			textFieldNumeroDoc.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
			
			}

			if (textFieldCuil.getText().isEmpty()) {
			textFieldCuil.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
			
			}
			else {
			textFieldCuil.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		
			}

			if (textFieldPais.getText().isEmpty()) {
			textFieldPais.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
			}
			else {
			textFieldPais.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
			}

			if (!EmailValidator.getInstance().isValid(textFieldEmail.getText().toString())) {
			textFieldEmail.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
			} 
			else {
			textFieldEmail.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
			
			}


			if (textFieldCalle.getText().isEmpty()) {
			textFieldCalle.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		
			} 
			else {
			textFieldCalle.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		
			}

			if (textFieldProvincia.getText().isEmpty()) {
			textFieldProvincia.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
			
			}	
			else {
			textFieldProvincia.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		
			}

			if (textFieldCiudad.getText().isEmpty()) {
			textFieldCiudad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
			}
			else {
			textFieldCiudad.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
			}
			
			if (textFieldNumero.getText().isEmpty()) {
				textFieldNumero.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
			}
			else {
			textFieldNumero.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
			}
			
			
			JOptionPane.showMessageDialog(null, "Existen campos incorrectos o sin completar");
		
			return false;

			} else return true; 
		}
		
	
private boolean verificarDNI(String dni) {
		
		Pattern pat = Pattern.compile("[0-9]{7,8}");
	    Matcher mat = pat.matcher(dni); 
	    return  mat.matches();
		
	}
}
