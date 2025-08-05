package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {
        double salario=5000;
        String mensagemDoar ="Vou doar 5 pro DevDojo";
        String mensagemNaoDoar="Ainda não tenho dinheiro";
        String resultado;
        System.out.println("Teste de condiçao");
        if(salario >6000){
           resultado =mensagemDoar;

        }
        else {
            resultado=mensagemNaoDoar;
        }
        System.out.println(resultado);
    }
}
