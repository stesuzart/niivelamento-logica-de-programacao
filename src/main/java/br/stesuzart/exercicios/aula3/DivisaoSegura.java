package br.stesuzart.exercicios.aula3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoSegura {
    public static void main(String[] args) {

        // Scanner para ler os números digitados pelo usuário
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita o primeiro número inteiro
            System.out.println("Digite o primeiro número inteiro:");
            int numero1 = scanner.nextInt(); // Pode gerar InputMismatchException

            // Solicita o segundo número inteiro
            System.out.println("Digite o segundo número inteiro:");
            int numero2 = scanner.nextInt(); // Também pode gerar InputMismatchException

            // Realiza a divisão
            // Se numero2 for 0, gera ArithmeticException
            int resultado = numero1 / numero2;

            // Mostra o resultado na tela
            System.out.println("O resultado da divisão é: " + resultado);

        } catch (ArithmeticException e) {
            // Tratamento para tentar dividir por zero
            System.out.println("Erro: Divisão por zero não é permitida.");

        } catch (InputMismatchException e) {
            // Tratamento para caso o usuário digite algo que não seja número inteiro
            System.out.println("Erro: Entrada inválida. Por favor, digite apenas números inteiros.");

        } finally {
            // O bloco finally é sempre executado
            // Boa prática: fechar o Scanner
            scanner.close();
        }
    }
}
