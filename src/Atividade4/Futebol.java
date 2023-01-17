package Atividade4;

public class Futebol extends Esporte {
    private Integer gols;

    public Futebol(String nome, Integer numeroJogadores) {
        super(nome, numeroJogadores);
        this.gols = 0;
    }

    public void pontuar() {
        this.gols++;
        System.out.println("Você pontuou!" + this.gols);
    }

    public void cometerFaltas() {
        int faltas = 0;
        System.out.println("");
    }

    public Integer getGols() {
        return gols;
    }

    public void setGols(Integer gols) {
        this.gols = gols;
    }
}
