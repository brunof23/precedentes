package com.precedentes.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "materias")
public class MateriaModel {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String materia;
	private Long tipoDireitoId;
	
	public MateriaModel() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Long getTipoDireitoId() {
		return tipoDireitoId;
	}

	public void setTipoDireitoId(Long tipoDireitoId) {
		this.tipoDireitoId = tipoDireitoId;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", materia=" + materia + ", tipoDireitoId=" + tipoDireitoId + "]";
	}
	
	
}
