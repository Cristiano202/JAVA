package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 =new Consumidor("Cris");
        Consumidor consumidor2 =new Consumidor("Mari");
        Consumidor consumidor3 =new Consumidor("pepa");

       Manga manga1= new Manga(2,"ONE PUNCH MAIN",20.00,99);
       Manga manga2= new Manga(2,"ONE PUNCH MAIN",20.00,99);
       Manga manga3= new Manga(2,"ONE PUNCH MAIN",20.00,99);
       Manga manga4=new Manga(2,"ONE PUNCH MAIN",20.00,99);

       List<Manga> mangaComsumidor1List =List.of(manga1,manga2,manga3);
       List<Manga> mangaComsumidor2List =List.of(manga4,manga1,manga3);
       List<Manga> mangaComsumidor3List =List.of(manga1,manga4,manga3);

       Map<Consumidor,List<Manga>> consumidorMangaMap=new HashMap<>();
       consumidorMangaMap.put(consumidor1,mangaComsumidor1List);

    }
}
