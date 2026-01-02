/* Usuário tem 3 tentativas para acertar a senha (1234).
Se errar 3 vezes → bloqueado
Se acertar → acesso liberado
Use loop + contador. */

package exercicios.estruturas_de_repeticao;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;
        int tentativas = 3;

        do {
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();
            if (senha.equals("1234")) {
                System.out.println("Acesso liberado!");
            } else {
                if (tentativas == 1) {
                    System.out.println("Número de tentativas excedido! Acesso bloqueado.");
                    break;
                }
                
                tentativas--;
                System.out.printf("Senha incorreta, você tem mais %d tentaviva(s).%n", tentativas);
            }

        } while (!senha.equals("1234"));
        scanner.close();
    }
}