package curso_java.Aula12.Animais;

import curso_java.Aula12.Dominio.Mamifero;

public class Cachorro extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo");

    }
    @Override
    public void locomover() {
        System.out.println("Cachorro correndo");

    }

}
