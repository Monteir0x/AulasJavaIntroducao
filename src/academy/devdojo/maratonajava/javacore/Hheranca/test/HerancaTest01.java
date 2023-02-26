package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12345678");
        Pessoa pessoa = new Pessoa("Monteiro");
        pessoa.setCpf("12345678910");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("--------------------------");

        Funcionario funcionario = new Funcionario("Vitor");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        funcionario.imprime();

    }
}
