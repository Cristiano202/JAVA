package academy.devdojo.maratonajava.javacore.Gassociacao.Test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1=new Jogador("cris");
        Jogador jogador2=new Jogador("CR7");
        Jogador jogador3=new Jogador("Pele");

        Jogador[]jogadores={
                jogador1,
                jogador2,
                jogador3
        };
        for(Jogador Jogador:jogadores){
            Jogador.imprime();
        }
    }
}
