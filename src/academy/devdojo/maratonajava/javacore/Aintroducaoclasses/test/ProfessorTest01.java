package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Renato";
        professor.age = 51;
        professor.gender = 'M';

        System.out.println("nome: " +professor.name + " " +"idade: " +professor.age + " " +"sexo: " +professor.gender);
    }
}
