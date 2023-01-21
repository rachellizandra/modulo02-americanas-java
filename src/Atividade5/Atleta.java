package Atividade5;

public abstract class Atleta {
    private String nome;
    private Double peso;
    private Double altura;

    private String esporte;

    public Atleta(String nome, Double peso, Double altura, String esporte) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.esporte = esporte;
    }

    public abstract void treinar();

    public final Double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }
}
