package academy.devdojo.maratonajava.javacore.Eblocosinicialzacao.dormain;

public class Anime {
    private String nome;
    private int[] episodios;

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
        {
          System.out.println("Dentro do bloco de iniialização");
            episodios=new int[100];
            int i=0;
            for (i=0;i<episodios.length;i++){
                episodios[i]=i+1;

            }
        }
    public Anime() {
        episodios=new int[100];
        int i=0;
        for (i=0;i<episodios.length;i++){
            episodios[i]=i+1;

        }
        for(int episodio :this.episodios){
            System.out.print(episodio+ " ");
            System.out.println();
        }

    }
}
