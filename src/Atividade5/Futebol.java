package Atividade5;

public class Futebol extends Jogador{

    private String posicao;
    private Integer gols;

    public Futebol(String nome, Double peso, Double altura, String esporte, String numeroCamisa, String posicao) {
        super(nome, peso, altura, esporte, numeroCamisa);
        this.posicao = posicao;
        this.gols = 0;
    }

    @Override
    public void treinar() {
        correr();
        chutarBola();
    }

    public void treinar(String tipoDeTreino) {
        if(tipoDeTreino.equals("corrida")) {
            correr();
        } else if (tipoDeTreino.equals("chutar")){
            chutarBola();
        } else {
            System.out.println("Treino não identificado");
        }
    }
    private void chutarBola() {
        System.out.println("Jogador está chutando a bola...");
    }

    private void correr() {
        System.out.println("Jogador está correndo...");
    }

    public final void fazerGol(){
        System.out.println("Jogador marcou um gol:" + gols++);
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Integer getGols() {
        return gols;
    }

}
