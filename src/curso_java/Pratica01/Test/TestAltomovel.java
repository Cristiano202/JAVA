package curso_java.Pratica01.Test;

import curso_java.Pratica01.Dominio.Carro;
import curso_java.Pratica01.Dominio.Moto;

import java.util.Scanner;

public class TestAltomovel {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Carro c1=new Carro();
        Moto m1=new Moto();
        int res=0;
        do{
            System.out.println("\n1-CADASTRAR MOTO");
            System.out.println("2-CADASTRAR CARRO");
            System.out.println("0-Sair");
            System.out.print("Informe qual altomovel você quer cadastrar: ");
            res= sc.nextInt();
            sc.nextLine();
            if (res==1){
                System.out.print("Informe o nome: ");
                m1.setNome(sc.nextLine());
                System.out.print("Informe a placa: ");
                m1.setPlaca(sc.nextInt());
                sc.nextLine();
                System.out.print("Informe o modelo: ");
                m1.setModelo(sc.nextLine());
            } else if (res==2) {
                System.out.print("Informe o nome: ");
                c1.setNome(sc.nextLine());
                System.out.print("Informe a placa: ");
                c1.setPlaca(sc.nextInt());
                sc.nextLine();
                System.out.print("Informe o modelo: ");
                c1.setModelo(sc.nextLine());

            }
            else {
                System.out.println("\nPOR FAVOR ESCOLHAR UMA OPÇÃO");
            }
        }while(res !=0);
    }



}
