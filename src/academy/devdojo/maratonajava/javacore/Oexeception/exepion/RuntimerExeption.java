package academy.devdojo.maratonajava.javacore.Oexeception.exepion;

public class RuntimerExeption {
    public static void main(String[] args){
        try{
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dentro do arquivo");
            System.out.println("Fechando recurso liberado pelo SO");
        }catch (Exception e ){
            System.out.println("Fechando recurso pelo SO");
            e.printStackTrace();
        }
    }
}
