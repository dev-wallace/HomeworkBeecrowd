# Programa para Encontrar o Menor Valor em um Vetor

## Descrição

Este programa lê um valor inteiro `N`, que representa o tamanho de um vetor `X[N]`. Em seguida, o programa lê `N` valores inteiros que preenchem o vetor `X`. O objetivo é encontrar o menor valor presente no vetor e determinar sua posição dentro do vetor. 

## Entrada

1. A primeira linha contém um único inteiro `N` (1 < N < 1000), indicando o número de elementos que devem ser lidos para o vetor `X[N]`.
2. A segunda linha contém `N` valores inteiros, separados por um espaço. Nenhum número será repetido.

## Saída

1. A primeira linha apresenta a mensagem "Menor valor:" seguida de um espaço e do menor valor lido na entrada.
2. A segunda linha apresenta a mensagem "Posicao:" seguida de um espaço e da posição no vetor onde se encontra o menor valor lido. Lembre-se de que o vetor inicia na posição zero.

## Exemplo

### Entrada
```
10

1 2 3 4 -5 6 7 8 9 10
```

### Saida
```
Menor valor: -5

Posicao: 4
```



# Programa de Substituição de Valores Negativos e Nulos no Vetor X

Este programa lê um vetor `X[10]` com 10 valores inteiros (podendo ser positivos, negativos ou nulos) e, em seguida, substitui todos os valores nulos ou negativos por `1`. Após isso, ele exibe o vetor modificado, no formato:

`X[i] = x`, onde `i` é a posição do vetor e `x` é o valor armazenado naquela posição.

## Exemplo de Entrada
```
0
-5
63
0
...
```

## Exemplo de Saída
```
X[0] = 1
X[1] = 1
X[2] = 63
X[3] = 1
...
```

## Como Funciona:
1. O programa lê 10 valores inteiros que podem ser positivos, negativos ou nulos.
2. Para cada valor no vetor:
   - Se o valor for negativo ou zero, ele é substituído por `1`.
3. O vetor modificado é exibido com as respectivas posições e valores.

## Estrutura de Saída:
O formato da saída é exibido como:
```
X[i] = x
```
Onde:
- `i` representa o índice (posição) do vetor.
- `x` é o valor do vetor na posição correspondente, após as substituições.

## Linguagem Utilizada
Este programa pode ser implementado em diversas linguagens de programação, como Python, C, ou Java.





