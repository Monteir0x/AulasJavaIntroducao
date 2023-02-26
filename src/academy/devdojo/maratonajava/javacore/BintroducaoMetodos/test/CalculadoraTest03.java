package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.test;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20.2,2);
        System.out.println(result);
        double result02 = calculadora.divideDoisNumeros02(3.2,1.2);
        System.out.println(result02);
    }
}
