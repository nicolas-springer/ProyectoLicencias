package dominio;
import java.time.LocalDate;


import javax.persistence.*;

@Entity (name="licencia")
@Table
public class Licencia {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idLicencia;
	
	//private List<Clase> clases; 
	@OneToOne(optional = false)
    @JoinColumn(name= "id_titular" , referencedColumnName = "idtitular")
	private Titular titular; //metodos comentados
	
	
	@Column(name = "alta")
	private LocalDate alta;
	@Column(name = "vencimiento")
	private LocalDate vencimiento;
	
	public Integer getIdLicencia() {
		return idLicencia;
	}
	public void setIdLicencia(Integer idLicencia) {
		this.idLicencia = idLicencia;
	}
	public Titular getTitular() {
		return titular;
	}
	public void setTitular(Titular titular) {
		this.titular = titular;
	}
	public LocalDate getAlta() {
		return alta;
	}
	public void setAlta(LocalDate alta) {
		this.alta = alta;
	}
	public LocalDate getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(LocalDate vencimiento) {
		this.vencimiento = vencimiento;
	}


	
	
	
	
}
