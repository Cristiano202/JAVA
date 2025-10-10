package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private  double salario;


    static {
        System.out.println("Dentro do bloco inicialização de Funcionario");

    }

    {
        System.out.println("Dentro do bloco não inicialização  de Funcionario1");
    }
    {
        System.out.println("Dentro do bloco não inicialização  de Funcionario2");
    }


    public Funcionario (String nome){
        super(nome);
        System.out.println("Dentro do contrutor funcionario ");
    }
    public void imprime(){
        super.emprime();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void relatorioPagamento(){
        System.out.println("Eu "+this.nome +" recebi o salario de "+this.salario );
    }
}
