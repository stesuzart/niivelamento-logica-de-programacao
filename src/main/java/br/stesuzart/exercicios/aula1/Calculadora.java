package br.stesuzart.exercicios.aula1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        // truque: usa o código ASCII do operador para escolher a operação
        double resultado =
                (toNum(op == '+')) * (a + b)
                        + (toNum(op == '-')) * (a - b)
                        + (toNum(op == '*')) * (a * b)
                        + (toNum(op == '/')) * (a / b);

        System.out.println("Resultado: " + resultado);
        sc.close();
    }

    private static int toNum(boolean condicao) {
        return condicao ? 1 : 0;
    }
}
