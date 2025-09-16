package academy.devdojo.maratonajava.javacore.Ex.test;

import academy.devdojo.maratonajava.javacore.Ex.domino.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa =new Pessoa();

        pessoa.setNome("Cris");
        pessoa.setIdade(19);
        pessoa.imprime();
    }
}
