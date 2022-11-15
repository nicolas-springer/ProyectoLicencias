package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dominio.Clase;
import dominio.Licencia;
import dominio.Titular;
import gestores.GestorLicencia;
import gestores.GestorTitular;
import util.TextPrompt;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JCheckBox;

public class EmitirLicencia extends JFrame {

	private JPanel contentPanePrincipal;
	private JTextField textFieldNumeroDoc;
	private Titular titular =  new Titular();
	private Licencia licencia;
	private GestorTitular gTitular = new GestorTitular();
	private GestorLicencia gLicencia = new GestorLicencia();
	
	
	public EmitirLicencia() {

		setTitle("Nuevo usuario");
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
		
		JPanel panelMedio = new JPanel();
		panelMedio.setLayout(null);
		panelMedio.setBackground(new Color(69, 69, 69));
		panelMedio.setBounds(0, 172, 1064, 44);
		
		JPanel panelAbajo = new JPanel();
		panelAbajo.setLayout(null);
		panelAbajo.setBackground(new Color(69, 69, 69));
		panelAbajo.setBounds(0, 417, 1064, 44);
	
		JLabel lblBusqueda = new JLabel("BUSQUEDA");
		lblBusqueda.setForeground(new Color(255, 255, 255));
		lblBusqueda.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblBusqueda.setBounds(28, 11, 407, 22);
		
		JLabel lblDatos = new JLabel("DATOS PERSONALES");
		lblDatos.setForeground(Color.WHITE);
		lblDatos.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblDatos.setBounds(28, 11, 221, 22);
		
		JLabel lblClases = new JLabel("CLASES");
		lblClases.setForeground(Color.WHITE);
		lblClases.setFont(new Font("Dialog", Font.PLAIN, 20));
		lblClases.setBounds(28, 11, 221, 22);
		
		panelArriba.add(lblBusqueda);
		panelMedio.add(lblDatos);
		panelAbajo.add(lblClases);
		contentPanePrincipal.add(panelAbajo);
		contentPanePrincipal.add(panelMedio);
		contentPanePrincipal.add(panelArriba);
		

		// TEXTFIELDS
		
		
		textFieldNumeroDoc = new JTextField();
		textFieldNumeroDoc.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldNumeroDoc.setColumns(10);
		textFieldNumeroDoc.setBounds(400, 100, 200, 35);
		contentPanePrincipal.add(textFieldNumeroDoc);
	
		
		//COMBOBOXS
		
		
		JComboBox comboBoxDocumento = new JComboBox();
		comboBoxDocumento.setBackground(new Color(255, 255, 255));
		comboBoxDocumento.setFont(new Font("Dialog", Font.PLAIN, 14));
		comboBoxDocumento.setBounds(100, 100, 110, 35);
		comboBoxDocumento.setModel(new DefaultComboBoxModel(new String[] { "DNI", "LE", "LC", "PASAPORTE", "OTRO" }));
		
		contentPanePrincipal.add(comboBoxDocumento);
		
		
		//BUTTONS
		
		JButton btnCargarLicencia = new JButton("Cargar licencia");
		btnCargarLicencia.setBounds(808, 625, 200, 35);
		btnCargarLicencia.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnCargarLicencia.setBackground(new Color(69,69,69));
		btnCargarLicencia.setForeground(new Color(255, 255, 255));
		btnCargarLicencia.setEnabled(false);
		
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnVolver.setBounds(36, 625, 200, 35);
		btnVolver.setBackground(new Color(69,69,69));
		btnVolver.setForeground(new Color(255, 255, 255));
		
		
		JButton btnBuscarTitular = new JButton("Buscar");
		btnBuscarTitular.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnBuscarTitular.setBounds(700, 100, 200, 35);
		btnBuscarTitular.setBackground(new Color(69,69,69));
		btnBuscarTitular.setForeground(new Color(255, 255, 255));
		
		
		contentPanePrincipal.add(btnVolver);
		contentPanePrincipal.add(btnCargarLicencia);
		contentPanePrincipal.add(btnBuscarTitular);


		//PLACEHOLDERS
		
		TextPrompt placeHolderNumeroDoc= new TextPrompt ("Numero de documento",textFieldNumeroDoc);
		
		
		//LABELS
		
		JLabel lblTipo = new JLabel("Tipo de documento");
		lblTipo.setForeground(new Color(69, 69, 69));
		lblTipo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblTipo.setBounds(100, 250, 155, 25);
		contentPanePrincipal.add(lblTipo);
		
		JLabel lblNumero = new JLabel("Numero de documento");
		lblNumero.setForeground(new Color(69, 69, 69));
		lblNumero.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNumero.setBounds(400, 250, 200, 25);
		contentPanePrincipal.add(lblNumero);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(69, 69, 69));
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNombre.setBounds(700, 250, 155, 25);
		contentPanePrincipal.add(lblNombre);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setForeground(new Color(69, 69, 69));
		lblSexo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblSexo.setBounds(100, 340, 155, 25);
		contentPanePrincipal.add(lblSexo);
		
