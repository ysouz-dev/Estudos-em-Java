/* Mostre um menu de opções com:
Olá
Data fictícia
Número aleatório
Sair
O programa só termina quando escolher “Sair”. */

package exercicios.estruturas_de_repeticao;

import java.util.Scanner;
import java.time.LocalDate;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        while (true) {
            System.out.println("==================================");
            System.out.println("[ 1 ] Boas vindas \n[ 2 ] Data de hoje \n[ 3 ] Número aleatório \n[ 4 ] Sair");
            System.out.println("==================================");
            
            while (true){
                System.out.print("Qual opção desejada? ");
                escolha = scanner.nextInt();
                if (escolha > 4 || escolha < 1) {
                    System.out.printf("Error: Número %d não é uma opção válida.%n", escolha);
                } else {
                    System.out.println("==================================");
                    break;
                }
            }

            switch (escolha) {
                case 1:
                    System.out.print("Digite seu nome: ");
                    String nome = scanner.next();

                    System.out.printf("Seja muito bem vindo %s!%n", nome);
                    break;
                
                case 2:
                    LocalDate dataDeHoje = LocalDate.now();
                    System.out.println("Data de hoje: " + dataDeHoje);
                    break;

                case 3:
                    Double random = Math.random();
                    int sorteado = (int) (0 + random * (10 - 0));

                    System.out.println("Número sorteado: " + sorteado);
                    break;

                case 4:
                    System.out.println("Sistema encerrado.");
                    System.out.println("Volte sempre!");
                    break;
            }
            if (escolha == 4) {
                break;
            } 

        }
        scanner.close();
        
    }
}