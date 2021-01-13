package org.javaboy.jdbctemplate;

import org.javaboy.jdbctemplate.model.User;
import org.javaboy.jdbctemplate.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JdbctemplateApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("javaboy");
        user.setAddress("www.javaboy.org");
        int i = userService.addUser(user);
        System.out.println(i);
    }

    @Test
    void test1() {
        User u = new User();
        u.setUsername("itboyhub");
        u.setAddress("www.itboyhub.com");
        int i = userService.addUser2(u);
        System.out.println("i = " + i);
        System.out.println("u.getId() = " + u.getId());
    }

    @Test
    void test2() {
        userService.deleteById(10L);
        userService.updateById(9L, "itboyhub123");
    }
    @Test
    void test3() {
        List<User> allUsers = userService.getAllUsers2();
        for (User allUser : allUsers) {
            System.out.println(allUser);
        }
    }
}
