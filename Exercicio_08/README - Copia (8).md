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


