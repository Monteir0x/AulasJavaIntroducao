package academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Club;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ClubRepository {
    private static List<Club> clubs = List.of(new Club(1, "Vasco da Gama", 50),
            new Club(2, "Flamengo", 25));

    public static Optional<Club> findByID(Integer id){
        return findBy(c -> c.getID().equals(id));
    }
    public static Optional<Club> findByName(String name){
        return findBy(c -> c.getName().equals(name));
    }

    private static Optional<Club> findBy (Predicate<Club> predicate){
        Club found = null;
        for(Club club : clubs)
            if (predicate.test(club)) {
                found = club;
            }
        return Optional.ofNullable(found);

    }
}
