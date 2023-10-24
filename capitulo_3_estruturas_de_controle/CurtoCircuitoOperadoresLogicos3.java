package capitulo_3_estruturas_de_controle;

public class CurtoCircuitoOperadoresLogicos3 {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        boolean resultado = x == 10 || y++ == 20;
        //resultado: true. Y não chega a ser incrementado por conta do curto circuito.

        System.out.println(resultado);
        System.out.println(y);
    }
}