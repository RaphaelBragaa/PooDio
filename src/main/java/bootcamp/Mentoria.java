package main.java.bootcamp;

public class Mentoria {
    private String nome;
    private String descricao;
    private int duracao;

    public Mentoria(String nome, String descricao, int duracao) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracao() {
        return duracao;
    }
}
