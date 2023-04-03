package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.AnimeRepository;

import java.util.Scanner;


public class AnimeService {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalArgumentException("not a valid option");
        }
    }


    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        AnimeRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] - $s $d %s%n ", p.getId(), p.getName(), p.getEpisodes(), p.getProducer().getName()));
    }

    private static void delete() {
        System.out.println("Type ID of the anime you want to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            AnimeRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the anime");
        String name = SCANNER.nextLine();
        System.out.println("Type the number of episodes");
        int episodes = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of the producer");
        Integer producerId = Integer.parseInt(SCANNER.nextLine());
        Anime anime = Anime.builder().name(name).episodes(episodes)
                .producer(Producer.builder().id(producerId).build()).build();
        AnimeRepository.save(anime);
    }
    private static void update() {
        System.out.println("Type the ID of the anime you want to update");
        int id = Integer.parseInt(SCANNER.nextLine());
        Anime anime = AnimeRepository.findById(id);
        if (anime == null){
            System.out.println("Anime ID not found");
            return;
        }
        anime = anime.getId() != null  ? anime : Anime.builder().id(id).build();
        System.out.println("Enter the new name of the anime");
        String newName = SCANNER.nextLine();
        System.out.println("Enter the new number of episodes");
        int newEpisodes = Integer.parseInt(SCANNER.nextLine());
        anime = Anime.builder()
                .id(anime.getId())
                .name(newName)
                .episodes(newEpisodes)
                .producer(anime.getProducer())
                .build();
        AnimeRepository.update(anime);
        System.out.println("Anime updated successfully");
    }

}

