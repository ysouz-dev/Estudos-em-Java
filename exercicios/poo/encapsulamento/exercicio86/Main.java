package exercicios.poo.encapsulamento.exercicio86;

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento("Confraternização", 2);
        evento1.realizarInscricao("yago", "teste@gmail.com");
        evento1.realizarInscricao("beto", "teste2@gmail.com");
        evento1.mostraResumoEvento();
        System.out.println("=====================");

        evento1.confirmarPagamento("teste12@gmail.com");
        evento1.confirmarPagamento("teste@gmail.com");
        evento1.mostraResumoEvento();
        System.out.println("======================");

        evento1.cancelarInscricao("teste2@gmail.com");
        evento1.mostraResumoEvento();
        System.out.println("======================");

        evento1.realizarInscricao("thiago", "teste3@gmail.com");
        evento1.listarInscritosAtivos();

        // teste de cadastro com limite atingido
        evento1.realizarInscricao("arthur", "teste4@gmail.com");
    }
}