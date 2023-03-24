package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Club;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.ClubRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Club> clubByName = ClubRepository.findByName("Flamengo");
        clubByName.ifPresent(c -> c.setName(c.getName() + " sub-20"));
        System.out.println(clubByName);

        Club clubByID = ClubRepository.findByID(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(clubByID);

        Club newClub = ClubRepository.findByName("Bangu")
                .orElseGet(() -> new Club(3, "Bangu", 11));
        System.out.println(newClub);
    }
}
