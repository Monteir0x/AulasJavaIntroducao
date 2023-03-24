package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("São Januário, meu caldeirão");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        Optional<String> nameOptional = findName("Monteiro");
        String empty = nameOptional.orElse("EMPTY");
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println(nameOptional);

    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("Matheus", "Monteiro");
       int i = list.indexOf(name);
        if (i>0){
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
