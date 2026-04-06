/* Crie:
- Uma classe base Personagem
- Classes derivadas como Guerreiro, Mago e Arqueiro
- Cada personagem deve implementar seu próprio comportamento de ataque.
O sistema deve:
- Armazenar os personagens em uma lista (ArrayList)
- Fazer todos os personagens executarem um ataque */

package exercicios.poo.heranca.exercicio97;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Arqueiro ashe = new Arqueiro("Ashe");
        Guerreiro darius = new Guerreiro("Darius");
        Mago ryze = new Mago("ryze");

        ArrayList<Personagem> listaPersonagens = new ArrayList<Personagem>();
        listaPersonagens.add(ashe);
        listaPersonagens.add(darius);
        listaPersonagens.add(ryze);

        for (Personagem personagem : listaPersonagens) {
            personagem.status();
            System.out.println("--------------------------------");
        }

        listaPersonagens.get(0).atacar(listaPersonagens.get(1));
        System.out.println(listaPersonagens.get(0).getNome() + " atacou " + listaPersonagens.get(1).getNome());
        System.out.println("--------------------------------");

        listaPersonagens.get(1).atacar(listaPersonagens.get(2));
        System.out.println(listaPersonagens.get(1).getNome() + " atacou " + listaPersonagens.get(2).getNome());
        System.out.println("--------------------------------");

        listaPersonagens.get(2).atacar(listaPersonagens.get(0));
        System.out.println(listaPersonagens.get(2).getNome() + " atacou " + listaPersonagens.get(0).getNome());
        System.out.println("--------------------------------");

        for (Personagem personagem : listaPersonagens) {
            personagem.status();
            System.out.println("--------------------------------");
        }

        // testa o guerreiro atacar sem estamina
        listaPersonagens.get(1).atacar(ryze);
    }
}
