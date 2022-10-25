package app;


import javax.persistence.EntityManager;


import util.ConnectionBD;

 
public class App {
 
    public static void main(String[] args)
    {
       // Configuration configuration = new Configuration();
       // configuration.configure("hibernate.cfg.xml"); 
        EntityManager manager = ConnectionBD.conectar();
       System.out.println(manager);
     }
    
}
