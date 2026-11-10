# FlowTrack

# 2026 - 1

**Empresa Parceira:** [IPEM - Instituto de Pesos e Medidas do Estado de São Paulo](#)

## Problema
A Regional de São José dos Campos do IPEM enfrentava um gargalo operacional no gerenciamento de sua frota: todo o controle de uso e abastecimento das viaturas era feito de maneira analógica, dependendo de pranchetas de papel deixadas dentro dos veículos. Anotações diárias cruciais — como o registro do odômetro, volume de combustível abastecido, custo financeiro e numeração de notas fiscais — eram preenchidas manualmente pelos técnicos. Esse cenário gerava um grande trabalho braçal no fechamento mensal, inviabilizando a comparação rápida de desempenho entre os carros e dificultando o cálculo preciso do consumo médio. O objetivo do projeto foi modernizar e automatizar esse fluxo, assegurando a integridade e rastreabilidade das informações, além de fornecer métricas gerenciais rápidas para embasar decisões e simplificar a exportação de dados para o Sistema de Gestão Integrada (SGI).

## Solução Entregue pela Equipe
**FlowTrack — Gestão Inteligente de Frotas e Abastecimentos.** Entregamos uma aplicação web que erradica o uso de papel, digitalizando toda a jornada de uso das viaturas da instituição. O sistema oferece interfaces focadas na experiência do usuário para que os condutores registrem de forma ágil as retiradas, devoluções e paradas em postos de combustível, construindo um histórico centralizado de despesas e quilometragem. Como valor agregado, a plataforma conta com um módulo completo de administração de cadastros, dispara alertas automáticos para revisões preventivas (baseados no painel do veículo) e exibe dashboards analíticos. Isso transforma o monitoramento da frota em um processo visual e dinâmico, facilitando drasticamente a futura alimentação do SGI.

[Repositório do Projeto](https://github.com/LizardsDBA/flow-track)

## Tecnologias Utilizadas
- **Java:** Empregado na construção do backend, oferecendo maior flexibilidade e simplificando a manutenção das regras de negócio da aplicação.
- **JavaScript:** Adotado para o desenvolvimento da interface gráfica, possibilitando a criação ágil e interativa da experiência do usuário (UI).
- **HTML:** Utilizado na estruturação e prototipagem visual, servindo como base para o planejamento e organização do layout do sistema.
- **Git e GitHub:** Fundamentais para o versionamento do código-fonte e trabalho colaborativo, assegurando um gerenciamento seguro e organizado das entregas da equipe.
- **Jira:** Plataforma escolhida para a gestão das atividades do projeto, facilitando a distribuição de tarefas e o acompanhamento do fluxo de trabalho do time.

## Contribuições Pessoais

<details>
<summary><strong>Módulo de Histórico de Viaturas e Auditoria (Full-Stack)</strong></summary>
<br>
<p>
Na camada de banco de dados, implementei <em>Native Queries</em> acopladas a <em>Projections</em> (<code>HistoricoProjection</code>) no repositório. Essa abordagem bypassou a necessidade de carregar a entidade completa de <code>Viatura</code>, otimizando a performance da query SQL. No backend, desenvolvi o endpoint REST (<code>GET /api/viaturas/{id}/historico</code>), orquestrando o fluxo até a formatação no objeto <code>HistoricoResponse</code>. No frontend, construí a interface modal consumindo a API, aplicando lógica condicional dinâmica na UI para renderizar distintivos (<em>badges</em>) que diferenciam viagens finalizadas de veículos "Em Uso Agora".
</p>

<br>

<p>📎 <strong>Evidências de Interface:</strong></p>

<ul>
  <li>
    🔘 <strong>Botão que apresenta o Histórico de Viatura:</strong><br>
    <img width="1366" height="637" alt="Botão que apresenta o Histórico de Viatura" src="https://github.com/user-attachments/assets/7ed3bc22-40f7-4bca-b76b-8e31db22c35b" />
  </li>
  <br>
  <li>
    📄 <strong>Caso o Histórico esteja vazio:</strong><br>
    <img width="842" height="390" alt="Caso o Histórico esteja vazio" src="https://github.com/user-attachments/assets/4da22211-34fe-4353-b01e-40db0306d756" />
  </li>
</ul>

<br>

<p>📎 <strong>Evidências de Código (Back-end):</strong></p>

<ul>
  <li>
    ⚙️ <strong>Implementação da Native Query e Projection no Repository:</strong><br>
<img width="659" height="312" alt="Captura de tela 2026-11-09 215536" src="https://github.com/user-attachments/assets/29f66d25-7dd9-43ea-bb58-3f015e683712" />

  <br>
  <li>
    ⚙️ <strong>Mapeamento da Projection para o DTO HistoricoResponse no Service:</strong><br>
<img width="626" height="238" alt="Captura de tela 2026-11-09 215555" src="https://github.com/user-attachments/assets/41f7421d-d670-42b7-8cef-a049ddfc6b0e" />

  </li>
</ul>
</details>

<details>
<summary><strong>Otimização de Performance com Motor de Buscas Client-Side</strong></summary>
<br>
<p>
Projetei um sistema de filtros combinados (Técnico, Data e Motivo) para o painel de auditoria. Para evitar a sobrecarga do servidor e mitigar requisições excessivas (N+1), implementei o gerenciamento de estado no navegador, armazenando os dados em memória (<code>app.currentHistorico</code>). Através de <em>event listeners</em> (<code>onkeyup</code>, <code>onchange</code>), a filtragem da tabela ocorre em tempo real no <em>client-side</em>, entregando resposta visual instantânea ao usuário.
</p>

<br>

<p>📎 <strong>Evidências de Front-end:</strong></p>

<ul>
  <li>
    🔍 <strong>Filtro de Condutor em tempo real enquanto escreve:</strong><br>
    <img width="1366" height="642" alt="Filtro de Condutor em tempo real" src="https://github.com/user-attachments/assets/5f7b1d34-4d24-4cda-9436-742a596472ab" />
  </li>
  <br>
  <li>
    📝 <strong>Filtro de Motivo de Uso de Viatura em tempo real enquanto escreve:</strong><br>
    <img width="1366" height="639" alt="Filtro de Motivo de Uso de Viatura em tempo real" src="https://github.com/user-attachments/assets/2e0ebb91-02f7-48f1-80a2-c67d7e44ef01" />
  </li>
  <br>
  <li>
    📅 <strong>Filtro de Data em tempo real enquanto escreve:</strong><br>
    <img width="1365" height="639" alt="Filtro de Data em tempo real" src="https://github.com/user-attachments/assets/7a455e86-fc11-4acc-b158-89c7feafe977" />
  </li>
</ul>
</details>

<details>
<summary><strong>Arquitetura de Front-end e Padronização de Componentes</strong></summary>
<br>
<p>
Refatorei a lógica de interatividade dos Dashboards gerenciais aplicando o conceito DRY (<em>Don't Repeat Yourself</em>). Abstraí as funções de minimização e maximização (Acordeões) para o escopo global da aplicação (<code>app.js</code>), permitindo a reutilização nativa do componente nas telas de Uso de Viatura e Abastecimentos. Envelopei estruturalmente os painéis de KPIs e injetei regras de transição CSS para animações fluidas, otimizando o aproveitamento do espaço útil da tela em resoluções menores.
</p>

<br>

<p>📎 <strong>Evidências de Front-end:</strong></p>

<ul>
  <li>
    ⛽ <strong>Tela de Abastecimentos — Visão Expandida:</strong><br>
    <img width="1919" height="676" alt="Tela de Abastecimentos - Painel Expandido" src="https://github.com/user-attachments/assets/809a06d5-1d82-44c1-90b7-4126e0d6cb75" />
  </li>
  <br>
  <li>
    ⛽ <strong>Tela de Abastecimentos — Visão Recolhida (Accordion):</strong><br>
    <img width="1702" height="424" alt="Tela de Abastecimentos - Painel Recolhido" src="https://github.com/user-attachments/assets/77a90834-6eed-45e0-a3cf-80959d786a8d" />
  </li>
  <br>
  <li>
    🚗 <strong>Tela de Uso de Viatura — Visão Expandida:</strong><br>
    <img width="1703" height="533" alt="Tela de Uso de Viatura - Painel Expandido" src="https://github.com/user-attachments/assets/d31f7744-c4a4-4422-b0f6-3ff3bb528cb0" />
  </li>
  <br>
  <li>
    🚗 <strong>Tela de Uso de Viatura — Visão Recolhida (Accordion):</strong><br>
    <img width="1703" height="544" alt="Tela de Uso de Viatura - Painel Recolhido" src="https://github.com/user-attachments/assets/96e08960-6721-40f0-a01e-50c0615db0e2" />
  </li>
</ul>
</details>

## Hard Skills

### O que desenvolvi (sei fazer com ajuda)
- **Java / Spring Boot:** Criação de endpoints REST, injeção de dependências e mapeamento de DTOs para garantir a comunicação fluida e segura entre front-end e back-end.
- **SQL / MySQL:** Desenvolvimento de *Native Queries* customizadas focadas em alta performance e baixo acoplamento para o módulo de relatórios e histórico.
- **JavaScript:** Manipulação avançada do DOM, consumo de APIs assíncronas (Fetch API), gerenciamento de estado local em memória (cache) e implementação de motores de busca dinâmicos no *client-side*.
- **HTML / CSS:** Estruturação semântica, criação de layouts responsivos, estilização de componentes interativos com transições dinâmicas e padronização visual de formulários.
- **Git / GitHub:** Domínio do ciclo completo de versionamento, estruturação de Pull Requests detalhados, resolução de conflitos e colaboração alinhada às boas práticas de desenvolvimento.

### O que gostaria de desenvolver
- **Frameworks Front-end (React/Vue):** Aplicar a lógica de componentização e estado que fiz em Vanilla JS dentro de ecossistemas modernos e escaláveis.
- **Spring Security:** Aprofundar meus conhecimentos em autenticação e autorização, protegendo rotas específicas da API com base no perfil de acesso do usuário (Admin vs. Técnico).
- **Testes Automatizados:** Implementar testes unitários e de integração (JUnit/Mockito) para garantir a estabilidade das lógicas de negócio antes de subir para produção.

## Soft Skills

### O que desenvolvi
- **Visão Arquitetural e Trabalho em Equipe:** Ao construir a funcionalidade de Histórico, optei intencionalmente por utilizar *Native Queries* em vez de mapear a entidade principal. Essa decisão técnica foi guiada pela empatia com a equipe, mantendo o acoplamento baixo para prevenir conflitos de versão (*merge conflicts*) com colegas que atuavam na mesma entidade simultaneamente.
- **Proatividade e Entrega de Valor:** Durante a implementação do motor de buscas, analisei os requisitos da tarefa e notei uma oportunidade. Além dos filtros solicitados, projetei e entreguei um filtro analítico adicional ("Motivo de Uso") sem impactar o prazo, além de corrigir nativamente problemas de renderização de datas nos navegadores.
- **Foco na Experiência do Usuário (UX):** Alinhei a engenharia de software à jornada do usuário final. Isso refletiu na minha decisão de realizar filtragens em tempo real no *client-side* (evitando telas de loading) e na implementação de painéis retráteis que permitem aos administradores focar na leitura de relatórios densos em telas menores.

### O que gostaria de desenvolver
- **Comunicação de Decisões Técnicas:** Melhorar a habilidade de traduzir escolhas arquiteturais complexas (como otimização de banco e renderização) para stakeholders não técnicos e membros de negócios.
- **Gestão de Tempo em Over-delivery:** Aprimorar o balanceamento entre entregar funcionalidades adicionais de alto impacto e manter o foco rigoroso no escopo inicial definido pela sprint, otimizando ainda mais a previsibilidade das entregas.
