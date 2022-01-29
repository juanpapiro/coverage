package br.com.modulo2.controllers;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
	
	@GetMapping("/calcular/soma")
	public ResponseEntity<BigDecimal> soma(@RequestParam BigDecimal num1, @RequestParam BigDecimal num2) {
		return ResponseEntity.ok(num1.add(num2));
	}

}
