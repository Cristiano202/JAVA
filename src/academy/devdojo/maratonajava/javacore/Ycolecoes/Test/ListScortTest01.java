package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListScortTest01 {
    public static void main(String[] args) {
        List<String> mangas=new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Hellsing ultimate");
        mangas.add("Pokemon");
        mangas.add("Attack on titan");
        mangas.add("Drangon ball z");
        
        
        Collections.sort(mangas);
        
        for(String manga:mangas){
            System.out.println(manga);
        }
    }
}
