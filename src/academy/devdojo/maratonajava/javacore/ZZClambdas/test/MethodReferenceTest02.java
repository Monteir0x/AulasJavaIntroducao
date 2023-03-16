package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Clube;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.ClubeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to a non-static method
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        ClubeComparators clubeComparators = new ClubeComparators();
        List<Clube> clubeList = new ArrayList<>(List.of(new Clube("Vasco", 42),
                new Clube("Flamengo", 53),
                new Clube("Botafogo", 37)));
        clubeList.sort(clubeComparators::compareByPlayersNonStatic);
        System.out.println(clubeList);

    }
}
