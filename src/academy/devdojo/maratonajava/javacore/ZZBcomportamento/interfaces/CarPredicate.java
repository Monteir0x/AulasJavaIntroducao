package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
    // anonimas, funções
}
    // (parametro) -> (expressao)
    // (Car car) -> (car.getColor().equals("green")