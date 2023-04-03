package academy.devdojo.maratonajava.javacore.ZZJcrud.service;

import academy.devdojo.maratonajava.javacore.ZZJcrud.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZJcrud.repository.ProducerRepository;
import lombok.extern.log4j.Log4j2;

import java.util.Scanner;


public class ProducerService {
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
        ProducerRepository.findByName(name)
                .forEach(p -> System.out.printf("[%d] -  %s%n ", p.getId(), p.getName()));
    }

    private static void delete() {
        System.out.println("Type ID of the producer you want to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    private static void save() {
        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }
    private static void update() {
        System.out.println("Type the ID of the producer you want to update");
        int id = Integer.parseInt(SCANNER.nextLine());
        Producer producer = ProducerRepository.findById(id);
        if (producer == null){
            System.out.println("Producer ID not found");
            return;
        }
        producer = producer.getId() != null  ? producer : Producer.builder().id(id).build();
        System.out.println("Enter the new name of the producer");
        String newName = SCANNER.nextLine();
        producer = Producer.builder()
                .id(producer.getId())
                .name(newName)
                .build();
        ProducerRepository.update(producer);
        System.out.println("Producer updated successfully");
    }

}

