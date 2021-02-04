package org.javaboy.jms.config;

import org.javaboy.jms.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;
import javax.jms.Queue;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Component
public class JmsComponent {
    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    Queue queue;

    public void send(Message message) {
        jmsMessagingTemplate.convertAndSend(queue, message);
    }

    @JmsListener(destination = "javaboy-queue")
    public void receive(Message msg) {
        System.out.println("msg = " + msg);
    }
}
