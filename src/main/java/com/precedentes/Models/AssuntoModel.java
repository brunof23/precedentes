package com.precedentes.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity(name = "assuntos")
public class AssuntoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String assunto;
	private String tema;
	@Column(name = "situacaotema")
	private String situacaoTema;
	
	public AssuntoModel() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getSituacaoTema() {
		return situacaoTema;
	}

	public void setSituacaoTema(String situacaoTema) {
		this.situacaoTema = situacaoTema;
	}

	@Override
	public String toString() {
		return "Assunto [id=" + id + ", assunto=" + assunto + ", tema=" + tema + ", situacaoTema=" + situacaoTema + "]";
	}
	
}
