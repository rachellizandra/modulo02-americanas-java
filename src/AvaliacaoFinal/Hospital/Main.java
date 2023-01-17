package AvaliacaoFinal.Hospital;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Instanciando alguns objetos para teste

        List<String> sintomas = List.of("dor de cabeça", "dor no corpo", "nauseas");

        Paciente paciente = new Paciente("Rachel", "123", "Ativo", sintomas);

        BigDecimal valorSalario = new BigDecimal("8000.00");

        Neuro neuro = new Neuro("Davyson", "555", "Médico", valorSalario, 96.7, "neuro", 85, 97);

        Sala sala = new Sala("22", "56 minutos", new int[]{3});

        Medico medico = new Medico("Carlos Roberto", "123", "medico",  valorSalario, 12.0, "Clinico geral", 123, 26);

        //Invocando os métodos

        //Para sala
        System.out.println("Posição na fila: " + Arrays.toString(sala.getPosicaoNaFila()));
        System.out.println("###############################");
        sala.reservar(12, 11, 2022);

        //Para paciente
        System.out.println("\n###############################");
        System.out.println(paciente.toString());
        paciente.realizarAtividade();
        System.out.println("\nStatus: " + paciente.getSituacaoAtual());
        paciente.listarSintomas("Sintomas:");

        //Para médico
        System.out.println("###############################");
        System.out.println(medico.toString());
        medico.realizarDiagnostico(sintomas);
        medico.prescreverReceita(paciente);

        //Para neuro - subclasse de médico
//      System.out.println(neuro.toString());

    }
}
