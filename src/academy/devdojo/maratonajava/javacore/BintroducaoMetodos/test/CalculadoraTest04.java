package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.domino.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1;
        num1 =10;
        int res =calculadora.ComparaPar(num1);
        if(res ==1){
            System.out.println("O numero informado é par");
        }
        else {
            System.out.println("O numero informado não é par");
        }
        System.out.println("-----Fim do pograma-----");
    }
}
