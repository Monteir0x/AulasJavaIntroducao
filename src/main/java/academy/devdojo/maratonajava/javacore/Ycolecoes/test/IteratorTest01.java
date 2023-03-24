package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Clube;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Clube> clubes = new ArrayList<>(16);
        clubes.add(new Clube(128L, "Vasco da Gama", 600.3, 23));
        clubes.add(new Clube(12L, "Bangu", 7.3, 15));
        clubes.add(new Clube(103L, "Botafogo", 423.6, 15));
        clubes.add(new Clube(76L, "Fluminense", 123.4, 11));
        clubes.add(new Clube(13L, "América RJ", 1.4, 0));

        //  Iterator<Club> clubeIterator = clubes.iterator();
        //  while(clubeIterator.hasNext()){
        //      if (clubeIterator.next().getJogadores() == 0){
        //          clubeIterator.remove();
        //      }
        // }
        clubes.removeIf(clube -> clube.getJogadores() == 0);
        System.out.println(clubes);
    }
}
