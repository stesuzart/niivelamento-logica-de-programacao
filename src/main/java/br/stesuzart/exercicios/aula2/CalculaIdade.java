package br.stesuzart.exercicios.aula2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento (formato: yyyy-MM-dd): ");
        LocalDate nascimento = LocalDate.parse(sc.nextLine());

        LocalDate hoje = LocalDate.now();

        Period idade = Period.between(nascimento, hoje);

        System.out.println("Idade: " 
                + idade.getYears() + " anos, " 
                + idade.getMonths() + " meses e " 
                + idade.getDays() + " dias.");

        sc.close();
    }
}
