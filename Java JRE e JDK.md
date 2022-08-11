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


## Sintaxe Java
O Java é **case-sensitive**.

O Java é uma linguagem **estaticamente** e **fortemente tipada**.

Uma das convenções do Java é a declaração de classes com letras maiúsculas utilizando o **CamelCase**.

### Declaração de Variáveis

Variável do tipo `inteiro`:
````java
public class Exemplo {
    public static void main(String[] args){
        int variavel;
    }
}
````

Variável do tipo `double`:
````java
public class Exemplo {
    public static void main(String[] args){
        double salario;
    }
}
````

Concatenar texto com variáveis numéricas:
````java
public class Exemplo {
    public static void main(String[] args) {
        int idade;
        idade = 22;
        System.out.println("Eu tenho " + idade + " anos");
    }
}
````

### Tipos e Conversão

No Java, assim como no C, a divisão entre inteiros nos dá um resultado inteiro. Quando quisermos fazer uma divisão precisa, é necessário que a variável que vai armazenar o resultado seja do tipo `double` e que um dos número seja declarado como `double`.

```java
public class Exemplo {
    int divisao = 5/2; // A saída vai ser 2.
    double divisao = 5/2; // A saída vai ser 2.0.
    double divisao = 5.0/2; // A saída vai ser 2.5.
}
```

Para forçar a conversão em Java de um `double` para `int`, nós podemos usar o `casting`:
````java
public class Exemplo {
    double peso = 88.99;
    int converteParaInteiro = (int) peso;
}
````

Lembrando que a conversão de valores inteiros para `double` é feita automaticamente.


Tabela dos tipos em Java, sua capacidade de armazenamento e necessidade de sigla para definir:

| Tipo    | Tamanho     | Letra |
|---------|-------------|-------|
| boolean | 1 **bit**   |       |
| byte    | 1 **byte**  |       |
| short   | 2 **bytes** |       |
| char    | 2 **bytes** |       |
| int     | 4 **bytes** |       |
| float   | 4 **bytes** | **f** |
| long    | 8 **bytes** | **L** |
| double  | 8 **bytes** |       |

Exemplo de `long` e `float`:
````java
public class Exemplo {
    long numeroGrande = 32432423523L;
    float pi = 3.14f; 
    // 3.14 é considerado double
    float pi = 3.14; // dá warning
}
````

Tabela de funcionamento do cast implícito (tipo menor para tipo maior) e explícito:

| DE/PARA | byte   | short   | char   | int   | long   | float   | double |
|---------|--------|---------|--------|-------|--------|---------|--------|
| byte    | ----   | Impl.   | (char) | Impl. | Impl.  | Impl.   | Impl.  |
| short   | (byte) | ----    |        | Impl. | Impl.  | Impl.   | Impl.  |
| char    | (byte) | (short) | ----   | Impl. | Impl.  | Impl.   | Impl.  |
| int     | (byte) | (short) | (char) | ----  | Impl.  | Impl.   | Impl.  |
| long    | (byte) | (short) | (char) | (int) | ----   | Impl.   | Impl.  |
| float   | (byte) | (short) | (char) | (int) | (long) | ----    | Impl.  |
| double  | (byte) | (short) | (char) | (int) | (long) | (float) | ----   |

