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
            
            System.out.println("=========================");
            do {
                System.out.printf("Digite o nome do %d° funcionário: ", i+1);
                funcionario.nome = scanner.nextLine().strip().toUpperCase();
                
                if (funcionario.nome.isEmpty()) {
                    System.out.println("Error: o nome não pode estar vazio.");
                } else if (!funcionario.validaNomeFuncionario()) {
                    System.out.println("Error: o nome só pode conter caracters alfabéticos.");
                }
            } while (!funcionario.validaNomeFuncionario());

            do {
                System.out.printf("Digite o salário de %s: R$ ", funcionario.nome);
                funcionario.salario = scanner.nextDouble();
                scanner.nextLine();

                if (!funcionario.validaSalario()) {
                    System.out.println("Error: o salário não pode ser negativo.");
                }
            } while (!funcionario.validaSalario());
            funcionarios[i] = funcionario;
            System.out.println("=========================");
        }
        return funcionarios;
    }

    public static int defineAumento(Scanner scanner) {
        int aumento;
        do {
            System.out.print("Quantos % de aumento: ");
            aumento = scanner.nextInt();

            if (!Funcionario.validaPercentual(aumento)) {
                System.out.println("Error: o percentual não pode ser negativo.");
            }
        } while (!Funcionario.validaPercentual(aumento));
        return aumento;
    }

    public static void listarFuncionarios(Funcionario[] lista) {
        for (Funcionario func : lista) {
            func.mostrarDados();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario[] listaDeFuncionarios = cadastraFuncionarios(scanner);
        
        for (Funcionario func : listaDeFuncionarios) {
            func.mostrarDados();
            func.aumentarSalario(defineAumento(scanner));
        }

        System.out.println("======= Lista de funcionários =======");
        listarFuncionarios(listaDeFuncionarios);
        scanner.close();
    }
}