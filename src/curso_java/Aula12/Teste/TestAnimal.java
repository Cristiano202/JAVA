package curso_java.Aula12.Teste;

import curso_java.Aula12.Animais.*;
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
        Canguru canguru=new Canguru();
        Cachorro cachorro=new Cachorro();
        Cobra cobra=new Cobra();
        Tartaruga tartaruga=new Tartaruga();
        Golfish golfish=new Golfish();
        Arara arara=new Arara();
        Ave ave=new Ave();

        System.out.println("---------------");
        System.out.println("Cachorro");
        cachorro.emitirSom();
        cachorro.locomover();
        System.out.println("-------");
        System.out.println("Ave");

        ave.locomover();
        System.out.println("----------");
        System.out.println("Canguru");
        canguru.locomover();
        canguru.alimentar();


        System.out.println("----------");
        System.out.println("Golfish");
        golfish.locomover();


        System.out.println("----------");
        System.out.println("Cobra");
        cobra.alimentar();
        cobra.locomover();
    }
}
