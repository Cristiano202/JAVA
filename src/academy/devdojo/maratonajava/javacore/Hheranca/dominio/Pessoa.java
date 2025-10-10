package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco inicialização de pesssoa");

    }

    {
        System.out.println("Dentro do bloco não inicialização  de pesssoa1");
    }
    {
        System.out.println("Dentro do bloco não inicialização  de pesssoa2");
    }


    public Pessoa(String nome){
        this.nome=nome;
    }

    public Pessoa(String nome,String cpf){
        this(nome);
        this.cpf=cpf;

    }

     public void emprime(){
         System.out.println(this.nome);
         System.out.println(this.cpf);
         System.out.println(this.endereco.getRua() + " "+ this.endereco.getCep());
     }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
