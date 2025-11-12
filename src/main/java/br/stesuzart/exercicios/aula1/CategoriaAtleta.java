package br.stesuzart.exercicios.aula1;

import java.util.Scanner;

public class CategoriaAtleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do atleta: ");
        int idade = sc.nextInt();

        String categoria = (idade < 18) ? "Juvenil"
                          : (idade <= 40) ? "Adulto"
                          : "Master";

        System.out.println("Categoria: " + categoria);
        sc.close();
    }
}