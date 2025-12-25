package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String,String>map =new HashMap<>();//nao pode ter chave duplicada

        map.put("teklado","teclado");
        map.put("mouze","mouse");
        map.put("vc","você");
        System.out.println(map);

        for(String key : map.keySet()){//retornando todas as chaves
            System.out.println(key);
        }
    }
}
