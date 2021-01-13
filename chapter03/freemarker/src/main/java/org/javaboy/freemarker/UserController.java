package org.javaboy.freemarker;

import org.javaboy.freemarker.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Controller
public class UserController {
    @GetMapping("/hello")
    public String hello(Model model) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setId((long) i);
            u.setUsername("javaboy:" + i);
            u.setAddress("www.javaboy.org:" + i);
            users.add(u);
        }
        model.addAttribute("users", users);
        Map<String, Object> info = new HashMap<>();
        info.put("name", "江南一点雨");
        info.put("age", 99);
        model.addAttribute("info", info);
        model.addAttribute("name", "javaboy");
        model.addAttribute("birthday", new Date());
        return "hello";
    }
}
