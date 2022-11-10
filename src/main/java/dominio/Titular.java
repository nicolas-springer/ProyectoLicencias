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
}
