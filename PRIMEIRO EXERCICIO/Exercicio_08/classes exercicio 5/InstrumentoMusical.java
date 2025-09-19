class InstrumentoMusical {
    private String tipo;
    private String nome;
    private double preco;

    public void tocar() {
        System.out.println("Tocando o instrumento musical...");
    }

    public void consertar() {
        System.out.println("Consertando o instrumento...");
    }

    public void afinar() {
        System.out.println("Afinando o instrumento...");
    }
}