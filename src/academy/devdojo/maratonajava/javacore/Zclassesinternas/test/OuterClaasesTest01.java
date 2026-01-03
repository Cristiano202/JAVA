package academy.devdojo.maratonajava.javacore.Zclassesinternas.test;




public class OuterClaasesTest01 {
    private String name= "Cris";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
        }
    }
    public static void main (String[] args){
        OuterClaasesTest01 outerClaases=new OuterClaasesTest01();
        Inner inner =outerClaases.new Inner();
    }

}
