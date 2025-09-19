public class MaquinaFotografica {
    // Atributos
    private String modelo;
    private String tipo;
    private String lente;

    // Construtor
    public MaquinaFotografica(String modelo, String tipo, String lente) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.lente = lente;
    }

    // Método
    public void tirarFoto() {
        System.out.println("Foto tirada com a máquina " + modelo + " usando a lente " + lente + ".");
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLente() {
        return lente;
    }

    public void setLente(String lente) {
        this.lente = lente;
    }
}
