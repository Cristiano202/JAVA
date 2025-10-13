package curso_java.Aula3.Dominio;

public class contaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public contaBanco(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }
    public void   abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if(t=="cc"){
            saldo=50;

        } else if (t=="cp") {
            saldo=150;
        }

    }
    public void fecharConta(){
        if(saldo>0){
            System.out.println("Conta com dinheiro");
        }
        else if(saldo<0){
            System.out.println("Conta em débito");
        }
        else {
            setStatus(false);
        }
    }
    public void depositar(float v){
        if(status==true){
            setSaldo(getSaldo()+v);
        }
        else {
            System.out.println("Impossivel depositar");
        }
    }
    public  void sacar(float v){
        if(status==true){
            if(saldo>v){
                saldo-=v;
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Impossível sacar");
        }
    }
    public void pagarMensal(){
        float valor=0;
        if(tipo=="cc"){
            valor+=12;
        } else if (tipo=="cp") {
            valor+=20;
        }
        if(status==true){
            if(saldo>valor){
                saldo-=valor;
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Impossível pagar");
        }
    }
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
