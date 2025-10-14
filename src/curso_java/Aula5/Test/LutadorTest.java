package curso_java.Aula5.Test;

import curso_java.Aula5.Dominio.Lutador;

public class LutadorTest {
    public static void main(String[] args) {
        Lutador l[]=new Lutador[2];
        l[0]=new Lutador("cris","brasil",19,
                1.71,90.5,10,00,80);
        l[0].apresentar();
        l[0].status();
    }
}
