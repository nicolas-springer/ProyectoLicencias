package dao;

import dominio.Clase;

public interface ClaseDAO {
	void guardarClase(Clase c);
	Clase recuperarClaseLetra(String letras);
	Clase recuperarClaseID(Integer i);
	
}
