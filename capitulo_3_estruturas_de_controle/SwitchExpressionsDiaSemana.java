package capitulo_3_estruturas_de_controle;

import java.util.Scanner;

public class SwitchExpressionsDiaSemana {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dia da semana (ex: seg, ter, qua, etc): ");
        String diaSemana = entrada.nextLine();

        // java 14 para frente
        // atribui o resultado da execução diretamente em uma variável
        String horarioFuncionamento = switch (diaSemana) {
            case "seg" -> "Fechado";
            case "ter", "qua", "qui", "sex" -> "08:00 às 17:00";
            case "sab", "dom" -> "09:00 às 16:00";
            default -> "fechado";
        };

        System.out.println(horarioFuncionamento);
    }
}