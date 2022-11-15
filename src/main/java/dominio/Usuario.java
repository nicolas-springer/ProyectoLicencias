package dominio;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
//import enumclasses.TipoDNI;
//import enumclasses.TipoLicencias;

import enumclasses.TipoDNI;


@Entity (name="usuario")
@Table 
public class Usuario {
	@Id
	@Column
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer idUsuario;
	@Column
	private String nombre; 
	@Column
	private String apellido; 
	@Column
	private String dni;
	@Column
	private String email;
	@Column
	private Date nacimiento;
	@Column
	private String nickUsuario;
	@Column
	private String passUsuario;
	@Column
	@Enumerated(EnumType.STRING)
	private TipoDNI tipoDNIUsuario;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickUsuario() {
		return nickUsuario;
	}
	public void setNickUsuario(String nickUsuario) {
		this.nickUsuario = nickUsuario;
	}
	public String getPassUsuario() {
		return passUsuario;
	}
	public void setPassUsuario(String passUsuario) {
		this.passUsuario = passUsuario;
	}
	public TipoDNI getTipoDNIUsuario() {
		return tipoDNIUsuario;
	}
	public void setTipoDNIUsuario(TipoDNI tipoDNIUsuario) {
		this.tipoDNIUsuario = tipoDNIUsuario;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	
}
