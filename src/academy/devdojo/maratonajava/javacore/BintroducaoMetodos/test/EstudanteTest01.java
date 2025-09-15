package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;


import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.domino.Estudante;
import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.domino.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 =new Estudante();
        Estudante estudante02 =new Estudante();
        ImpressoraEstudante impressora =new ImpressoraEstudante();

        estudante01.nome="Midoriya";
        estudante01.idade=20;
        estudante01.sexo='M';

        estudante02.nome="Sakura";
        estudante02.idade=10;
        estudante02.sexo='F';
        impressora.Imprime(estudante01);
        System.out.println("---------- ");
        impressora.Imprime(estudante02);


    }
}
