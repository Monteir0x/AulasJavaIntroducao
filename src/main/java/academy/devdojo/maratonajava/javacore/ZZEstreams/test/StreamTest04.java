package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Jose", "Manuella", "Carlos");
        List<String> developers = List.of("Monteiro", "Carlos", "Leonardo");
        List<String> students = List.of("Catarina", "Henrique", "Maria", "Carolina");
        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);
        for (List<String> people : devDojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("-------------------");
        devDojo.stream()
                .flatMap(Collection::stream).forEach(System.out::println);
    }
}
