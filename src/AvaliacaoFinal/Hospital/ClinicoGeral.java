package AvaliacaoFinal.Hospital;

import java.math.BigDecimal;

public class ClinicoGeral extends Medico{

    public ClinicoGeral(String nome, String registro, String profissao, BigDecimal salario, Double cargaHoraria, String especializacao, int qtdDiagnosticos, int qtdExames) {
        super(nome, registro, profissao, salario, cargaHoraria, especializacao, qtdDiagnosticos, qtdExames);
    }
}
