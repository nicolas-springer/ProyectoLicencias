package dao;

import java.util.List;

import javax.persistence.EntityManager;

import dominio.Clase;
import util.ConnectionBD;

public class ClaseDAO_Hibernate implements ClaseDAO {

	private EntityManager manager;
	@Override
	public void guardarClase(Clase c) {
		try {
			manager = ConnectionBD.conectar();
			manager.getTransaction().begin();
			manager.persist(c);
			manager.getTransaction().commit();
			manager.close();
		} catch (Exception e) {
		}
	}
	@Override
	public Clase recuperarClaseLetra(String letra) {
		manager = ConnectionBD.conectar();
		List<Clase> clase =  manager.createQuery("select c from clase c WHERE letra = '"+letra+"'",Clase.class).getResultList();
		if(clase.size()==0)return null;
		else return clase.get(0);
	}
	@Override
	public Clase recuperarClaseID(Integer i) {
		manager = ConnectionBD.conectar();
		List<Clase> clase =  manager.createQuery("select c from clase c WHERE idclase = '"+i+"'",Clase.class).getResultList();
		if(clase.size()==0)return null;
		else return clase.get(0);
	}

}
