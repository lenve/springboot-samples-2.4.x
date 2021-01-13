package org.javaboy.jdbctemplatemulti.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨  ssm
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Configuration
public class JdbcTemplateConfig {

    @Bean
    JdbcTemplate jdbcTemplateOne(@Qualifier("dsOne") DataSource ds) {
        return new JdbcTemplate(ds);
    }

    @Bean
    JdbcTemplate jdbcTemplateTwo(@Qualifier("dsTwo") DataSource ds) {
        return new JdbcTemplate(ds);
    }
}
