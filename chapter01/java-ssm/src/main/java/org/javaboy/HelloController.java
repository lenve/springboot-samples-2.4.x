package org.javaboy;

import org.javaboy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 *
 * mvc:view-controller
 */
@Controller
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("helloService.hello() = " + helloService.hello());
        return "hello javassm";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "hello";
    }

    @GetMapping("/hello4")
    @ResponseBody
    public List<User> getNames() {
        List<User> names = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            names.add(new User("javaboy:" + i, new Date()));
        }
        return names;
    }
}
