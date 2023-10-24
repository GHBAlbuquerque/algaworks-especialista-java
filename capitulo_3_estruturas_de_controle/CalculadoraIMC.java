package capitulo_3_estruturas_de_controle;

import java.util.Scanner;

public class CalculadoraIMC {

    private static final String mulher = "M";
    private static final String homem = "H";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual seu gênero? Digite H para Homem e M para Mulher: ");
        String genero = entrada.next();

        System.out.print("Qual seu IMC? ");
        Double imc = entrada.nextDouble();

        if (genero.equals(mulher)) {
            if (imc < 19.1) {
                System.out.println("Abaixo do peso.");
            } else if (imc >= 19.1 && imc <= 25.8) {
                System.out.println("No peso ideal");
            } else if (imc >= 25.9 && imc <= 27.3) {
                System.out.println("Um pouco acima do peso");
            } else if (imc >= 27.4 && imc <= 32.3) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obesa");
            }
            return;
        }

        if (genero.equals(homem)) {
            if (imc < 20.7) {
                System.out.println("Abaixo do peso.");
            } else if (imc >= 20.8 && imc <= 26.4) {
                System.out.println("No peso ideal");
            } else if (imc >= 26.5 && imc <= 27.8) {
                System.out.println("Um pouco acima do peso");
            } else if (imc >= 27.9 && imc <= 31.1) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obeso");
            }
            return;
        }
    }
}