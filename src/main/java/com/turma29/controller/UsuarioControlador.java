package com.turma29.controller;


import com.turma29.model.Usuario;
import com.turma29.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/usuario")
public class UsuarioControlador {

    private @Autowired UsuarioRepositorio repositorio;

    @GetMapping("/todes")
    public List<Usuario> pegarTodes(){
        return repositorio.findAll();
    }

}
