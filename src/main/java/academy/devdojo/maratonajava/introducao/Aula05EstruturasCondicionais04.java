package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salary = 70000;
        double tax;

        if (salary < 34712) {
            tax = salary * 0.0970;

        } else if (salary >= 34713 && salary < 68507) {
            tax = salary * 0.3735;

        } else {
            tax = salary * 0.4950;

        }
        System.out.println("Impostos: " + tax);
    }
}
