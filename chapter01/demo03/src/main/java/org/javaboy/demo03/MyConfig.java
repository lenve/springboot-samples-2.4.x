package org.javaboy.demo03;

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
public class MyConfig {
    @Bean
    Author author() {
        Author author = new Author();
        System.out.println(author);
        return author;
    }

    @Bean
    Book book() {
        Book book = new Book(author());
        System.out.println(author());
        return book;
    }

}
