package org.javaboy.jpamulti;

import org.javaboy.jpamulti.dao1.UserDao1;
import org.javaboy.jpamulti.dao2.UserDao2;
import org.javaboy.jpamulti.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JpamultiApplicationTests {

    @Autowired
    UserDao1 userDao1;
    @Autowired
    UserDao2 userDao2;
    @Test
    void contextLoads() {
        List<User> a1 = userDao1.findAll();
        System.out.println("a1 = " + a1);
        List<User> a2 = userDao2.findAll();
        System.out.println("a2 = " + a2);
    }

}
