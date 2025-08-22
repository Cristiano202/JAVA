package academy.devdojo.maratonajava.introducao;

public class Aula06EstrurasDerepeticao04 {
    //Dado o valor de um carro ,desubra em quantas ele pode ser parcelado
    //Condição valorParcela >=1000
    public static void main(String[] args) {
        double valorToltal=3000;
        for(int parcela =1;parcela<=valorToltal;parcela++){
            double valorParcela=valorToltal/parcela;
            if(valorParcela<1000){
                break;
            }
            System.out.println("Parcela"+ parcela +"R$ "+valorParcela);
        }
    }
}
