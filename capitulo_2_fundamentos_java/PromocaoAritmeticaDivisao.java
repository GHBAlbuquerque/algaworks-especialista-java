public class PromocaoAritmeticaDivisao {

    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        // int resultado = x/y;
        // compila normalmente

        float resultado = x / y;
        /* compila normalmente, resultado 3.0
        a operação é feita usando tipos int, não o resultado é um int, ainda que colocado em uma variável tipo float
        a atribuição é feita depois do cálculo
        */

        System.out.println("Resultado: " + resultado);
    }

}