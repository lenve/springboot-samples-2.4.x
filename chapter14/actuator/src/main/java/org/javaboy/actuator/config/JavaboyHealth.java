package org.javaboy.actuator.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

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
public class JavaboyHealth implements HealthIndicator {
    @Override
    public Health health() {
//        return Health.status("FATAL").withDetail("msg","发现严重问题").build();
        return Health.up().withDetail("msg","一切正常...").build();
    }
}
