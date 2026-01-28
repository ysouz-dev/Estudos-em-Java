/* criar um programa em Java que simula um validador de cadastro de usuário,
 usando métodos bem separados. */

package exercicios.metodos;

import java.util.Scanner;

public class Exercicio74 {

    public static void menu(Scanner scanner) {
        System.out.println("===========================");
        System.out.println("||       Cadastro        ||");
        System.out.println("===========================");

        String nome;
        do {
            System.out.print("Nome: ");
            nome = scanner.nextLine().strip().toUpperCase();
            if (!validaNome(nome)) {
                System.out.println("Error: O nome deve conter apenas caracteres alfabéticos.");
            }
        } while (!validaNome(nome));
    }

    public static boolean validaNome(String nome) {
        String nomeSemEspaco = nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu(scanner);
    }
}