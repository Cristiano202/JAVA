package academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio;

public class Smarphone {
    private String seriaNumber;
    private String marca;

    public Smarphone(String seriaNumber, String marca) {
        this.seriaNumber = seriaNumber;
        this.marca = marca;
    }

    public String getSeriaNumber() {
        return seriaNumber;
    }

    public void setSeriaNumber(String seriaNumber) {
        this.seriaNumber = seriaNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
