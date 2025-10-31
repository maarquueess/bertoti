public class Main {

    public static void main(String[] args) {
        //System.out.println("### INICIANDO SIMULADOR AUTOMATIZADO DE PARTIDA ###\n");

        // --- 1. SETUP: Criando os objetos ---
        Time corinthians = new Time("Corinthians");
        Time realmadrid = new Time("Real Madrid");

        corinthians.adicionarJogador(new Jogador("Memphis Depay", "Atacante", 10));
        corinthians.adicionarJogador(new Jogador("Rodrigo Garro", "Meio-Campista", 8));
        corinthians.adicionarJogador(new Jogador("Yuri Alberto", "Atacante", 9));

        realmadrid.adicionarJogador(new Jogador("Vini Jr", "Atacante", 7));
        realmadrid.adicionarJogador(new Jogador("Kylian Mbappé", "Atacante", 10));
        realmadrid.adicionarJogador(new Jogador("Jude Bellingham", "Meio-Campista", 5));

        //System.out.println("Times criados. Estado inicial:");
        corinthians.exibirRelatorio();
        realmadrid.exibirRelatorio();

        //System.out.println("\n### 2. EXECUÇÃO DA AUTOMAÇÃO ###");

        // Criando a partida que vai gerenciar o processo
        Partida jogoDaRodada = new Partida(corinthians, realmadrid);

        // Passo 1 da automação: Simular o jogo
        jogoDaRodada.simular();

        // Passo 2 da automação: Processar o resultado (atualizar os times)
        jogoDaRodada.processarResultado();

        //System.out.println("\n### 3. VERIFICAÇÃO PÓS-PROCESSO ###");
        System.out.println("Exibindo relatórios atualizados após a partida: ");

        // Verificando o estado final dos objetos
        corinthians.exibirRelatorio();
        realmadrid.exibirRelatorio();

        //System.out.println("\n### SIMULAÇÃO FINALIZADA ###");
    }
}