package academy.devdojo.maratonajava.javacore.Oexeception.erro.test;

import java.io.File;
import java.io.IOException;

public class StackOverflowTest01 {
    public static void main(String[] args) {
       criarNovoArquivo();


    }
    //RuntimeException é um erro   que o programandor devia ter prestado mais atenção
    //Exeption
    private static void criarNovoArquivo(){
        File file =new File("arquivo\\test.txt");
        try{
            boolean iscriado = file.createNewFile();
            System.out.println("Arquivo criado "+iscriado);

        }catch (IOException e){//Nunca deixa o catch em branco
            e.printStackTrace();

        }

    }
}
