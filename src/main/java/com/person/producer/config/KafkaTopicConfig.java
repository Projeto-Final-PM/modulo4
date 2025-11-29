package com.person.producer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.apache.kafka.clients.admin.NewTopic;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic topic(
            @Value("${spring.kafka.topic.module4}") String topicName,
            @Value("${spring.kafka.partitions}") int partitions,
            @Value("${spring.kafka.replicas}") short replicas) {
        return new NewTopic(topicName, partitions, replicas);
    }
}