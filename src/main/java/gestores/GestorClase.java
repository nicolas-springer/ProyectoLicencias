package gestores;

import java.util.ArrayList;
import java.util.List;

import dao.ClaseDAO;
import dao.ClaseDAO_Hibernate;
import dominio.Clase;

public class GestorClase {

	private ClaseDAO claseDAO = new ClaseDAO_Hibernate();
	
	Clase recuperarClaseLetra(String l) {
		return claseDAO.recuperarClaseLetra(l);
	}
	
	public void cargarClasesIniciales() {
			Clase c1 = new Clase();
			c1.setCostoVigencia1(1);
			c1.setCostoVigencia2(2);
			c1.setCostoVigencia3(3);
			c1.setCostoVigencia4(4);
			c1.setCostoVigencia5(5);
			c1.setLetra("A");
		
			Clase c2 = new Clase();
			c2.setCostoVigencia1(1);
			c2.setCostoVigencia2(2);
			c2.setCostoVigencia3(3);
			c2.setCostoVigencia4(4);
			c2.setCostoVigencia5(5);
			c2.setLetra("B");
			
			Clase c3 = new Clase();
			c3.setCostoVigencia1(1);
			c3.setCostoVigencia2(2);
			c3.setCostoVigencia3(3);
			c3.setCostoVigencia4(4);
			c3.setCostoVigencia5(5);
			c3.setLetra("C");
			
			Clase c4 = new Clase();
			c4.setCostoVigencia1(1);
			c4.setCostoVigencia2(2);
			c4.setCostoVigencia3(3);
			c4.setCostoVigencia4(4);
			c4.setCostoVigencia5(5);
			c4.setLetra("D");
			
			Clase c5 = new Clase();
			c5.setCostoVigencia1(1);
			c5.setCostoVigencia2(2);
			c5.setCostoVigencia3(3);
			c5.setCostoVigencia4(4);
			c5.setCostoVigencia5(5);
			c5.setLetra("E");
			
			Clase c6 = new Clase();
			c6.setCostoVigencia1(1);
			c6.setCostoVigencia2(2);
			c6.setCostoVigencia3(3);
			c6.setCostoVigencia4(4);
			c6.setCostoVigencia5(5);
			c6.setLetra("F");
			
			Clase c7 = new Clase();
			c7.setCostoVigencia1(1);
			c7.setCostoVigencia2(2);
			c7.setCostoVigencia3(3);
			c7.setCostoVigencia4(4);
			c7.setCostoVigencia5(5);
			c7.setLetra("G");
			
			
			claseDAO.guardarClase(c1);
			claseDAO.guardarClase(c2);
			claseDAO.guardarClase(c3);
			claseDAO.guardarClase(c4);
		
	}

	public List<Clase> recuperarClaseIDs(List<Integer> ids) {
		
		List<Clase> lista = new ArrayList<Clase>();
		
		for(Integer i : ids) {
			lista.add(claseDAO.recuperarClaseID(i));
		}
		
		return lista;
	}
	

}
