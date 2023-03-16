package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person1 =  Person.PersonBuilder
                .builder()
                .firstName("Matheus")
                .lastName("Monteiro")
                .username("Monteir0x")
                .email("msmonteiro@id.uff.br")
                .build();
        System.out.println(person1);
    }
}
