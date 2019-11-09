package br.com.aula9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.aula9.entity.Livro;
import br.com.aula9.repository.LivroRepository;

@RestController
@CrossOrigin
public class HomeController {

	@Autowired
	private LivroRepository repository;

	@GetMapping("/")
	public ResponseEntity<Object> teste() {
		return new ResponseEntity<>("Teste", HttpStatus.OK);
	}

	@GetMapping("/livro")
	public ResponseEntity<Object> livro() {
		return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
	}

	@PostMapping("/livro")
	public ResponseEntity<Object> salvar(@RequestBody Livro livro){
		return new ResponseEntity<>(repository.save(livro), HttpStatus.OK);
	}
}
