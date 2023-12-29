package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/lista-de-BSM’s")
	public String customMessage() {
		return "Persistência;\r\n"
				+ "Mentalidade de Crescimento;\r\n"
				+ "Responsabilidade Pessoal;\r\n"
				+ "Orientação ao Futuro;\r\n"
				+ "Proatividade;\r\n"
				+ "Comunicação;\r\n"
				+ "Trabalho em Equipe;\r\n"
				+ "Orientação ao Detalhe";
	}
	
	@GetMapping("/Lista-de-OBJETIVOS")
	public String goodbye() {
		return "Persistência;\r\n"
				+ "Mentalidade de Crescimento;\r\n"
				+ "Responsabilidade Pessoal;\r\n"
				+ "Proatividade;\r\n"
				+ "Comunicação;\r\n"
				+ "Orientação ao Detalhe";
	}
}
