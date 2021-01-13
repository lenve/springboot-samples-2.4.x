package org.javaboy.jdbctemplatemulti;

import org.javaboy.jdbctemplatemulti.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class JdbctemplatemultiApplicationTests {

    @Autowired
    @Qualifier("jdbcTemplateOne")
    JdbcTemplate jdbcTemplateOne;

    @Resource(name = "jdbcTemplateTwo")
    JdbcTemplate jdbcTemplateTwo;
    @Test
    void contextLoads() {
        List<User> list1 = jdbcTemplateOne.query("select * from user", new BeanPropertyRowMapper<>(User.class));
        List<User> list2 = jdbcTemplateTwo.query("select * from user", new BeanPropertyRowMapper<>(User.class));
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
    }

}
