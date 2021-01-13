package org.javaboy.demo04;

import org.javaboy.demo04.model.Apple;
import org.javaboy.demo04.model.Banana;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo04ApplicationTests {

    @Autowired
    Apple apple;
    @Autowired
    Banana banana;

    @Value("${bb.name}")
    String bb;

    @Test
    void test1() {
        System.out.println("bb = " + bb);
    }

    @Test
    void contextLoads() {
        System.out.println("apple = " + apple);
        System.out.println("banana = " + banana);
    }

}
