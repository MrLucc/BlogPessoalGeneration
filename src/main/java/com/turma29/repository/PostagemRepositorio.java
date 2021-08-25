package com.turma29.repository;
//AGUARDAR DADOS REFERENTE A POSTAGEM

import com.turma29.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepositorio extends JpaRepository<Postagem, Long> {

}
