package academy.devdojo.maratonajava.javacore.PadroesProjeto.Test;

import academy.devdojo.maratonajava.javacore.PadroesProjeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {

        Person build = new Person.Personbuider()
                .firstName("Cris")
                .lastName("Irineu")
                .build();
        System.out.println(build);


    }
}
