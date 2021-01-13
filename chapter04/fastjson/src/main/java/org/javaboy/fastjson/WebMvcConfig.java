package org.javaboy.fastjson;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
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
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setCharset(Charset.forName("UTF-8"));
        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
        converter.setFastJsonConfig(fastJsonConfig);
        converter.setDefaultCharset(Charset.forName("UTF-8"));
        converters.add(converter);
    }

//    @Bean
//    FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
//        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setCharset(Charset.forName("UTF-8"));
//        fastJsonConfig.setDateFormat("yyyy-MM-dd HH:mm:ss");
//        converter.setFastJsonConfig(fastJsonConfig);
//        converter.setDefaultCharset(Charset.forName("UTF-8"));
//        return converter;
//    }
}
