package com.wgu.sageit.kafkatest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaTestApplication {

    @Autowired
    KafkaProducerService kafkaProducerService;

    public static void main(String[] args) {
        SpringApplication.run(KafkaTestApplication.class, args);
    }

    @Bean
    public CommandLineRunner sendTestMessage() {
        System.out.println("TRYING TO SEND MESSAGE TO TOPIC");
        return args -> {
            kafkaProducerService.sendMessage("nglx_test", "Connectivity test message");
        };
    }
}
