package br.stesuzart.exercicios.aula3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        // Scanner para ler dados digitados pelo usuário no teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário informe um número
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt(); // lê o número digitado

        /*
         * Estrutura de repetição for:
         * i começa em 1 e vai até 10.
         * A cada repetição, i é incrementado em 1.
         * Em cada passo, calculamos "numero * i".
         */
        for (int i = 1; i <= 10; i++) {

            // Calcula a multiplicação do número escolhido pelo valor atual de i
            int resultado = numero * i;

            // Exibe o formato "numero x i = resultado"
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Boa prática: fechar o Scanner para liberar recursos
        scanner.close();
    }
}
