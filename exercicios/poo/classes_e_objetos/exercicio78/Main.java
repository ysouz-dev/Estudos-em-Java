/* Objetivo: 
- Criar uma classe Funcionario com nome e salário, aplicar aumento salarial
por percentual e exibir um relatório final com os dados atualizados. */

package exercicios.poo.classes_e_objetos.exercicio78;

import java.util.Scanner;

public class Main {

    public static Funcionario[] cadastraFuncionarios(Scanner scanner) {
        Funcionario[] funcionarios = new Funcionario[3];
        for (int i = 0; i < funcionarios.length; i++) {
            Funcionario funcionario = new Funcionario();
            
            do {
                System.out.printf("Digite o nome do %d° funcionário: ", i+1);
                funcionario.nome = scanner.nextLine();
                if (funcionario.nome.isEmpty()) {
                    System.out.println("Error: o nome não pode estar vazio.");
                } else if (!funcionario.validaNomeFuncionario()) {
                    System.out.println("Error: O nome só pode conter caracters alfabéticos.");
                }
            } while (!funcionario.validaNomeFuncionario());

            System.out.printf("Digite o salário de %s: R$ ", funcionario.nome);
            funcionario.salario = scanner.nextDouble();
            scanner.nextLine();

            funcionarios[i] = funcionario;
        }
        return funcionarios;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}