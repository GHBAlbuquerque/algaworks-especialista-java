package capitulo_3_estruturas_de_controle;

import java.util.Scanner;

public class DesafioEstruturaWhile {

    /*
    4) Desafio da estrutura while (intermediário)
    Escreva um programa que solicita um número inteiro para o usuário
    e imprime na saída o número com os dígitos invertidos.
    Por exemplo, se o número digitador for 98765, a saída deve ser 56789.
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int inteiro = input.nextInt();

        String numeroDigitado = String.valueOf(inteiro);
        String numeroInvertido = "";
        int contador = numeroDigitado.length() - 1;

        while (numeroInvertido.length() < numeroDigitado.length()) {
            numeroInvertido += String.valueOf(numeroDigitado.charAt(contador));
            contador--;
        }

        System.out.println("Número digitado: " + numeroDigitado);
        System.out.println("Número invertido: " + numeroInvertido);
    }
}