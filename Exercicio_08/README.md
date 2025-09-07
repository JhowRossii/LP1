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

<details>
<summary><strong> Classes Exercício 4 </strong></summary> 

<br>

 - ## Classe Animal

  ```java

class Animal {
    private String nome;
    private String especie;
    private int idade;
    private double peso;
    private String habitat;

    public void comer() {
        System.out.println("O animal está comendo.");
    }

    public void dormir() {
        System.out.println("O animal está dormindo.");
    }

    public void emitirSom() {
        System.out.println("O animal está emitindo som.");
    }
}
  ```

 - ## Classe Estrela

  ```java

class Estrela {
    private String nome;
    private String tipo;
    private double massa;
    private double temperatura;

    public void brilhar() {
        System.out.println("A estrela está brilhando.");
    }

    public void explodir() {
        System.out.println("A estrela explodiu em uma supernova!");
    }

    public void alterarTemp() {
        System.out.println("A estrela alterou sua temperatura.");
    }
}
  ```

 - ## Classe Arvore

  ```java

class Arvore {
    private String tipo;
    private double altura;
    private int idade;

    public void crescer() {
        System.out.println("A árvore cresceu.");
    }

    public void produzirFrutos() {
        System.out.println("A árvore produziu frutos.");
    }

    public void fotossintetizar() {
        System.out.println("A árvore está realizando fotossíntese.");
    }
}
  ```

 - ## Classe Main

  ```java

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
  ```

</details>

<details>
<summary><strong> Classes Exercício 5 </strong></summary> 

<br>

 - ## Classe Construção 

  ```java

class Construcao {
    private String tipo;
    private String tamanho;
    private double altura;

    public void calcularArea() {
        System.out.println("Calculando área da construção...");
    }

    public void calcularQtdPessoas() {
        System.out.println("Calculando quantidade de pessoas suportada...");
    }

    public void adicionarComodo() {
        System.out.println("Adicionando cômodo à construção...");
    }
}
  ```

 - ## Classe Fazenda

  ```java

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
  ```

 - ## Classe Instrumento Musical

  ```java

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
  ```

 - ## Classe Main

  ```java

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
  ```

</details>











