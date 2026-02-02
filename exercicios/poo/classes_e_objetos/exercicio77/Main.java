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
            do {
                System.out.printf("Digite o nome do %d° aluno: ", i+1);
                aluno.nome = scanner.nextLine();

                if (!aluno.validaNomeAluno()) {
                    System.out.println("Error: o nome do aluno deve conter apenas caracteres alfabéticos.");
                }
            } while (!aluno.validaNomeAluno());
            
            do {
                System.out.printf("Digite a 1° nota de %s: ", aluno.nome);
                aluno.nota1 = scanner.nextDouble();
                
                if (!Aluno.validaNota(aluno.nota1)) {
                    System.out.println("Error: as notas devem estar entre 0 e 10.0 pontos.");
                }
            } while (!Aluno.validaNota(aluno.nota1));

            do {
                System.out.printf("Digite a 2° nota de %s: ", aluno.nome);
                aluno.nota2 = scanner.nextDouble();
                scanner.nextLine();
                
                if (!Aluno.validaNota(aluno.nota2)) {
                    System.out.println("Error: as notas devem estar entre 0 e 10.0 pontos.");
                }
            } while (!Aluno.validaNota(aluno.nota2));

            alunos[i] = aluno;
            System.out.println("=============================");
        }
        return alunos;
    }

    public static void relatorioAlunos(Aluno[] listaDeAlunos) {
        for (Aluno al : listaDeAlunos) {
            System.out.println("=========================");
            System.out.printf("Nome: %s %n1°Nota: %.1f pts%n2°Nota: %.1f pts%nMédia: %.1f pts%n",
                            al.nome, al.nota1, al.nota2, al.calcularMedia());
                            al.situacao();
            System.out.println("=========================");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    }
}