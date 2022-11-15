package app;


import java.awt.EventQueue;

import javax.persistence.EntityManager;

import gestores.GestorClase;
import gestores.GestorLicenciaClase;
import gestores.GestorTitular;
import gui.Principal;
import util.ConnectionBD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {	
					GestorClase gclase = new GestorClase();
					//gclase.cargarClasesIniciales();
					/*Configuration configuration = new Configuration();
			        configuration.configure("hibernate.cfg.xml");
			        SessionFactory sessionFactory
			            = configuration.buildSessionFactory();
			        Session session = sessionFactory.openSession();
			        System.out.println(session);
					session.close();*/
					
					//GestorTitular gt = new GestorTitular();
					//System.out.println(gt.recuperarTitularDNI("41864818").getNombre());
					//GestorLicenciaClase g =  new GestorLicenciaClase();
					//System.out.println(g.recuperarIDClases());
					Principal jframePrincipal = new Principal();
					jframePrincipal.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});   
    }   
}
