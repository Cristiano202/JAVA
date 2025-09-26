package academy.devdojo.maratonajava.HoraDeCodar;
import java.util.Scanner;
public class TesteScanner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Digite seu nome ");
        String nome=scanner.nextLine();
        System.out.print("Digite sua idade ");
        int idade= scanner.nextInt();

        System.out.println("Ola "+nome+" Seja bem vindo(a)");
        System.out.println("Sua idade é "+idade);
        if(idade>=18){
            System.out.println("Você já pode dirigir ");
        }
        else {
            System.out.println("Você não pode dirigir ");
            int cont=2025-idade;
            int cont_ano=18-idade;
            System.out.println("Você nasceu em "+cont+" e falta "+cont_ano+" para vocer fazer 18 anos");
        }
        scanner.close();

    }
}
