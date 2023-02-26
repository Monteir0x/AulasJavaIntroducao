package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = 10;
        long numeroGrande = 1000000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        // String não é tipo primitivo
        String nome = "Monteiro";

        System.out.println("A idade é: " + age + " anos");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("Oi, meu nome é "+ nome);
    }
}
