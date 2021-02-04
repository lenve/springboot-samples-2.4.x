package org.javaboy.jms;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;

@SpringBootApplication
public class JmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmsApplication.class, args);
    }

    @Bean
    Queue queue() {
        return new ActiveMQQueue("javaboy-queue");
    }
}
