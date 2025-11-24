package br.stesuzart.exercicios.aula3;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HorarioReuniao {
    public static void main(String[] args) {

        // Scanner para ler entrada do usuário pelo teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data e hora da reunião (formato YYYY-MM-DDTHH:mm:ss):");

        // Lê a data e hora como texto
        // Exemplo correto: 2025-12-01T15:30:00
        String dataHoraStr = scanner.nextLine();

        try {
            // Converte o texto digitado para um objeto LocalDateTime
            // Caso o formato esteja errado, será lançada uma exceção
            LocalDateTime dataHoraReuniao = LocalDateTime.parse(dataHoraStr);

            // Se a conversão funcionar, mostra a data da reunião
            System.out.println("Reunião agendada para: " + dataHoraReuniao);

        } catch (DateTimeParseException e) {
            // Mensagem exibida quando o usuário digita no formato errado
            System.out.println("Erro: Formato de data e hora inválido. Por favor, use o formato YYYY-MM-DDTHH:mm:ss.");

        } finally {
            // Fecha o Scanner (boa prática)
            scanner.close();
        }
    }
}
