package curso_java.AulaX.Test;

import curso_java.AulaX.dominio.Aluno;
import curso_java.AulaX.dominio.Pessoa;
import curso_java.AulaX.dominio.Professor;
import curso_java.AulaX.dominio.Visitante;

public class PessoaTest01 {
    public static void main(String[] args) {
        //Pessoa p1=new Pessoa();
        Aluno p2=new Aluno();
        Professor p3=new Professor();
        Visitante v1=new Visitante();

        v1.setNome("Cris ");
        v1.setIdade(15);
        v1.setSexo("M");
        System.out.println(v1.toString());

        p2.setNome("Cristiano ");
        p2.setIdade(150);
        p2.setSexo("Mm");
        System.out.println(p2.toString());

        p3.setNome("Cris ");
        p3.setIdade(15);
        p3.setSexo("M");
    }
}
