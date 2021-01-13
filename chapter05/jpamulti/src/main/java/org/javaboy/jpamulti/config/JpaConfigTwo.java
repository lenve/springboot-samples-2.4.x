package org.javaboy.jpamulti.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

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
@EnableJpaRepositories(basePackages = "org.javaboy.jpamulti.dao2", entityManagerFactoryRef = "localContainerEntityManagerFactoryBean2", transactionManagerRef = "platformTransactionManager2")
public class JpaConfigTwo {
    @Autowired
    @Qualifier("dsTwo")
    DataSource ds;
    @Autowired
    JpaProperties jpaProperties;

    @Bean
    LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean2(EntityManagerFactoryBuilder builder) {
        return builder.dataSource(ds)
                .packages("org.javaboy.jpamulti.model")
                .properties(jpaProperties.getProperties())
                .persistenceUnit("pu2")
                .build();
    }

    @Bean
    PlatformTransactionManager platformTransactionManager2(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(localContainerEntityManagerFactoryBean2(builder).getObject());
    }
}
