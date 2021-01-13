package org.javaboy.profile.c2;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.slf4j.LoggerFactory.getLogger;

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
public class HelloController2 {
    private static final Logger logger = getLogger(HelloController2.class);
    @GetMapping("/hello2")
    public void hello() {
        for (int i = 0; i < 100000; i++) {
            logger.info("hello javaboy2");
        }
    }
}
