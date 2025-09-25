package curso_java;
import java.util.Scanner;

public class Aula02 {
    static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int media=0;
        int soma =0;
       // System.out.println("Informe seu nome : ");
       // String nome =scanner.next();
        //System.out.println("Informe sua idade : " );
        //int idade =scanner.nextInt();

        System.out.println("Informe um numero : ");
        int numero= scanner.nextInt();

        for(int i =1;i<=numero;i++){
            for(int pecorre =1;pecorre<=i;pecorre++){
                System.out.print("*");
            }
            System.out.println();

        }
        scanner.close();
    }

}
