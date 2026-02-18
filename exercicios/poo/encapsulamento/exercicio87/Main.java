package exercicios.poo.encapsulamento.exercicio87;

public class Main {
    public static void main(String[] args) {
        SistemaVotacao votacao = new SistemaVotacao();
        votacao.iniciarVotacao();
        votacao.cadastrarVoto("yago", 2);
        votacao.cadastrarVoto("maria", 2);
        votacao.cadastrarVoto("jose", 1);
        votacao.cadastrarVoto("gustavo", 1);
        votacao.cadastrarVoto("mendes", 2);
        votacao.cadastrarVoto("matheus", 1);
        votacao.encerrarVotacao();
        votacao.verStatusVotacao();
        System.out.println(votacao.decidirVencedor());

        // testa votar apos votacao encerrada
        votacao.cadastrarVoto("joao", 2);
    }
}