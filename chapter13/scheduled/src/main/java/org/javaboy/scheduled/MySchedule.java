package org.javaboy.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

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
@Component
public class MySchedule {
    //当前方法执行结束，1秒后，下个任务开启
    @Scheduled(fixedDelay = 1000)
    public void fixedDelay() {
//        System.out.println("fixedDelay:"+new Date());
    }

    //当前方法开始执行，1秒后，下个任务开启
    @Scheduled(fixedRate = 1000)
    public void fixedRate() {
//        System.out.println("fixedRate:"+new Date());
    }

    @Scheduled(initialDelay = 1000,fixedRate = 1000)
    public void initDelay() {
//        System.out.println("initDelay:"+new Date());
    }

    @Scheduled(cron = "0/5 58 * * * *")
    public void cron() {
        System.out.println("cron:"+new Date());
    }
}
