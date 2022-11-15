package dominio;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

import enumclasses.TipoDNI;

@Entity (name="titular")
@Table 
public class Titular {
	
	@Id
	@Column
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer idTitular;
	
	@Column
	private String nombre; 
	@Column
	private String apellido; 
	@Column
	private String dni; 
	@Column
	private Date nacimiento;
	@Column
	private String calle;
	@Column
	private String numero;
	@Column
	private String piso;
	@Column
	private String depto;
	@Column
	private String localidad;
	@Column
	private String grupoYFactorSanguineo; 
	@Column
	private Boolean esDonante;
	@Column
	private String sexo;
	@Column
	private String tipoDNITitular;
		
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
	public Integer getIdTitular() {
		return idTitular;
	}
	public void setIdTitular(Integer idTitular) {
		this.idTitular = idTitular;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
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
	public void setEsDonante(Boolean esDonante) {
		this.esDonante = esDonante;
	}
	public String getTipoDNITitular() {
		return tipoDNITitular;
	}
	public void setTipoDNITitular(String tipoDNITitular) {
		this.tipoDNITitular = tipoDNITitular;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	
	
	
}
