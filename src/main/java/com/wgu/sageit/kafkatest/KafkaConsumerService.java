package com.wgu.sageit.kafkatest;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "test-topic", groupId = "demo-consumer-group")
    public void consume(String message) {
        System.out.println("Received message: " + message);
    }
}
