package academy.devdojo.maratonajava.javacore.ZZIjdbc.service;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        if (producer.getName().length() > 255) {
            throw new ArrayIndexOutOfBoundsException();
        }
        ProducerRepository.save(producer);
    }

    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name) {
        return ProducerRepository.findByName(name);
    }
    public static List<Producer> findByNamePreparedStatement(String name) {
        return ProducerRepository.findByNamePreparedStatement(name);
    }

    public static void showProducerMetadata() {
        ProducerRepository.showProducerMetadata();
    }

    public static void showDriverMetadata() {
        ProducerRepository.showDriverMetadata();
    }

    public static void showTypeScrollWorking() {
        ProducerRepository.showTypeScrollWorking();
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        return ProducerRepository.findByNameAndUpdateToUpperCase(name);
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String name) {
        return ProducerRepository.findByNameAndInsertWhenNotFound(name);
    }

    public static void findByNameAndDelete(String name) {
        ProducerRepository.findByNameAndDelete(name);
    }


    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Invalid value for ID");
        }
    }
}