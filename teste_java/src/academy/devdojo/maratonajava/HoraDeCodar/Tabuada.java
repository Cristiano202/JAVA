package academy.devdojo.maratonajava.HoraDeCodar;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Informe um numero inteiro ");
        int num= scanner.nextInt();
        for(int i=0;i<=10;i++){
            int calculo =num*i;
            System.out.println(i+"X"+num+"="+calculo);
        }
        scanner.close();

    }
}
