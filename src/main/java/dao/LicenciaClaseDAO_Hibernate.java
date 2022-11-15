package dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

import dominio.LicenciaClase;
import util.ConnectionBD;

public class LicenciaClaseDAO_Hibernate implements LicenciaClaseDAO{

	private EntityManager manager;
	
	@Override
	public List<Integer> recuperarIDClasesDeLicenciaID(Integer id) {
		
		String s= String.valueOf(id);
		System.out.println(s);
		manager = ConnectionBD.conectar();
		
		List<Integer> l = manager.createQuery("select idclasex from licenciaclase l where idlicenciax= '"+id+"'",Integer.class).getResultList();
		System.out.println(l.toString());
		manager.close();
		if(l.size()==0) return null;
		else return l;
	}

	@Override
	public void guardarClasesDeLicencia(List<LicenciaClase> lc) {
		manager = ConnectionBD.conectar();
		System.out.println("test");
		try {
		manager.getTransaction().begin();
		for(LicenciaClase l: lc) {
			System.out.println(l.getIdclase()+"/"+l.getIdlicencia());
			manager.persist(l);
		}
		manager.getTransaction().commit();
		
		
		} catch (Exception e) {
			e.printStackTrace();
			}finally {
			manager.close();
			}
		
	}

}
