package com.turma29.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping



	public class HelloApplication {

	@GetMapping()
	public String menu(){
		return  "<hr><b>MENTALIDADES:</hr></b> "
				+ "<i>Trabalho em equipe, persistência, Proatividade</i>"
				+ "<hr></hr>";
	}

	@GetMapping("/pagina")
	public String pagina2(){
		return "<hr><b>Terminar a semana, com um otimo desepenho.!</hr></b>"
				+ "<hr></hr>";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

}
