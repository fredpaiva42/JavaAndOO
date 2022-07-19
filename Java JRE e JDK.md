## Linguagem Java
Características que chamavam atenção quando foi criada:
- Orientada a Objetos
- Possui muitas bibliotecas
- Parece `C++`
- Roda em vários sistemas operacionais

A linguagem ``Java`` consegue atender áreas como **web**, **server-side**, **Android** ou um antigo, **applet**. No entanto, ela é mais popular na área de sistemas web e Android.

## Plataforma Java
Características:
- Portabilidade
- É fácil desenvolver para ela
- É segura
- Onipresente

Composta por:
1. Máquina Virtual - JVM
2. Bibliotecas - API
3. Linguagem Java

## Máquina Virtual Java
Características:
- Multi-Plataforma
- Gerenciamento de memória
- Segurança
- Sandbox
- Otimizações
- JIT Compiler

O principal benefício da `JVM` é poder executar o código independente do sistema operacional. No mundo Java nós sempre teremos o mesmo "executável" ou **Bytecode** que será executado pela Maquina Virtual Java, totalmente independente do sistema operacional.

### Bytecode
 O Bytecode é parecido com o ``Assembly`` (código de montagem que é traduzido para código de máquina). Ele é exeutado pela `JVM` e independe do `Sistema Operacional`.

### JRE
O `JRE` é o ambiente para executar uma aplicação Java.

``JRE = JVM + bibliotecas``

### JDK
É o ambiente para executar uma aplicação Java e possui várias ferramentas de desenvolvimento (como o compilador).

``JDK = JRE + ferramentas de desenvolvimento``

### Diferença entre a JVM e o JRE
Apesar de ambos executarem o **Bytecode**, eles são diferente. O `JRE` (ambiente de execução) contém a `JVM`, mas também possui um monte de bibliotecas embutidas. Ou seja, para rodar uma aplicação Java não basta ter apenas a `JVM`, também é preciso ter as Bibliotecas.

O Java é **case-sensitive**.