package exercicios.poo.encapsulamento.exercicio86;

public class Evento {
    private String nomeEvento;
    private int totalVagas;
    private Inscricao[] listaDeInscricoes;

    public Evento(String nomeEvento, int totalVagas) {
        if (!validaNomeEvento(nomeEvento)) {
            throw new IllegalArgumentException("Nome do evento inválido!");
        }
        if (!validaVagas(totalVagas)) {
            throw new IllegalArgumentException("Número de vagas inválido!");
        }

        this.nomeEvento = formataNome(nomeEvento);
        this.totalVagas = totalVagas;
        this.listaDeInscricoes = new Inscricao[0];
    }

    public int getVagasDisponiveis() {
        return this.totalVagas;
    }

    public void realizarInscricao(String nome, String email) {
        if (!validaVagas(totalVagas)) {
            throw new IllegalStateException("Número máximo de vagas atingido!");
        }
        Inscricao inscricao = new Inscricao(nome, email);
        adicionarInscricao(inscricao);
    }

    private void adicionarInscricao(Inscricao inscricao) {
        Inscricao[] arrayTemporaria = new Inscricao[this.listaDeInscricoes.length + 1];
        for (int i = 0; i < arrayTemporaria.length; i++) {
            arrayTemporaria[i] = this.listaDeInscricoes[i];
        }
        arrayTemporaria[listaDeInscricoes.length] = inscricao;
        this.listaDeInscricoes = arrayTemporaria;
        this.totalVagas--;
    }

    private static boolean validaVagas(int vagas) {
        return vagas > 0;
    }

    private static boolean validaNomeEvento(String nomeEvento) {
        if (formataNome(nomeEvento).isEmpty() || formataNome(nomeEvento).length() < 3) {
            return false;
        }
        return true;
    }

    private static String formataNome(String nomeEvento) {
        return nomeEvento.strip().toUpperCase();
    }
}