		JLabel lblFecha = new JLabel("Fecha de nacimiento");
		lblFecha.setForeground(new Color(69, 69, 69));
		lblFecha.setFont(new Font("Dialog", Font.BOLD, 16));
		lblFecha.setBounds(400, 340, 200, 25);
		contentPanePrincipal.add(lblFecha);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setForeground(new Color(69, 69, 69));
		lblEdad.setFont(new Font("Dialog", Font.BOLD, 16));
		lblEdad.setBounds(700, 340, 155, 25);
		contentPanePrincipal.add(lblEdad);
		
		
		//CHECKBOXS
		
		JCheckBox chckbxA = new JCheckBox("A");
		chckbxA.setFont(new Font("Dialog", Font.PLAIN, 16));
		chckbxA.setBounds(100, 500, 58, 23);
		contentPanePrincipal.add(chckbxA);
		
		
		JCheckBox chckbxB = new JCheckBox("B");
		chckbxB.setFont(new Font("Dialog", Font.PLAIN, 16));
		chckbxB.setBounds(200, 500, 58, 23);
		contentPanePrincipal.add(chckbxB);
		
		JCheckBox chckbxC = new JCheckBox("C");
		chckbxC.setFont(new Font("Dialog", Font.PLAIN, 16));
		chckbxC.setBounds(300, 500, 58, 23);
		contentPanePrincipal.add(chckbxC);
		
		JCheckBox chckbxD = new JCheckBox("D");
		chckbxD.setFont(new Font("Dialog", Font.PLAIN, 16));
		chckbxD.setBounds(400, 500, 58, 23);
		contentPanePrincipal.add(chckbxD);
		
		JCheckBox chckbxE = new JCheckBox("E");
		chckbxE.setFont(new Font("Dialog", Font.PLAIN, 16));
		chckbxE.setBounds(500, 500, 58, 23);
		contentPanePrincipal.add(chckbxE);
		
		JCheckBox chckbxF = new JCheckBox("F");
		chckbxF.setFont(new Font("Dialog", Font.PLAIN, 16));
		chckbxF.setBounds(600, 500, 58, 23);
		contentPanePrincipal.add(chckbxF);
		
		JCheckBox chckbxG = new JCheckBox("G");
		chckbxG.setFont(new Font("Dialog", Font.PLAIN, 16));
		chckbxG.setBounds(700, 500, 58, 23);
		contentPanePrincipal.add(chckbxG);
		
		JLabel lblTipoDocumentoCompletar = new JLabel("");
		lblTipoDocumentoCompletar.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTipoDocumentoCompletar.setBounds(100, 285, 155, 20);
		contentPanePrincipal.add(lblTipoDocumentoCompletar);
		
		JLabel lblSexoCompletar = new JLabel("New label");
		lblSexoCompletar.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSexoCompletar.setBounds(100, 376, 155, 20);
		contentPanePrincipal.add(lblSexoCompletar);
		
		JLabel lblNacimientoCompletar = new JLabel("New label");
		lblNacimientoCompletar.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNacimientoCompletar.setBounds(400, 376, 155, 20);
		contentPanePrincipal.add(lblNacimientoCompletar);
		
		JLabel lblEdadCompletar = new JLabel("New label");
		lblEdadCompletar.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblEdadCompletar.setBounds(700, 376, 155, 20);
		contentPanePrincipal.add(lblEdadCompletar);
		
		JLabel lblNombreCompletar = new JLabel("New label");
		lblNombreCompletar.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNombreCompletar.setBounds(700, 286, 155, 20);
		contentPanePrincipal.add(lblNombreCompletar);
		
		JLabel lblNumDocumentoCompletar = new JLabel("New label");
		lblNumDocumentoCompletar.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNumDocumentoCompletar.setBounds(400, 286, 155, 20);
		contentPanePrincipal.add(lblNumDocumentoCompletar);
	
		
		List<JCheckBox> checkboxs = new ArrayList<JCheckBox>();
		checkboxs.add(chckbxA);
		checkboxs.add(chckbxB);
		checkboxs.add(chckbxC);
		checkboxs.add(chckbxD);
		checkboxs.add(chckbxE);
		checkboxs.add(chckbxF);
		checkboxs.add(chckbxG);
		
