package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    //Construtores usando paramentros
    public Anime(String nome,String tipo,int episodios,String genero){
        this.nome=nome;
        this.tipo=tipo;
        this.episodios=episodios;
        this.genero=genero;
    }
    //Construtores sem paramentros
    public Anime(){

    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public void emprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

}

