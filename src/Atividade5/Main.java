package Atividade5;

public class Main {
    public static void main(String[] args) {

        Futebol futebol = new Futebol("ruan", 65.89, 1.88, "futebol", "10", "ATK");
        Formula1 formula1 = new Formula1("Job", 71.54, 1.98, "formula1", "265595959", "Ferrari");

        System.out.println("Fisico: ");
        System.out.println("Peso: " + formula1.getPeso());
        System.out.println("IMC: " + formula1.calcularIMC());
        System.out.println("Treino: ");
        formula1.treinar();
        formula1.darVoltas( 5);

        System.out.println("Fisico: ");
        System.out.println("Peso: " + futebol.getPeso());
        System.out.println("IMC: " + futebol.calcularIMC());
        System.out.println("Treino: ");
        futebol.treinar();
        futebol.treinar("corrida");
    }
}
