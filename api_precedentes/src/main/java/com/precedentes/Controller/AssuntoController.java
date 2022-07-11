package com.precedentes.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.precedentes.Models.AssuntoModel;
import com.precedentes.Repositories.AssuntoRepository;

@RestController
@RequestMapping(value = "/assunto")
@CrossOrigin(origins = "*")
public class AssuntoController {
	
	@Autowired
	AssuntoRepository assunto;
	
	@GetMapping
	public List getAllAssuntos() {
		return assunto.findAll();
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public AssuntoModel inserirAssunto(@RequestBody AssuntoModel assuntoModel) {
		return assunto.save(assuntoModel);
		
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity atualizarAssunto(@RequestBody AssuntoModel assuntoModel, @PathVariable Long id) {
		
		if (!assunto.existsById(id)) {
			return ResponseEntity.notFound().build();
		}	
		
		return ResponseEntity.ok(assunto.save(assuntoModel));
			
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public ResponseEntity deletarAssunto(@PathVariable Long id) {
		
		if(!assunto.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.noContent().build();
		
	}
		
}
