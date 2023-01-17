package AvaliacaoFinal.Hospital;

public class Atendimento extends Sala {

    private String dataEHora;

    public Atendimento(String numeroReserva, String tempoDeEspera, int[] posicaoNaFila, String dataEHora) {
        super(numeroReserva, tempoDeEspera, posicaoNaFila);
        this.dataEHora = dataEHora;
    }

    public String getDataEHora() {
        return dataEHora;
    }

    public void setDataEHora(String dataEHora) {
        this.dataEHora = dataEHora;
    }
}
