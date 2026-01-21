package com.jpmc.midascore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.jpmc.midascore.component.KafkaConsumer;
import com.jpmc.midascore.entity.UserRecord;
import com.jpmc.midascore.foundation.Transaction;
import com.jpmc.midascore.repository.UserRepository;

@SpringBootApplication
public class MidasCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MidasCoreApplication.class, args);
    }

    // ✅ FIXED
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 🔥 Task-4 Runner (Kafka NOT provided in Forage)
     */
    @Bean
    public CommandLineRunner run(
            UserRepository userRepository,
            KafkaConsumer consumer
    ) {
        return args -> {

            // ✅ Seed users
            userRepository.save(new UserRecord("wilbur", 1000f));
            userRepository.save(new UserRecord("alice", 800f));
            userRepository.save(new UserRecord("bob", 500f));

           // ✅ Simulated transactions (PURE JAVA)
consumer.consume(new Transaction(1L, 2L, 100f));
consumer.consume(new Transaction(2L, 1L, 50f));
consumer.consume(new Transaction(1L, 3L, 200f));
consumer.consume(new Transaction(3L, 1L, 75f));

        };
    }
}
