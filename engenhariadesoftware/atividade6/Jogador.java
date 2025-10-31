public class Jogador {
    private String nome;
    private String posicao;
    private int numeroCamisa;

    public Jogador(String nome, String posicao, int numeroCamisa) {
        this.nome = nome;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nº " + numeroCamisa + " - " + nome + " (" + posicao + ")";
    }
}