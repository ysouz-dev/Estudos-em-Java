/* Leia um ano.
Verifique se ele é bissexto ou não. */

package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("============================%n" +
                         "Verificador de ano bissexto%n" +
                         "============================%n");

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        String bissex;

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    bissex = "é bissexto.";
                } else {
                    bissex = "não é bissexto";
                }
            } else {
                bissex = "é bissexto.";
            }
        } else {
            bissex = "não é bissexto";
        }

        System.out.println("============================");
        System.out.printf("O ano %d ele %s%n", ano, bissex);
        scanner.close();

    }
}