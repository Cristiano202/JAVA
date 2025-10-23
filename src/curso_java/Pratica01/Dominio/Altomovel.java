package curso_java.Pratica01.Dominio;

public abstract class Altomovel {
    private int placa;
    private String nome;
    private String modelo;

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Altomovel() {
    }
}
