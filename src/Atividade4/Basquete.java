package Atividade4;

public class Basquete extends Esporte {
    private Integer pontos;

    public Basquete(String nome, Integer numeroJogadores) {
        super(nome, numeroJogadores);
        this.pontos = 0;
    }

    public void pontuar() {
        this.pontos += 2;
        System.out.println("Você marcou uma cesta" + this.pontos);
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }
}
