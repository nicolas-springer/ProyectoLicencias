package dominio;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity(name="clase")
@Table
public class Clase {
	@Id
	@Column
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer idClase ;
	@Column
	private String letra;
	@Column
	private Integer costoVigencia5; 
	@Column
	private Integer costoVigencia4; 
	@Column
	private Integer costoVigencia3; 
	@Column
	private Integer costoVigencia2;
	@Column
	private Integer costoVigencia1; 

	@ManyToMany(mappedBy = "clases")
	private Set<Licencia> licencia;

	public Integer getIdClase() {
		return idClase;
	}

	public void setIdClase(Integer idClase) {
		this.idClase = idClase;
	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	/*public Set<Licencia> getLicencia() {
		return licencia;
	}

	public void setLicencia(Set<Licencia> licencia) {
		this.licencia = licencia;
	}*/

	public Integer getCostoVigencia5() {
		return costoVigencia5;
	}

	public void setCostoVigencia5(Integer costoVigencia5) {
		this.costoVigencia5 = costoVigencia5;
	}

	public Integer getCostoVigencia4() {
		return costoVigencia4;
	}

	public void setCostoVigencia4(Integer costoVigencia4) {
		this.costoVigencia4 = costoVigencia4;
	}

	public Integer getCostoVigencia3() {
		return costoVigencia3;
	}

	public void setCostoVigencia3(Integer costoVigencia3) {
		this.costoVigencia3 = costoVigencia3;
	}

	public Integer getCostoVigencia2() {
		return costoVigencia2;
	}

	public void setCostoVigencia2(Integer costoVigencia2) {
		this.costoVigencia2 = costoVigencia2;
	}

	public Integer getCostoVigencia1() {
		return costoVigencia1;
	}

	public void setCostoVigencia1(Integer costoVigencia1) {
		this.costoVigencia1 = costoVigencia1;
	}

	
	
	
}
