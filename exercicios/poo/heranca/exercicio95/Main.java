/* Crie uma estrutura onde:
- Existe uma classe base Funcionario
- Existem subclasses como Gerente e Desenvolvedor
- Cada tipo de funcionário calcula seu salário de forma diferente
Implemente um programa que:
- Armazene funcionários em uma lista (ArrayList)
- Percorra a lista e exiba o salário final de cada funcionário */

package exercicios.poo.heranca.exercicio95;

import java.util.ArrayList;

public class Main {
    public static void listarFuncionarios(ArrayList<Funcionario> lista) {
        int contador = 1;
        for (Funcionario funcionario : lista) {
            System.out.println("-----------------------------------");
            System.out.println("N. " + contador);
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Cargo: " + funcionario.getClass().getSimpleName());
            System.out.println("-----------------------------------");
            contador++;
        }
    }

    public static void main(String[] args) {

    }
}
