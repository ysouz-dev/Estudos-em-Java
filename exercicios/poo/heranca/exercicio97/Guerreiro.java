package exercicios.poo.heranca.exercicio97;

public class Guerreiro extends Personagem {
    private int ataqueForte;
    private boolean estamina;

    public Guerreiro(String nome) {
        super(nome);
        this.ataqueForte = 15;
        this.estamina = true;
    }

    @Override
    public void atacar(Personagem personagem) {
        if (!this.estamina) {
            throw new IllegalStateException("O guerreiro precisa recuperar estamina para atacar.");
        }
        super.atacar(personagem);
        personagem.reduzirVida(this.ataqueForte);
        this.estamina = false;
    }

    @Override
    public void status() {
        super.status();
        System.out.println("Ataque forte: " + this.ataqueForte);
    }

    public void recuperarEstamina() {
        if (this.estamina) {
            throw new IllegalStateException("O guerreiro já possui estamina!");
        }
        this.estamina = true;
    }
}
