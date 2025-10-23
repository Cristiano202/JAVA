package curso_java.AulaX.Test;

import curso_java.AulaX.dominio.Aluno;

import curso_java.AulaX.dominio.Bolsista;
import curso_java.AulaX.dominio.Professor;
import curso_java.AulaX.dominio.Visitante;

public class PessoaTest01 {
    public static void main(String[] args) {
        //Pessoa p1=new Pessoa();
        Aluno p2=new Aluno();
        Professor p3=new Professor();
        Visitante v1=new Visitante();
        Bolsista b1=new Bolsista();

        v1.setNome("Cris ");
        v1.setIdade(15);
        v1.setSexo("M");
        System.out.println(v1.toString());

        p2.setNome("Cristiano ");
        p2.setIdade(150);
        p2.setSexo("Mm");
        p2.pagarMensalidade();
        System.out.println(p2.toString());

        p3.setNome("Cris ");
        p3.setIdade(15);
        p3.setSexo("M");

        System.out.println("======");
        b1.setNome("Cris ");
        b1.setIdade(15);
        b1.setSexo("M");
        b1.pagarMensalidade();
        System.out.println(b1.toString());

    }
}
