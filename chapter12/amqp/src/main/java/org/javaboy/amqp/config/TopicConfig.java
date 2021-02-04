package org.javaboy.amqp.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
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
public class TopicConfig {
    @Bean
    Queue xiaomi() {
        return new Queue("xiaomi");
    }
    @Bean
    Queue huawei() {
        return new Queue("huawei");
    }
    @Bean
    Queue phone() {
        return new Queue("phone");
    }

    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange("javaboy-topic", true, false);
    }

    @Bean
    Binding xiaomiBinding() {
        return BindingBuilder.bind(xiaomi()).to(topicExchange()).with("xiaomi.#");
    }

    @Bean
    Binding huaweiBinding() {
        return BindingBuilder.bind(huawei()).to(topicExchange()).with("huawei.#");
    }

    @Bean
    Binding phoneBinding() {
        return BindingBuilder.bind(phone()).to(topicExchange()).with("#.phone.#");
    }

}
