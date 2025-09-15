package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.domino;

public class Calculadora {
    public  void somaDoisNmeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(20-10);
    }
    public void multiplicaDoisNumeros(int num1,int num2){
        System.out.println(num1*num2);
    }
    public double divideDoisNumeros(double num1,double num2){

        return num1/num2;
    }
    public int ComparaPar(int num1){
        if(num1 % 2 == 0){
            return 1;
        }
        return 0;
    }
    public void AlteraDoisNumeros(int num1 ,int num2){
        int aux;
        if(num1 ==num2){
            System.out.println("Numeros não precisa ser alterado ");
        }
        else {
            aux=num1;
            num1 =num2;
            num2=aux;
            System.out.println("O numero 1 foi alterado para "+ num1+"\nO numero 2 foi alterado para "+ num2);
        }
    }

}
