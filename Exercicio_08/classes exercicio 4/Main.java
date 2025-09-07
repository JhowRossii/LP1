public class Main {
    public static void main(String[] args) {
        Animal garca = new Animal();
        garca.comer();
        garca.dormir();
        garca.emitirSom();

        Estrela sol = new Estrela();
        sol.brilhar();
        sol.alterarTemp();
        sol.explodir();

        Arvore palmeira = new Arvore();
        palmeira.crescer();
        palmeira.produzirFrutos();
        palmeira.fotossintetizar();
    }
}