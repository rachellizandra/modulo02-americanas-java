package Atividade4;

public class Esporte {
    private String nome;
    private Integer numeroJogadores;

    public Esporte(String nome, Integer numeroJogadores) {
        this.nome = nome;
        this.numeroJogadores = numeroJogadores;
    }

    public void pontuar() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNumeroJogadores(Integer numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }
}
