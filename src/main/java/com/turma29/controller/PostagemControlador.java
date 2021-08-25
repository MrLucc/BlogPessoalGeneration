package com.turma29.controller;

//RESPONSAVEL POR CONTROLAR O ACESSO DA PAGINA, JUNTO COM OS "ENDSPOINT" DO ENDEREÇO

import com.turma29.model.Postagem;
import com.turma29.repository.PostagemRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/postagem")
public class PostagemControlador {

    private @Autowired PostagemRepositorio repositorio;

    @GetMapping("/todas")
    public List<Postagem> pegarTodes(){
        return repositorio.findAll();
    }
}

