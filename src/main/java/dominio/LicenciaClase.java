package dominio;
import javax.persistence.*;

@Entity (name="licenciaclase")
@Table
public class LicenciaClase {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idLicenciaClase;
	
	@Column
	private Integer idlicenciax;
	
	@Column
	private Integer idclasex;

	public Integer getIdLicenciaClase() {
		return idLicenciaClase;
	}

	public void setIdLicenciaClase(Integer idLicenciaClase) {
		this.idLicenciaClase = idLicenciaClase;
	}

	public Integer getIdlicencia() {
		return idlicenciax;
	}

	public void setIdlicencia(Integer idlicencia) {
		this.idlicenciax = idlicencia;
	}

	public Integer getIdclase() {
		return idclasex;
	}

	public void setIdclase(Integer idclase) {
		this.idclasex = idclase;
	}
	
	
}
