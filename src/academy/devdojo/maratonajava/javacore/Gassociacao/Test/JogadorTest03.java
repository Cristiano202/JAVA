package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador =new Jogador("Cafu");
        Time time=new Time("Brasil");
        Jogador[] jogadores={jogador};
        jogador.setTime(time);

        time.setJogadores(jogadores);
        System.out.println("---jogador---");

        jogador.imprime();

        System.out.println("---Time---");

        time.imprime();
    }
}
