package br.com.aula9.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value = "/home")
	public ResponseEntity<Object> teste(){
		return new ResponseEntity<>("Teste", HttpStatus.OK);
	}
}
