package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
    pessoa.setName("Monteiro");
    pessoa.setAge(27);
    pessoa.print();
        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
    }
}
