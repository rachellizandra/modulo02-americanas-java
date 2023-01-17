package Atividade2;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    /*
    Sistema Bancário
    - Deposito
    - Sacar
    - Transferir
    - Transferir apenas se tiver saldo
    - Sacar apenas se tiver saldo
    - Todos os atributos tem que ser privados
     */

    // menu que define o tipo de conta que será operada em seguida
    public static int menuConta() {
        while (true) {
            System.out.println();
            System.out.println("Selecione o tipo de conta: ");
            System.out.println("1 - Corrente");
            System.out.println("2 - Poupança");
            System.out.print("> ");

            Scanner scanner = new Scanner(System.in);
            int tipoConta = scanner.nextInt();

            if (tipoConta == 1) {
                return 0;
            } else if (tipoConta == 2) {
                return 1;
            } else {
                System.out.println("ID de conta inválido");
            }
        }
    }

    // menu de operações a serem realizadas
    private static void menuOperacoes(Cliente cliente) {
        boolean operando = true;

        while (operando) {
            int indiceConta = menuConta();
            Conta conta = cliente.getConta(indiceConta);

            System.out.println();
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Transferir");
            System.out.println("0 - Deslogar");
            System.out.print("> ");

            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 0:
                    operando = false;
                    System.out.println("Tchau!");
                    break;
                case 1:
                    System.out.println("Informe o valor a ser retirado:");
                    System.out.print("> ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 2:
                    System.out.println("Informe o valor a ser adicionado:");
                    System.out.print("> ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.println("Saldo disponível em Conta " + conta.getTipoConta() +": R$ " + conta.getSaldo());
                    break;
                case 4:
                    System.out.println("Informe o valor:");
                    System.out.print("> ");
                    double valorTransferencia = scanner.nextDouble();
                    // transfere o valor entre contas, novamente de acordo com a posição no vetor
                    int indiceContaDestino = 0;
                    if (indiceConta == 0) {
                        indiceContaDestino = 1;
                    }
                    // utiliza o método get definido por nós para acessar a conta no índice especificado
                    Conta contaDestino = cliente.getConta(indiceContaDestino);
                    // realiza a transferência baseado no conta existente naquele índice
                    conta.transferir(valorTransferencia, contaDestino);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Conta contaCorrente = new Conta("1", "Corrente");
        Conta contaPoupanca = new Conta("2", "Poupança");

        Cliente cliente = new Cliente("Pedro", "235", "senha", contaCorrente, contaPoupanca);

        menuOperacoes(cliente);
    }
}


