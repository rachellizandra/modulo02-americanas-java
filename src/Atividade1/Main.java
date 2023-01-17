package Atividade1;
import java.util.Scanner;

public class Main {

    /**
     *
     * Sistema Bancário
     * - Deposito
     * - Sacar
     * - Transferir
     *
     * - Transferir apenas se tiver saldo
     * - Sacar apenas se tiver saldo
     *
     * - Todos os atributos tem que ser privados
     *
     */
    public static void main(String[] args) {

        Conta conta1 = new Conta();

        Scanner scan = new Scanner(System.in);

        int escolha;
        double valor = 0;

        conta1.saldo = 500.50;
        conta1.tipoDaConta = "poupança";
        conta1.numeroDaConta = 12345678;

        Cliente cliente1 = new Cliente();

        cliente1.nome = "Barbara";
        cliente1.cpf  = "78594631245";
        cliente1.telefone = "08112345678";
        cliente1.conta = conta1;

        boolean clienteAtivo = true;

        while(clienteAtivo) {
            System.out.println();
            System.out.println("Escolha uma operação");
            System.out.println("1 - Consultar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("0 - Sair da conta");
            System.out.printf("Operação: ");

            escolha = scan.nextInt();

            switch(escolha) {
                case 1:
                    System.out.println("Seu saldo é de: " + cliente1.conta.saldo);
                    break;
                case 2:
                    if(cliente1.conta.saldo > 0) {
                        System.out.println("Digite o valor que você quer sacar:");
                        valor = scan.nextDouble();
                        if(valor <= cliente1.conta.saldo && valor > 0) {
                            cliente1.conta.saldo -= valor;
                            System.out.println("Seu saldo agora é: " + cliente1.conta.saldo);
                        } else {
                            System.out.println("Valor inválido! Tente novamente");
                            break;
                        }

                    } else {
                        System.out.println("Você não possui saldo suficiente");
                    }
                    break;
                case 3:
                    System.out.println("Digite o valor que você quer depositar:");
                    valor = scan.nextDouble();
                    if(valor > 0) {
                        cliente1.conta.saldo += valor;
                        System.out.println("Seu saldo agora é: " + cliente1.conta.saldo);
                    } else {
                        System.out.println("Valor inválido! Tente novamente");
                        break;
                    }
                    break;
                case 0:
                    clienteAtivo = false;
                    System.out.println("Você saiu da conta.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
