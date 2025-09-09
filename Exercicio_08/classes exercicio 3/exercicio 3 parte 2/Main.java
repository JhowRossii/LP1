import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando objeto de MaquinaFotografica
        MaquinaFotografica camera = new MaquinaFotografica("Canon EOS 90D", "Digital", "50mm");
        camera.tirarFoto();

        // Criando objeto de Fotografia
        Fotografia foto = new Fotografia(new Date(), "1920x1080", "Retrato");
        foto.exibiraFoto();

        // Criando objeto de Profissao
        Profissao jornalista = new Profissao("Carlos", 4500.00, "Pleno");
        jornalista.desempenharAtividade();
    }
}
