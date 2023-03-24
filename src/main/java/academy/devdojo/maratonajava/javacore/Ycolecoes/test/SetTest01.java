package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Clube;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Clube> clubes = new HashSet<>();
        clubes.add(new Clube(128L, "Vasco da Gama", 600.3, 23));
        clubes.add(new Clube(12L, "Bangu", 7.3, 15));
        clubes.add(new Clube(103L, "Botafogo", 423.6, 15));
        clubes.add(new Clube(76L, "Fluminense", 123.4, 11));
        clubes.add(new Clube(13L, "América RJ", 1.4, 0));

        for (Clube clube : clubes){
            System.out.println(clube);
        }
    }
}