		chckbxA.setEnabled(false);
		chckbxB.setEnabled(false);
		chckbxC.setEnabled(false);
		chckbxD.setEnabled(false);
		chckbxE.setEnabled(false);
		chckbxF.setEnabled(false);
		chckbxG.setEnabled(false);
		
		//BUTTON ACTIONS

		btnVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Menu jFrameMenu = new Menu();
				jFrameMenu.setVisible(true);
				dispose();
			}
		});
		
		
		btnBuscarTitular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String dni = textFieldNumeroDoc.getText().toString();
				if(dni.isEmpty()) {
					textFieldNumeroDoc.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
					JOptionPane.showMessageDialog(null, "Ingrese un numero de DNI");
				}
				else if(verificarDNI(dni)) {
					textFieldNumeroDoc.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
					titular = gTitular.recuperarTitularDNI(dni);
					if(titular != null) {
						btnCargarLicencia.setEnabled(true);
						lblTipoDocumentoCompletar.setText(titular.getTipoDNITitular().toString());
						lblNumDocumentoCompletar.setText(titular.getDni());
						lblNombreCompletar.setText(titular.getNombre()+" "+titular.getApellido());
						lblSexoCompletar.setText(titular.getSexo());
						lblNacimientoCompletar.setText(titular.getNacimiento().toString());
						//lblEdadCompletar.setText();
						//completar datos
						licencia = gLicencia.recuperarLicenciaDNI(titular.getDni());
						chckbxA.setEnabled(true);
						chckbxB.setEnabled(true);
						chckbxC.setEnabled(true);
						chckbxD.setEnabled(true);
						chckbxE.setEnabled(true);
						chckbxF.setEnabled(true);
						chckbxG.setEnabled(true);
						if(licencia!=null) {
							List<Clase> clasesEnLicencia = gLicencia.recuperarClases(licencia.getIdLicencia());
							for(Clase c : clasesEnLicencia) {
								if(c.getLetra().equals("A")){
									chckbxA.setSelected(true);
									chckbxA.setEnabled(false);
									}
								if(c.getLetra().equals("B")){
									chckbxB.setSelected(true);
									chckbxB.setEnabled(false);
									}
								if(c.getLetra().equals("C")){
									chckbxC.setSelected(true);
									chckbxC.setEnabled(false);
									}
								if(c.getLetra().equals("D")){
									chckbxD.setSelected(true);
									chckbxD.setEnabled(false);
									}
								if(c.getLetra().equals("E")){
									chckbxE.setSelected(true);
									chckbxE.setEnabled(false);
									}
								if(c.getLetra().equals("F")){
									chckbxF.setSelected(true);
									chckbxF.setEnabled(false);
									}
								if(c.getLetra().equals("G")){
									chckbxG.setSelected(true);
									chckbxG.setEnabled(false);
									}
							}
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "NO EXISTE TITULAR CON EL DOCUMENTO: "+dni);
						btnCargarLicencia.setEnabled(false);
					}
				}
				else {
					textFieldNumeroDoc.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
					JOptionPane.showMessageDialog(null, "Ingrese un DNI de 7 u 8 numeros");
				}
				
			}
		});
		
		btnCargarLicencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(btnCargarLicencia.isEnabled()) {
					List<String> letras = new ArrayList<String>();
					if(licencia == null) {
						
						for(JCheckBox jc : checkboxs) {
							if(jc.isEnabled() && jc.isSelected()) {
								letras.add(jc.getText().toString());
							}
						}
						
						gLicencia.crearLicencia(titular, letras);
					}
									
				}
			}
		});
	}
	
	
	private boolean verificarDNI(String dni) {		
		String expDNI = "[1-9][0-9]+";
		//Pattern formatoDNI = Pattern.compile(expDNI);
		if(dni.length()==7 || dni.length()==8) {
			if(dni.matches(expDNI)) {
				return true;
			}
		}
		return false;
	}
	boolean validarHayVacios(List<JTextField> av) {
		boolean flag = false;
	for (JTextField j : av) {
		
		if (j.getText().isEmpty()) {
			flag=true;
			j.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
		}
		else {
			j.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
		}
		
	}	
		return flag;	
	}
}
