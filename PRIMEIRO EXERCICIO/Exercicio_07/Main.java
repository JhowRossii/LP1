import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repetir;

        do {
            System.out.println("Digite o nome do aluno:");
            String nomeAluno = sc.nextLine();

            System.out.println("Olá " + nomeAluno + ", vamos calcular sua média com suas notas de atividades mais a nota de Api.\n");

            // Coletando notas principais
            double p1 = CalculadoraNotas.lerNota(sc, "Digite a nota da P1, de 0 a 10:", 0, 10);
            double e1 = CalculadoraNotas.lerNota(sc, "Digite a nota da E1, de 0 a 10:", 0, 10);
            double e2 = CalculadoraNotas.lerNota(sc, "Digite a nota da E2, de 0 a 10:", 0, 10);
            double x = CalculadoraNotas.lerNota(sc, "Digite a nota das atividades extras, de 0 a 2:", 0, 2);

            // Prova substitutiva só se necessário
            double sub = 0;
            if (CalculadoraNotas.precisaSubstitutiva(p1, e1, e2)) {
                sub = CalculadoraNotas.lerNota(sc, "Digite a nota da prova substitutiva, de 0 a 10:", 0, 10);
            } else {
                System.out.println("Suas notas em P1, E1 e E2 foram todas acima de 6, não precisa de prova substitutiva.");
            }

            // Nota da API
            double api = CalculadoraNotas.lerNota(sc, "Digite a nota da Api:", 0, 10);

            // Cálculo das médias
            double mediaAtividades = CalculadoraNotas.calcularMediaAtividades(p1, e1, e2, x, sub);
            double mediaFinal = (mediaAtividades <= 5.9) ? mediaAtividades * 0.50 : (mediaAtividades * 0.50) + (api * 0.50);

            // Exibir resultados
            CalculadoraNotas.exibirResultado(nomeAluno, p1, e1, e2, x, sub, api, mediaAtividades, mediaFinal);

            // Perguntar se deseja repetir
            System.out.println("Deseja calcular a média de outro aluno? (S/N)");
            String resposta = sc.nextLine().trim().toUpperCase();
            repetir = resposta.equals("S");

        } while (repetir);

        sc.close();
        System.out.println("Programa encerrado. Até mais!");
    }
}
