import java.util.Scanner;

public class InicializacaoEscopoVariaveis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Frete cobrado?");
        boolean cobrarFrete = input.nextBoolean();

        double valorFrete;

        /*
        if (cobrarFrete) {
            valorFrete = input.nextDouble();
        }

        double valorTotal = 10 + valorFrete;
         exception: variable valorFrete might not have been initialized.
         Por ser um tipo primitivo, obrigatoriamente precisa ter valor.
         */

        if (cobrarFrete) {
            System.out.println("Valor do frete:");
            valorFrete = input.nextDouble();
        } else {
            valorFrete = 0;
        }

        double valorTotal = 10 + valorFrete;
    }
}