package curso_java.Aula5.Test;

import curso_java.Aula5.Dominio.Lutador;
import java.util.Scanner;

public class LutadorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lutador[] l = new Lutador[2];

        for (int i = 0; i < l.length; i++) {
            l[i] = new Lutador();

            System.out.print("Digite seu nome: ");
            l[i].setNome(sc.nextLine());

            System.out.print("Qual é sua nacionalidade: ");
            l[i].setNacionalidade(sc.nextLine());

            System.out.print("Digite sua idade: ");
            l[i].setIdade(Integer.parseInt(sc.nextLine()));

            System.out.print("Qual sua altura: ");
            l[i].setAltura(Double.parseDouble(sc.nextLine().replace(",", ".")));

            System.out.print("Qual seu peso: ");
            l[i].setPeso(Double.parseDouble(sc.nextLine().replace(",", ".")));

            System.out.print("Total de vitórias: ");
            l[i].setVitoria(Integer.parseInt(sc.nextLine()));

            System.out.print("Total de derrotas: ");
            l[i].setDerrotas(Integer.parseInt(sc.nextLine()));

            System.out.print("Total de empates: ");
            l[i].setEmpates(Integer.parseInt(sc.nextLine()));

            System.out.println("\nLutador " + (i + 1) + " cadastrado com sucesso!\n");
        }

        System.out.println("=== LUTADORES CADASTRADOS ===");
        for (int i = 0; i < l.length; i++) {
            System.out.println("\n--- Lutador " + (i + 1) + " ---");
            l[i].apresentar(); // ✅ imprime diretamente
        }

        sc.close();
    }
}
