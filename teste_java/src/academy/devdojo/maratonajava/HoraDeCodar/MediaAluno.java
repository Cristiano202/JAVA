package academy.devdojo.maratonajava.HoraDeCodar;
import java.util.Scanner;
public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome=scanner.nextLine();
        System.out.println("Informe suas 3 notas: ");
        int nota1=scanner.nextInt();
        int nota2=scanner.nextInt();
        int nota3=scanner.nextInt();
        float media=(nota1+nota2+nota3)/3;
        System.out.println(media);
        if(media>=4 || media<7 ){
            System.out.println("Você estar  na final");
        } else if (media>7) {
            System.out.println("Vocer estar aprovado");

        }
        else {
            System.out.println("Você estar reprovado ");
        }
        scanner.close();
    }

}
