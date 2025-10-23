package curso_java.AulaX.dominio;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+this.getNome());
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome()+" é bolsita! pagamento ok!!");
        super.pagarMensalidade();
    }
}
