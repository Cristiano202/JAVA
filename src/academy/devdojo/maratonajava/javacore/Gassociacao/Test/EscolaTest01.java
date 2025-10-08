package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1=new Professor("Dev CRISTIANO");
        Professor professor2=new Professor("Dev JOAO");
        Professor[] professores={professor1,professor2};
        Escola escola=new Escola("Escola gravatá pb",professores);

        escola.imprime();
    }
}
