package com.precedentes.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tiposDireito")
public class TipoDireitoModel {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long origemId;
	private String tipo;
	
	public TipoDireitoModel() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrigemId() {
		return origemId;
	}
	public void setOrigemId(Long origemId) {
		this.origemId = origemId;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "TipoDireito [id=" + id + ", origemId=" + origemId + ", tipo=" + tipo + "]";
	}
		
}
