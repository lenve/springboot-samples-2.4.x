package org.javaboy.mongodb;

import org.javaboy.mongodb.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootTest
class MongodbApplicationTests {

    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    void contextLoads() {
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setId((long) i);
            u.setUsername("javaboy:" + i);
            u.setAddress("www.javaboy.org:" + i);
            mongoTemplate.insert(u);
        }
    }

    @Test
    void test1() {
        List<User> us = mongoTemplate.findAll(User.class);
        for (User u : us) {
            System.out.println("u = " + u);
        }
    }

    @Test
    void test2() {
        User user = new User();
        user.setId(1L);
        mongoTemplate.remove(user);
    }

}
