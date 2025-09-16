package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.domino.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 =new Estudante();
        Estudante estudante02 =new Estudante();
        estudante01.nome="cris";
        estudante01.idade=20;
        estudante01.sexo='M';

        estudante02.nome="Maribel";
        estudante02.idade=28;
        estudante02.sexo='F';

        estudante01.imprime();
        System.out.println("----------");
        estudante02.imprime();
    }
}
