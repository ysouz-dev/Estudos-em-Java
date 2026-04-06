/* Crie:
- Uma classe base Pessoa
- Classes derivadas Aluno e Professor
- Um enum StatusAluno para representar a situação acadêmica
Regras:
- Alunos podem mudar de status (ativo, trancado, formado)
- Professores possuem comportamentos específicos (como ministrar aula)
- O sistema deve armazenar diferentes tipos de pessoas em uma lista única */

package exercicios.poo.heranca.exercicio99;

import java.util.ArrayList;
import java.math.BigDecimal;

import exercicios.poo.heranca.exercicio99.Professor.Disciplina;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Yago", 23);
        Aluno aluno2 = new Aluno("Joao", 24);
        Professor professor1 = new Professor("vanessa", 40, Disciplina.MATEMATICA, new BigDecimal("3000"));
        Professor professor2 = new Professor("Orioli", 35, Disciplina.HISTORIA, new BigDecimal("2810"));

        ArrayList<Pessoa> listaGeral = new ArrayList<Pessoa>();
        listaGeral.add(aluno1);
        listaGeral.add(aluno2);
        listaGeral.add(professor1);
        listaGeral.add(professor2);

        // mostra resumo da lista
        for (Pessoa pessoa : listaGeral) {
            pessoa.resumo();
            System.out.println("---------------");
        }

        // forma os dois alunos e coloca os dois professores para dar aula
        for (Pessoa pessoa : listaGeral) {
            if (pessoa.getClass().getSimpleName().equals("Aluno")) {
                ((Aluno) pessoa).formar();
            } else {
                ((Professor) pessoa).iniciarAula();
            }
        }

        // aumenta R$ 300 do salário dos professores
        for (Pessoa pessoa : listaGeral) {
            if (pessoa.getClass().getSimpleName().equals("Professor")) {
                ((Professor) pessoa).aumentarSalario(new BigDecimal("300"));
            }
        }

        // faz aniversario de todos da lista
        for (Pessoa pessoa : listaGeral) {
            pessoa.fazerAniversario();
        }

        // mostra resumo de todos novamente
        for (Pessoa pessoa : listaGeral) {
            pessoa.resumo();
            System.out.println("=====================");
        }

        // testa trancar a matricula de um aluno formado
        ((Aluno) listaGeral.get(0)).trancarMatricula();
    }
}
