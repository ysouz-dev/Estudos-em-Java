/*Crie uma classe aluno.
Atributos:
- nome
- nota1
- nota2
Métodos:
- calcular média
- verificar se foi aprovado (média ≥ 7)
- mostrar situação
No main:
- crie 3 alunos
- mostre média e situação de cada um */

package exercicios.poo.classes_e_objetos.exercicio77;

import java.util.Scanner;

public class Main {

    public static Aluno[] cadastroAlunos(Scanner scanner) {
        Aluno[] alunos = new Aluno[3];
        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = new Aluno();
            System.out.printf("Digite o nome do %d° aluno: ", i+1);
            aluno.nome = scanner.nextLine();

            System.out.printf("Digite a %d° nota de %s: ", i+1, aluno.nome);
            aluno.nota1 = scanner.nextDouble();

            System.out.printf("Digite a %d° nota de %s: ", i+1, aluno.nome);
            aluno.nota2 = scanner.nextDouble();
            scanner.nextLine();

            alunos[i] = aluno;
            System.out.println("=============================");
        }
        return alunos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}