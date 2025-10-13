package curso_java.Aula3.TestContaBanco;

import curso_java.Aula3.Dominio.ContaBanco;

public class TesteContaBanco01 {
    public static void main(String[] args) {
        ContaBanco p1 =new ContaBanco();
        ContaBanco p2=new ContaBanco();
        p1.setNumConta(2222);
        p1.setDono("Cris");
        p1.abrirConta("cc");
        p1.depositar(150);

        p2.setNumConta(11111);
        p2.setDono("Maribel");
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.sacar(1000);

        p1.sacar(200);
        p1.fecharConta();
        p2.estadoAtual();
        p1.estadoAtual();

    }
}
