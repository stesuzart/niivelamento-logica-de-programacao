package br.stesuzart.exercicios.aula4.biblioteca.modelo;

// Representa a categoria de um livro (ex: Ficção, Fantasia, Técnica)
public class Categoria {

    private String nome;
    private String descricao;

    public Categoria(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return nome;
    }
}
