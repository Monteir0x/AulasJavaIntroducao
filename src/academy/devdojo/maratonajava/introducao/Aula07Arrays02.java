package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000'
        // boolean false
        // String null
        String[] names = new String[4];
        names[0] = "Vasco";
        names[1] = "Flamengo";
        names[2] = "Botafogo";
        names[3] = "Fluminense";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        names = new String[1];
        System.out.println(names[0]);
        // ao iniciar novo array, perde-se a referencia ao primeiro

        }
    }

