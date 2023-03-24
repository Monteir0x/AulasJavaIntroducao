package academy.devdojo.maratonajava.javacore.ZZClambdas.service;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Clube;

public class ClubeComparators {
    public static int compareByTitle(Clube c1, Clube c2){
        return c1.getTitle().compareTo(c2.getTitle());
    }
    public static int compareByPlayers(Clube c1, Clube c2){
        return Integer.compare(c1.getPlayer(), c2.getPlayer());
    }
    public int compareByPlayersNonStatic(Clube c1, Clube c2){
        return Integer.compare(c1.getPlayer(), c2.getPlayer());
    }
}
