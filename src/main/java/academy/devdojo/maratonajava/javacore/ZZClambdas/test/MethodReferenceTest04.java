package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Clube;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.ClubeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<ClubeComparators> newClubComparators = ClubeComparators::new;
         ClubeComparators clubeComparators = newClubComparators.get();
        List<Clube> clubeList = new ArrayList<>(List.of(new Clube("Vasco", 42),
                new Clube("Flamengo", 53),
                new Clube("Botafogo", 37)));
        clubeList.sort(clubeComparators::compareByPlayersNonStatic);
        System.out.println(clubeList);

        BiFunction<String , Integer, Clube> clubeBiFunction = (title, players) -> new Clube(title, players);
        BiFunction<String , Integer, Clube> clubeBiFunction2 = Clube::new;
        System.out.println(clubeBiFunction2.apply("Bangu", 21));
    }
}
