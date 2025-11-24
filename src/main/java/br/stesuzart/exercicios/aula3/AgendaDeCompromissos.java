package br.stesuzart.exercicios.aula3;

import java.util.Scanner;

public class AgendaDeCompromissos {

    public static void main(String[] args) {

        // try-with-resources → o Scanner será fechado automaticamente
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("*** Sistema de Agendamento ***");

            // Lê o dia da semana
            System.out.print("Informe o dia da semana (1=Segunda ... 7=Domingo): ");
            int dia = sc.nextInt();

            // Valida se é dia útil
            if (dia < 1 || dia > 7) {
                System.out.println("Dia inválido!");
                return;
            }

            if (dia == 6 || dia == 7) {
                System.out.println("Não é possível agendar no fim de semana.");
                return;
            }

            // Lê o horário desejado
            System.out.print("Informe o horário (0 a 23): ");
            int hora = sc.nextInt();

            // Valida se está dentro do horário comercial
            if (hora < 8 || hora > 18) {
                System.out.println("Horário fora do expediente! (Permitido 08h às 18h)");
                return;
            }

            // Se tudo ok
            System.out.println("Compromisso agendado com sucesso!");
            System.out.println("Dia: " + dia + " | Hora: " + hora + "h");
        }
    }
}
