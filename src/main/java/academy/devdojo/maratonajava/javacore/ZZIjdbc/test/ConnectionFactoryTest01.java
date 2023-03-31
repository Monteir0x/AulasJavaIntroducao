package academy.devdojo.maratonajava.javacore.ZZIjdbc.test;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        //Producer producer = Producer.builder().name("Studio Deen").build();
        // Producer producerToUpdate = Producer.builder().id(1).name("MADHOUSE").build();
        // ProducerService.save(producer);
        // ProducerService.delete(1);
        // ProducerService.update(producerToUpdate);
        // List<Producer> producers = ProducerService.findAll();
        // List<Producer> producers = ProducerService.findByName("de");
        // ProducerService.showProducerMetadata();
        // ProducerService.showDriverMetadata();
        // log.info("Producers found'{}'", producers);
        // ProducerService.showTypeScrollWorking();
        // List<Producer> producers = ProducerService.findByNameAndUpdateToUpperCase("Deen");
        //log.info(producers);
        //ProducerService.findByNameAndDelete("A-1 Pictures");
       // List<Producer> producers = ProducerService.findByNamePreparedStatement("Bo");
       // log.info("Producers found '{}'", producers);
        //ProducerService.updatePreparedStatement(producerToUpdate);
        List<Producer> producers = ProducerService.findByNameCallableStatement("BO");
        log.info("Producers found '{}'", producers);

    }
}
