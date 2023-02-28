package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Matheus Monteiro";
        nome.concat(" Vasco");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Matheus Monteiro");
        sb.append(" Vasco").append(" da Gama");
        sb.reverse();
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,sb.length()-4);
        System.out.println(sb);
    }
}
