package br.stesuzart.exercicios.aula2;

import java.util.Scanner;

public class CategoriaProdutoExercicio {
    public enum CategoriaProduto {
        ELETRONICO,
        VESTUARIO,
        ALIMENTO
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a categoria do produto (ELETRONICO, VESTUARIO, ALIMENTO): ");
        String entrada = scanner.nextLine().toUpperCase();

        CategoriaProduto categoria;

        try {
            categoria = CategoriaProduto.valueOf(entrada);
        } catch (IllegalArgumentException e) {
            System.out.println("Categoria inválida!");
            return;
        }

        switch (categoria) {
            case ELETRONICO:
                System.out.println("Você escolheu a categoria Eletrônico. Produtos como celulares e notebooks estão aqui!");
                break;
            case VESTUARIO:
                System.out.println("Você escolheu a categoria Vestuário. Roupas e acessórios à sua disposição!");
                break;
            case ALIMENTO:
                System.out.println("Você escolheu a categoria Alimento. Aqui estão comidas e bebidas!");
                break;
        }
    }
}
