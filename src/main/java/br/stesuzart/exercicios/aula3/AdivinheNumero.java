package br.stesuzart.exercicios.aula3;

import java.util.Random;
import java.util.Scanner;

public class AdivinheNumero {
    public static void main(String[] args) {

        // Scanner para ler o palpite do usuário
        Scanner scanner = new Scanner(System.in);

        // Objeto Random para gerar números aleatórios
        Random random = new Random();

        // Gera um número ENTRE 1 e 10
        // random.nextInt(10) → gera de 0 a 9
        // +1 → ajusta para 1 a 10
        int numeroSecreto = random.nextInt(10) + 1;

        int palpite; // variável que receberá os palpites do usuário

        System.out.println("*** Jogo: Adivinhe o Número ***");
        System.out.println("Tente adivinhar o número entre 1 e 10!");

        /*
         * Estrutura do-while:
         * - O bloco interno roda pelo menos uma vez
         * - O jogo continua enquanto o palpite for diferente do número secreto
         */
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt(); // lê o palpite digitado

            // Compara o palpite com o número secreto
            if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }

        } while (palpite != numeroSecreto); // continua até acertar

        // Boa prática: fechar o Scanner
        scanner.close();
    }
}
