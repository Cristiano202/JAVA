package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.Test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1=new Carro("BMW",280);
        Carro carro2=new Carro("Ford",180);
        Carro carro3=new Carro("Audi",300);
        carro1.setVelocidaLimite(180);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }


}
