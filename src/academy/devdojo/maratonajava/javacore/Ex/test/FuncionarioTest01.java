package academy.devdojo.maratonajava.javacore.Ex.test;

import academy.devdojo.maratonajava.javacore.Ex.domino.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario =new Funcionario();
        funcionario.nome="Cris";
        funcionario.idade=19;
        funcionario.salarios=new double[]{1000,2000,3000};


        funcionario.Imprime();
        funcionario.imprimeMediaSalario();

    }
}
