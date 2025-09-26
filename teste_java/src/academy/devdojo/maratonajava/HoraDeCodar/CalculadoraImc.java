package academy.devdojo.maratonajava.HoraDeCodar;
import  java.util.Scanner;
public class CalculadoraImc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Informe seu peso ");
        double peso= scanner.nextDouble();
        System.out.println("Informe sua altura ");
        double altura= scanner.nextDouble();
        double Imc=peso/(altura * altura);
        System.out.printf("Imc =%.2f\n",Imc);
        if (Imc<18.5){
            System.out.println("Abaixo do peso");
        } else if (Imc>=18.5 && Imc<=24.9) {
            System.out.println("Peso normal ");

        } else if (Imc>=25 && Imc<=29.9) {
            System.out.println("Sobre peso");

        }
        else {
            System.out.println("obeso");
        }
        scanner.close();
    }

}
