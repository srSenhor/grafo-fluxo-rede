## Grafo de fluxo em rede 

Este projeto, desenvolvido na disciplina de Teoria dos Grafos da UFERSA, tem como objetivo pôr em prática o conteúdo estudado em sala de aula aplicando a uma situação cotidiana. 

Para tal, aplicaremos o conceito de grafos de fluxo em rede para uma distribuição elétrica em um determinado bairro de tal forma que ela consiga chegar a uma determinada casa com o maior fluxo de energia possível (sujeito a mudança).

Pretende-se usar o algoritmo de Ford-Fulkerson para solução desse.


### Interpretação do problema

Prezando pela eficiência no fornecimento de energia de uma subestação a um bairro, que pode ser interpretado como um grafo de fluxo de rede, é importante pensar na infraestrutura de tal forma que determinado bairro consiga receber energia.

(sujeito a melhoria)

### Especificações da implementação

Inicialmente teremos a definição de um grafo de fluxo. Este deve conter:

- Conjunto V de Vértices
  - Podem possuir um rótulo
- Conjunto E de Arestas
  - Devem conter uma capacidade, que representa a quantidade máxima de fluxo comportado
  - Devem conter um fluxo que representa uma espécie de "peso" atual

(Escrever definição de corte mínimo)

(Escrever definição de caminho aumentante)

Para o cálculo do caminho aumentante em um grafo de fluxo em rede, temos o algoritmo de Ford-Fulkerson, que consiste em (explicar algoritmo de ford-fulkerson)


## Notas dos autores

- Ainda vamos definir se vamos trabalhar com uma distribuição elétrica, então vamos começar com a implementação base do problema.