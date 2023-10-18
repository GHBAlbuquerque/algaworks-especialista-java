import java.util.Scanner;

public class SwitchExpressionsDiaSemana2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dia da semana (ex: seg, ter, qua, etc): ");
        String diaSemana = entrada.nextLine();

        System.out.print("Mês: ");
        int mes = entrada.nextInt();

        //yield é como um return interno ao switch
        System.out.printf("Horário de funcionamento: %s%n", switch (diaSemana) {
            case "seg" -> {
                if (mes == 12) {
                    yield "08:00 às 16:00";
                }
                yield "Fechado";
            }
            case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
            case "sab", "dom" -> "08:00 às 12:00";
            default -> "Dia inválido";
        });
    }
}