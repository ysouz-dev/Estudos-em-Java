/* Leia N notas válidas (0 a 10) e mostre:
- média
- maior e menor nota
- quantidade acima da média
- quantidade iguais à média
- quantidade abaixo da média
- percentual (%) acima da média
Use 2 loops separados obrigatoriamente. */

package exercicios.arrays;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int notas;
        do {
            System.out.print("Quantas notas deseja ler? ");
            notas = scanner.nextInt();

            if (notas <= 0) {
                System.out.println("Error: As quantidade de notas devem ser maior que 0.");
            }
    
        } while (notas <= 0);

        System.out.println("----------------------------");

        double listaNotas[] = new double[notas];
        double media = 0;

        for (int i=0; i < listaNotas.length; i++) {
            while (true) {
                System.out.printf("Digite a %d° nota: ", i+1);
                listaNotas[i] = scanner.nextDouble();
                
                if (listaNotas[i] < 0 || listaNotas [i] > 10) {
                    System.out.println("Error: As notas devem estar entre 0 e 10.");
                    continue;
                }
                media += listaNotas[i];
                break;
            }
        }

        double maiorNota = 0;
        double menorNota = 0;
        int notasAbaixoDaMedia = 0;
        int notasAcimaDaMedia = 0;
        int notasNaMedia = 0;
        media /= (double) listaNotas.length;
        System.out.println(media);

        for (double numero : listaNotas) {
            
            if (maiorNota == 0 && menorNota == 0) {
                maiorNota = numero;
                menorNota = numero;
            } else if (numero > maiorNota) {
                maiorNota = numero;
            } else if (numero < menorNota) {
                menorNota = numero;
            }

            if (numero == media) {
                notasNaMedia++;
            } else if (numero > media) {
                notasAcimaDaMedia++;
            } else {
                notasAbaixoDaMedia++;
            }
        }

        double percentualAcimaDaMedia = (notasAcimaDaMedia / (double) notas) * 100.0;

        System.out.println("------- RELATORIO FINAL --------");
        System.out.printf("Média: %.1f %nMaior nota: %.1f %nMenor nota: %.1f %nNotas acima da média: %d %nNotas abaixo da média: %d %n" +
                        "Notas na média: %d %nPercentual acima da média: %.0f%%%n", media, maiorNota, menorNota, notasAcimaDaMedia,
                         notasAbaixoDaMedia, notasNaMedia, percentualAcimaDaMedia);

        System.out.println("-----------------------------");
        scanner.close();
    }
}