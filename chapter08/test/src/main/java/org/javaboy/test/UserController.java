package org.javaboy.test;

import org.javaboy.test.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@RestController
public class UserController {
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("javaboy");
        return user;
    }
}
