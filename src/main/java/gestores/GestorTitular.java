package gestores;

import dao.TitularDAO;
import dao.TitularDAO_Hibernate;
import dominio.Titular;
import dto.TitularDTO;
import enumclasses.TipoDNI;

public class GestorTitular {
	private TitularDAO titularDao = new TitularDAO_Hibernate();
	
	public void darDeAltaTitular(TitularDTO titularDTO) {
		Titular nuevoTitular = crearTitular(titularDTO);
		titularDao.guardarTitular(nuevoTitular);	
	}

	private Titular crearTitular(TitularDTO titularDTO) {	
		Titular nuevoTitular = new Titular();
		nuevoTitular.setTipoDNITitular(titularDTO.getTipodni().toString());
		nuevoTitular.setDni(titularDTO.getDni());
		nuevoTitular.setApellido(titularDTO.getApellido());
		nuevoTitular.setNombre(titularDTO.getNombre());
		nuevoTitular.setCalle(titularDTO.getCalle());
		nuevoTitular.setNumero(titularDTO.getNumero());
		nuevoTitular.setPiso(titularDTO.getPiso());
		nuevoTitular.setDepto(titularDTO.getDepto());
		nuevoTitular.setLocalidad(titularDTO.getLocalidad());
		nuevoTitular.setGrupoYFactorSanguineo(titularDTO.getGrupoYFactorSanguineo());
		nuevoTitular.setSexo(titularDTO.getSexo());
		nuevoTitular.setEsDonante(titularDTO.getEsDonante());
		nuevoTitular.setNacimiento(titularDTO.getNacimiento());
		return nuevoTitular;
	}

	public Titular recuperarTitularDNI(String dni) {
		return titularDao.recuperarTitularDNI(dni);
	}

	public String recuperarIDdeTitularDNI(String dni) {
		return titularDao.recuperarIDdeTitularDNI(dni);
	}
}
