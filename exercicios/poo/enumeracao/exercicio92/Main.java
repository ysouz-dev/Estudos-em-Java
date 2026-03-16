/* Crie um Sistema de matricula com:
- Classe: Aluno
- Classe: Matricula 
Status da matricula:
- ATIVA
- TRANCADA
- CANCELADA
- CONCLUIDA
Regras:
- Não pode concluir se estiver cancelada
- Não pode trancar se já estiver concluída
- Só pode cancelar se estiver ativa ou trancada
- Deve validar transições */

package exercicios.poo.enumeracao.exercicio92;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Yago", 23);
        Aluno aluno2 = new Aluno("Lara", 20);

        aluno1.trancarMatricula();
        aluno2.cancelarMatricula();
        aluno1.resumo();
        System.out.println("-------------------");
        aluno2.resumo();
        System.out.println("-------------------");

        aluno1.concluirMatricula();
        aluno1.resumo();

        // testa ativar assinatura do aluno 2 que ja esta cancelada
        aluno2.ativarMatricula();
    }
}
