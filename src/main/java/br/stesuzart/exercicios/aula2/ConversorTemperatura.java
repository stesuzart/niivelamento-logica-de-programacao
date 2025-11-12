package br.stesuzart.exercicios.aula2;

import java.util.Scanner;

public class ConversorTemperatura {
    enum UnidadeTemperatura {
        CELSIUS, FAHRENHEIT, KELVIN
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a unidade atual (CELSIUS, FAHRENHEIT, KELVIN): ");
        UnidadeTemperatura origem = UnidadeTemperatura.valueOf(scanner.next().toUpperCase());

        System.out.print("Digite a unidade desejada (CELSIUS, FAHRENHEIT, KELVIN): ");
        UnidadeTemperatura destino = UnidadeTemperatura.valueOf(scanner.next().toUpperCase());

        System.out.print("Digite a temperatura atual: ");
        double valor = scanner.nextDouble();

        double resultado = 0;

        switch (origem) {
            case CELSIUS:
                switch (destino) {
                    case FAHRENHEIT: resultado = (valor * 9 / 5) + 32; break;
                    case KELVIN: resultado = valor + 273.15; break;
                    case CELSIUS: resultado = valor; break;
                }
                break;

            case FAHRENHEIT:
                switch (destino) {
                    case CELSIUS: resultado = (valor - 32) * 5 / 9; break;
                    case KELVIN: resultado = (valor + 459.67) * 5 / 9; break;
                    case FAHRENHEIT: resultado = valor; break;
                }
                break;

            case KELVIN:
                switch (destino) {
                    case CELSIUS: resultado = valor - 273.15; break;
                    case FAHRENHEIT: resultado = (valor * 9 / 5) - 459.67; break;
                    case KELVIN: resultado = valor; break;
                }
                break;
        }

        System.out.printf("Temperatura convertida: %.2f %s%n", resultado, destino);

        scanner.close();
    }
}
