package gestores;

import dao.TitularDAO;
import dao.TitularDAO_Hibernate;
import dominio.Titular;
import dto.TitularDTO;

public class GestorTitular {

	public void darDeAltaTitular(TitularDTO titularDTO) {
		// TODO Auto-generated method stub
		Titular nuevoTitular = crearTitular(titularDTO);
		
		TitularDAO titularDao = new TitularDAO_Hibernate();
		titularDao.guardarTitular(nuevoTitular);
		
		
		
	}

	private Titular crearTitular(TitularDTO titularDTO) {
		
		Titular nuevoTitular = new Titular();
		
		nuevoTitular.setApellido(titularDTO.getApellido());
		nuevoTitular.setDni(titularDTO.getDni());
		//completar
		
		return nuevoTitular;
	}

}
