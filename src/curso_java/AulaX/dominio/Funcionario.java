package curso_java.AulaX.dominio;

public class Funcionario {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        this.trabalhando= !this.trabalhando;
    }
}
