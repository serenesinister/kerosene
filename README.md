
# Kerosene

**Kerosene** é um projeto simples em desenvolvimento de um jogo 2D em Java. O jogo ainda está em sua fase inicial, desenvolvido utilizando o Eclipse IDE com Java 22. O jogo possui a funcionalidade de movimentar o personagem pelo cenário, enquanto trabalha nas mecânicas e gráficos.

## Funcionalidades Atuais

- **Movimentação do jogador**: O jogador pode se mover nas quatro direções (cima, baixo, esquerda, direita).
- **Animações**: O jogador possui animações simples que mudam conforme a direção de movimento.
- **Configuração de tela**: O jogo está configurado para rodar em uma tela com uma resolução de 768x576 pixels.

## Tecnologias Usadas

- **Linguagem**: Java 22
- **IDE**: Eclipse IDE 6
- **Biblioteca**: `javax.swing` para a interface gráfica
- **Controle de entrada**: Teclado para movimentação do jogador
- **Gerenciamento de imagens**: `ImageIO` para carregar imagens do personagem

## Como Rodar o Projeto

### Pré-requisitos

Antes de rodar o jogo, é necessário ter:

- **Java 22** ou superior instalado em sua máquina.
- **Eclipse IDE** instalado para facilitar o desenvolvimento.

### Passos para rodar o jogo:

1. Clone este repositório:
   ```bash
   git clone https://github.com/usuario/kerosene.git
   ```

2. Abra o projeto no Eclipse IDE.

3. Compile e execute a classe `Main.java`, que irá inicializar a janela do jogo.

### Controles

- **W**: Mover para cima
- **S**: Mover para baixo
- **A**: Mover para a esquerda
- **D**: Mover para a direita

## Estrutura do Projeto

- `src/main`: Contém as classes principais, incluindo a classe para a janela e o painel de jogo.
- `src/entidade`: Contém as classes relacionadas aos objetos do jogo, como o jogador.
- `src/jogador`: Imagens e lógica relacionadas ao personagem.

## Desenvolvimento

Este projeto está em uma fase inicial e está sendo desenvolvido como um projeto de aprendizado. 

## Status do Projeto

Este projeto está em desenvolvimento e ainda não está finalizado. A funcionalidade de movimentação do jogador e as animações estão em funcionamento básico. Recursos adicionais, como colisões, interação com o ambiente e mais animações, estão planejados para futuras versões.
