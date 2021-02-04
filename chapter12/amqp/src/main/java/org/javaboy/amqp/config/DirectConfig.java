package org.javaboy.amqp.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Configuration
public class DirectConfig {
    @Bean
    Queue directQueue() {
        return new Queue("javaboy-queue");
    }

    //如果用了 direct 模式，下面两个 bean 可以省略

//    @Bean
//    DirectExchange directExchange() {
//        return new DirectExchange("javaboy-direct", true, false);
//    }
//
//    @Bean
//    Binding directBinding() {
//        return BindingBuilder.bind(directQueue()).to(directExchange()).with("direct");
//    }

}
