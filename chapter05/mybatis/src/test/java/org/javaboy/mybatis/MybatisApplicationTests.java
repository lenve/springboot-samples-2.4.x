package org.javaboy.mybatis;

import org.javaboy.mybatis.mapper.UserMapper;
import org.javaboy.mybatis.mapper.UserMapper2;
import org.javaboy.mybatis.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.getUserById(9L);
        System.out.println(user);
    }

    @Test
    void tes1() {
        List<User> users = userMapper.getAllUsers();
        System.out.println(users);
    }

    @Test
    void test2() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setAddress("shenzhen");
        userMapper.addUser(user);
        System.out.println("user.getId() = " + user.getId());
    }

    @Test
    void test3() {
        userMapper.deleteById(12L);
        userMapper.updateById("123", 11L);
    }

    @Autowired
    UserMapper2 userMapper2;
    @Test
    void test4() {
        User user = userMapper2.getUserById(9L);
        System.out.println("user = " + user);
        List<User> allUsers = userMapper2.getAllUsers();
        System.out.println("allUsers = " + allUsers);
        User u = new User();
        u.setUsername("lisi");
        u.setAddress("guangzhou");
        userMapper2.addUser(u);
        System.out.println(u.getId());
        userMapper2.deleteById(9L);
        userMapper2.updateById("zhangsan", 4L);
    }
}
