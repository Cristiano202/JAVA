package academy.devdojo.maratonajava.javacore.CsobrecargaMetados.Test;


import academy.devdojo.maratonajava.javacore.CsobrecargaMetados.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime =new Anime();
        anime.init("cris","tv",12,"Ação");
        anime.emprime();
    }

}
