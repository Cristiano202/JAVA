package academy.devdojo.maratonajava.javacore.Ycolecoes.Dominio;

public class Smarphone {
    private String seriaNumber;
    private String marca;

    public Smarphone(String seriaNumber, String marca) {
        this.seriaNumber = seriaNumber;
        this.marca = marca;
    }
//Reflexivo:x.equals(x) tem quer ser true para tudo que for de null
//Simetrico: para x e y diferentes de null , se x.equals(y) == true logo,   y .equals ==true
    @Override
    public boolean equals(Object obj) {
        if (obj == null)return false;//primeiro tem quer fazer um teste para verificar  se o obj é nulo
        if (this == obj)return  true;
        if(this.getClass()!=obj.getClass()) return false;
        Smarphone smarphone =(Smarphone) obj;
        return  seriaNumber != null && seriaNumber.equals(smarphone.seriaNumber);
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
