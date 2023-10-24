package capitulo_3_estruturas_de_controle;

public class CurtoCircuitoOperadoresLogicos {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean resultado = x == 10 && y++ == 20;
        //resultado: true. A avaliação da exp é feita ANTES da incrementação.

        System.out.println(resultado);
        System.out.println(y);
    }
}