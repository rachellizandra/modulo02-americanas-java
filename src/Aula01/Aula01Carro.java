import java.util.Scanner;

public class Aula01Carro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String cor = "vermelho";
        String marca = "BMW";
        String modelo = "X5";
        boolean isLigado = true;
        int velocidade = 0;

        int escolha;

        while(isLigado) {
            System.out.println();
            System.out.println("Escolha uma operação");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Estado atual");
            System.out.println("0 - Desligar");
            System.out.printf("Operação: ");

          escolha = scan.nextInt();

          if(escolha == 0) {
              isLigado = false;
          } else if(escolha == 1) {
              velocidade += 10;
              System.out.printf("Você acelerou e sua velocidade é de: %dkm/h", velocidade);
          } else if(escolha ==2) {
              if(velocidade > 0) {
                  velocidade -= 10;
                  System.out.printf("Você freou e sua velocidade é de: %dkm/h", velocidade);
              }else {
                  System.out.println("Carro parado");
                  isLigado = false;
              }
          } else if(escolha ==3) {
              System.out.println("O seu " + modelo + " está atualmente a " + velocidade + "km/h");
          }

        }
        System.out.println("Carro desligado");
    }

}