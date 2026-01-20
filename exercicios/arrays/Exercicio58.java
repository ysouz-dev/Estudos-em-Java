/* Objetivo: Coletar informações básicas de 3 usuários, como nome, idade e e-mail.
Desafio:
- Solicite o nome do usuário e valide se é um nome válido.
- Solicite a idade e valide se é um número inteiro positivo e maior que 0.
- Solicite o e-mail e valide se contém o caractere @. 
- Guarda todas informações e mostre os cadastros na saída*/

package exercicios.arrays;

import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] listaDeNomes = new String[3];
        int[] listaDeIdades = new int[3];
        String[] listaDeEmails = new String[3];

        System.out.println("---------------------");
        System.out.println(" Sistema de cadastro");
        System.out.println("---------------------");

        for (int i = 0; i < 3; i++) {
            System.out.printf("-------- %d° CADASTRO --------%n", i+1);
            
            // lê e valida se o nome só possui caracteres alfabéticos
            while (true) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                nome = nome.strip();
                
                boolean eNome = true;
                for (int n = 0; n < nome.replace(" ", "").length(); n++) {
                    if (!Character.isLetter(nome.replace(" ", "").charAt(n))) {
                        eNome = false;
                        break;
                    }
                }

                if (eNome) {
                    listaDeNomes[i] = nome;
                    break;
                } else {
                    System.out.println("Error: Digite um nome válido!");
                }
            }

            // lê e valida a idade da pessoa
            int idade;
            do {
                System.out.print("Idade: ");
                idade = scanner.nextInt();
                scanner.nextLine();

                if (idade > 0) {
                    listaDeIdades[i] = idade;
                } else {
                    System.out.println("Error: A idade precisa ser maior que 0.");
                }

            } while (idade <= 0);

            // lê e valida se o email é um email permitido
            boolean emailValido = false;
            String[] emailsPermitidos = {"@gmail.com", "@hotmail.com", "@outlook.com", "@yahoo.com"};

            do {
                System.out.print("Email: ");
                String email = scanner.nextLine();

                for (String mail : emailsPermitidos) {
                    if (email.endsWith(mail)) {
                        emailValido = true;
                        break;
                    }
                }

                if (!emailValido) {
                    System.out.println("Error: Digite um email válido! (exemplo@gmail.com)");
                } else {
                    System.out.println("-=-=-=-=-=-=-=-=-=");
                    System.out.println("Usuário cadastrado com sucesso!");
                    System.out.println("----------------------------------");
                    listaDeEmails[i] = email;
                }
            } while (!emailValido);
        }
        
        // saida
        System.out.println("---------- Lista de cadastros ----------");
        for (int i = 0; i < listaDeNomes.length; i++) {
            System.out.printf("%d - Nome: %s  %nIdade: %d %nEmail: %s%n",
                            i+1, listaDeNomes[i], listaDeIdades[i], listaDeEmails[i]);
            System.out.println("---------------------------------------");
        }
        scanner.close();
    }
}