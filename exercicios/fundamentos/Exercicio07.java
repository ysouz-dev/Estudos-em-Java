package exercicios.fundamentos;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("=====================%n"+
                        "Conversor de medidas%n"+
                        "=====================%n");

        System.out.print("Digite a metragem que deseja converter: ");
        double metros = scanner.nextDouble();

        double km = metros / 1000.0;
        double cm = metros * 100.0;
        double mm = metros * 1000.0;
        
        System.out.printf("=====================%n"+
                        "%.1f convertidos em: %nQuilômetros: %.1f km %nCentímetros: %.1f cm %nMilímetros: %.1f mm%n",
                        metros, km, cm, mm);
        scanner.close();
    }
}