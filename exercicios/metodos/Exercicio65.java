/* Crie um contador usando métodos que receba: 
- inicio
- fim
- passo 
E mostre a contagem corretamente.*/

package exercicios.metodos;

import java.util.Scanner;

public class Exercicio65 {

    public static void contador(int inicio, int fim, int passo) {
        System.out.println("-------------------------------------------");

        int start = inicio;
        int end = fim;
        int step = passo;

        // pega a parte absoluta do passo
        step = Math.abs(step);

        if (start < end) {
            System.out.printf("Contagem de %d até %d de %d em %d:%n", start, end, step, step);
            
            // adiciona no valor inicial o passo até chegar no fim 
            while (start <= end) {
                System.out.print(start + " ");
                start += step;
            }

        } else if (end < start) {
            System.out.printf("Contagem de %d até %d voltando de %d em %d:%n", start, end, step, step);
            
            // subtrai do valor inicial o passo até chegar no fim
            while (start >= end) {
                System.out.print(start + " ");
                start -= step;
            }

        } else {
            // condição caso o passo seja 0
            System.out.printf("Contagem de %d até %d de %d em %d:%n", start, end, step, step);
            System.out.println(start);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // menu 
        System.out.println("--------------------------");
        System.out.println("    Contador automático");
        System.out.println("--------------------------");
        System.out.print("Inicio: ");
        
        // lê os parametros do contador
        int incio = scanner.nextInt();
        
        System.out.print("Fim: ");
        int fim = scanner.nextInt();
        
        System.out.print("Passo: ");
        int passo = scanner.nextInt();

        // saida
        contador(incio, fim, passo);

        scanner.close();
    }
}