package main.br.usp.esi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="laboratorio")
public class Laboratorio extends Espaco {
	private int numeroLab;
	private String tipoLab;
//	private Espaco espaco;
	
	@Column(name="num_lab", nullable=false)
	public int getNumeroLab() {
		return numeroLab;
	}
	public void setNumeroLab(int numeroLab) {
		this.numeroLab = numeroLab;
	}
	@Column(name="tipo_lab", nullable=false, length=255)
	public String getTipoLab() {
		return tipoLab;
	}
	public void setTipoLab(String tipoLab) {
		this.tipoLab = tipoLab;
	}
//	@JoinColumn(name="espaco_id", nullable=false)
//	@OneToOne(cascade = CascadeType.ALL, fetch=FetchType.LAZY)
//	public Espaco getEspaco() {
//		return espaco;
//	}
//	public void setEspaco(Espaco espaco) {
//		this.espaco = espaco;
//	}
}