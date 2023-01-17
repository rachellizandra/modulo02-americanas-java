package AvaliacaoFinal.Hospital;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {
    private String profissao;
    private BigDecimal salario;
    private Double cargaHoraria;

    public Funcionario() {

    }

    public Funcionario(String nome, String registro, String profissao, BigDecimal salario, Double cargaHoraria) {
        super(nome, registro);
        this.profissao = profissao;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public void realizarAtividade() {
        System.out.println("Funcionário trabalhando");
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Profissão: " + this.getProfissao() + ", Carga horária: " + this.getCargaHoraria() + " horas.";
    }
}
