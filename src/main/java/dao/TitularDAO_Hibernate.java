package dao;

import java.util.List;

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
	@Override
	public Titular recuperarTitularDNI(String dni) {
		manager = ConnectionBD.conectar();
		List<Titular> t =  manager
				.createQuery("SELECT t FROM titular t WHERE dni = '"+dni+"' ",Titular.class).getResultList();
			manager.close();
			if(t.size() == 1) {
				return t.get(0);	
			}
			else {
				return null;
				}
	}
	@Override
	public String recuperarIDdeTitularDNI(String dni) {
		manager = ConnectionBD.conectar();
		List<Titular> t =  manager
				.createQuery("SELECT t FROM titular t WHERE dni = '"+dni+"' ",Titular.class).getResultList();
			manager.close();
			if(t.size() == 1) {
				return t.get(0).getIdTitular().toString();	
			}
			else {
				return null;
				}
	}
	
	

}
