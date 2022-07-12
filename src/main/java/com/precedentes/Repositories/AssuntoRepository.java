package com.precedentes.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.precedentes.Models.AssuntoModel;

@Repository
public interface AssuntoRepository extends JpaRepository<AssuntoModel, Long>{
	public AssuntoModel findByAssunto(String assunto);
	
}
