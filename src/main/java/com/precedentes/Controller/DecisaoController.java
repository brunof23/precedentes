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

import com.precedentes.Models.DecisaoModel;
import com.precedentes.Repositories.DecisaoRepository;

@RestController
@RequestMapping(value = "/decisao")
@CrossOrigin(origins = "*")
public class DecisaoController {
	
	@Autowired
	DecisaoRepository decisao;
	
	@GetMapping
	public List getAllDecisao() {
		return decisao.findAll();
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public DecisaoModel inserirDecisao(@RequestBody DecisaoModel decisaoModel) {
		return decisao.save(decisaoModel);		
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity atualizarDecisao(@RequestBody DecisaoModel decisaoModel, @PathVariable Long id) {
		
		if (!decisao.existsById(id)) {
			return ResponseEntity.notFound().build();
		}	
		
		return ResponseEntity.ok(decisao.save(decisaoModel));
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public ResponseEntity deletarDecisao(@PathVariable Long id) {
		
		if(!decisao.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.noContent().build();
		
	}

}
