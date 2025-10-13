package curso_java.Aula3.Dominio;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("_____________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }


    public ContaBanco() {

    }
    public void   abrirConta(String t){
      this.setTipo(t);
      this.setStatus(true);
        if("cc".equals(t)){
           this.setSaldo(50);

        } else if ("cp".equals(t)) {
           this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta não pode ser feixada porque ainda  tem dinheiro");
        }
        else if(this.getSaldo()<0){
            System.out.println("Conta em débito");
        }
        else {
           this.setStatus(false);
            System.out.println("Conta feixada com sucesso!");
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Depósito realizado com sucesso na conta "+this.getDono());
        }
        else {
            System.out.println("Impossivel depositar");
        }
    }
    public  void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de "+this.getDono());
            }
            else {
                System.out.println("Saldo insuficiente!");
            }
        }
        else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        float valor=0;
        if("cc".equals(this.getTipo())){
            valor=12;
        } else if ("cp".equals(this.getTipo())) {
            valor=20;
        }
        if(this.getStatus()){
            this.setSaldo(getSaldo()-valor);
            System.out.println("Mensalidade paga com sucesso por "+this.getDono());
        }
        else {
            System.out.println("Impossível pagar ");
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

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
