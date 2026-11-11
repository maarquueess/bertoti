# Padrões de Projeto Aplicados — GitHub Onboarding Agent

Este repositório documenta a aplicação dos padrões de projeto GoF desenvolvidos no agente inteligente de onboarding de desenvolvedores.

## Padrões Utilizados e Estrutura

### 1. State (Comportamental)
- **Localização:** `br.edu.fatec.onboardingagent.state`
- **Aplicação:** Gerencia a transição de tarefas e estados de execução do agente (`InitState`, `PlanningState`, `ExecutingState`, `ObservingState`, `WaitingApprovalState`, `ErrorState`, `CompletedState`) de forma polimórfica.

### 2. Command (Comportamental)
- **Localização:** `br.edu.fatec.onboardingagent.command`
- **Aplicação:** Encapsula operações do Git e da base de conhecimento como comandos executáveis (`GitStatusCommand`, `GitBranchCommand`, `GitCheckoutCommand`, `KnowledgeSearchCommand`), utilizando o `GitClient` como *Receiver*.

### 3. Strategy (Comportamental)
- **Localização:** `br.edu.fatec.onboardingagent.strategy`
- **Aplicação:** Alternância dinâmica em tempo de execução dos algoritmos de planejamento do agente (`ReActStrategy`, `PlanThenExecuteStrategy`, `HumanInTheLoopStrategy`), gerenciados pelo `StrategySelector`.

### 4. Observer (Comportamental)
- **Localização:** `br.edu.fatec.onboardingagent.observer`
- **Aplicação:** Notifica alterações de estado e execução de comandos para componentes de log (`TraceObserver`) e interface gráfica via `AgentEventPublisher`.

### 5. Composite (Estrutural)
- **Localização:** `br.edu.fatec.onboardingagent.gui`
- **Aplicação:** Organização hierárquica dos componentes de interface gráfica Swing (`UIComponent`, `UIComposite`, `StatePanel`, `TraceLogPanel`).
