package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import java.util.*;

public class ListTest01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<String> nomes=new ArrayList<>();
        List<String>nomes2=new ArrayList<>();
        int op;
        String nomePessoa;
        do{
            System.out.println("1-Deseja adicionar alguem mais: ");
            System.out.println("0-Digite zero para sair: ");
            op= sc.nextInt();
            sc.nextLine();
            if(op==1){
                System.out.print("Digite um nome: ");
                nomePessoa= sc.nextLine();
                nomes.add(nomePessoa);
            }
        }while (op !=0);



        nomes2.add("cris");
        Set<String> conjunto = new LinkedHashSet<>(nomes); // mantém ordem
        conjunto.addAll(nomes2);

        for(String nome : nomes){
            System.out.println(nome);


        }
    }
}
