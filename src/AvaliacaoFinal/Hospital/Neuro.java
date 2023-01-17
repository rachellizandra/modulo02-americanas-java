package AvaliacaoFinal.Hospital;

import java.math.BigDecimal;

public final class Neuro extends Medico {

    // Essa classe foi determinada com final pois não pode ser derivada de nenhuma outra


    public Neuro(String nome, String registro, String profissao, BigDecimal salario, Double cargaHoraria, String especializacao, int qtdDiagnosticos, int qtdExames) {
        super(nome, registro, profissao, salario, cargaHoraria, especializacao, qtdDiagnosticos, qtdExames);
    }
}
