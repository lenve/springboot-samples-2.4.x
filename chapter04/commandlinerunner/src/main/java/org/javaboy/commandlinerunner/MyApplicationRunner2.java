package org.javaboy.commandlinerunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

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
@Order(97)
public class MyApplicationRunner2 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //获取没有键的参数，获取到的值和 commandlinerunner 一致
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println("nonOptionArgs2 = " + nonOptionArgs);
        Set<String> optionNames = args.getOptionNames();
        for (String optionName : optionNames) {
            System.out.println(optionName + "-2->" + args.getOptionValues(optionName));
        }
        //获取命令行中的所有参数
        String[] sourceArgs = args.getSourceArgs();
        System.out.println("sourceArgs2 = " + Arrays.toString(sourceArgs));
    }
}
