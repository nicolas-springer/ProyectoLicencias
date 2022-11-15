package dominio;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity (name="licencia")
@Table
public class Licencia {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idLicencia;
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "licencia_clase", 
        joinColumns = { @JoinColumn(name = "idLicencia") }, 
        inverseJoinColumns = { @JoinColumn(name = "idClase") }
    )
	private Set<Clase> clases; 
	

	@ManyToOne
    @JoinColumn(name= "id_titular" , referencedColumnName = "idtitular")
	private Titular titular; 
	
	@Column(name = "alta")
	private Date alta;
	@Column(name = "vencimiento")
	private Date vencimiento;
	
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
	public Date getAlta() {
		return alta;
	}
	public void setAlta(Date alta) {
		this.alta = alta;
	}
	public Date getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}

	
}
