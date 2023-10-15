public class PromocaoAritmeticaPontoFlutuante {

    public static void main(String[] args) {
        long x = 10;
        float y = 5f;

        // long resultado = x * y;
        // error: incompatible types: possible lossy conversion from float to long

        float resultado = x * y;


        System.out.println("Resultado: " + resultado);
    }

}