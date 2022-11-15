package dao;

import java.util.List;

import javax.persistence.EntityManager;

import dominio.Clase;
import dominio.Licencia;
import dominio.Titular;
import util.ConnectionBD;

public class LicenciaDAO_Hibernate implements LicenciaDAO{
	private EntityManager manager;
	@Override
	public void guardarLicencia(Licencia nuevaLicencia) {
		manager = ConnectionBD.conectar();
		try {
		manager.getTransaction().begin();
		manager.persist(nuevaLicencia);
		manager.getTransaction().commit();
		
		
		} catch (Exception e) {
			e.printStackTrace();
			}finally {
			manager.close();
			}
	}
	@Override
	public Licencia recuperarLicenciaIDTitular(String idTitular) {
		manager = ConnectionBD.conectar();
		List<Licencia> l = manager.createQuery("SELECT l FROM licencia l WHERE id_titular = '"+idTitular+"' ",Licencia.class).getResultList();
		if(l.size()==0) return null;
		else return l.get(0);
		
	}
	@Override
	public List<Integer> recuperarIDClasesDeLicenciaID(Integer id) {//devuelve las ID correspondientes a las clases de una licencia
		manager = ConnectionBD.conectar();
		List<Integer> l = manager.createQuery("SELECT idclase FROM licencia_clase WHERE idlicencia = '"+id+"' ",Integer.class).getResultList();
		if(l.size()==0) return null;
		else return l;
	}

}
