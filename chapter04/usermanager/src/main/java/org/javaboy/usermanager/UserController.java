package org.javaboy.usermanager;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨 回复 ssm
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@RestController
public class UserController {
    @PostMapping("/user1")
    public void addUser(User user) {
        System.out.println("user = " + user);
    }
    @PostMapping("/user2")
    public void addUser2(@RequestBody User user) {
        System.out.println("user = " + user);
    }
}
