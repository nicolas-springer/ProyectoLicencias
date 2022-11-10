package dominio;

import java.time.LocalDate;

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
	private LocalDate nacimiento;
	@Column
	private String domicilio;
	@Column
	private String grupoYFactorSanguineo; 
	@Column
	private Boolean esDonante;
	@Column
	private TipoDNI tipoDNITitular;
	
	
	
	
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
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
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
	public TipoDNI getTipoDNITitular() {
		return tipoDNITitular;
	}
	public void setTipoDNITitular(TipoDNI tipoDNITitular) {
		this.tipoDNITitular = tipoDNITitular;
	}
	
	
	
}
