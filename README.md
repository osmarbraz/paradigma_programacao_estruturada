# Cálculo de Área e Perímetro de um Triângulo — Programação Estruturada

## 1. Sobre o projeto

Este projeto apresenta uma implementação em Java para calcular a área e o perímetro de um triângulo, utilizando os conceitos do **paradigma de programação estruturada**.

O programa solicita ao usuário os três lados de um triângulo, verifica se os valores informados atendem às condições de existência de um triângulo e, caso sejam válidos, calcula sua área e seu perímetro.

O objetivo é demonstrar como um problema computacional pode ser resolvido por meio de uma sequência organizada de instruções, estruturas condicionais e métodos, mantendo o código modularizado e de fácil compreensão.

## 2. Paradigma de programação estruturada

A programação estruturada é um paradigma que organiza o código por meio de três estruturas fundamentais:

- **Sequência:** execução das instruções em uma ordem definida.
- **Decisão:** utilização de estruturas condicionais, como `if` e `else`, para executar diferentes ações conforme uma condição.
- **Repetição:** utilização de estruturas como `for` e `while` para repetir instruções.

Outra característica importante é a divisão do programa em métodos, permitindo organizar o código em partes menores, cada uma responsável por uma determinada tarefa.

Neste projeto, os métodos são utilizados para separar a validação do triângulo e os cálculos da área e do perímetro.

## 3. Funcionalidades

O programa realiza as seguintes operações:

1. Solicita ao usuário os valores dos três lados do triângulo.
2. Verifica se os lados são positivos.
3. Verifica se os lados atendem às condições de existência de um triângulo.
4. Calcula o perímetro, caso o triângulo seja válido.
5. Calcula a área utilizando a fórmula de Heron.
6. Apresenta os resultados na saída do programa.

## 4. Regras matemáticas utilizadas

### 4.1. Condição de existência de um triângulo

Para que três segmentos formem um triângulo, é necessário que:

- `a > 0`, `b > 0` e `c > 0`;
- `a < b + c`;
- `b < a + c`;
- `c < a + b`.

Se todas essas condições forem satisfeitas, o triângulo é considerado válido.

### 4.2. Cálculo do perímetro

O perímetro corresponde à soma dos três lados:

`P = a + b + c`

### 4.3. Cálculo da área — Fórmula de Heron

Primeiramente, calcula-se o semiperímetro:

`s = (a + b + c) / 2`

Em seguida, aplica-se a fórmula de Heron:

`A = √[s × (s - a) × (s - b) × (s - c)]`

## 5. Tecnologias utilizadas

- **Linguagem:** Java.
- **Gerenciamento e construção:** Apache Maven.
- **Entrada de dados:** classe `Scanner`, da biblioteca `java.util`.
- **Cálculos matemáticos:** classe `Math`, utilizada para calcular a raiz quadrada.

## 6. Estrutura do projeto

O projeto segue a estrutura convencional de aplicações Java com Maven:

```
projeto-triangulo/
│
├── src/
│   └── main/
│       └── java/
│           └── Principal.java
│
├── pom.xml
├── .gitignore
├── README.md
└── LICENSE
```

**Descrição dos arquivos:**

- `Principal.java`: contém a implementação do programa e o método principal (`main`).
- `pom.xml`: arquivo de configuração do Maven, responsável pelo gerenciamento e pela construção do projeto.
- `.gitignore`: define os arquivos e diretórios que não devem ser versionados pelo Git.
- `README.md`: apresenta a documentação do projeto.
- `LICENSE`: informa os termos de licenciamento do projeto.

## 7. Organização do código

A classe `Principal` contém três métodos principais:

| Método                | Responsabilidade                                      |
| --------------------- | ----------------------------------------------------- |
| `verificaTriangulo()` | Verifica se os três lados formam um triângulo válido. |
| `calculaPerimetro()`  | Calcula a soma dos três lados.                        |
| `calculaArea()`       | Calcula a área utilizando a fórmula de Heron.         |

O método `main()` coordena a execução do programa, realizando a leitura dos dados, chamando os métodos de validação e cálculo e apresentando os resultados.

## 8. Como executar o projeto

### Pré-requisitos

Para executar o projeto, é necessário ter instalado:

- Java JDK.
- Apache Maven.
- Git (opcional, para clonar o repositório).

### Clonar o repositório

```
git clone URL_DO_REPOSITORIO
```

Acesse o diretório do projeto:

```
cd NOME_DO_PROJETO
```

### Compilar o projeto

Execute o comando:

```
mvn clean compile
```

O Maven realizará a limpeza dos arquivos de compilação anteriores e compilará os arquivos-fonte do projeto.

### Executar o programa

Considerando que a classe `Principal` não possui declaração de pacote, o programa poderá ser executado com:

```
mvn exec:java -Dexec.mainClass="Principal"
```

Esse comando utiliza o plugin Exec do Maven.

Caso o plugin ainda não esteja configurado no projeto, será necessário adicioná-lo ao `pom.xml`.

## 9. Exemplo de execução

### Exemplo 1 — Triângulo válido

**Entrada:**

```
Lado A: 3
Lado B: 4
Lado C: 5
```

**Saída:**

```
Triangulo valido!
Perimetro: 12.0
Area: 6.0
```

### Exemplo 2 — Triângulo inválido

**Entrada:**

```
Lado A: 2
Lado B: 3
Lado C: 8
```

**Saída:**

```
Triangulo invalido!
```

## 10. Conceitos de programação demonstrados

Este projeto permite estudar e identificar os seguintes conceitos:

- Programação estruturada.
- Declaração e utilização de variáveis.
- Entrada e saída de dados com `Scanner`.
- Métodos e modularização.
- Estruturas condicionais (`if` e `else`).
- Operadores relacionais e lógicos.
- Retorno de valores com `return`.
- Operações matemáticas.
- Utilização de bibliotecas da linguagem Java.

## 11. Considerações finais

A implementação demonstra a aplicação do paradigma estruturado na resolução de um problema matemático. A separação das responsabilidades em métodos permite organizar o código, facilitar sua leitura e tornar a manutenção mais simples.

Este projeto também servirá como referência para comparar diferentes paradigmas de programação, permitindo observar como o mesmo problema pode ser resolvido por abordagens distintas, como programação funcional, concorrente, orientada a eventos e orientada a objetos.
