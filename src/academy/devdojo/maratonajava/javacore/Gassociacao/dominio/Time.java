package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private  String nome;
    private Jogador[]jogadores;

    public Time(Jogador[] jogadores, String nome) {
        this.jogadores = jogadores;
        this.nome = nome;
    }

    public Time(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
    public void imprime(){
        System.out.println(this.nome);
        if(jogadores==null)return;

        for (Jogador jogadore : jogadores) {
            System.out.println(jogadore.getNome());
        }

    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
