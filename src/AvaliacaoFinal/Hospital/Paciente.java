package AvaliacaoFinal.Hospital;
import java.util.ArrayList;

public class Paciente extends Pessoa {
    private String situacaoAtual;
    private String[] sintomas;

    public Paciente(String nome, String registro, String situacaoAtual, String[] sintomas) {
        super(nome, registro);
        this.situacaoAtual = situacaoAtual;
        this.sintomas = sintomas;
    }

//    public String[] listarSintomas(String[] sintomas) {
//        String[] sintomasEncontrados = new String[sintomas.length];
//        int contSintomas = 0;
//
//        for(int i = 0; i < sintomas.length; i++) {
//            sintomasEncontrados[contSintomas++] = sintomas[i];
//        }
//
//        String[] retorno = new String[contSintomas];
//        for(int i = 0; i < contSintomas; i++) {
//            retorno[i] = sintomasEncontrados[i];
//        }
//        return retorno;
//    }

    public void listarSintomas(ArrayList<String> sintomas, String cabecalho) {
        System.out.printf(cabecalho); // mostrar cabeçalho

        for (String item : sintomas)
            System.out.printf(" %s", item);
        System.out.println();
    }

    public String getSituacaoAtual() {
        return situacaoAtual;
    }

    public void setSituacaoAtual(String situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
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
