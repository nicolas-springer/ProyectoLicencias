package dto;

import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;

import dominio.Clase;
import enumclasses.TipoDNI;

public class TitularDTO {

	private Integer id;
	private String nombre; 
	private String apellido; 
	private TipoDNI tipoDNI;
	private String dni; 
	private Date nacimiento;
	private String domicilio;
	private String grupoYFactorSanguineo; 
	private Boolean esDonante;
	private ImageIcon imagen;
	
}
