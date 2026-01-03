package academy.devdojo.maratonajava.javacore.Zclassesinternas.test;

public class OuterClassesTest02 {
    private String nome = "Criss";
    void print(){
        class LocalClass{
            public void printLocal(){
                System.out.println(nome);
            }
        }
    }

   /* LocalClass localClass = new LocalClass(){

    }

    public static void main(String[] args) {
        OuterClaasesTest02 outer =new OuterClassesTest02();

    }*/

}
