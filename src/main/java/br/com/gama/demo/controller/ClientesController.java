
package br.com.gama.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gama.demo.DemoApplication;

@SpringBootApplication
@RestController
@RequestMapping("/home")
public class ClientesController {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/clientes")
	public String clientes() {
		return "Lista de Clientes";
	}
}
