package gestores;

import java.util.List;

import dao.LicenciaClaseDAO;
import dao.LicenciaClaseDAO_Hibernate;
import dao.LicenciaDAO_Hibernate;
import dominio.LicenciaClase;

public class GestorLicenciaClase {
	private LicenciaClaseDAO lcDAO = new LicenciaClaseDAO_Hibernate();
	public List<Integer> recuperarIDClases(Integer id){
		return lcDAO.recuperarIDClasesDeLicenciaID(id);
	}
	public void guardarClasesDeLicencia(List<LicenciaClase> lc) {
		
		lcDAO.guardarClasesDeLicencia(lc);
	}
	
}
