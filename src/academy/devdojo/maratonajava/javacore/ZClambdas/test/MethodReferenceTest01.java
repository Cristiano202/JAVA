package academy.devdojo.maratonajava.javacore.ZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZClambdas.dominio.Anime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>();
        anime.add(new Anime("Berserk", 43));
        anime.add(new Anime("One piece", 1000));
        anime.add(new Anime("Naruto", 50));

        anime.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        System.out.println(anime);

    }
}
