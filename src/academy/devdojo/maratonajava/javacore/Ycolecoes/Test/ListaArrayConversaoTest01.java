package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args){
        List<Integer> nuns=new ArrayList<>();
        nuns.add(4);
        nuns.add(3);
        nuns.add(2);
        nuns.add(1);
        //lista para array

        Integer[] integersArray = nuns.toArray(new Integer[0]);

        //Array para lista
        System.out.println(Arrays.toString(integersArray));

        Integer[] numerosArray = new Integer[3];

        numerosArray[0]=1;
        numerosArray[1]=90;
        numerosArray[2]=10;
        List<Integer> arrayToList=Arrays.asList(numerosArray);

        System.out.println(arrayToList);
    }
}
