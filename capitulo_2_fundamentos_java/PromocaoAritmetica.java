public class PromocaoAritmetica {

    public static void main(String[] args) {
        long x = 10;
        int y = 5;

        // int resultado = x * y;
        // error: incompatible types: possible lossy conversion from long to int

        long resultado = x * y;


        System.out.println("Resultado: " + resultado);
    }

}