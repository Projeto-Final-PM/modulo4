package com.person.producer;

import com.person.producer.event.MessageEventProducer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class KafkaProducerApplication implements CommandLineRunner {
    private final MessageEventProducer producer;

    public KafkaProducerApplication(MessageEventProducer producer) {
        this.producer = producer;
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        producer.send("Olá Mundo");
    }
}
