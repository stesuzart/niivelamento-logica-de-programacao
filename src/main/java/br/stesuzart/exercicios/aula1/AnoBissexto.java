package br.stesuzart.exercicios.aula1;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        String resultado = ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
                ? "Ano bissexto"
                : "Ano comum";

        System.out.println(resultado);

        sc.close();
    }
}