package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.name = "Monteiro";
        estudante01.age = 27;
        estudante01.gender = 'M';

        estudante02.name = "Andressa";
        estudante02.age = 25;
        estudante02.gender = 'F';

        impressora.imprime(estudante01);

        impressora.imprime(estudante02);


    }
}
