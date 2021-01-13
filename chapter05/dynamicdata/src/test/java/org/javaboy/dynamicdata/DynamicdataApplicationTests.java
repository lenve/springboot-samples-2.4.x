package org.javaboy.dynamicdata;

import org.javaboy.dynamicdata.mapper.UserMapper;
import org.javaboy.dynamicdata.model.User;
import org.javaboy.dynamicdata.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DynamicdataApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("zhangsan");
        userService.addUser(user);
    }

    @Test
    void test1() {
        List<User> allUsers = userService.getAllUsers();
        System.out.println("allUsers = " + allUsers);
    }

}
