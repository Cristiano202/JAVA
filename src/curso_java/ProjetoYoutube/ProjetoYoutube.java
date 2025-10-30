package curso_java.ProjetoYoutube;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video video[]=new Video[3];
        video[0]=new Video("Aula 1 de poo");
        video[1]=new Video("Aula 2 de poo");
        video[2]=new Video("Aula 3 de poo");

        System.out.println(video[0].toString());

    }
}
