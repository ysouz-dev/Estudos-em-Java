package exercicios.poo.heranca.exercicio97;

public class Mago extends Personagem {
    private int ataqueMagico;
    private boolean mana;

    public Mago(String nome) {
        super(nome);
        this.ataqueMagico = 12;
        this.mana = true;
    }

    @Override
    public void atacar(Personagem personagem) {
        if (!this.mana) {
            throw new IllegalStateException("O mago precisa recuperar mana para atacar.");
        }
        super.atacar(personagem);
        personagem.reduzirVida(this.ataqueMagico);
        this.mana = false;
    }

    @Override
    public void status() {
        super.status();
        System.out.println("Ataque mágico: " + this.ataqueMagico);
    }

    public void recuperarMana() {
        if (this.mana) {
            throw new IllegalStateException("O mago já possui mana!");
        }
        this.mana = true;
    }
}
