#🎓☕️  algaworks-especialista-java
Repositório do curso Especialista Java da Algaworks.

# 1. Introdução 👩‍🏫
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




