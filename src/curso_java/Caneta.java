package curso_java;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Estar tampada ? "+this.tampada);
    }
    void rabiscar(){
        if (this.tampada==true){
            System.out.println("Erro ! não pode rabiscar ");
        }
        else {
            System.out.println("Estou rabiscando ");
        }
    }
    void tampar(){
        this.tampada=true;
    }
    void destampar(){
        this.tampada=false;
    }

}
