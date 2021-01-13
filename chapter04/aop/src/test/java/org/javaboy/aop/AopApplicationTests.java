package org.javaboy.aop;

import org.javaboy.aop.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AopApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        userService.getUserById(99);
    }

}
