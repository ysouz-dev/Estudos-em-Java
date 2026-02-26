package exercicios.poo.enumeracao.exercicio88;

import java.util.ArrayList;

public class Pedido {
    public enum Status {
        PENDENTE(0),
        EM_PREPARO(1),
        SAIU_PARA_ENTREGA(2),
        ENTREGUE(3);

        private int codigo;

        Status(int codigo) {
            this.codigo = codigo;
        }

        public int getCodigo() {
            return this.codigo;
        }

        public void setCodigo(int novoCodigo) {
            this.codigo = novoCodigo;
        }
    }

    private String nome;
    private ArrayList<String> listaItens;
    private Status status;

    public Pedido(String nome) {
        if (!validaNome(nome)) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        this.nome = nome.strip().toUpperCase();
        this.listaItens = new ArrayList<String>();
        this.status = Status.PENDENTE;
    }

    public void adicionarItem(String item) {
        if (this.status == Status.SAIU_PARA_ENTREGA || this.status == Status.ENTREGUE) {
            String erro = "Não é possivel adicionar item com o pedido a caminho.";
            if (this.status == Status.ENTREGUE) {
                erro = "Não é possivel adicionar item, o pedido já foi entregue.";
            }
            throw new IllegalStateException(erro);
        }

        if (!validaNomeItem(item)) {
            throw new IllegalArgumentException("Nome do item inválido!");
        }

        this.listaItens.add(item);
    }

    public void avancarComPedido() {
        if (this.status == Status.ENTREGUE) {
            throw new IllegalStateException("Não é possivel avançar com o pedido, pois ele já foi entregue.");
        }
        this.status.setCodigo(this.status.getCodigo() + 1);
        for (Status status : Status.values()) {
            if (this.status.getCodigo() == status.getCodigo()) {
                this.status = status;
            }
        }
    }

    public void mostrarResumo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Itens: ");
        for (String item : this.listaItens) {
            System.out.println("- " + item);
        }
        System.out.println("Status do pedido: " + this.status);
    }

    private static boolean validaNomeItem(String item) {
        if (item == null || item.strip().isEmpty() || item.length() < 3) {
            return false;
        }
        return true;
    }

    private static boolean validaNome(String nome) {
        if (nome == null || nome.strip().isEmpty() || nome.length() < 3) {
            return false;
        }
        String nomeSemEspaco = nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
