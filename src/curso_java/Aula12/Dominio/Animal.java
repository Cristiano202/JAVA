package curso_java.Aula12.Dominio;

public abstract class Animal {
    protected float peso;
    protected int idade;
    protected int menbros;
    //Métodos de animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
