import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Partida {
    private Time timeCasa;
    private Time timeVisitante;

    // Variáveis que guardam o placar final
    private int golsCasa;
    private int golsVisitante;

    private boolean partidaRealizada;

    // Listas para guardar quem marcou os gols
    private List<Jogador> goleadoresCasa;
    private List<Jogador> goleadoresVisitante;

    public Partida(Time timeCasa, Time timeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.partidaRealizada = false;

        // Sempre inicialize as listas!
        this.goleadoresCasa = new ArrayList<>();
        this.goleadoresVisitante = new ArrayList<>();

        // Placar começa zerado
        this.golsCasa = 0;
        this.golsVisitante = 0;
    }

    /**
     * Este é o método de automação principal.
     * 1. Gera uma *quantidade* aleatória de gols.
     * 2. Sorteia *quais jogadores* marcaram.
     * 3. Define o placar final com base em quantos gols foram sorteados.
     */
    public void simular() {
        Random random = new Random();

        List<Jogador> jogadoresCasa = timeCasa.getJogadores();
        List<Jogador> jogadoresVisitante = timeVisitante.getJogadores();

        // PASSO 1: Gerar a QUANTIDADE de gols (0 a 4)
        // Usamos variáveis LOCAIS para controlar o loop
        int numGolsCasa = random.nextInt(5);
        int numGolsVisitante = random.nextInt(5);

        System.out.println("--- Início da Partida: " + timeCasa.getNome() + " vs " + timeVisitante.getNome() + " ---");

        // PASSO 2: Sortear os autores dos gols da CASA
        if (numGolsCasa > 0 && !jogadoresCasa.isEmpty()) {
            System.out.println("\nGols do " + timeCasa.getNome() + ":");
            for (int i = 0; i < numGolsCasa; i++) {
                // Sorteia um jogador da lista
                int indiceAutor = random.nextInt(jogadoresCasa.size());
                Jogador autorDoGol = jogadoresCasa.get(indiceAutor);

                this.goleadoresCasa.add(autorDoGol); // Adiciona na lista
                System.out.println("GOL! Marcado por: " + autorDoGol.getNome());
            }
        }

        // PASSO 3: Sortear os autores dos gols do VISITANTE
        if (numGolsVisitante > 0 && !jogadoresVisitante.isEmpty()) {
            System.out.println("\nGols do " + timeVisitante.getNome() + ":");
            for (int i = 0; i < numGolsVisitante; i++) {
                // Sorteia um jogador da lista
                int indiceAutor = random.nextInt(jogadoresVisitante.size());
                Jogador autorDoGol = jogadoresVisitante.get(indiceAutor);

                this.goleadoresVisitante.add(autorDoGol); // Adiciona na lista
                System.out.println("GOL! Marcado por: " + autorDoGol.getNome());
            }
        }

        // PASSO 4: Definir o placar final
        // O placar final é o tamanho da lista de goleadores
        this.golsCasa = this.goleadoresCasa.size();
        this.golsVisitante = this.goleadoresVisitante.size();

        this.partidaRealizada = true;

        System.out.println("\n--- FIM DE JOGO ---");
        System.out.println("Placar Final: " + timeCasa.getNome() + " " +
                golsCasa + " x " + golsVisitante + " " +
                timeVisitante.getNome());
    }

    /**
     * Este método lê o placar final (golsCasa, golsVisitante) e
     * manda cada time atualizar suas estatísticas.
     */
    public void processarResultado() {
        if (!partidaRealizada) {
            System.out.println("A partida precisa ser simulada primeiro!");
            return;
        }

        // Manda o time da casa registrar seu resultado
        timeCasa.registrarPartida(golsCasa, golsVisitante);

        // Manda o time visitante registrar seu resultado
        timeVisitante.registrarPartida(golsVisitante, golsCasa);

        System.out.println("Resultados processados e estatísticas atualizadas.");
    }
}