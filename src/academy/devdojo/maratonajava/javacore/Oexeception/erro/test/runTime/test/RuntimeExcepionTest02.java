package academy.devdojo.maratonajava.javacore.Oexeception.erro.test.runTime.test;

public class RuntimeExcepionTest02 {
    public static void main (String[] args) throws IllegalAccessException {
        System.out.println(divisao(1,0));

    }
    private static int  divisao( int a , int b) throws IllegalAccessException {
        if(b==0){
            throw new IllegalAccessException("Argumento ilegal");
        }

        //ou

       /* try{
            return  a/b;
        }catch(RuntimeException e ){//Mais nunca deixa o catch vazio
           // e.printStackTrace();
            // ou
            System.out.println(" Erro algo deu errado por favor verifique os numero ");
        }*/
        return a/b;

    }
}
