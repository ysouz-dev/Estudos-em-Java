/* Crie uma classe Aluno com: 
Atributos privados:
- nome
- nota1
- nota2
Regras:
- nome válido (não vazio, só letras, mínimo 3 caracteres)
- notas entre 0 e 10
Métodos:
- construtor obrigando a passar nome, nota1 e nota2
- getters e setters com validação
- método calcularMedia() → retorna a média
- método situacao() → retorna “APROVADO” se média ≥7, caso contrário “REPROVADO”
Extra:
- no main, crie um array de 3 alunos
- peça os dados ao usuário usando Scanner
- depois mostre nome, notas, média e situação de cada aluno*/

package exercicios.poo.encapsulamento.exercicio81;

import java.util.Scanner;

public class Main {

    public static Aluno cadastrarAluno(Scanner scanner) {
        System.out.println("====== Cadastro ======");
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("1° nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("2° nota: ");
        double nota2 = scanner.nextDouble();
        scanner.nextLine();

        return new Aluno(nome, nota1, nota2);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Aluno[] listaDeAlunos = new Aluno[3];
        for (int i = 0; i < listaDeAlunos.length; i++) {
            System.out.printf("========= %d° =========%n", i + 1);
            listaDeAlunos[i] = cadastrarAluno(scanner);
            System.out.println("Aluno cadastrado!");
        }
        System.out.println("====== Boletim Escolar ======");
        for (Aluno al : listaDeAlunos) {
            al.mostrarDados();
            System.out.println("================");
        }
        scanner.close();
    }
}