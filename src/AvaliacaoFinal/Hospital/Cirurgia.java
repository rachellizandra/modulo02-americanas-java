package AvaliacaoFinal.Hospital;

public class Cirurgia extends Sala {
    private String pacienteAtual;
    private String proximoPaciente;

    public Cirurgia(String numeroReserva, String tempoDeEspera, int[] posicaoNaFila, String pacienteAtual, String proximoPaciente) {
        super(numeroReserva, tempoDeEspera, posicaoNaFila);
        this.pacienteAtual = pacienteAtual;
        this.proximoPaciente = proximoPaciente;
    }

    public String getPacienteAtual() {
        return pacienteAtual;
    }

    public void setPacienteAtual(String pacienteAtual) {
        this.pacienteAtual = pacienteAtual;
    }
}
