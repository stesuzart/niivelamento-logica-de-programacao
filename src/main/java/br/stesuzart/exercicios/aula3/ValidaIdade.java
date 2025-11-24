package br.stesuzart.exercicios.aula3;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ValidaIdade {
    public static void main(String[] args) {

        // Scanner para ler dados digitados pelo usuário no teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento (formato YYYY-MM-DD):");

        // Lê a data como texto (String)
        String dataNascimentoStr = scanner.nextLine();

        try {
            // Converte a String para um objeto LocalDate
            // Caso o formato esteja errado, vai gerar uma exceção
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);

            // Pega a data atual do sistema
            LocalDate dataAtual = LocalDate.now();

            // Calcula a idade em anos completos usando ChronoUnit
            long idade = ChronoUnit.YEARS.between(dataNascimento, dataAtual);

            // Exibe o resultado para o usuário
            System.out.println("Você tem " + idade + " anos.");

        } catch (DateTimeParseException e) {
            // Caso a data esteja em formato incorreto, essa mensagem aparece
            System.out.println("Erro: Formato de data inválido. Por favor, use o formato YYYY-MM-DD.");

        } finally {
            // Fecha o Scanner (boa prática)
            scanner.close();
        }
    }
}
