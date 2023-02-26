package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();
        carro.name = "Ford";
        carro.model = "Focus";
        carro.year = 2018;
        carro1.name = "Fiat";
        carro1.model = "GrandSiena";
        carro1.year = 2002;

        System.out.println("Marca: " + carro.name + " " + carro.model + " Modelo: " + carro.year);
        System.out.println("Marca: " + carro1.name + " " + carro1.model + " Modelo: " + carro1.year);
    }


}
