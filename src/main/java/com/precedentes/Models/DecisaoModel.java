package com.precedentes.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "decisoes")
public class DecisaoModel {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String questao;
	private String tese;
	private String processo;
	private String ministro;
	private String tribunalOrigem;
	
	public DecisaoModel() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getQuestao() {
		return questao;
	}

	public void setQuestao(String questao) {
		this.questao = questao;
	}

	public String getTese() {
		return tese;
	}

	public void setTese(String tese) {
		this.tese = tese;
	}

	public String getProcesso() {
		return processo;
	}

	public void setProcesso(String processo) {
		this.processo = processo;
	}

	public String getMinistro() {
		return ministro;
	}

	public void setMinistro(String ministro) {
		this.ministro = ministro;
	}

	public String getTribunalOrigem() {
		return tribunalOrigem;
	}

	public void setTribunalOrigem(String tribunalOrigem) {
		this.tribunalOrigem = tribunalOrigem;
	}

	@Override
	public String toString() {
		return "Decisao [id=" + id + ", titulo=" + titulo + ", questao=" + questao + ", tese=" + tese + ", processo="
				+ processo + ", ministro=" + ministro + ", tribunalOrigem=" + tribunalOrigem + "]";
	}
	
	
}
