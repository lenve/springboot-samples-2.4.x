package org.javaboy.json;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

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
    @GetMapping("/user")
    public User getUserById() {
        User user = new User();
        user.setUsername("javaboy");
        user.setBirthday(new Date());
        user.setAddress("www.javaboy.org");
        user.setAge(99);
        return user;
    }

    @PostMapping("/user")
    public void addUser(@RequestBody User user) {
        System.out.println(user);
    }
}
