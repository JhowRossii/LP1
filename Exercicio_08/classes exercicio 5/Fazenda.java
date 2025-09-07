class Fazenda {
    private String nome;
    private double hectares;
    private int qtdeAnimais;

    public void adicionarAnimal() {
        qtdeAnimais++;
        System.out.println("Animal adicionado. Total agora: " + qtdeAnimais);
    }

    public void calcularDensidadeAnimal() {
        System.out.println("Densidade: " + (qtdeAnimais / hectares) + " animais/hectare");
    }

    public void calcularAreaLivre() {
        System.out.println("Área livre disponível: " + (hectares - qtdeAnimais * 0.1));
    }
}