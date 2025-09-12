package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.domino.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora=new Calculadora();
        double res =calculadora.divideDoisNumeros(100,10);
        System.out.println(res);
    }
}
