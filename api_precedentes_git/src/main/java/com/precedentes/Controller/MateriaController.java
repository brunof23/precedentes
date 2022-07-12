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

import com.precedentes.Models.MateriaModel;
import com.precedentes.Repositories.MateriaRepository;

@RestController
@RequestMapping(value = "/materia")
@CrossOrigin(origins = "*")
public class MateriaController {
	
	@Autowired
	MateriaRepository materia;
	
	@GetMapping
	public List getAllMateria() {
		return materia.findAll();
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public MateriaModel inserirMateria(@RequestBody MateriaModel materiaModel) {
		return materia.save(materiaModel);		
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity atualizarMateria(@RequestBody MateriaModel materiaModel, @PathVariable Long id) {
		
		if (!materia.existsById(id)) {
			return ResponseEntity.notFound().build();
		}	
		
		return ResponseEntity.ok(materia.save(materiaModel));
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public ResponseEntity deletarMateria(@PathVariable Long id) {
		
		if(!materia.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.noContent().build();
	}

}
