import java.util.Scanner;

public class CalculadoraNotas {

    // Método para ler e validar nota
    public static double lerNota(Scanner sc, String mensagem, double min, double max) {
        double nota;
        do {
            System.out.println(mensagem);
            String input = sc.next();
            input = input.replace(',', '.'); // Aceitar vírgula ou ponto
            try {
                nota = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Erro, digite apenas números.");
                nota = -1;
            }
            if (nota < min || nota > max) {
                System.out.println("Valor inválido! Digite entre " + min + " e " + max + ".");
            }
        } while (nota < min || nota > max);

        sc.nextLine(); // limpar buffer
        return nota;
    }

    // Método para calcular a média de atividades
    public static double calcularMediaAtividades(double p1, double e1, double e2, double x, double sub) {
        double media = (p1 * 0.5) + (e1 * 0.2) + (e2 * 0.3) + x + (sub * 0.15);
        return Math.min(media, 10); // Limitar a no máximo 10
    }

    // Método para verificar se precisa de prova substitutiva
    public static boolean precisaSubstitutiva(double p1, double e1, double e2) {
        return (p1 <= 6 || e1 <= 6 || e2 <= 6);
    }

    // Método para exibir o resultado final formatado
    public static void exibirResultado(String nomeAluno, double p1, double e1, double e2,
                                       double x, double sub, double api,
                                       double mediaAtividades, double mediaFinal) {
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
    }
}
