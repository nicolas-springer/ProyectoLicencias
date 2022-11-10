package dominio;
import javax.persistence.*;

@Entity(name="clase")
@Table
public class Clase {
	@Id
	@Column
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idClase ;
	@Column
	private String letra;
	@Column
	private Float costoVigencia5; 
	@Column
	private Float costoVigencia4; 
	@Column
	private Float costoVigencia3; 
	@Column
	private Float costoVigencia2;
	@Column
	private Float costoVigencia1; 
}
