package org.javaboy.thymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.TemplateEngine;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

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
    public String index(Model model, HttpSession session) {
        session.setAttribute("name", "江南一点雨");
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setId(i);
            u.setUsername("javaboy:" + i);
            u.setAddress("www.javaboy.org:" + i);
            users.add(u);
        }
        model.addAttribute("users", users);
        User user = new User();
        user.setId(99);
        user.setUsername("江南一点雨");
        user.setAddress("深圳");
        model.addAttribute("user", user);
        return "hello";
    }


}
