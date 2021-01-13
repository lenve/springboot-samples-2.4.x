package org.javaboy.cors01;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨 vhr
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@RestController
//@CrossOrigin(value = "http://localhost:8081",maxAge = 1800)
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello cors";
    }

    @PutMapping("/hello")
    public String hello2() {
        return "hello cors put!";
    }

}
