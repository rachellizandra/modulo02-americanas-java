package AvaliacaoFinal.Hospital;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Medico extends Funcionario {
    private String especializacao;
    private int qtdDiagnosticos;
    private int qtdExames;
    private Paciente paciente;

    public Medico() {

    }

    public Medico(String nome, String registro, String profissao, BigDecimal salario, Double cargaHoraria, String especializacao, int qtdDiagnosticos, int qtdExames) {
        super(nome, registro, profissao, salario, cargaHoraria);
        this.especializacao = especializacao;
        this.qtdDiagnosticos = qtdDiagnosticos;
        this.qtdExames = qtdExames;
    }

    public final void prescreverReceita(String paciente) {
        System.out.println("\nPrescrição de receita: \nMédico: " + getNome() +  "\nPaciente: " + paciente);
    }

    public void realizarDiagnostico(ArrayList<String> sintomas) {
        this.paciente.listarSintomas(sintomas, "Sintomas relatados:");
    }

    public int getQtdDiagnosticos() {
        return qtdDiagnosticos;
    }

    public void setQtdDiagnosticos(int qtdDiagnosticos) {
        this.qtdDiagnosticos = qtdDiagnosticos;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public int getQtdExames() {
        return qtdExames;
    }

    public void setQtdExames(int qtdExames) {
        this.qtdExames = qtdExames;
    }

    @Override
    public String toString() {
        return "Dados do médico:" +
                "\nNome: " + getNome() +
                "\nEspecialização: '" + especializacao + '\'' +
                ", Numero de diagnosticos: " + qtdDiagnosticos +
                ", Numero de exames: " + qtdExames +
                ", Paciente: " + paciente;
    }
}
