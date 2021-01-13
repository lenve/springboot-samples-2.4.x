package org.javaboy.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨  ssm
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 *
 * 这个配置类相当于 spring-servlet.xml
 */
@Configuration
@ComponentScan(basePackages = "org.javaboy",useDefaultFilters = false,includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class),@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Configuration.class)})
public class SpringMVCConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/");
    }

    @Override
    protected void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/jsp/", ".jsp");
    }

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hello3").setViewName("hello");
    }

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        ObjectMapper om = new ObjectMapper();
        om.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter(om);
        converters.add(converter);
    }

}
