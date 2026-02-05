package exercicios.poo.encapsulamento.exercicio81;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        if (!validaNome(nome)) throw new IllegalArgumentException("Nome informado inválido! (permitido somente caracteres)");
        if (!validaNota(nota1) || !validaNota(nota2)) throw new IllegalArgumentException("Nota informada inválida (fora do intervalo 0 a 10)!");

        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setNome(String novoNome) {
        if (!validaNome(novoNome)) return false;
        
        this.nome = novoNome;
        return true;
    }

    public double getNota1() {
        return this.nota1;
    }

    public boolean setNota1(double novaNota) {
        if (!validaNota(novaNota)) return false;
        
        this.nota1 = novaNota;
        return true;
    }

    public double getNota2() {
        return this.nota2;
    }

    public boolean setNota2(double novaNota) {
        if (!validaNota(novaNota)) return false;
        
        this.nota2 = novaNota;
        return true;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }

    public String situacao() {
        if (calcularMedia() >= 7)  return "APROVADO";

        return "REPROVADO";
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("1° nota: " + this.nota1);
        System.out.println("2° nota: " + this.nota2);
        System.out.println("Média: %.1f".formatted(calcularMedia()));
        System.out.println("Situação: " + situacao());
    }
    
    public static boolean validaNome(String nome) {
        if (nome.isEmpty() || nome.length() < 3) return false;
        String nomeSemEspaco = nome.replace(" ", "");
        for (int i = 0; i < nomeSemEspaco.length(); i++) {
            if (!Character.isLetter(nomeSemEspaco.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean validaNota(double nota) {
        return nota >= 0 && nota <= 10;
    }
}
