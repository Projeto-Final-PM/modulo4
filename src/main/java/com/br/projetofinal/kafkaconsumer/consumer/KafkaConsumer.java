package com.br.projetofinal.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.kafka.retrytopic.TopicSuffixingStrategy;
import org.springframework.retry.annotation.Backoff;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @RetryableTopic(
        autoCreateTopics = "false",
        backoff = @Backoff(
                delay = 15000,
                multiplier = 2.0,
                maxDelay = 54000),
        topicSuffixingStrategy = TopicSuffixingStrategy.SUFFIX_WITH_INDEX_VALUE)
    @KafkaListener(
        topics = "${spring.kafka.topic.module4}",
        groupId = "${spring.kafka.consumer.group-id}",
        containerFactory = "kafkaListenerFactory")
    public void consume(String message) {
        System.out.println("A mensagem chegou: " + message);
    }
}