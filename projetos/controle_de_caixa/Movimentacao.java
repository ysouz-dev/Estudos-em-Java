package projetos.controle_de_caixa;

public class Movimentacao {
    private static int contadorId = 2000;

    private int id;
    private String descricao;
    private double valor;
    private String tipo;

    public Movimentacao(String descricao, double valor, String tipo) {
        if (descricao.isEmpty() || tipo.isEmpty()) {
            throw new IllegalArgumentException("Nenhum paramêtro pode estar vazio.");
        }
        
        if (!validaValor(valor)) {
            throw new IllegalArgumentException("O valor não pode ser negativo.");       
        }

        if (!validaTipo(tipo)) {
            throw new IllegalArgumentException("O tipo deve ser somente ENTRADA ou SAÍDA.");
        }

        this.id = contadorId;
        contadorId++;
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }

    public static boolean validaValor(double valor) {
        return valor >= 0;
    }

    public static boolean validaTipo(String tipo) {
        final String[] TIPOS_PERMITIDOS = {"ENTRADA", "SAIDA", "SAÍDA"};
        for (String type : TIPOS_PERMITIDOS) {
            if (tipo.strip().toUpperCase().equals(type)) {
                return true;
            }
        }
        return false;
    }
}