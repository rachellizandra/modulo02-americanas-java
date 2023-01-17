package AvaliacaoFinal.Hospital;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Medico extends Funcionario {
    private String especializacao;
    private int qtdDiagnosticos;
    private int qtdExames;

    public Medico() {

    }

    public Medico(String nome, String registro, String profissao, BigDecimal salario, Double cargaHoraria, String especializacao, int qtdDiagnosticos, int qtdExames) {
        super(nome, registro, profissao, salario, cargaHoraria);
        this.especializacao = especializacao;
        this.qtdDiagnosticos = qtdDiagnosticos;
        this.qtdExames = qtdExames;
    }

    //O método final abaixo foi feito para não ser sobreescrito nas subclasses pois esta é uma forma padrão de prescrição médica
    public final void prescreverReceita(Paciente paciente) {
        System.out.println("Prescrição de receita: \nMédico: " + getNome() +  "\nPaciente: " + paciente.getNome());
    }

    public void realizarDiagnostico(List<String> sintomas) {
        int cont = 0;
        for(int i = 0; i < sintomas.size(); i++) {
            cont++;
            //System.out.println(sintomas.get(i));
        }
        if(cont <= 3) {
            System.out.println("Diagnóstico: A partir dos sintomas relatados, você deve fazer um exame de sangue");
        } else {
            System.out.println("Diagnóstico: Você precisa fazer um exame mais completo para ser dignosticado");
        }
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
                ", Numero de exames: " + qtdExames;
    }
}
