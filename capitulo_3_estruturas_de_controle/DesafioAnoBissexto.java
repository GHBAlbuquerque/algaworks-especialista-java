package capitulo_3_estruturas_de_controle;

import java.util.Scanner;

public class DesafioAnoBissexto {
	/*
	•	São bissextos todos os anos múltiplos de 400, por exemplo: 1600, 2000, 2400, etc
	•	São bissextos todos os múltiplos de 4 e não múltiplos de 100, por exemplo: 1996, 2004, 2008, 2012, etc
	•	Não são bissextos todos os demais anos
	*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano desejado: ");
        int ano = input.nextInt();

        if (ano % 400 != 0 && (ano % 4 != 0 || ano % 100 == 0)) {
            System.out.printf("O ano %s não é bissexto", ano);
            return;
        }

        System.out.printf("O ano %s é bissexto", ano);

    }
}