package academy.devdojo.maratonajava.javacore.Dconstrutores.Test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime =new Anime("cris","tv",12,"Ação");
        Anime anime2=new Anime();
        //anime.init("cris","tv",12,"Ação");
        anime.emprime();
        anime2.emprime();

    }

}
