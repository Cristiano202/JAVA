package academy.devdojo.maratonajava.javacore.Oexeception.erro.test;

import java.io.File;
import java.io.IOException;

public class StackOverflowTest02 {
    public static void main(String[] args)throws IOException {
       criarNovoArquivo();


    }
    //RuntimeException é um erro   que o programandor devia ter prestado mais atenção
    //Exeption
    public static void criarNovoArquivo()throws IOException{
        File file =new File("arquivo\\test.txt");
        try{
            boolean iscriado = file.createNewFile();
            System.out.println("Arquivo criado "+iscriado);

        }catch (IOException e){//Nunca deixa o catch em branco
            e.printStackTrace();
            throw  e;

        }

    }
}
