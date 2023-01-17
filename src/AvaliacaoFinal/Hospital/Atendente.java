package AvaliacaoFinal.Hospital;

import java.math.BigDecimal;

public class Atendente extends Funcionario {

    //O método final é usado nesta classe para não ser sobrescrito nas possíveis subclasses.
    //É usado para garantir que um algoritmo não possa ser modificado.

    private int qtdAtendimentos;

    public Atendente(String nome, String registro, String profissao, BigDecimal salario, Double cargaHoraria, int qtdAtendimentos) {
        super(nome, registro, profissao, salario, cargaHoraria);
        this.qtdAtendimentos = qtdAtendimentos;
    }

    public final void iniciarAtendimento() {
        System.out.println("Iniciando atendimento");
    }

    public int getQtdAtedimentos() {
        return qtdAtendimentos;
    }

    public void setQtdAtedimentos(int qtdAtendimentos) {
        this.qtdAtendimentos = qtdAtendimentos;
    }
}
