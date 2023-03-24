package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Clube;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.ClubeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 // reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Clube> clubeList = new ArrayList<>(List.of(new Clube("Vasco", 42),
                new Clube("Flamengo", 53),
                new Clube("Botafogo", 37)));
        clubeList.sort((c1, c2) -> c1.getTitle().compareTo(c2.getTitle()));
        clubeList.sort(ClubeComparators::compareByTitle);
        Collections.sort(clubeList, ClubeComparators::compareByPlayers);
        System.out.println(clubeList);
    }
}
