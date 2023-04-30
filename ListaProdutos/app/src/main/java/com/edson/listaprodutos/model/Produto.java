package com.edson.listaprodutos.model;

public class Produto {
    int foto;
    String nome;
    String descricao;
    String preco;

    public Produto(int foto, String nome, String descricao, String preco) {
        this.foto = foto;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(int foto) {
        this.foto = foto;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
