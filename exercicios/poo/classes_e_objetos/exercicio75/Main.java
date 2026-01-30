/* Crie uma classe que represente um produto. Ela deve ter:
- nome
- preço
- quantidade em estoque
Crie métodos para:
- mostrar os dados do produto
- calcular o valor total em estoque (preço × quantidade) */

package exercicios.poo.classes_e_objetos.exercicio75;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "Teclado";
        produto1.preco = 39.90;
        produto1.estoque = 10;

        produto2.nome = "Mouse";
        produto2.preco = 10.0;
        produto2.estoque = 10;
    }
}