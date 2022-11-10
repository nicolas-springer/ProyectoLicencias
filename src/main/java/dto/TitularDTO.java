package dto;

import java.util.Date;
import java.util.List;

import javax.swing.ImageIcon;

import dominio.Clase;
import enumclasses.TipoDNI;

public class TitularDTO {

	private String nombre; 
	private String apellido; 
	private String dni; 
	private Date nacimiento;
	private String calle;
	private String numero;
	private String ciudad;
	private String grupoYFactorSanguineo; 
	private Boolean esDonante;
	private ImageIcon imagen;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	public String getGrupoYFactorSanguineo() {
		return grupoYFactorSanguineo;
	}
	public void setGrupoYFactorSanguineo(String grupoYFactorSanguineo) {
		this.grupoYFactorSanguineo = grupoYFactorSanguineo;
	}
	public Boolean getEsDonante() {
		return esDonante;
	}
	public void setEsDonante(Boolean esDonante) {
		this.esDonante = esDonante;
	}
	public ImageIcon getImagen() {
		return imagen;
	}
	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}
	
	
	
	
}
