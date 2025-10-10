package curso_java;

public class Aula1 {
    public static void main(String[] args) {
        Caneta c1=new Caneta();
        c1.cor="red";
        c1.ponta=0.5f;
        c1.tampar();
        c1.rabiscar();
        c1.status();
        System.out.println("----------------");
        Caneta c2=new Caneta();
        c2.cor="Blue";
        c2.modelo="Zênite";
        c2.tampar();
        c2.status();
        c2.destampar();
        c2.rabiscar();
    }
}
