import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Jogador> jogadores;
    private int pontos;
    private int golsMarcados;
    private int golsSofridos;

    // Construtor
    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
        this.pontos = 0;
        this.golsMarcados = 0;
        this.golsSofridos = 0;
    }

    // Método para adicionar jogadores
    public void adicionarJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    // Método que registra o resultado (usado pela Partida)
    public void registrarPartida(int golsFeitos, int golsSofridos) {
        this.golsMarcados += golsFeitos;
        this.golsSofridos += golsSofridos;

        if (golsFeitos > golsSofridos) {
            this.pontos += 3; // Vitória
        } else if (golsFeitos == golsSofridos) {
            this.pontos += 1; // Empate
        }
        // Derrota não soma pontos
    }

    // Método para buscar o nome (usado pela Partida)
    public String getNome() {
        return nome;
    }

    // Método para buscar a lista de jogadores (usado pela Partida)
    public List<Jogador> getJogadores() {
        return jogadores;
    }

    // Método para mostrar o relatório no final
    public void exibirRelatorio() {
        System.out.println("--- Relatório do Time: " + nome + " ---");
        System.out.println("Pontos: " + pontos);
        System.out.println("Gols Marcados: " + golsMarcados);
        System.out.println("Gols Sofridos: " + golsSofridos);
        System.out.println("Saldo de Gols: " + (golsMarcados - golsSofridos));
        System.out.println("------------------------------------");
    }
}