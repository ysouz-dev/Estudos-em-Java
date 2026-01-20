/* Objetivo: 
- Coletar informações de produtos, como nome, preço e quantidade em estoque.
Desafio:
- Pergunte quantos produtos serão registrados.
- Para cada produto, solicite o nome (não vazio), o preço (número decimal positivo) e a quantidade em estoque (número inteiro não negativo).
- Armazene essas informações em arrays separadas.
- Ao final, apresente uma lista de todos os produtos, mostrando o nome, o preço e a quantidade em estoque. */

package exercicios.arrays;

import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lê e valida a quantidade de produtos cadastrados
        int quantidade;
        do {
            System.out.print("Digite quantos produtos deseja cadastrar: ");
            quantidade = scanner.nextInt();
            scanner.nextLine();
            if (quantidade < 1) {
                System.out.println("Error: A quantidade de produtos deve ser maior que 0.");
            }
        } while (quantidade < 1);

        // inicializa arrays
        String[] nomeProduto = new String[quantidade];
        double[] precoProduto = new double[quantidade];
        int[] estoqueProduto = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("---------------%d° PRODUTO-------------%n", i+1);
            // lê e valida se o nome do produto não vai ficar vazio
            String nome;
            do {
                System.out.print("Nome do produto: ");
                nome = scanner.nextLine().strip();
                if (nome.equals("")) {
                    System.out.println("Error: o Nome não pode estar vazio.");
                } else {
                    nomeProduto[i] = nome;
                }
            } while (nome.equals(""));
            
            // lê e valida o preço do produto
            double preco;
            do {
                System.out.print("Preço do produto R$: ");
                preco = scanner.nextDouble();
                if (preco <= 0) {
                    System.out.println("Error: o preço do produto deve ser maior que R$ 0,00.");
                } else {
                    precoProduto[i] = preco;
                }
            } while (preco <= 0);

            // lê e valida a quantidade de estoque
            int estoque;
            do {
                System.out.print("Quantidade em estoque: ");
                estoque = scanner.nextInt();
                scanner.nextLine();
                if (estoque < 0) {
                    System.out.println("Error: O estoque deve ser um valor positivo.");
                } else {
                    estoqueProduto[i] = estoque;
                }
            } while (estoque < 0);
        }
        // saida
        System.out.println("-------------------------------");
        System.out.println("------ LISTA DE PRODUTOS ------");
        
        for (int p = 0; p < quantidade; p++) {
            System.out.printf("%d. %nNome do produto: %s %nPreço unitário: R$ %.2f %nEstoque: %d%n", 
                            p+1, nomeProduto[p], precoProduto[p], estoqueProduto[p]);
            System.out.println("-------------------------------");
        }
        scanner.close();
    }
}