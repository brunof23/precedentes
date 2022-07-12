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

import com.precedentes.Models.OrigemModel;
import com.precedentes.Repositories.OrigemRepository;

@RestController
@RequestMapping(value = "/origem")
@CrossOrigin(origins = "*")
public class OrigemController {
	
	@Autowired
	OrigemRepository origem;
	
	@GetMapping
	public List getAllOrigem() {
		return origem.findAll();
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public OrigemModel inserirOrigem(@RequestBody OrigemModel origemModel) {
		return origem.save(origemModel);		
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity atualizarOrigem(@RequestBody OrigemModel origemModel, @PathVariable Long id) {
		
		if (!origem.existsById(id)) {
			return ResponseEntity.notFound().build();
		}	
		
		return ResponseEntity.ok(origem.save(origemModel));
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public ResponseEntity deletarOrigem(@PathVariable Long id) {
		
		if(!origem.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.noContent().build();
	}

}
