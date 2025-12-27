/* Leia um número inteiro.
* Mostre:
* "Número positivo" se for maior que zero
"Número negativo" caso contrário*/

package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String decisao = "";

        if (numero >= 0){
            decisao = "número positivo";
        } else {
            decisao = "número negativo";
        }

        System.out.printf("O número que você digitou é um %s", decisao);
        scanner.close();
    }
}