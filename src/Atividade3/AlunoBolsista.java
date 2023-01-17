package Atividade3;

public class AlunoBolsista extends Aluno{
    private Double valorBolsa;

    public AlunoBolsista() {
    }

    public AlunoBolsista(String nome, String registro, String disciplina, double media, Double valorBolsa) {
        super(nome, registro, disciplina, media);
        this.valorBolsa = valorBolsa;
    }

    public Double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(Double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
}
