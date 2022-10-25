package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class EmitirLicencia extends JFrame {

	private JPanel contentPane;
	private JTextField textFielddniTitular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmitirLicencia frame = new EmitirLicencia();
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
	public EmitirLicencia() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Emitir licencia");
		
		textFielddniTitular = new JTextField();
		textFielddniTitular.setBounds(39, 91, 174, 20);
		contentPane.add(textFielddniTitular);
		textFielddniTitular.setColumns(10);
		
		JButton btnBuscarTitular = new JButton("Buscar");
		
		btnBuscarTitular.setBounds(49, 122, 89, 23);
		contentPane.add(btnBuscarTitular);
		
		JComboBox comboBoxClase = new JComboBox();
		comboBoxClase.setBounds(39, 401, 163, 22);
		contentPane.add(comboBoxClase);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(36, 613, 89, 23);
		contentPane.add(btnVolver);
		
		JButton btnCargarLicencia = new JButton("Cargar licencia");
		
		btnCargarLicencia.setBounds(913, 613, 141, 23);
		contentPane.add(btnCargarLicencia);
		
		JLabel lblNewLabel = new JLabel("Ingrese DNI del titular a asignar una clase de licencia:");
		lblNewLabel.setBounds(39, 66, 335, 14);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBoxTipoDNI = new JComboBox();
		comboBoxTipoDNI.setBounds(238, 90, 102, 22);
		contentPane.add(comboBoxTipoDNI);
		
		
		
		
		
		btnCargarLicencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Vista previa de la licencia");
			}
		});
		
		btnBuscarTitular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				

				if(textFielddniTitular.getText().toString().isEmpty()) {
					textFielddniTitular.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
					JOptionPane.showMessageDialog(null, "Ingrese un numero de DNI");
				}
				else if(verificarDNI(textFielddniTitular.getText().toString())) {
					textFielddniTitular.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
					JOptionPane.showMessageDialog(null, "se muestran los datos y se busca en BD");
				}
				else {
					textFielddniTitular.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
					JOptionPane.showMessageDialog(null, "Ingrese un DNI de 7 u 8 numeros");
				}
				
			}
		});
		
	}
	
	
	private boolean verificarDNI(String dni) {
		
		String expDNI = "[1-9][0-9]+";
		Pattern formatoDNI = Pattern.compile(expDNI);
		
		
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
