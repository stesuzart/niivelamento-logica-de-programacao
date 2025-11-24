package br.stesuzart.exercicios.aula3;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplosCatch {
    public static void main(String[] args) {

        // Scanner para captar dados do usuário pelo teclado
        Scanner scanner = new Scanner(System.in);

        try {
            // --- PRIMEIRA PARTE: LER DATA ---
            System.out.println("Digite sua data de nascimento (YYYY-MM-DD):");

            // Lê a data como texto
            String dataStr = scanner.nextLine();

            // Converte a String para LocalDate
            // Se estiver em formato errado, dispara DateTimeParseException
            LocalDate dataNascimento = LocalDate.parse(dataStr);

            // --- SEGUNDA PARTE: FAZER UMA DIVISÃO ---
            System.out.println("Digite um número para dividir 10:");

            // Lê um número inteiro
            // Se o usuário digitar algo que não é número, dispara InputMismatchException
            int numero = scanner.nextInt();

            // Realiza a divisão
            // Se o número for 0, dispara ArithmeticException (divisão por zero)
            int resultado = 10 / numero;

            // Se tudo deu certo, exibe:
            System.out.println("Data de nascimento: " + dataNascimento);
            System.out.println("Resultado da divisão: " + resultado);

            // --- TRATAMENTO DE EXCEÇÕES ESPECÍFICAS ---

        } catch (DateTimeParseException e) {
            // Executado quando o formato da data é inválido
            System.out.println("Erro de data: Formato de data inválido. Use YYYY-MM-DD.");

        } catch (ArithmeticException e) {
            // Executado quando ocorre uma divisão por zero
            System.out.println("Erro de cálculo: Divisão por zero não é permitida.");

        } catch (InputMismatchException e) {
            // Executado quando o usuário digita algo que não é número inteiro
            System.out.println("Erro de entrada: O número digitado não é um inteiro válido.");

        } finally {
            // O bloco finally SEMPRE é executado
            // Boa prática: fechar o Scanner para liberar recursos
            scanner.close();
        }
    }
}
