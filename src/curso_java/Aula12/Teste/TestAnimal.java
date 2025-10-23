package curso_java.Aula12.Teste;

import curso_java.Aula12.Dominio.Ave;
import curso_java.Aula12.Dominio.Mamifero;
import curso_java.Aula12.Dominio.Peixe;
import curso_java.Aula12.Dominio.Reptil;

public class TestAnimal {
    public static void main(String[] args) {
        Mamifero m=new Mamifero();
        Reptil r=new Reptil();
        Peixe p=new Peixe();
        Ave v=new Ave();

        System.out.println("----------Teste tando todas class------");

        System.out.println("Mamifero");
        m.setCorPelo("red");
        m.setPeso(12.2f);
        m.setIdade(12);
        m.emitirSom();

        System.out.println("Reptil");
        r.setCorEscama("blue");
        r.setPeso(123.2f);
        r.setIdade(14);
        r.emitirSom();

        System.out.println("Peixe");
        p.setCorEscama("red");
        p.setPeso(12.2f);
        p.setIdade(12);
        p.emitirSom();
    }
}
