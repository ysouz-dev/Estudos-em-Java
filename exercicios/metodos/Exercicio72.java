/*objetivo: 
 Usando arrays paralelos, crie um método que exiba apenas as pessoas maiores de idade. */

package exercicios.metodos;

import java.util.Scanner;

public class Exercicio72 {

    public static boolean validaIdade(int idade) {
        if (idade > 0) return true;
        return false;
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

    public static int[] adicionaIdade(int[] arrayIdade, int novaIdade) {
        int[] novasIdades = new int[arrayIdade.length + 1];
        for (int i = 0; i < arrayIdade.length; i++) {
            novasIdades[i] = arrayIdade[i];
        }
        novasIdades[arrayIdade.length] = novaIdade;
        return novasIdades;
    }

    public static String[] adicionaNome(String[] arrayNome, String novoNome) {
        String[] novosNomes = new String[arrayNome.length + 1];
        for (int i = 0; i < arrayNome.length; i++) {
            novosNomes[i] = arrayNome[i];
        }
        novosNomes[arrayNome.length] = novoNome;
        return novosNomes;
    }

    public static boolean validaResposta(String reposta) {
        String[] permitidos = {"S", "N"};
        for (String permi : permitidos) {
            if (reposta.toUpperCase().equals(permi)) {
                return true;
            }
        }
        return false;
    }

    public static void mostrarMaiores(String[] arrayNomes, int[] arrayIdades) {
        for (int i = 0; i < arrayNomes.length; i++) {
            if (arrayIdades[i] >= 18) {
                System.out.printf("Nome: %s %nIdade: %d anos %n", arrayNomes[i], arrayIdades[i]);
                System.out.println("-----------------------------");
            }
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
                    System.out.println("Error: O nome só pode conter caracteres alfabéticos.");
                }
            } while (!validaNome(nome));

            int idade;
            do {
                System.out.print("Digite a idade: ");
                idade = scanner.nextInt();
                scanner.nextLine();
                if (!validaIdade(idade)) {
                    System.out.println("Error: a idade precisa ser maior que 0.");
                }
            } while (!validaIdade(idade));

            listaDeNomes = adicionaNome(listaDeNomes, nome);
            listaDeIdades = adicionaIdade(listaDeIdades, idade);

            do {
                System.out.print("Deseja cadastrar mais alguem (S/N) ? ");
                resposta = scanner.nextLine().strip().toUpperCase();
                if (!validaResposta(resposta)) {
                    System.out.println("Error: Digite somente S ou N.");
                }
            } while (!validaResposta(resposta));
        }

        System.out.println("----------------Maiores de Idade------------------");
        mostrarMaiores(listaDeNomes, listaDeIdades);
        scanner.close();
    }
}