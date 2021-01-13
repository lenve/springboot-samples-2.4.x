package org.javaboy.mybatismulti;

import org.javaboy.mybatismulti.mapper1.UserMapper1;
import org.javaboy.mybatismulti.mapper2.UserMapper2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatismultiApplicationTests {

    @Autowired
    UserMapper1 userMapper1;
    @Autowired
    UserMapper2 userMapper2;
    @Test
    void contextLoads() {
        System.out.println("userMapper1.getAllUsers() = " + userMapper1.getAllUsers());
        System.out.println("userMapper2.getAllUsers() = " + userMapper2.getAllUsers());
    }

}
