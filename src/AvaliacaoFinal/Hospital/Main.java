package AvaliacaoFinal.Hospital;

import java.util.Arrays;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Instanciando os objetos
        String[] sintomas1 = new String[]{"dor de cabeça", "dor nas costas"};
        Paciente paciente = new Paciente("Rachel", "123", "Ativo", sintomas1);
        BigDecimal valorSalario = new BigDecimal("400.00");
        Neuro neuro = new Neuro("Davyson", "555", "medico", valorSalario, 96.7, "neuro", 85, 97);
        Sala sala = new Sala("22", "56 min", new int[]{0}); //VERIFICAR PQ TA IMPRIMINDO O ENDERECO DE MEMORIA QUANDO NAO UTILIZO ARRAYS.TOSTRING
        Medico medico = new Medico("Carlos Roberto", "123", "medico",  valorSalario, 12.0, "legista", 123, 26);

        //Invocando os métodos
        paciente.realizarAtividade();
        System.out.println("\nStatus: " + paciente.getSituacaoAtual());

        //System.out.println("\nSintomas: " + Arrays.toString(paciente.listarSintomas(sintomas1))); //VERIFICAR PQ TA IMPRIMINDO O ENDERECO DE MEMORIA QUANDO NAO UTILIZO ARRAYS.TOSTRING

        //System.out.println(paciente.toString());
        //System.out.println(paciente.getSintomas());

        //Teste com arrayList:
        ArrayList<String> sintomas = new ArrayList<>();

        sintomas.add("Dor no corpo,");
        sintomas.add("Nauseas");
        paciente.listarSintomas(sintomas, "Sintomas relatados:");
        //medico.realizarDiagnostico(sintomas);

        System.out.println(neuro.toString());

        System.out.println(Arrays.toString(sala.getPosicaoNaFila()));
        sala.reservar(12, 11, 2022);

        medico.prescreverReceita(paciente.getNome());
        System.out.println(medico.toString());
    }
}
