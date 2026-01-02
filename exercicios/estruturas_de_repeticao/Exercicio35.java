/* Mostre todos os números de 1 a 100 que:
são divisiveis por 3
mas não por 5 */

package exercicios.estruturas_de_repeticao;

public class Exercicio35 {
    public static void main(String[] args) {
        System.out.println("===============================");
        for (int i=1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.printf("%d > ", i);
            }
        }
        System.out.print("Fim");
        System.out.println("\n===============================");
    }
}