/* Crie uma classe Produto com:
- nome
- preço
- estoque
Regras:
- nome não pode ser vazio
- preço deve ser maior que zero
- estoque não pode ser negativo
Exigências:
- construtor obrigatório
- getters para todos os atributos
- setters com validação
- método que calcula o valor total em estoque */

package exercicios.poo.encapsulamento.exercicio79;

import java.util.Scanner;

public class Main {

    public static Produto cadastraProduto(Scanner scanner) {
        Produto produto = new Produto();
        
        String nome;
        do {
            System.out.print("Nome do produto: ");
            nome = scanner.nextLine().strip().toUpperCase();
        } while (!produto.setNome(nome));

        double preco;
        do {
            System.out.print("Preço do produto R$: ");
            preco = scanner.nextDouble();
        } while (!produto.setPreco(preco));

        int estoque;
        do {
            System.out.print("Quantidade em estoque: ");
            estoque = scanner.nextInt();
            scanner.nextLine();
        } while (!produto.setEstoque(estoque));

        return produto;
    }

    public static void listarProdutos(Produto[] lista) {
        for (Produto prod : lista) {
            prod.mostraInfo();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto[] listaDeProdutos = new Produto[3];
        for (int i = 0; i < listaDeProdutos.length; i++) {
            listaDeProdutos[i] = cadastraProduto(scanner);
            System.out.println("==============================");
            System.out.printf("%s cadastrado com sucesso!%n", listaDeProdutos[i].getNome());
            System.out.println("==============================");
        }
        System.out.println("======== Produtos cadastrados ========");
        listarProdutos(listaDeProdutos);
        scanner.close();
    } 
}