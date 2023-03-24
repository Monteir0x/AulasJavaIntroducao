package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Clube;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        ClubeByIdComparator clubeByIdComparator = new ClubeByIdComparator();
        List<Clube> clubes = new ArrayList<>(16);
        clubes.add(new Clube(128L, "Vasco da Gama", 600.3));
        clubes.add(new Clube(12L, "Bangu", 7.3));
        clubes.add(new Clube(103L, "Botafogo", 423.6));
        clubes.add(new Clube(76L, "Fluminense", 123.4));
        clubes.add(new Clube(13L, "América RJ", 1.4));
      //  Collections.sort(clubes);
        clubes.sort(clubeByIdComparator);
        for (Clube clube : clubes) {
            System.out.println(clube);

        }
        Clube clubeToSearch = new Clube(13L, "América RJ", 1.4);

        System.out.println(Collections.binarySearch(clubes, clubeToSearch, clubeByIdComparator));
    }
}
