/* Crie dois arrays paralelos: um para nomes e outro para idades.
Preencha e exiba os dados. */

package exercicios.metodos;

import java.util.Scanner;

public class Exercicio71 {

    public static boolean validaNome(String nome) {
        String nomeSemEspaco = nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean validaIdade(int idade) {
        if (idade <= 0 ) {
            return false;
        }
        return true;
    }

    public static int[] adicionaIdade(int[] arrayInteira, int idade) {
        int[] novasIdades = new int[arrayInteira.length + 1];
        for (int i = 0; i < arrayInteira.length; i++) {
            novasIdades[i] = arrayInteira[i];
        }
        novasIdades[arrayInteira.length] = idade;
        return novasIdades;
    }

    public static String[] adicionaNome(String[] arrayString, String nome) {
        String[] novosNomes = new String[arrayString.length + 1];
        for (int i = 0; i < arrayString.length; i++) {
            novosNomes[i] = arrayString[i];
        }
        novosNomes[arrayString.length] = nome;
        return novosNomes;
    }

    public static boolean validaResposta(String reposta) {
        String[] permitidos = {"S", "N"};
        for (String perm : permitidos) {
            if (reposta.toUpperCase().equals(perm)) {
                return true;
            }
        }
        return false;
    }

    public static void relatorio(int[] idades, String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("%d. %nNome: %s %nIdade: %d%n", i+1, nomes[i], idades[i]);
            System.out.println("---------------------------------");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] listaDeIdades = new int[0];
        String[] listaDeNomes = new String[0];

        String resposta = "S";
        while (resposta.equals("S")) {
            String nome;
            do {
                System.out.print("Digite seu nome: ");
                nome = scanner.nextLine().strip();

                if (!validaNome(nome)) {
                    System.out.println("Error: o nome só pode conter caracteres alfabéticos.");
                }

            } while (!validaNome(nome));
            
            int idade = 0;
            while (!validaIdade(idade)) {
                System.out.print("Digite sua idade: ");
                idade = scanner.nextInt();
                scanner.nextLine();

                if (!validaIdade(idade)) {
                    System.out.println("Error: A idade deve ser acima de 0.");
                }
            }

            listaDeIdades = adicionaIdade(listaDeIdades, idade);
            listaDeNomes = adicionaNome(listaDeNomes, nome);

            do {
                System.out.print("Deseja cadastrar mais um (S/N)? ");
                resposta = scanner.nextLine().toUpperCase();
                if (!validaResposta(resposta)) {
                    System.out.println("Error: A resposta deve ser somente S ou N.");
                }
            } while (!validaResposta(resposta));
        }
        System.out.println("-----------------Nomes Cadastrados----------------");
        relatorio(listaDeIdades, listaDeNomes);
        scanner.close();
    }
}