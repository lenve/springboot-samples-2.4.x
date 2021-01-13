package org.javaboy.mybatis.mapper;

import org.apache.ibatis.annotations.*;
import org.javaboy.mybatis.model.User;

import java.util.List;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨 mybatis
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
public interface UserMapper2 {
    User getUserById(Long id);
    List<User> getAllUsers();
    Integer addUser(User user);
    Integer deleteById(Long id);
    Integer updateById(String username, Long id);
}