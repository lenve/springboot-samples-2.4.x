package org.javaboy.springproperties;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringPropertiesApplicationTests {

    @Autowired
    Book book;
    @Test
    void contextLoads() {
        System.out.println("book = " + book);
    }

}
