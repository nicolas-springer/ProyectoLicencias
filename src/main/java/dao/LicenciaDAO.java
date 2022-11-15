package dao;

import java.util.List;

import dominio.Licencia;

public interface LicenciaDAO {

	void guardarLicencia(Licencia nuevaLicencia);
	Licencia recuperarLicenciaIDTitular(String dni);
	List<Integer> recuperarIDClasesDeLicenciaID(Integer id);
	
}
