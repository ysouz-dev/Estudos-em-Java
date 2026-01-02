/* Leia notas até o usuário digitar -1
- Ignore notas inválidas
- Calcule média apenas das válidas */

package exercicios.estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota, somaDasNotas=0;
        int contadorDeNotas=0;

        do {
            while (true) {
                System.out.print("Digite uma nota: ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 10.0) {
                    if (nota == -1) {
                        break;
                    }
                    System.out.println("Error: A nota precisa estar entre 0 e 10.");
                    continue;
                }
                contadorDeNotas++;
                somaDasNotas += nota;
                break;
            }
            
        } while (nota != -1);

        double media;
        if (contadorDeNotas != 0) {
            media = somaDasNotas / (double) contadorDeNotas;
        } else {
            media = 0;
        }

        
        System.out.println("=================================");
        System.out.printf("Soma das notas: %.1f %nNotas digitadas: %d %nMédia das notas: %.1f%n", somaDasNotas, contadorDeNotas, media);
        scanner.close();
        
    }
}