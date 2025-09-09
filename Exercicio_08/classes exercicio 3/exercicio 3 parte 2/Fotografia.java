import java.util.Date;

public class Fotografia {
    // Atributos
    private Date data;
    private String resolucao;
    private String tipo;

    // Construtor
    public Fotografia(Date data, String resolucao, String tipo) {
        this.data = data;
        this.resolucao = resolucao;
        this.tipo = tipo;
    }

    // Método
    public void exibiraFoto() {
        System.out.println("Foto do tipo " + tipo + " em resolução " + resolucao + " tirada em " + data);
    }

    // Getters e Setters
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
