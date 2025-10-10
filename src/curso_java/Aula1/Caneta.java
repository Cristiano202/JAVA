package curso_java.Aula1;

public class Caneta {
   public String modelo;
   public String cor;
   private   float ponta;
   protected int carga;
   protected boolean tampada;
   public void status(){
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Estar tampada ? "+this.tampada);
    }
   public void rabiscar(){
        if (this.tampada==true){
            System.out.println("Erro ! não pode rabiscar ");
        }
        else {
            System.out.println("Estou rabiscando ");
        }
    }
   protected void tampar(){
        this.tampada=true;
    }
   protected void destampar(){
        this.tampada=false;
    }

}
