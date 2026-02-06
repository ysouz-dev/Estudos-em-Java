/*  Crie uma classe Cofre com:
- senha
- aberto (boolean)
Regras:
- senha só pode ser definida no construtor
- só abre com senha correta
- não pode alterar senha depois
Exigências:
- getter apenas para estado (aberto)
- método abrir
- método fechar
- encapsulamento total*/

package exercicios.poo.encapsulamento.exercicio82;

import java.util.Scanner;

public class Main {

    public static Cofre criarCofre(Scanner scanner) {
        String senha;
        String confirmSenha;
        do {
            System.out.print("Nova senha: ");
            senha = scanner.nextLine();

            System.out.print("Confirme a senha: ");
            confirmSenha = scanner.nextLine();

            if (!senha.equals(confirmSenha)) {
                System.out.println("Error: senha e confirmação de senha não coincidem");
            }

        } while (!senha.equals(confirmSenha));

        System.out.println("Cofre criado!");
        return new Cofre(senha);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}