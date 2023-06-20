package demo;

import demo.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateSpringBootOneToManyBidirectionalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateSpringBootOneToManyBidirectionalApplication.class, args);
    }

}
