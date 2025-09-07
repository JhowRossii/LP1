# 💿 Exercício 7: Codar em Java

# 🧮 **Teste de Mesa – Cálculo de Média**

Usando Linguagem Java, codifique uma classe que lê as entradas via teclado e forneça o cálculo da média, conforme o item 1.

<details>
<summary><strong> 💻 Main </strong></summary> 

```java
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


```
</details>

<details>
<summary><strong> 🔎 Refatoração do código do exercício </strong></summary> 

<br> 

<details>
<summary><strong> Por que devemos separar o código ? </strong></summary> 

<br>

<details>
<summary><strong> 🔴 1. Organização e Clareza </strong></summary> 
  
    - Quando todo o código está em um único arquivo, ele se torna confuso e difícil de ler.
    - Separando em arquivos diferentes, cada classe ou funcionalidade fica em seu próprio arquivo, facilitando a localização do código e a compreensão por outros desenvolvedores.
    - Exemplo:
      - Main.java → contém apenas o ponto de entrada do programa (main).
      - CalculadoraMedia.java → contém toda a lógica de cálculo da média.
    - Isso segue o princípio da responsabilidade única (SRP), onde cada classe tem apenas uma função clara.
</details> 

<details>
<summary><strong> 🔴 2. Reaproveitamento de Código (Reuso) </strong></summary> 
  
  - Quando a lógica está separada em uma classe, você pode reaproveitar essa lógica em outros programas sem precisar copiar e colar tudo.
    -Exemplo: A classe CalculadoraMedia pode ser usada em outro projeto que também precise calcular médias, sem depender do código da Main.
</details> 

<details>
<summary><strong> 🔴 3. Facilidade na Manutenção </strong></summary> 
  
  - Quando precisar corrigir um erro ou adicionar uma nova funcionalidade, você só precisa alterar a parte específica do código, sem mexer no restante.
  - Isso evita quebrar outras funcionalidades e reduz o risco de bugs.

</details>

<details>
<summary><strong> 🔴 4. Testes mais simples </strong></summary> 

  - Classes separadas permitem criar testes unitários facilmente, testando cada parte do código isoladamente.
    - Exemplo:
      -Testar apenas a lógica de cálculo na CalculadoraMedia.java sem precisar rodar todo o programa.

</details>

<details>
<summary><strong> 🔴 5. Boas práticas de mercado </strong></summary> 

  - No mercado de trabalho, projetos são grandes e complexos.
  - Se tudo estivesse em um único arquivo, seria impossível várias pessoas trabalharem juntas sem se atrapalharem.
  - Separar em arquivos é um padrão exigido em desenvolvimento profissional.

</details>

<details>
<summary><strong> 🔴Como ficou a separação </strong></summary> 
  
<pre>
src/
│
├── Main.java              # Ponto de entrada do programa
└── CalculadoraMedia.java  # Toda a lógica de cálculo da média
</pre>

</details>

🎯**Resumo:**

Main.java → Controla o fluxo do programa e interage com o usuário.

CalculadoraMedia.java → Contém os métodos de cálculo e validações.
<br>

<details>
<summary><strong> 💻 Main </strong></summary> 

```java

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

```
</details>

<details>
<summary><strong> 💻 CalculadoraNotas </strong></summary> 

```java
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

```
</details>

</details>
