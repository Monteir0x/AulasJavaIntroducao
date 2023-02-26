package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.FuncionariosExercicio;

public class FuncionariosTestExercicio {
    public static void main(String[] args) {
        FuncionariosExercicio funcionario = new FuncionariosExercicio();

        funcionario.setName("Monteiro");
        funcionario.setAge(28);
        funcionario.setSalarys(new double[]{1500,2500,5500});
        funcionario.print();
        funcionario.media();
        System.out.println("Média: " +funcionario.getMedia());


    }
}
