package org.javaboy.filter;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨 vhr
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Configuration
public class FilterConfiguration {
    @Bean
    FilterRegistrationBean<MyFilter04> filter04FilterRegistrationBean04() {
        FilterRegistrationBean<MyFilter04> bean = new FilterRegistrationBean<>();
        bean.setOrder(90);
        bean.setFilter(new MyFilter04());
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
    @Bean
    FilterRegistrationBean<MyFilter05> filter04FilterRegistrationBean05() {
        FilterRegistrationBean<MyFilter05> bean = new FilterRegistrationBean<>();
        bean.setOrder(89);
        bean.setFilter(new MyFilter05());
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
}
