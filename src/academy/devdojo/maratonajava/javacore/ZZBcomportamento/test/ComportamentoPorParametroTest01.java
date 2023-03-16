package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));
    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("------------------");
        System.out.println(filterCarByYearBefore(2010));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                greenCars.add(car);
            }

        }
        return greenCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                greenCars.add(car);
            }

        }
        return greenCars;
    }
    private static List<Car> filterCarByYearBefore(int year) {
        List<Car> filteredByYearBefore = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < 2015) {
                filteredByYearBefore.add(car);
            }

        }
        return filteredByYearBefore;
    }
}
