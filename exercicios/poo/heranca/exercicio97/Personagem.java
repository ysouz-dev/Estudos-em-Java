package exercicios.poo.heranca.exercicio97;

public abstract class Personagem {
    private String nome;
    private int vida;
    private int ataqueBasico;

    public Personagem(String nome) {
        validaNome(nome);

        this.nome = nome.strip().toUpperCase();
        this.vida = 100;
        this.ataqueBasico = 10;
    }

    public int getVida() {
        return this.vida;
    }

    public String getNome() {
        return this.nome;
    }

    public void atacar(Personagem personagem) {
        if (this.equals(personagem)) {
            throw new IllegalArgumentException("O personagem não pode atacar a si mesmo.");
        }

        if (personagem.getVida() <= 0) {
            System.out.println("O(A)" + personagem.getNome() + " já foi derrotado!");
            return;
        }
        reduzirVida(this.ataqueBasico);
    }

    public void reduzirVida(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa.");
        }

        this.vida -= quantidade;
    }

    private static void validaNome(String nome) {
        if (nome == null || nome.isBlank() || nome.strip().length() < 3) {
            throw new IllegalArgumentException("Nome de personagem inválido!");
        }
    }
}
