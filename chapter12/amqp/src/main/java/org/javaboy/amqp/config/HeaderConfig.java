package org.javaboy.amqp.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.HeadersExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

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
public class HeaderConfig {
    @Bean
    Queue queueAge() {
        return new Queue("queue-age");
    }
    @Bean
    Queue queueName() {
        return new Queue("queue-name");
    }
    @Bean
    HeadersExchange headersExchange() {
        return new HeadersExchange("javaboy-header", true, false);
    }
    @Bean
    Binding bindingAge() {
        Map<String, Object> map = new HashMap<>();
        map.put("age", 99);
        return BindingBuilder.bind(queueAge()).to(headersExchange()).whereAny(map).match();
    }

    @Bean
    Binding bindingName() {
        return BindingBuilder.bind(queueName()).to(headersExchange()).where("name").exists();
    }
}
