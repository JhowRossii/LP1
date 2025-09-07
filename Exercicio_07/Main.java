import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lerNota = new Scanner(System.in);

        boolean repetir; // controle para repetir o programa

        do {
            // Entrada do nome do aluno
            System.out.println("Digite o nome do aluno:");
            String nomeAluno = lerNota.nextLine();

            System.out.println("Olá " + nomeAluno + ", vamos calcular sua média com suas notas de atividades mais a nota de Api.");
            System.out.println();

            double p1;
            do {
                System.out.println("Digite a nota da P1, de 0 a 10: ");
                String input = lerNota.next();
                input = input.replace(',', '.'); // substitui vírgula por ponto
                try {
                    p1 = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Erro, digite apenas números.");
                    p1 = -1;
                }
            } while (p1 < 0 || p1 > 10);

            double e1;
            do {
                System.out.println("Digite a nota da E1, de 0 a 10: ");
                String input = lerNota.next();
                input = input.replace(',', '.');
                try {
                    e1 = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Erro, digite apenas números.");
                    e1 = -1;
                }
            } while (e1 < 0 || e1 > 10);

            double e2;
            do {
                System.out.println("Digite a nota da E2, de 0 a 10: ");
                String input = lerNota.next();
                input = input.replace(',', '.');
                try {
                    e2 = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Erro, digite apenas números.");
                    e2 = -1;
                }
            } while (e2 < 0 || e2 > 10);

            double x;
            do {
                System.out.println("Digite a nota das atividades extras, de 0 a 2:");
                String input = lerNota.next();
                input = input.replace(',', '.');
                try {
                    x = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Erro, digite apenas números.");
                    x = -1;
                }
            } while (x < 0 || x > 2);

            // --- AQUI ENTRA A LÓGICA PARA SÓ PEDIR SUBSTITUTIVA SE NECESSÁRIO ---
            double sub = 0;
            if (p1 <= 6 || e1 <= 6 || e2 <= 6) {
                do {
                    System.out.println("Digite a nota da prova substitutiva, de 0 a 10:");
                    String input = lerNota.next();
                    input = input.replace(',', '.');
                    try {
                        sub = Double.parseDouble(input);
                    } catch (NumberFormatException e) {
                        System.out.println("Erro, digite apenas números.");
                        sub = -1;
                    }
                } while (sub < 0 || sub > 10);
            } else {
                System.out.println("Suas notas em P1, E1 e E2 foram todas acima de 6, não precisa de prova substitutiva.");
            }

            double api;
            do {
                System.out.println("Digite a nota da Api: ");
                String input = lerNota.next();
                input = input.replace(',', '.');
                try {
                    api = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Erro, digite apenas números.");
                    api = -1;
                }
            } while (api < 0 || api > 10);

            lerNota.nextLine(); // Limpar buffer

            // Cálculo
            double mediaAtividades = ((p1 * 0.5) + (e1 * 0.2) + (e2 * 0.3) + x + (sub * 0.15));
            mediaAtividades = Math.min(mediaAtividades, 10); // trava para não ultrapassar 10

            double mediaFinal;
            if (mediaAtividades <= 5.9) {
                mediaFinal = mediaAtividades * 0.50;
            } else {
                mediaFinal = ((mediaAtividades * 0.50) + (api * 0.50));
            }

            // Exibição do resultado final formatado
            System.out.println("\n------------------- RESULTADO FINAL -------------------");
            System.out.println("ALUNO: " + nomeAluno);
            System.out.println("NOTAS:");
            System.out.println("P1: " + p1);
            System.out.println("E1: " + e1);
            System.out.println("E2: " + e2);
            System.out.println("ATIVIDADES EXTRAS: " + x);
            System.out.println("PROVA SUBSTITUTIVA: " + sub);
            System.out.println("API: " + api);
            System.out.printf("NOTA FINAL DE LINGUAGEM DE PROGRAMACAO: %.2f%n", mediaAtividades);
            System.out.printf("MEDIA FINAL: %.2f%n", mediaFinal);
            System.out.println("SITUACAO: " + (mediaFinal >= 6 ? "APROVADO" : "REPROVADO"));
            System.out.println("-------------------------------------------------------\n");

            // Perguntar se deseja repetir
            System.out.println("Deseja calcular a média de outro aluno? (S/N)");
            String resposta = lerNota.nextLine().trim().toUpperCase();
            repetir = resposta.equals("S");

        } while (repetir);

        lerNota.close();
        System.out.println("Programa encerrado. Até mais!");
    }
}
