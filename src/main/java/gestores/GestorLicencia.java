package gestores;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dao.LicenciaDAO;
import dao.LicenciaDAO_Hibernate;
import dominio.Clase;
import dominio.Licencia;
import dominio.LicenciaClase;
import dominio.Titular;
import util.DateUtils;

public class GestorLicencia {

	private LicenciaDAO daoLicencia =  new LicenciaDAO_Hibernate();
	private GestorClase gClase = new GestorClase();
	private GestorTitular gTitular = new GestorTitular();
	private GestorLicenciaClase glc =  new GestorLicenciaClase();
	
	public Licencia recuperarLicenciaDNI(String dni) {
		
		String idTitular = gTitular.recuperarIDdeTitularDNI(dni);
		
		return daoLicencia.recuperarLicenciaIDTitular(idTitular);
	}

	public void crearLicencia(Titular titular, List<String> letras) {
		Licencia nuevaLicencia = new Licencia();	
		
		nuevaLicencia.setTitular(titular);
		nuevaLicencia.setAlta(DateUtils.asDate(LocalDate.now()));
		
		
		LocalDate nac = DateUtils.asLocalDate(titular.getNacimiento());
		Integer edadTitular =  Period.between(LocalDate.now(), nac).getYears();
		
		System.out.println(nac.toString());
		LocalDate fv;
		if(edadTitular<21) {
			 fv = LocalDate.of(LocalDate.now().getYear()+1,
					 nac.getMonthValue(), 
					 nac.getDayOfMonth());
		}
		else if(edadTitular<45){
			 fv = LocalDate.of(LocalDate.now().getYear()+5,
					 nac.getMonthValue(), 
					 nac.getDayOfMonth());
		}
		else if(edadTitular<60){
			 fv = LocalDate.of(LocalDate.now().getYear()+4,
					 nac.getMonthValue(), 
					 nac.getDayOfMonth());
				}
		else{
			 fv = LocalDate.of(LocalDate.now().getYear()+3,
					 nac.getMonthValue(), 
					 nac.getDayOfMonth());
			
		}
		
		nuevaLicencia.setVencimiento(DateUtils.asDate(fv));
		
		List<LicenciaClase> lc = new ArrayList<LicenciaClase>();
		
		for (String l: letras) {
			Clase c = new Clase();
			c = gClase.recuperarClaseLetra(l);
			Integer idclase = c.getIdClase();
			LicenciaClase aux = new LicenciaClase();
			aux.setIdclase(idclase);
			lc.add(aux);
		}
		System.out.println("size="+lc.size());
		//nuevaLicencia.setClases(lc);
		//ACA YA TENEMOS LAS CLASES POR ENDE SUS ID, AHORA LAS GUARDARMOS EN LA TABLA LICENCIAS-CLASE
		try {
			daoLicencia.guardarLicencia(nuevaLicencia);
			Integer idlicencia = daoLicencia.recuperarLicenciaIDTitular(String.valueOf(titular.getIdTitular())).getIdLicencia();
			System.out.println(idlicencia);
			for(LicenciaClase l : lc) {
				l.setIdlicencia(idlicencia);
				System.out.println(l.getIdclase()+":"+l.getIdlicencia());
			}
			glc.guardarClasesDeLicencia(lc);
		} catch (Exception e) {
			
		}
		
	}

	public List<Clase> recuperarClases(Integer idLicencia) {
		
		List<Clase> lista = gClase.recuperarClaseIDs(glc.recuperarIDClases(idLicencia));
		return lista;
	}
	
	/*public boolean actualizarLicencia(Titular t, List<String> clases) {	
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
