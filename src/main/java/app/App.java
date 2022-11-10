package app;


import java.awt.EventQueue;

import javax.persistence.EntityManager;

import gui.Principal;
import util.ConnectionBD;

public class App {
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {	
					Principal jframePrincipal = new Principal();
					jframePrincipal.setVisible(true);
					EntityManager manager;
					manager =  ConnectionBD.conectar();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});   
    }   
}
