package exercicios.poo.encapsulamento.exercicio84;

public class ContaBancaria implements Conta {
    final private static int RECEM_CRIADA = 0;
    final private static int ATIVA = 1;
    final private static int BLOQUEADA = 2;

    private String nome;
    private double saldo;
    private int status;

    public ContaBancaria(String nome) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        this.nome = formataNome(nome);
        this.saldo = 0;
        this.status = RECEM_CRIADA;
    }

    public void mostrarInfo() {
        System.out.println("------- Informações -------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Saldo: R$ %.2f".formatted(this.saldo));
        String status = "CRIADA";
        if (this.status == ATIVA) status = "ATIVA";
        if (this.status == BLOQUEADA) status = "BLOQUEADA";      
        System.out.println("Status: " + status);
    }

    private static boolean validaNome(String nome) {
        String nomeSemEspaco = formataNome(nome).replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean verificaStatus() {
        if (this.status == RECEM_CRIADA || this.status == BLOQUEADA) {
            return false;
        }
        return true;
    }

    public static boolean validaValor(double valor) {
        return valor >= 0;
    }

    private static String formataNome(String nome) {
        return nome.strip().toUpperCase();
    }

    @Override
    public void ativar() {
        this.status = ATIVA;
    }

    @Override
    public void bloquear() {
        if (this.saldo != 0) {
            throw new IllegalArgumentException("Conta ainda com saldo para ser bloqueada.");
        }
        this.status = BLOQUEADA;
    }

    @Override
    public void depositar(double valor) {
        if (!validaValor(valor)) {
            throw new IllegalArgumentException("Valor de deposito inválido");
        }
        
        if (!verificaStatus()) {
            String erro = "Sua conta está BLOQUEADA! você não pode fazer mais movimentações.";
            if (this.status == RECEM_CRIADA) erro = "Sua conta foi RECÉM CRIADA, ative ela antes de movimentar.";
            throw new IllegalStateException(erro);
        }

        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (!validaValor(valor) || valor > this.saldo) {
            String erro = "Valor de saque inválido!";
            if (valor > this.saldo) erro = "Saldo insuficiente para esse saque.";
            throw new IllegalArgumentException(erro);
        }

        if (!verificaStatus()) {
            String erro = "Sua conta está BLOQUEADA! você não pode fazer mais movimentações.";
            if (this.status == RECEM_CRIADA) erro = "Sua conta foi RECÉM CRIADA, ative ela antes de movimentar.";
            throw new IllegalStateException(erro);
        }

        this.saldo -= valor;
    }
}
