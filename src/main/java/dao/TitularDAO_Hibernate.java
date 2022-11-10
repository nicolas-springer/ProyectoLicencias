package dao;

import javax.persistence.EntityManager;

import dominio.Titular;
import util.ConnectionBD;

public class TitularDAO_Hibernate implements TitularDAO {

	private static EntityManager manager;
	@Override
	public void guardarTitular(Titular titular) {
		// TODO Auto-generated method stub
		manager = ConnectionBD.conectar();
		try {
		manager.getTransaction().begin();
		manager.persist(titular);
		manager.getTransaction().commit();
		} catch (Exception e) {
			 
			e.printStackTrace();
			}finally {
			manager.close();
			}
	}

}
