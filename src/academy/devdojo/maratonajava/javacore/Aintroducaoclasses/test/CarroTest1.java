package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominig.Carro;

public class CarroTest1 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1=new Carro();
        carro.nome="golf";
        carro.modelo="sportline";
        carro.ano=2008;

        System.out.println(carro.nome +"\n"+carro.modelo+"\n"+carro.ano);

        System.out.println("-----");
        carro1.nome="Fiat Estrada";
        carro1.modelo=" freedom";
        carro1.ano=2021;

        System.out.println(carro1.nome +"\n"+carro1.modelo+"\n"+carro1.ano);
    }
}
