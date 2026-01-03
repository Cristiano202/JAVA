package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 =new Consumidor("Cris");
        Consumidor consumidor2 =new Consumidor("Mari");
        Consumidor consumidor3 =new Consumidor("pepa");

       Manga manga1= new Manga(2,"ONE PUNCH MAIN",20.00,99);
       Manga manga2= new Manga(2,"ONE PUNCH MAIN",20.00,99);
       Manga manga3= new Manga(2,"ONE PUNCH MAIN",20.00,99);
       Manga manga4=new Manga(2,"ONE PUNCH MAIN",20.00,99);
       Map<Consumidor,Manga> consumidorManga=new HashMap<>();
       consumidorManga.put(consumidor1,manga1);
       consumidorManga.put(consumidor2,manga2);
       consumidorManga.put(consumidor3,manga2);

       for(Map.Entry<Consumidor , Manga >entry :consumidorManga.entrySet() )
           System.out.println(entry.getKey() + " - " +entry.getValue() );
    }
}
