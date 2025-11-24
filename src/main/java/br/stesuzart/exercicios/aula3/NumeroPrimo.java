package br.stesuzart.exercicios.aula3;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        // Scanner para ler o número digitado pelo usuário
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();

        // Números menores que 2 não são considerados primos
        if (numero < 2) {
            System.out.println(numero + " não é primo.");
            scanner.close();
            return; // encerra o programa mais cedo
        }

        int divisor = 2;      // primeiro possível divisor de um número
        boolean primo = true; // variável "flag" para marcar se o número é primo

        /*
           Estrutura while:
           Vamos testar todos os possíveis divisores de 2 até metade do número.
           Por quê? Porque nenhum número maior que metade do próprio número
           pode ser seu divisor (exceto ele mesmo).
        */
        while (divisor <= numero / 2) {

            // Se o resto da divisão for 0, achamos um divisor → não é primo
            if (numero % divisor == 0) {
                primo = false; // marca que não é mais primo
                break;         // podemos parar a busca
            }

            divisor++; // passa para o próximo divisor
        }

        // Verifica a variável "primo" e exibe o resultado
        if (primo) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        scanner.close(); // boa prática: fechar o Scanner
    }
}
