package br.stesuzart.exercicios.aula2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EmendaFeriadoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a data do feriado (formato: yyyy-MM-dd): ");
        LocalDate feriado = LocalDate.parse(sc.nextLine());

        // Verifica se tem emenda (terça ou quinta)
        if (feriado.getDayOfWeek() == DayOfWeek.TUESDAY || feriado.getDayOfWeek() == DayOfWeek.THURSDAY) {
            System.out.println("Tem emenda! Vamos planejar a viagem!");
        } else {
            System.out.println("Sem emenda.");
        }

        LocalDate hoje = LocalDate.now();
        long diasTotais = ChronoUnit.DAYS.between(hoje, feriado);
        long semanas = diasTotais / 7;

        int diasUteis = 0;
        LocalDate data = hoje;

        while (data.isBefore(feriado)) {
            DayOfWeek dia = data.getDayOfWeek();
            if (dia != DayOfWeek.SATURDAY && dia != DayOfWeek.SUNDAY) {
                diasUteis++;
            }
            data = data.plusDays(1);
        }

        System.out.println("\nFaltam:");
        System.out.println(diasTotais + " dias no total");
        System.out.println(diasUteis + " dias úteis (seg a sex)");
        System.out.println(semanas + " semanas");

        sc.close();
    }
}
