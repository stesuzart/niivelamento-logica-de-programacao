package br.stesuzart.exercicios.aula2;

import java.util.Scanner;


public class Calculadora {
    enum OperacaoMatematica {
        SOMA, SUBTRACAO, MULTIPLICACAO, DIVISAO
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char simbolo = scanner.next().charAt(0);

        OperacaoMatematica operacao = null;

        switch (simbolo) {
            case '+': operacao = OperacaoMatematica.SOMA; break;
            case '-': operacao = OperacaoMatematica.SUBTRACAO; break;
            case '*': operacao = OperacaoMatematica.MULTIPLICACAO; break;
            case '/': operacao = OperacaoMatematica.DIVISAO; break;
            default:
                System.out.println("Operação inválida!");
                return;
        }

        double resultado = 0;

        switch (operacao) {
            case SOMA: resultado = num1 + num2; break;
            case SUBTRACAO: resultado = num1 - num2; break;
            case MULTIPLICACAO: resultado = num1 * num2; break;
            case DIVISAO: resultado = num2 != 0 ? num1 / num2 : Double.NaN; break;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
