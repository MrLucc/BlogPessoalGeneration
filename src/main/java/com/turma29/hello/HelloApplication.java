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

    @GetMapping
    public String menu() {
        return "<title>SPRING BOOT</title>"
                +"<body bgcolor = #7FFFD4>"
                + "<b><a href = \"http://localhost:8080/pagina\">MENTALIDADES</a></b><br>"
                + "<b><a href = \"http://localhost:8080/pagina1\">OBJETIVO DA SEMANA</a></b>"
                +"</body>";
    }

    @GetMapping("/pagina")
    public String pagina1() {
        return "<b><hr><i>Trabalho em equipe, persistência, Proatividade</i></b></hr>"
                + "<hr></hr>";


    }

    @GetMapping("/pagina1")
    public String pagina2() {
        return "<hr><b>Terminar a semana com um otimo desepenho, sobre SPRING BOOT.!</hr></b>"
                + "<hr></hr>";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

}
