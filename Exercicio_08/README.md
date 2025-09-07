#  💻 Exercício 8: Classes em Java

> Usando Linguagem Java, codifique todas as classes geradas nos itens 2 a 5. 

<details>
<summary><strong> Classes Exercício 2 </strong></summary> 

<br>

 - ## Classe Nacionalidade 

  ```java

class Nacionalidade {
    private String pais;
    private String origem;
    private String identidade;

    public void identificarCultura() {
        System.out.println("Cultura identificada.");
    }
}
  ```

- ## Classe Roupa

 ```java

class Roupa {
    private String tipo;
    private int tamanho;
    private String estado;

    public void vestirRoupa() {
        System.out.println("Roupa vestida.");
    }
}
 ```

- ## Classe Profissão

 ```java

class Profissao {
    private String nome;
    private double salario;
    private String nivel;

    public void usarFerramenta() {
        System.out.println("Estou usando ferramentas para trabalhar melhor.");
    }
}
 ```

- ## Classe Main

 ```java

public class Main {

    public static void main(String[] args) {

        Nacionalidade japones = new Nacionalidade();
        japones.identificarCultura();

        Roupa bomboJaco = new Roupa();
        bomboJaco.vestirRoupa();

        Profissao dj = new Profissao();
        dj.usarFerramenta();
    }
}
 ```

</details>


<details>
<summary><strong> Classes Exercício 3 </strong></summary> 

<br>

### Classes da Imagem Paparazzi

 - ## Classe MaquinaFotografica

 ```java

class MaquinaFotografica {
    private String modelo;
    private String tipo;
    private String lente;

    public void tirarFoto() {
        System.out.println("Foto tirada pela câmera.");
    }
}
 ```

 - ## Classe Fotografia

 ```java

class Fotografia {
    private String data;
    private String resolucao;
    private String tipo;

    public void exibirFoto() {
        System.out.println("Foto exibida.");
    }
}
 ```

 - ## Classe Profissao

 ```java

class Profissao {
    private String nome;
    private double salario;
    private String nivel;

    public void desempenharAtividade() {
        System.out.println("Profissional desempenhando atividade.");
    }
}
 ```

 - ## Classe Main

 ```java

public class Main {
    public static void main(String[] args) {
        MaquinaFotografica filmadora = new MaquinaFotografica();
        filmadora.tirarFoto();

        Fotografia foto = new Fotografia();
        foto.exibirFoto();

        Profissao jornalista = new Profissao();
        jornalista.desempenharAtividade();
    }
}
 ```

---

### Classes da Imagem Sugar Children

 - ## Classe Pessoa

 ```java

class Pessoa {
    private String nome;
    private int idade;
    private String corCabelo;

    public void trabalhar() {
        System.out.println("A pessoa está trabalhando.");
    }
}
 ```

 - ## Classe Comida

 ```java

class Comida {
    private String tipo;
    private String textura;
    private double quantidade;

    public void consumir() {
        System.out.println("A comida foi consumida.");
    }
}
 ```

 - ## Classe Estado Emocional

 ```java

class EstadoEmocional {
    private String emocao;
    private String expressaoFacial;
    private String intensidade;

    public void modificarEmocao() {
        System.out.println("O estado emocional foi modificado.");
    }
}
 ```

 - ## Classe Main

 ```java

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
 ```

</details>



























