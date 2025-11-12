package br.stesuzart.exercicios.aula2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DatasFuturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos dias deseja adicionar à data de hoje? ");
        int dias = scanner.nextInt();

        LocalDate hoje = LocalDate.now();
        LocalDate futura = hoje.plusDays(dias);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data de hoje: " + hoje.format(formato));
        System.out.println("Data futura (+ " + dias + " dias): " + futura.format(formato));

        scanner.close();
    }
}
