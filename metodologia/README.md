# FlowTrack

**Empresa Parceira:** [IPEM - Instituto de Pesos e Medidas do Estado de São Paulo](#)

## Problema
O desafio consiste no desenvolvimento de um sistema web para controle e análise dos abastecimentos das viaturas do IPEM – Regional de São José dos Campos, substituindo o atual processo manual realizado por meio de pranchetas físicas mantidas nos veículos. Atualmente, os técnicos registram informações como quilometragem, litros abastecidos, valor pago e número da nota fiscal de forma manual, o que dificulta a consolidação mensal dos dados, a análise comparativa entre viaturas e o acompanhamento do consumo médio de combustível. A proposta do projeto é digitalizar esses registros, garantindo maior organização, rastreabilidade e confiabilidade das informações, além de permitir a geração de indicadores gerenciais que apoiem a tomada de decisão e facilitem a consolidação dos dados para posterior inserção no SGI.

## Solução Entregue pela Equipe
**FlowTrack — Plataforma de Controle de Abastecimento e Utilização de Viaturas.** O FlowTrack permitirá o registro digital da utilização de viaturas, substituindo o controle manual realizado em pranchetas. A solução possibilita registrar abastecimentos, início e término de uso dos veículos, mantendo histórico completo de quilometragem, consumo e despesas. Além disso, contará com gerenciamento de cadastros, avisos de manutenção preventiva baseados em quilometragem e visualização de indicadores e relatórios consolidados, facilitando o acompanhamento da frota e a organização das informações para posterior inserção no SGI.

[Repositório do Projeto](https://github.com/LizardsDBA/flow-track)

## Tecnologias Utilizadas
- **Java 21:** Utilizado como linguagem principal para o desenvolvimento seguro, escalável e orientado a objetos do backend do sistema.
- **Spring Boot:** Framework adotado para acelerar a configuração da aplicação, facilitando a criação da API RESTful e a injeção de dependências.
- **MySQL:** Banco de dados relacional escolhido para o armazenamento estruturado de todas as entidades do sistema.
- **HTML, CSS e JavaScript Vanilla:** Tecnologias empregadas para construir uma interface de usuário leve e interativa, focando na manipulação direta do DOM.
- **Chart.js:** Biblioteca integrada ao front-end para a renderização visual dos gráficos dinâmicos nos dashboards gerenciais.
- **Git e GitHub:** Ferramentas essenciais para o versionamento de código, colaboração paralela via branches e revisão de entregas (Pull Requests).

## Contribuições Pessoais

### ► Módulo de Histórico de Viaturas e Auditoria (Full-Stack)
Na camada de banco de dados, implementei *Native Queries* acopladas a *Projections* (`HistoricoProjection`) no repositório. Essa abordagem bypassou a necessidade de carregar a entidade completa de `Viatura`, otimizando a performance da query SQL. No backend, desenvolvi o endpoint REST (`GET /api/viaturas/{id}/historico`), orquestrando o fluxo até a formatação no objeto `HistoricoResponse`. No frontend, construí a interface modal consumindo a API, aplicando lógica condicional dinâmica na UI para renderizar distintivos (*badges*) que diferenciam viagens finalizadas de veículos "Em Uso Agora".

### ► Otimização de Performance com Motor de Buscas Client-Side
Projetei um sistema de filtros combinados (Técnico, Data e Motivo) para o painel de auditoria. Para evitar a sobrecarga do servidor e mitigar requisições excessivas (N+1), implementei o gerenciamento de estado no navegador, armazenando os dados em memória (`app.currentHistorico`). Através de *event listeners* (`onkeyup`, `onchange`), a filtragem da tabela ocorre em tempo real no *client-side*, entregando resposta visual instantânea ao usuário.

### ► Arquitetura de Front-end e Padronização de Componentes
Refatorei a lógica de interatividade dos Dashboards gerenciais aplicando o conceito DRY (*Don't Repeat Yourself*). Abstraí as funções de minimização e maximização (Acordeões) para o escopo global da aplicação (`app.js`), permitindo a reutilização nativa do componente nas telas de Uso de Viatura e Abastecimentos. Envelopei estruturalmente os painéis de KPIs e injetei regras de transição CSS para animações fluidas, otimizando o aproveitamento do espaço útil da tela em resoluções menores.

## Hard Skills

### O que desenvolvi (com autonomia)
- **Java / Spring Boot:** Criação de endpoints REST, injeção de dependências e mapeamento de DTOs para comunicação eficiente entre front e back.
- **SQL / MySQL:** Criação de *Native Queries* customizadas focadas em performance e baixo acoplamento para relatórios e históricos.
- **JavaScript Vanilla:** Manipulação avançada de DOM, requisições assíncronas (Fetch API), gerenciamento de estado em memória (cache) e filtros dinâmicos *client-side*.
- **HTML / CSS:** Estruturação semântica, design responsivo, injeção de transições dinâmicas para componentes interativos e padronização visual de inputs.
- **Git / GitHub:** Fluxo completo de versionamento, criação de Pull Requests detalhados, resolução de conflitos e boas práticas de colaboração assíncrona.

### O que gostaria de desenvolver
- **Frameworks Front-end (React/Vue):** Aplicar a lógica de componentização e estado que fiz em Vanilla JS dentro de ecossistemas modernos e escaláveis.
- **Spring Security:** Aprofundar meus conhecimentos em autenticação e autorização, protegendo rotas específicas da API com base no perfil de acesso do usuário (Admin vs. Técnico).
- **Testes Automatizados:** Implementar testes unitários e de integração (JUnit/Mockito) para garantir a estabilidade das lógicas de negócio antes de subir para produção.

## Soft Skills

### O que desenvolvi
- **Visão Arquitetural e Trabalho em Equipe:** Ao construir a funcionalidade de Histórico, optei intencionalmente por utilizar *Native Queries* em vez de mapear a entidade principal. Essa decisão técnica foi guiada pela empatia com a equipe, mantendo o acoplamento baixo para prevenir conflitos de versão (*merge conflicts*) com colegas que atuavam na mesma entidade simultaneamente.
- **Proatividade e Entrega de Valor (Over-delivery):** Durante a implementação do motor de buscas, analisei os requisitos da tarefa e notei uma oportunidade. Além dos filtros solicitados, projetei e entreguei um filtro analítico adicional ("Motivo de Uso") sem impactar o prazo, além de corrigir nativamente problemas de renderização de datas nos navegadores.
- **Foco na Experiência do Usuário (UX):** Alinhei a engenharia de software à jornada do usuário final. Isso refletiu na minha decisão de realizar filtragens em tempo real no *client-side* (evitando telas de loading) e na implementação de painéis retráteis que permitem aos administradores focar na leitura de relatórios densos em telas menores.

### O que gostaria de desenvolver
- **Comunicação de Decisões Técnicas:** Melhorar a habilidade de traduzir escolhas arquiteturais complexas (como otimização de banco e renderização) para stakeholders não técnicos e membros de negócios.
- **Gestão de Tempo em Over-delivery:** Aprimorar o balanceamento entre entregar funcionalidades adicionais de alto impacto e manter o foco rigoroso no escopo inicial definido pela sprint, otimizando ainda mais a previsibilidade das entregas.
