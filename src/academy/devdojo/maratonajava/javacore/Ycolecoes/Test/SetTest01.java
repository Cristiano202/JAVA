package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args){
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(2,"ONE PUNCH MAIN",20.00,99));
        mangas.add(new Manga(2,"ONE PUNCH MAIN",20.00,99));
        mangas.add(new Manga(2,"ONE PUNCH MAIN",20.00,99));
        mangas.add(new Manga(2,"ONE PUNCH MAIN",20.00,99));
        for(Manga lis : mangas ){
            System.out.println(lis);
        }
    }

}
