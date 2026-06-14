# Trabalho Final - Pilhas

## Estrutura de Dados I

### Descrição

Este projeto consiste na implementação de um Validador de Expressões utilizando a estrutura de dados Pilha, conforme solicitado na disciplina de Estrutura de Dados I.

O objetivo é verificar se uma expressão matemática está corretamente formada através da validação de delimitadores e operadores.

### Funcionalidades

O programa realiza as seguintes validações:

* Balanceamento de parênteses `()`;
* Balanceamento de colchetes `[]`;
* Balanceamento de chaves `{}`;
* Verificação de operadores consecutivos;
* Verificação de operador no início da expressão;
* Verificação de operador no final da expressão;
* Verificação de operador após abertura de delimitador;
* Verificação de operador antes de fechamento de delimitador.

### Estrutura do Projeto

```text
Main.java
Pilha.java
ValidadorExpressao.java
```

### Estrutura Utilizada

Foi utilizada uma pilha estática implementada através de vetor, sem utilizar a classe `Stack` da linguagem Java.

### Execução

Compilar os arquivos:

```bash
javac *.java
```

Executar o programa:

```bash
java Main
```

### Complexidade

O algoritmo possui complexidade temporal O(n), pois percorre a expressão apenas uma vez.

### Autor

Gustavo Trevizani
