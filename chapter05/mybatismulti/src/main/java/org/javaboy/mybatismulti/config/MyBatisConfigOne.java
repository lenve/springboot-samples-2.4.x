package org.javaboy.mybatismulti.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

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
@MapperScan(basePackages = "org.javaboy.mybatismulti.mapper1",sqlSessionFactoryRef = "sqlSessionFactory1",sqlSessionTemplateRef = "sqlSessionTemplate1")
public class MyBatisConfigOne {
    @Autowired
    @Qualifier("dsOne")
    DataSource ds;

    @Bean
    SqlSessionFactory sqlSessionFactory1() {
        SqlSessionFactory sqlSessionFactory = null;
        try {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            bean.setDataSource(ds);
            sqlSessionFactory = bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sqlSessionFactory;
    }

    @Bean
    SqlSessionTemplate sqlSessionTemplate1() {
        return new SqlSessionTemplate(sqlSessionFactory1());
    }
}
