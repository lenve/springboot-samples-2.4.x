package org.javaboy.demo02.config;

import org.javaboy.demo02.Author;
import org.javaboy.demo02.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨 vhr
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Configuration
public class MyConfig {
    @Bean
    Author author() {
        return new Author();
    }

    @Bean
    Book book() {
        return new Book(author());
    }
}
