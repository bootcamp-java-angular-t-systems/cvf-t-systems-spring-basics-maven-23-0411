package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProyectoMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoMavenApplication.class, args);
	}

	@GetMapping("/home")
	public String home() {
		return String.format("Bienvenido a mi API REST /home");
	}
	
	@GetMapping("/inicio")
	public String inicio() {
		return String.format("Bienvenido a mi API REST /inicio");
	}
}
