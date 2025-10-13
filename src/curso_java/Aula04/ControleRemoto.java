package curso_java.Aula04;

public class ControleRemoto {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //métodos especiais
    public ControleRemoto() {

    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


}
