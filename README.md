# algaworks-especialista-java 🎓☕️
Repositório do curso Especialista Java da Algaworks.
https://www.algaworks.com/

## 1. Introdução 👩‍🏫
### 1.5 Plataformas Java
Um software deveria ser capaz de rodar em diferentes máquinas.

As plataformas incluem um mecanismo de execução de programas (VM), um compilador, um conjunto de bibliotecas e ferramentas. As principais são o Java SE, Jakarta EE, Java ME e Java Card.

Java SE -> conjunto de apis, desenvolvimento da maior parte das aplicações desktop e servidores
Jakarta EE -> plataforma guarda-chuva (jakarta servlet, JPA, bean validation, CDI)

Especificação: documentação detalhada de como uma tecnologia deve funcionar - blueprint, padrão
Implementação: tecnologia de fato que implementa um especificação (ex: hibernate é a implementação do jakarta persistence)

### 1.6 JVM
Software que roda o código pré-compilado (traduz para a linguagem nativa de máquina).

Um programa escrito em C:
Código-fonte -> Binário -> Sistema Operacional (binários diferentes para cada sistema operacional)

A JVM emula uma máquina física e permite executar códigos pré-compilados (não compilado nativamente). Independe do sistema operacional e arquitetura do sistema.

Código-fonte -> _ByteCode_ -> Binário -> Sistema Operacional

ByteCode: não é legível para humanos e nem interpretável pela máquina, apenas a JVM consegue entender e traduzir as instruções. É necessário possuir a JVM compatível com o sistema operacional.

O formato do arquivo bytecode é _.class_, e pode ser gerado através do comando _javac_ em uma classe _.java_.

Não há relação entre a linguagem Java e o Bytecode. Pode ser escrito em qualquer linguagem (por exemplo, Kotlin).

Mas a interpretação dos programas não torna lenta a execução?
R: Sim, quando comparado com a compilação para código nativo. Mas isso é minimizado pelo JIT (Just In Time compiler), que pode transformar código em código nativo se achar necessário em tempo de execução, melhorando a velocidade.

### 1.7 JRE/JDK

JRE (Java Runtime Environment)
Ambiente de execução Java completo, que contém a JVM, Class Loader, bibliotecas padrão.

JDK (Java Development Kit)
Inclui o compilador, ferramentas, utilitário e a JRE.

```JDK(JRE(JVM))```

### 1.8 Versões do Java

Feature release -> versão que dura 6 meses e tem suporte por tempo curto (ideal atualização imediata)
LTS -> Long Term Support: atualizações gratuitas por um longo período.

Java 17: setembro/2021 (atualizações gratuitas até, no mínimo, 2029).

### 1.9 Distribuições JDK e licenças de uso
JCP - Java Community Process
Comunidade de desenvolvimento de Java. Não implementa o produto, só define como vai funcionar, e uma empresa ou instuição fará a implementação.

JSR - Java Specification Request
Define especificações que as implementações devem seguir.
Java SE reúne várias JSRs.

OpenJDk: prova conceito, mostra uma exemplo de implementação - e pode ser usada em produção.

```
ESPECIFICAÇÃO JAVA SE (JSRs)
            |  
            V
         OPEN JDK
(implementação de referência) - não é a distribuição
            |  
            V
Fornecedores fazem build do OpenJDK e criam uma distribuição
Oracle OpenJDK, Oracle JDK, Amazon Corretto, Eclipse Temurin    
```

OpenJDK Oracle -> evitar usar em produção pela falta de suporte a longe prazo.

Neste projeto, será usada a distribuição Eclipse Temurin 17.0.2.


## 2. Fundamentos Java 💻
### 2.2 Compilando e executando um programa

```javac Classe.java```
Dará origem a um arquivo com extensão _.class_.

```java Classe``` ou ```java Classe.java```, caso não tenha sido compilada de antemão, executa a classe.

### 2.12 Tipos primitivos

|Tipo|Bits|Mínimo|Máximo|
|----|----|----|----|
| boolean | 1 | false | true |
| char | 16 | 0 | 2^16 - 1 |
| byte | 8 | -2^7 | 2^7 - 1 (127) |
| short | 16 | -2^15 | 2^15 - 1 (32_767) |
| int | 32 | -2^31 | 2^31 - 1 (2_147_483_647)|
| long | 64 | -2^63 | -2^63 - 1 |
| float | 32 | - | - |
| double  | 64 | - | - |

* o literal numérico inteiro é sempre int, a não ser que seja declaradamente long (L).
* o literal numérico decimal é sempre double, a não ser que seja declaradamente float (f).

### 2.15 Conversão de tipos primitivos

A conversão de um tipo maior para um menor, mesmo de um número que caiba, estoura o seguinte erro:

```error: incompatible types: possible lossy conversion from long to int```

É possível forçar o casting:
```
long x = 10;
int y = (int) x; //casting
```

Entre ponto flutuante e inteiro também é necssário deixar explícito o casting:
```
double x = 100;
int y = (int) x; //casting
```

### 2.17 Promoção Aritmética

Operações aritméticas entre variáveis de tipos diferentes, o resultado sempre será igual ao tipo maior.
```
long x = 10;
int y = 5;
long resultado = x*y; // será do tipo long
```

Para operações entre inteiros e ponto flutuante (ex. long x float), o resultado vai ser sempre o ponto flutuante. 
```
long x = 10;
float y = 5f;
float resultado = x*y; // será do tipo float
```

Para operações usando inteiros que resultem em pontos flutuantes:

```
int x = 10;
int y = 3;
float resultado = x/y; // resultado 3.0
```

Compila normalmente, resultado é um número inteiro. A operação é feita usando tipos int, então o resultado é um int, ainda que colocado numa variável tipo float. A atribuição é feita depois do cálculo.

Se eu quiser que seja dividido como um número de ponto flutuante, devo dividir por float:

```
int x = 10;
float resultado = x/3f; // resultado 3.333
```

### 2.24 JShell

Basta digitar jshell no terminar e assim é possível utilizar comandos java.
É possível declarar variáveis, ver valor de variáveis (/vars) e realizar operações aritméticas.

```
jshell
```

## 3. Estruturas de Controle e Operadores 🔁
### 3.1 Operadores de Igualdade e Negação (unário)





