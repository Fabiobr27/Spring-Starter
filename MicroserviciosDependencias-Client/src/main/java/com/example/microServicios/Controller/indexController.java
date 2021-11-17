package com.example.microServicios.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.microServicios.starter.Saludo;

public class indexController {

	@Autowired
	private Saludo saludo;


	@GetMapping("/saludo")
	public ResponseEntity<String> saludo() {
		
		new ResponseEntity<String>(HttpStatus.OK);
		return ResponseEntity.ok(saludo.mensajeSaludo());
	}
	
}
