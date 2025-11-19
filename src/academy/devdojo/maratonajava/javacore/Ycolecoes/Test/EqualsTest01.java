package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Smarphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smarphone smarphone1=new Smarphone("1ABC1","IPHONE");
        Smarphone smarphone2=new Smarphone("1ABC1","IPHONE");

        System.out.println(smarphone1.equals(smarphone2) );

    }
}
