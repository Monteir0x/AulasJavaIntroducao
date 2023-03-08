package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Clube;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Clube> clubes = new PriorityQueue<>(new ClubeValorComparator().reversed());
        clubes.add(new Clube(128L, "Vasco da Gama", 600.3, 23));
        clubes.add(new Clube(12L, "Bangu", 7.3, 15));
        clubes.add(new Clube(103L, "Botafogo", 423.6, 15));
        clubes.add(new Clube(76L, "Fluminense", 123.4, 41));
        clubes.add(new Clube(13L, "América RJ", 1.4, 15));

        while (!clubes.isEmpty()){
            System.out.println(clubes.poll());
        }
    }
}
