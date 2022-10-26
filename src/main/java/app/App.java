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
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    	
    	
    	
       // Configuration configuration = new Configuration();
       // configuration.configure("hibernate.cfg.xml"); 
      //  EntityManager manager = ConnectionBD.conectar();
      // System.out.println(manager.createQuery("select s from song s").getResultList().get(0));
       
       
       
       
    }
    
    
}
