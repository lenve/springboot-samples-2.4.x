package org.javaboy.jms;

import org.javaboy.jms.config.JmsComponent;
import org.javaboy.jms.model.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class JmsApplicationTests {

    @Autowired
    JmsComponent jmsComponent;
    @Test
    void contextLoads() {
        Message msg = new Message();
        msg.setContent("hello javaboy");
        msg.setDate(new Date());
        jmsComponent.send(msg);
    }

}
