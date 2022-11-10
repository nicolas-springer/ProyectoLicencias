package gestores;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

import dominio.Licencia;
import dominio.Titular;

public class GestorLicencia {
	/*public boolean darAltaLicencia(Titular t, List<String> clases) {	
		Licencia nuevaLicencia = new Licencia();	
		nuevaLicencia.setTitular(t);
		nuevaLicencia.setAlta(LocalDate.now());
		nuevaLicencia.setAlta(LocalDate.now().plusYears(5));
		for (String letra: clases) {
		//Clase c = GestorClases.recuperarClaseLetra(letra)
		nuevaLicencia.setClases(null);
		}
		
		try {
			LicenciaDato.guardarLicencia(nuevaLicencia)
			return true;
		} catch (Exception e) {
			
		}
		
		return false;
	}
	public boolean actualizarLicencia(Titular t, List<String> clases) {	
		//Licencia unaLicencia = GestorLicencia.recuperarLicenciaDNI(t.getDNI());
		Licencia unaLicencia = new Licencia();
		unaLicencia.setTitular(t);
		unaLicencia.setAlta(LocalDate.now());
		unaLicencia.setAlta(LocalDate.now().plusYears(5));
		for (String letra: clases) {
		//Clase c = GestorClases.recuperarClaseLetra(letra)
			unaLicencia.setClases(null);
		}
		/*
		try {
			LicenciaDato.actualizarLicencia(nuevaLicencia)
			return true;
		} catch (Exception e) {
			
		}
		return false;
	}*/
}
