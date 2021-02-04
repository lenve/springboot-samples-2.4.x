package org.javaboy.test.dao;

import org.javaboy.test.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Repository
public class UserDao {

    public User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("111");
        return user;
    }
}
