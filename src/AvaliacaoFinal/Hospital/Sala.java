package AvaliacaoFinal.Hospital;

import Atividade2.Conta;

public class Sala {
    private String numeroReserva;
    private String tempoDeEspera;
    private int[] posicaoNaFila;
    private Pessoa[] pessoa;

    public Sala(String numeroReserva, String tempoDeEspera, int[] posicaoNaFila) {
        this.numeroReserva = numeroReserva;
        this.tempoDeEspera = tempoDeEspera;
        this.posicaoNaFila = posicaoNaFila;
    }

    public void reservar(int dia, int mes, int ano) {
        System.out.printf("Número da reserva: " + getNumeroReserva() + "\nData: " + "%2d/%2d/%4d", dia, mes, ano);
    }

    public String getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(String numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public String getTempoDeEspera() {
        return tempoDeEspera;
    }

    public void setTempoDeEspera(String tempoDeEspera) {
        this.tempoDeEspera = tempoDeEspera;
    }

    public int[] getPosicaoNaFila() {
        return posicaoNaFila;
    }

    public void setPosicaoNaFila(int[] posicaoNaFila) {
        this.posicaoNaFila = posicaoNaFila;
    }

    public Pessoa getPessoa(int indice) {
        return pessoa[indice];
    }

    public void setPessoa(Pessoa[] pessoa) {
        this.pessoa = pessoa;
    }
}
