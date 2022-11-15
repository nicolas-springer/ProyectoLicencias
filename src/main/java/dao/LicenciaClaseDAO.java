package dao;

import java.util.List;

import dominio.LicenciaClase;

public interface LicenciaClaseDAO {
	List<Integer> recuperarIDClasesDeLicenciaID(Integer id);

	void guardarClasesDeLicencia(List<LicenciaClase> lc);
}
