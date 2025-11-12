package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

   static      {
        System.out.println("Dentro do bloco de incialização");
        episodios=new int[100];
        int i=0;
        for (i=0;i<episodios.length;i++){
            episodios[i]=i+1;

        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
    //1 - Alocado espaço em memória pro objeto

    public Anime() {
        episodios=new int[100];
        int i=0;
        for (i=0;i<episodios.length;i++){
            episodios[i]=i+1;

        }
        for(int episodio :Anime.episodios){
            System.out.print(episodio+ " ");
            System.out.println();
        }

    }
}
