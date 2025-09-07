public class Main {
    public static void main(String[] args) {
        Construcao casa = new Construcao();
        casa.calcularArea();
        casa.calcularQtdPessoas();
        casa.adicionarComodo();

        Fazenda fazendinha = new Fazenda();
        fazendinha.adicionarAnimal();
        fazendinha.calcularDensidadeAnimal();
        fazendinha.calcularAreaLivre();

        InstrumentoMusical violao = new InstrumentoMusical();
        violao.tocar();
        violao.afinar();
        violao.consertar();
    }
}