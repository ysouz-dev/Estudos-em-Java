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

    public void mostraResumoEvento() {
        System.out.println("----- Resumo Evento -----");
        System.out.println("Nome do evento: " + this.nomeEvento);
        System.out.println("Vagas disponíveis: " + this.totalVagas);
        System.out.println("Inscritos ativos: " + getInscritosAtivos());
        System.out.println("Pagamentos confirmados: " + getPagamentosConfirmados());
    }

    public void confirmarPagamento(String email) {
        for (int i = 0; i < this.listaDeInscricoes.length; i++) {
            if (this.listaDeInscricoes[i].getEmail().equals(formataNome(email))) {
                this.listaDeInscricoes[i].confirmarPagamento();
            }
        }
    }

    public void cancelarInscricao(String email) {
        for (int i = 0; i < this.listaDeInscricoes.length; i++) {
            if (this.listaDeInscricoes[i].getEmail().equals(formataNome(email))) {
                this.listaDeInscricoes[i].cancelarInscricao();
                this.totalVagas++;
                return;
            }
        }
        System.out.println("Email não encontrado!");
    }

    public int getVagasDisponiveis() {
        return this.totalVagas;
    }

    public int getInscritosAtivos() {
        int contador = 0;
        for (Inscricao inscritos : this.listaDeInscricoes) {
            if (inscritos.getAtiva()) {
                contador++;
            }
        }
        return contador;
    }

    public int getPagamentosConfirmados() {
        int contador = 0;
        for (Inscricao inscritos : this.listaDeInscricoes) {
            if (inscritos.getPagamento()) {
                contador++;
            }
        }
        return contador;
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
        for (int i = 0; i < this.listaDeInscricoes.length; i++) {
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
