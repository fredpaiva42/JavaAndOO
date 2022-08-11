package sintaxeBasica;

public class TestaConversao {
    public static void main(String[] args){
        /*
         double salario = 1270.50;
         int valor = salario; não funciona.
        */

        // double valor = 3; // converte implicitamente 3 para 3.0

        double salario = 1270.50;
        int valor = (int) salario; // Usando o casting nós conseguimos forçar a conversão
        System.out.println(valor);

        float pi = 3.14f;
    }
}
