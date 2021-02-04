package org.javaboy.cache_ehcache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CacheEhcacheApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        User userById = userService.getUserById(100L);
        User userById2 = userService.getUserById(100L);
    }

}
