package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a superclasse
        // 1 = Bloco de inicialização estático da sub classe é executado quando a JVM carregar a subclasse
        // 2 - Alocado espaço em memória pro objeto da superclasse
        // 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado
        // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
        // 5 - Contrutor é executado da superclasse
        // 6 - Alocado espaço em memória pro objeto da subclasse
        // 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
        // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
        // 9 - Contrutor é executado da subclasse
        Funcionario funcionario = new Funcionario("Noel");
    }
}
