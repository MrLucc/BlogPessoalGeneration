package com.turma29.controller;


import com.turma29.model.Tema;
import com.turma29.repository.TemaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tema")
public class TemaControlador {

    private @Autowired TemaRepositorio repositorio;

    @GetMapping("/todos")
    public List<Tema> pegarTodes(){
        return repositorio.findAll();
    }


}
