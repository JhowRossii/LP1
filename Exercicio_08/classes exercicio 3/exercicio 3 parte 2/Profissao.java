public class Profissao {
    // Atributos
    private String nome;
    private double salario;
    private String nivel;

    // Construtor
    public Profissao(String nome, double salario, String nivel) {
        this.nome = nome;
        this.salario = salario;
        this.nivel = nivel;
    }

    // Método
    public void desempenharAtividade() {
        System.out.println(nome + " está desempenhando sua atividade como jornalista nível " + nivel + ".");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
