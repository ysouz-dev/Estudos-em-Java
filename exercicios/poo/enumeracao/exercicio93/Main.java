/* Crie um sistema de Rank de Jogador
Rank:
- BRONZE (0–999)
- PRATA (1000–1999)
- OURO (2000–2999)
- PLATINA (3000+)
Jogador:
- Pontuação
- Método adicionarPontos()
- Rank muda automaticamente */

package exercicios.poo.enumeracao.exercicio93;

public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Yago");
        j1.resumo();
        System.out.println("---");

        j1.adicionarPontos(1000);
        j1.resumo();
        System.out.println("---");

        j1.adicionarPontos(1000);
        j1.resumo();
        System.out.println("---");

        j1.adicionarPontos(1000);
        j1.resumo();

        // testa adicionar pontos negativos
        j1.adicionarPontos(-1);
    }
}
