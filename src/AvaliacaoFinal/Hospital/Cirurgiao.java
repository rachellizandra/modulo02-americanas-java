package AvaliacaoFinal.Hospital;

import java.math.BigDecimal;

public class Cirurgiao extends Medico {
    private int numerosDeCirurgias;

    public Cirurgiao(String nome, String registro, String profissao, BigDecimal salario, Double cargaHoraria, String especializacao, int qtdDiagnosticos, int qtdExames, int numerosDeCirurgias) {
        super(nome, registro, profissao, salario, cargaHoraria, especializacao, qtdDiagnosticos, qtdExames);
        this.numerosDeCirurgias = numerosDeCirurgias;
    }

    public int getNumerosDeCirurgias() {
        return numerosDeCirurgias;
    }

    public void setNumerosDeCirurgias(int numerosDeCirurgias) {
        this.numerosDeCirurgias = numerosDeCirurgias;
    }
}
