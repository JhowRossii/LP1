public class Main {
    public static void main(String[] args) {
        Pessoa crianca = new Pessoa();
        crianca.trabalhar();

        Comida acucar = new Comida();
        acucar.consumir();

        EstadoEmocional felicidade = new EstadoEmocional();
        felicidade.modificarEmocao();
    }
}