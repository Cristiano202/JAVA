package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Smarphone;

import java.util.ArrayList;
import java.util.List;

public class SmarphoneTest02 {
    public static void main(String[] args) {
        Smarphone smarphone1=new Smarphone("2222","sansung");
        Smarphone smarphone2=new Smarphone("2223","Pixel");
        Smarphone smarphone3=new Smarphone("2224","Moto G");

        List<Smarphone> smarphones =new ArrayList<>();
        smarphones.add(smarphone1);
        smarphones.add(smarphone2);
        smarphones.add(smarphone3);

        for(Smarphone smarphone:smarphones){
            System.out.println(smarphone);
        }
    }
}
