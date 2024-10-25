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


# Programa de Preenchimento do Vetor com Valores Dobros

Este programa lê um valor inteiro `V` e o coloca na primeira posição do vetor `N[10]`. Em seguida, para cada posição subsequente, o valor colocado é o dobro do valor da posição anterior. Ou seja, se o valor lido for `1`, o vetor será preenchido da seguinte forma: `1, 2, 4, 8,...` e assim por diante.

## Exemplo de Entrada
```
1
```

## Exemplo de Saída
```
N[0] = 1
N[1] = 2
N[2] = 4
N[3] = 8
...
```

## Como Funciona:
1. O programa começa lendo um valor inteiro `V` (onde `V ≤ 50`).
2. O primeiro elemento do vetor `N` recebe o valor de `V`.
3. Para cada posição subsequente `i`, o valor é o dobro do valor da posição anterior, ou seja: 
   - `N[i] = 2 * N[i-1]`
4. O vetor é exibido com as respectivas posições e valores.

## Estrutura de Saída:
O formato da saída é exibido como:
```
N[i] = X
```
Onde:
- `i` representa o índice (posição) do vetor.
- `X` é o valor do vetor na posição correspondente.

## Exemplo Completo:
Entrada:
```
1
```
Saída:
```
N[0] = 1
N[1] = 2
N[2] = 4
N[3] = 8
N[4] = 16
N[5] = 32
N[6] = 64
N[7] = 128
N[8] = 256
N[9] = 512
```

## Limitações
- O valor `V` deve ser um número inteiro menor ou igual a 50.

# Desafio: Valores Menores ou Iguais a 10 no Vetor

## Enunciado

Faça um programa que leia um vetor `A[100]`. No final, mostre todas as posições do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.

### Entrada

A entrada contém 100 valores, podendo ser:
- Números inteiros ou reais
- Números positivos ou negativos

### Saída

Para cada valor do vetor menor ou igual a 10, escreva `"A[i] = x"`, onde `i` é a posição do vetor e `x` é o valor armazenado naquela posição. O valor deve ser mostrado com **uma casa decimal** após o ponto.

### Exemplo de Entrada
```
0 -5 63 -8.5 ...
```

### Exemplo de Saída


```
A[0] = 0.0 A[1] = -5.0 A[3] = -8.5 ...
```

# Desafio: Troca em Vetor I

## Enunciado

Faça um programa que leia um vetor `N[20]`. Em seguida, troque o primeiro elemento com o último, o segundo elemento com o penúltimo, e assim por diante, até trocar o 10º elemento com o 11º. Mostre o vetor modificado.

### Entrada

A entrada contém 20 valores inteiros, que podem ser:
- Números inteiros, positivos ou negativos.

### Saída

Para cada posição do vetor `N`, escreva `"N[i] = Y"`, onde:
- `i` é a posição do vetor (índice de 0 a 19).
- `Y` é o valor armazenado naquela posição, após as trocas realizadas.

### Exemplo de Entrada
```
0 -5 ... 63 230
```

### Exemplo de Saída


```
N[0] = 230 N[1] = 63 ... N[18] = -5 N[19] = 0
```
# Problema de Preenchimento de Vetores

Neste problema, você deverá ler 15 valores e organizá-los em 2 vetores, conforme estes valores forem pares ou ímpares. O tamanho de cada um dos dois vetores é de 5 posições. Cada vez que um dos vetores se encher, você deverá imprimir todo o vetor e utilizá-lo novamente para os próximos números que forem lidos. Ao final da leitura, deve-se imprimir o conteúdo que restou em cada um dos dois vetores, imprimindo primeiro os valores do vetor ímpar. Cada vetor pode ser preenchido tantas vezes quantas forem necessárias.

## Exemplo

**Entrada**

```
1
3
4
-4
2
3
8
2
5
-7
54
76
789
23
98
```

**Saída**
```
par[0] = 4
par[1] = -4
par[2] = 2
par[3] = 8
par[4] = 2
impar[0] = 1
impar[1] = 3
impar[2] = 3
impar[3] = 5
impar[4] = -7
impar[0] = 789
impar[1] = 23
par[0] = 54
par[1] = 76
par[2] = 98
```




