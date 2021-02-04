package org.javaboy.amqp;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AmqpApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;
    @Test
    void contextLoads() {
//        rabbitTemplate.convertAndSend("javaboy-queue", "hello javaboy!");
//        rabbitTemplate.convertAndSend("javaboy-fanout", null, "hello javaboy");
//        rabbitTemplate.convertAndSend("javaboy-topic","xiaomi.news","小米新闻");
//        rabbitTemplate.convertAndSend("javaboy-topic","xiaomi.phone","小米手机");
//        Message nameMsg = MessageBuilder.withBody("hello javbaoy-name".getBytes()).setHeader("name", "javaboy").build();
        Message ageMsg = MessageBuilder.withBody("hello javbaoy-age".getBytes()).setHeader("age", 98).build();
        rabbitTemplate.send("javaboy-header",null,ageMsg);
    }

}
