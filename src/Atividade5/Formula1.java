package Atividade5;

public final class Formula1 extends Piloto {

    private String escuderia;

    public Formula1(String nome, Double peso, Double altura, String esporte, String cnh, String escuderia) {
        super(nome, peso, altura, esporte, cnh);
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public void treinar() {
       musculacao();
       darVoltas();
    }

    private void musculacao() {
        System.out.println("Fazendo musculação..");
    }

    private void darVoltas() {
        int cont = 0;

        while(cont < 10) {
            cont++;
            System.out.println("Piloto dando voltas");
        }
        System.out.println("Treino encerrado");
    }

    public void darVoltas(int numeroDeVoltas) {
        int cont = 0;

        while(cont < numeroDeVoltas) {
            cont++;
            System.out.println("Piloto dando a volta numero: " + cont);
        }
        System.out.println("Treino encerrado");
    }
}
