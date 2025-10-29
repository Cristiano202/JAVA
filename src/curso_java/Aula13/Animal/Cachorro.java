package curso_java.Aula13.Animal;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au Au Au ");


    }

    public void reagir(String frase){
        if(frase.equals("Toma comida")|| frase.equals("Ola")){
            System.out.println("Abanar e latir");
        }
        else {
            System.out.println("Rosnar");
        }

    }
    public void reagir(int hora, int min){

    }
    public void reagir(Boolean dono) {

    }
    public void reagir(int idade,float peso){

    }



}
