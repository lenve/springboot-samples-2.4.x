package org.javaboy.amqp.recevier;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

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
public class TopicReceiver {
    @RabbitListener(queues = "phone")
    public void handler1(String msg) {
        System.out.println("phone:msg = " + msg);
    }
    @RabbitListener(queues = "xiaomi")
    public void handler2(String msg) {
        System.out.println("xiaomi:msg = " + msg);
    }
    @RabbitListener(queues = "huawei")
    public void handler3(String msg) {
        System.out.println("huawei:msg = " + msg);
    }
}
