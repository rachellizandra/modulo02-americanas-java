package Atividade5;

public abstract class Jogador extends Atleta {
    private String numeroCamisa;

    public Jogador(String nome, Double peso, Double altura, String esporte, String numeroCamisa) {
        super(nome, peso, altura, esporte);
        this.numeroCamisa = numeroCamisa;
    }

    public String getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(String numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
}
