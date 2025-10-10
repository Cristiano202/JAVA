package academy.devdojo.maratonajava.javacore.Hheranca.Test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco =new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("5892929");
        Pessoa pessoa =new Pessoa("Cris");

        pessoa.setNome("123444444");
        pessoa.setEndereco(endereco);
        pessoa.emprime();
        Funcionario funcionario =new Funcionario("Abel balas");

        funcionario.setCpf("12356789");
        funcionario.setSalario(1234);
        funcionario.setEndereco(endereco);
        System.out.println("---------");
        funcionario.emprime();

    }
}
