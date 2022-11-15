package dao;

import dominio.Titular;

public interface TitularDAO {

	
	public void guardarTitular(Titular titular);
	public Titular recuperarTitularDNI(String DNI);
	public String recuperarIDdeTitularDNI(String dni);
}
