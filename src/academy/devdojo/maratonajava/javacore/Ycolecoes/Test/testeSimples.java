package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import java.util.*;

public class testeSimples {
    public static void main (String[] args){
        List<Integer> nums1=new ArrayList<>();
        List<Integer> nums2=new ArrayList<>();
        nums1.add(12);
        nums1.add(12);
        nums1.add(15);
        nums2.add(20);
        nums2.add(21);
        nums2.add(10);
        nums2.add(12);

        Set<Integer> conjunto=new HashSet<>(); // É uma  coleção
        conjunto.add(1);
        conjunto.addAll(nums1);
        conjunto.addAll(nums2);
        List<Integer> resultado=new ArrayList<>(conjunto);
        Collections.sort(resultado);//ordena a lista
        //ou
        resultado.sort(Comparator.naturalOrder());
        System.out.println(resultado);
        //decrescente
        resultado.sort(Comparator.reverseOrder());
        System.out.println("---------");
        System.out.println(resultado);
       /* for(Integer con : resultado){
            System.out.println(con);
        }*/
    }
}
