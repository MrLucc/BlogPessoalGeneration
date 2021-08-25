package com.turma29.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


//FALANDO QUE ESSA CLASSE É UMA ENTIDADE.
@Entity
public class Postagem {

//ATRIBUNDO VALORES NA "TABELA POSTAGEM" NO MYSQL, POR LINHA DE CODIGO(COSTRUINDO TABLE)

    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long idPostagem;

    private @NotBlank String titulo;
    private @NotBlank String descricao;

    public long getIdPostagem() {
        return idPostagem;
    }

    public void setIdPostagem(long idPostagem) {
        this.idPostagem = idPostagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
