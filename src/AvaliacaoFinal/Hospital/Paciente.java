package AvaliacaoFinal.Hospital;

import java.util.List;

public class Paciente extends Pessoa {
    private String situacaoAtual;
    private List<String> sintomas;

    public Paciente(String nome, String registro, String situacaoAtual, List<String> sintomas) {
        super(nome, registro);
        this.situacaoAtual = situacaoAtual;
        this.sintomas = sintomas;
    }

    public void listarSintomas(String cabecalho) {
        System.out.printf(cabecalho); // mostrar cabeçalho

        for (String item : sintomas)
            System.out.printf(" %s,", item);
        System.out.println();
    }

    public String getSituacaoAtual() {
        return situacaoAtual;
    }

    public void setSituacaoAtual(String situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
    }

    public List<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<String> sintomas) {
        this.sintomas = sintomas;
    }

    @Override
    public void realizarAtividade() {
        if(this.getSituacaoAtual().equals("Ativo")) {
            System.out.printf("Paciente %s em atendimento", getNome());
        } else if(this.getSituacaoAtual().equals("Espera")) {
            System.out.printf("Paciente %s em espera", getNome());
        } else if(this.getSituacaoAtual().equals("Concluído")){
            System.out.printf("Paciente %s teve alta", getNome());
        }
    }

    public String toString() {
        return "Paciente: " + this.getNome() + ", Registro: " + this.getRegistro() +", Sintomas: " + this.getSintomas() + ", Situação atual: " + this.getSituacaoAtual();
    }
}
