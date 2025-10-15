package curso_java.Aula5.Dominio;

public class Lutador {
    private String nome;
    private  String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrotas;
    private int empates;

    public Lutador() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.peso<52.2){
            this.categoria="Invalido";
        }
        else if(this.peso<=70.3) {
            this.categoria = "Leve";
        }
        else if(this.peso<=83.9){
            this.categoria="Medio";

        } else if (this.peso<=120.2) {
            this.categoria="Pesado";
        }
        else {
            this.categoria="Invalido";
        }

    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("-----------------------------------------------");
        System.out.println("Chegouu a hora ! Apresentamos o lutador "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("Com "+this.getIdade()+" anos e "+this.getAltura()+" altura ");
        System.out.println("Pesando "+this.getPeso()+" kg");
        System.out.println(this.getVitoria()+" vitorias "+this.getDerrotas()+" Derrotas ");
        System.out.println(this.getEmpates()+" Empates");

    }
    public void status(){
        System.out.println(this.getNome()+" é um peso "+this.getCategoria());
        System.out.println("Ganhou "+this.getVitoria()+" vezes");
        System.out.println("Empatou "+this.getEmpates()+" vezes");
        System.out.println("Derrota "+this.getDerrotas()+" vezes");

    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria()+1);

    }
    public void perderLuta(){
        this.setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(getEmpates()+1);
    }
}
