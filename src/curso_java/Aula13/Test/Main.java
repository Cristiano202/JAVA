package curso_java.Aula13.Test;

import curso_java.Aula13.Animal.Cachorro;
import curso_java.Aula13.Animal.Lobo;
import curso_java.Aula13.Animal.Mamifero;

public class Main {
    public static void main(String[] args) {
        Lobo lb=new Lobo();
        Cachorro cc=new Cachorro();
        Mamifero mm=new Mamifero();

        lb.emitirSom();
        cc.emitirSom();
        System.out.println("------------CACHORRO-------------");
        cc.reagir("Ola");
        cc.reagir("Vai apanhar");
        cc.reagir(11,45);
        cc.reagir(21,00);
        cc.reagir("verdadeiro");
        cc.reagir("false");
        cc.reagir(2,12.5f);
        cc.reagir(17,4.5f);

    }
}
