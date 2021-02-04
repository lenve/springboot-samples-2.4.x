package org.javaboy.cache_redis;

import org.javaboy.cache_redis.model.User;
import org.javaboy.cache_redis.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CacheRedisApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        User u1 = userService.getUserById(100L);
        userService.deleteUserById(100L);
        userService.getUserById(100L);

    }

}
