package Aula01;

import java.util.Scanner;

public class Aula01Carro {
    public static void main(String[] args) {

        // VERIFICAR O CÓDIGO MELHORADO NO PROJETO EXERCICIOSDELOGPROG NA PASTA AULA CONSTRUTORES

        Scanner scan = new Scanner(System.in);

//        String cor = "vermelho";
//        String marca = "BMW";
//        String modelo = "X5";
//        boolean isLigado = true;
//        int velocidade = 0;

        Carro carrodaRachel = new Carro();
        carrodaRachel.isLigado = true;

        int escolha;

        while(carrodaRachel.isLigado) {
            System.out.println();
            System.out.println("Escolha uma operação");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Estado atual");
            System.out.println("0 - Desligar");
            System.out.printf("Operação: ");

          escolha = scan.nextInt();

          if(escolha == 0) {
              carrodaRachel.isLigado = false;
          } else if(escolha == 1) {
              carrodaRachel.velocidade += 10;
              System.out.printf("Você acelerou e sua velocidade é de: %dkm/h", carrodaRachel.velocidade);
          } else if(escolha ==2) {
              if(carrodaRachel.velocidade > 0) {
                  carrodaRachel.velocidade -= 10;
                  System.out.printf("Você freou e sua velocidade é de: %dkm/h", carrodaRachel.velocidade);
              }else {
                  carrodaRachel.isLigado = false;
              }
          } else if(escolha ==3) {
              System.out.println("O seu " + carrodaRachel.modelo + " está atualmente a " + carrodaRachel.velocidade + "km/h");
          }

        }
        System.out.println("Carro desligado");
    }

}