package com.exercicioDois.ex02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ex02")


public class Exercicio02Controller {

	@GetMapping
	public String exercicio02 () {
		return "Meu objetivo essa semana será aprender Springboot.";
	}
	
}
