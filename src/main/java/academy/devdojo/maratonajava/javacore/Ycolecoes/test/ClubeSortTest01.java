package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Clube;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ClubeByIdComparator implements Comparator<Clube> {
    @Override
    public int compare(Clube clube1, Clube clube2) {
        return clube1.getId().compareTo(clube2.getId());
    }
}

public class ClubeSortTest01 {
    public static void main(String[] args) {
        List<Clube> clubes = new ArrayList<>(16);
        clubes.add(new Clube(128L, "Vasco da Gama", 600.3));
        clubes.add(new Clube(12L, "Bangu", 7.3));
        clubes.add(new Clube(103L, "Botafogo", 423.6));
        clubes.add(new Clube(76L, "Fluminense", 123.4));
        clubes.add(new Clube(13L, "América RJ", 1.4));
        for (Clube clube : clubes) {
            System.out.println(clube);

        }

        Collections.sort(clubes);
        System.out.println("------------------");

        for (Clube clube : clubes) {
            System.out.println(clube);

        }

        // Collections.sort(clubes, new ClubeByIdComparator());
        clubes.sort(new ClubeByIdComparator());
        System.out.println("------------------");

        for (Clube clube : clubes) {
            System.out.println(clube);

        }


    }


}
