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

    }
}
