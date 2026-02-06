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

        Cofre cf = new Cofre(senha);
        System.out.println("Cofre criado!");
        return cf;
    }

    public static void tentarAbrirCofre(Scanner scanner, Cofre cofrinho) {
        String senha;
        int contador = 3;
        do {
            System.out.print("Senha para abrir: ");
            senha = scanner.nextLine();
            if (!cofrinho.abrirCofre(senha)) {
                contador--;
                if (contador == 0) {
                    System.out.println("Excesso de tentativas, tente novamente mais tarde.");
                    break;
                }
                System.out.println("senha incorreta");
                System.out.printf("%d tentativa(s). %n", contador);
                
            }
        } while (!cofrinho.abrirCofre(senha));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofre cofrinho = criarCofre(scanner);
        System.out.println("cofre aberto = " + cofrinho.getAberto());
        tentarAbrirCofre(scanner, cofrinho);
        System.out.println("cofre aberto = " + cofrinho.getAberto());
        scanner.close();
    }
}