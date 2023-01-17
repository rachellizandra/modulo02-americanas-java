package Atividade2;

public class Conta {

    private String numConta;
    private String agencia;
    private double saldo;
    private String tipoConta;

    public Conta(String numConta, String tipoConta) {
        this.numConta = numConta;
        this.agencia = "1";
        this.saldo = 0;
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public boolean sacar(double valor) {
        if(valor <= 0) {
            System.out.println("Operação inválida");
            return false;
        } else if(valor > saldo) {
            System.out.println("Saldo indisponível");
            return true;
        }
        saldo -= valor;
        return true;
    }

    public void depositar(double valor) {
        if(valor <= 0) {
            System.out.println("Operação inválida");
        } else {
            saldo += valor;
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if(sacar(valor)) {
            contaDestino.depositar(valor);
        } else {
            System.out.println("Não foi possível efetuar a operação, tente novamente.");
        }
    }
}
