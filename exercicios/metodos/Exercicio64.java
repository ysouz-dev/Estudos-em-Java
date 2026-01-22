/* Criar um método que receba dois números e retorne o maior. */

package exercicios.metodos;

import java.util.Scanner;

public class Exercicio64 {

    public static Integer mostraMaior(int numero1, int numero2) {
        int maior;
        if (numero1 > numero2) {
            maior = numero1;
        } else if (numero2 > numero1) {
            maior = numero2;
        } else {
            return null;   
        }
        return maior;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // lê os valores a serem analisados
        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();
    
        System.out.println("-----------------------------");

        // verifica qual é maior
        Integer maiorNumero = mostraMaior(n1, n2);
        
        // saida
        if (maiorNumero != null) {
            System.out.println("O maior número é o " + maiorNumero);
        } else {
            System.out.println("Os dois valores são iguais!");
        }
        System.out.println("-----------------------------");
        scanner.close();
    }
}