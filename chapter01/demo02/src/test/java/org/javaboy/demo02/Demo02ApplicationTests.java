package org.javaboy.demo02;

import org.javaboy.demo02.config.MyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo02ApplicationTests {

    @Autowired
    Author author;
    @Autowired
    MyConfig myConfig;
    @Autowired
    Book book;

    @Autowired
    BeanFactory beanFactory;

    @Test
    void test1() {
        List<String> list = AutoConfigurationPackages.get(beanFactory);
        list.forEach(p-> System.out.println("p = " + p));
    }

    @Test
    void contextLoads() {
        System.out.println("author = " + author);
        System.out.println("myConfig = " + myConfig);
        System.out.println("author==book.getAuthor() = " + (author == book.getAuthor()));
    }

}
