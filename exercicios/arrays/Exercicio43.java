/* Criar um programa em Java que gerencie notas de alunos usando arrays, com validações e relatório final. */


package exercicios.arrays;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade;
        do {
            System.out.print("Quantas notas você deseja cadastrar: ");
            quantidade = scanner.nextInt();

            if (quantidade <= 0) {
                System.out.println("Error: A quantidade precisa ser maior que 0.");
            }

        } while (quantidade <= 0);

        System.out.println("--------------------------");

        double listaDeNotas[] = new double[quantidade];

        for (int i=0; i < listaDeNotas.length; i++) {
            double nota;
            while (true) {
                System.out.printf("Digite a %d° nota: ", i+1);
                nota = scanner.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Error: A nota deve estar entre 0 e 10.");
                    continue;
                }
                break;
            }
            listaDeNotas[i] = nota;
        }

        System.out.println("--------------------------");

        double somaDasNotas = 0;
        double maiorNota = 0;
        double menorNota = 0;
        int notasAcimaDaMedia = 0;
    
        for (int i=0; i < listaDeNotas.length; i++) {
            somaDasNotas += listaDeNotas[i];

            if (i == 0) {
                maiorNota = listaDeNotas[i];
                menorNota = listaDeNotas[i];

            } else if (listaDeNotas[i] > maiorNota) {
                maiorNota = listaDeNotas[i];

            } else if (listaDeNotas[i] < menorNota) {
                menorNota = listaDeNotas[i];
            }
        }

        double media = somaDasNotas / (double) listaDeNotas.length;

        for (double numero : listaDeNotas) {
            if (numero > media) {
                notasAcimaDaMedia++;
            }
        }

        System.out.println("========== RELATÓRIO FINAL ==========");
        System.out.printf("Notas cadastradas: %d %nSoma das notas: %.1f %nMedia: %.1f" +
                        "%nMaior nota: %.1f %nMenor nota: %.1f %nNotas acima da média: %d%n", listaDeNotas.length, somaDasNotas, media, maiorNota, menorNota, notasAcimaDaMedia);

        scanner.close();
    }
}