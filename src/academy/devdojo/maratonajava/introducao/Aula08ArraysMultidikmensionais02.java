package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidikmensionais02 {
    public static void main(String[] args) {
        int[][] arryInt=new int [3][];
        arryInt[0]=new int[2];
        arryInt[1]=new int[3];
        arryInt[2]=new int[6];

        for(int[] arrybase:arryInt){
            System.out.println("\n----");
            for(int num:arrybase ){
                System.out.println(num + " ");
            }
        }

    }
}
