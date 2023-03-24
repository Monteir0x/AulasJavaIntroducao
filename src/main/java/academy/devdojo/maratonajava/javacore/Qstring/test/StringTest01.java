package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Monteiro"; // String constant pool
        String nome2 = "Monteiro";
        nome = nome.concat(" Matheus"); // nome += " Matheus"
        System.out.println(nome);
        System.out.println(nome.equals(nome2));
        String nome3 = new String("Monteiro"); // 1 variavel de referência, 2 objeto do tipo string, 3 uma string no string pool
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
