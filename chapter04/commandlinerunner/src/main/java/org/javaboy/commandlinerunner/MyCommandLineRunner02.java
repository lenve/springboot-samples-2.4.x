package org.javaboy.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Component
@Order(99)
public class MyCommandLineRunner02 implements CommandLineRunner {
    //当系统启动时，run 方法会被触发，方法参数就是 main 方法所传入的参数
    @Override
    public void run(String... args) throws Exception {
        System.out.println("args2 = " + Arrays.toString(args));
    }
}