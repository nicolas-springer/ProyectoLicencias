package dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
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
	private String piso;
	private String depto;
	private String localidad;
	private String grupoYFactorSanguineo; 
	private Boolean esDonante;
	private ImageIcon imagen;
	private String sexo;
	private String tipodni;
	
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
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public String getTipodni() {
		return tipodni;
	}
	public void setTipodni(String tipodni) {
		this.tipodni = tipodni;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	
	
}
