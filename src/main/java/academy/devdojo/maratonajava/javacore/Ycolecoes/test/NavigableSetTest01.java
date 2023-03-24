package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Clube;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
class ClubeValorComparator implements Comparator<Clube>{

    @Override
    public int compare(Clube o1, Clube o2) {
        return Double.compare(o1.getValor(), o2.getValor());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Clube> clubes = new TreeSet<>(new ClubeValorComparator());
        clubes.add(new Clube(128L, "Vasco da Gama", 600.3, 23));
        clubes.add(new Clube(12L, "Bangu", 7.3, 15));
        clubes.add(new Clube(103L, "Botafogo", 423.6, 15));
        clubes.add(new Clube(76L, "Fluminense", 123.4, 41));
        clubes.add(new Clube(13L, "América RJ", 1.4, 15));
        for (Clube clube : clubes){
            System.out.println(clube);
        }
        Clube cariocaB = new Clube(13l, "Volta Redonda" , 7, 17);
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("--------------------------");
        System.out.println(clubes.lower(cariocaB));
        System.out.println(clubes.higher(cariocaB));
        System.out.println(clubes.floor(cariocaB));
        System.out.println(clubes.ceiling(cariocaB));

        System.out.println(clubes.size());
        System.out.println(clubes.pollFirst());
        System.out.println(clubes.pollLast());
    }
}
