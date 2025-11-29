package com.person.producer.event;

import org.springframework.stereotype.Component;
import org.springframework.kafka.core.KafkaTemplate;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import org.springframework.beans.factory.annotation.Value;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Component
public class MessageEventProducer {
    private final String topic;
    private final KafkaTemplate<String, String> kafkaTemplate;

    public MessageEventProducer(
            KafkaTemplate<String, String> kafkaTemplate, @Value("${spring.kafka.topic.module4}") String topic) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String message) throws ExecutionException, InterruptedException, TimeoutException {
        kafkaTemplate.send(
                topic, UUID.randomUUID().toString(), message).get(5000, TimeUnit.MILLISECONDS);
    }
}
