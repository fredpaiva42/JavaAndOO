package sintaxeBasica;

public class TestaPontoFlutuante {

    public static void main(String[] args) {
        double salario;
        salario = 1250.70;
        double divisao;
        divisao = 3.14/2;
        System.out.println("meu salário é " + salario);
        System.out.println(divisao);

        // int valor = 12.5; não compila.
        // int valor2 = 0.0; não compila.
        double teste = 125.50; // compila
        //int valor3 = teste; não compila.
        double teste2 = 135; // compila
    }
}
