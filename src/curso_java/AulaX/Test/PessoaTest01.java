package curso_java.AulaX.Test;

import curso_java.AulaX.dominio.Aluno;
import curso_java.AulaX.dominio.Pessoa;
import curso_java.AulaX.dominio.Professor;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa p1=new Pessoa();
        Aluno p2=new Aluno();
        Professor p3=new Professor();

        p1.setNome("Cris ");
        p1.setIdade(15);
        p1.setSexo("M");

        p2.setNome("Cris ");
        p2.setIdade(15);
        p2.setSexo("M");

        p3.setNome("Cris ");
        p3.setIdade(15);
        p3.setSexo("M");
    }
}
