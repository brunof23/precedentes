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

import com.precedentes.Models.TipoDireitoModel;
import com.precedentes.Repositories.TipoDireitoRepository;

@RestController
@RequestMapping(value = "/tipo-direito")
@CrossOrigin(origins = "*")
public class TipoDireitoController {
	
	@Autowired
	TipoDireitoRepository tipoDireito;
	
	@GetMapping
	public List getAllTipoDireito() {
		return tipoDireito.findAll();
	}
	
	@PostMapping
	@ResponseStatus(value = HttpStatus.CREATED)
	public TipoDireitoModel inserirTipoDireito(@RequestBody TipoDireitoModel tipoDireitoModel) {
		return tipoDireito.save(tipoDireitoModel);		
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity atualizarTipoDireito(@RequestBody TipoDireitoModel tipoDireitoModel, @PathVariable Long id) {
		
		if (!tipoDireito.existsById(id)) {
			return ResponseEntity.notFound().build();
		}	
		
		return ResponseEntity.ok(tipoDireito.save(tipoDireitoModel));
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public ResponseEntity deletarTipoDireito(@PathVariable Long id) {
		
		if(!tipoDireito.existsById(id)) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.noContent().build();
	}
	
	//teste

}
