package org.javaboy.redis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.javaboy.redis.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("javaboy");
        user.setAddress("www.javaboy.org");
        ValueOperations ops = redisTemplate.opsForValue();
        ops.set("u", user);
        User u = (User) ops.get("u");
        System.out.println("u = " + u);
    }

    @Test
    void test1() throws JsonProcessingException {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        User user = new User();
        user.setUsername("javaboy");
        user.setAddress("www.javaboy.org");
        ObjectMapper om = new ObjectMapper();
        String s = om.writeValueAsString(user);
        ops.set("u1", s);
        String u1 = ops.get("u1");
        User user1 = om.readValue(u1, User.class);
        System.out.println("user1 = " + user1);
    }

}
