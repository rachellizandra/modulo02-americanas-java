package Atividade5;

public abstract class Piloto extends Atleta{
    private String cnh;

    public Piloto(String nome, Double peso, Double altura, String esporte, String cnh) {
        super(nome, peso, altura, esporte);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
