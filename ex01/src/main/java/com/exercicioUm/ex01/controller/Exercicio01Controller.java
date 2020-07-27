package com.exercicioUm.ex01.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/ex01")

public class Exercicio01Controller {

	@GetMapping
	public String hello() {
		return "As mentalidades usadas serão: Persistência e Orientação ao Futuro.";
	}
	
}
