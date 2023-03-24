package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> clubes = new ArrayList<>(6);
        clubes.add("Vasco");
        clubes.add("Botafogo");
        clubes.add("Bangu");
        clubes.add("America");
        clubes.add("Madureira");

        Collections.sort(clubes);

        List<Double> moneys = new ArrayList<>();
        moneys.add(100.21);
        moneys.add(23.98);
        moneys.add(72.13);
        moneys.add(23.64);
        Collections.sort(moneys);

        System.out.println(moneys);

        for(String clube: clubes){
            System.out.println(clube);
        }
    }
}
