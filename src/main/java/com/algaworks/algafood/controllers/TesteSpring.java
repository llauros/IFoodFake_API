package com.algaworks.algafood.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class TesteSpring {

	@GetMapping("/t")
	public String test() {
		return "Hello";
	}
}
