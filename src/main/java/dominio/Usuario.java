package dominio;

import java.time.LocalDate;
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
	private LocalDate nacimiento;
	@Column
	private String nickUsuario;
	@Column
	private String passUsuario;
	@Column
	private TipoDNI tipoDNIUsuario;
}
