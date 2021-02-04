package org.javaboy.quartz.trigger;

import org.javaboy.quartz.job.MyJob02;
import org.quartz.JobDataMap;
import org.quartz.SchedulerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.*;

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
public class QuartzConfig {
    @Bean
    MethodInvokingJobDetailFactoryBean jobDetail01() {
        MethodInvokingJobDetailFactoryBean bean = new MethodInvokingJobDetailFactoryBean();
        bean.setTargetBeanName("myJob01");
        bean.setTargetMethod("sayHello");
        return bean;
    }

    @Bean
    JobDetailFactoryBean jobDetail02() {
        JobDetailFactoryBean bean = new JobDetailFactoryBean();
        bean.setJobClass(MyJob02.class);
        JobDataMap map = new JobDataMap();
        map.put("name","javaboy");
        bean.setJobDataMap(map);
        return bean;
    }

    @Bean
    SimpleTriggerFactoryBean simpleTriggerFactoryBean() {
        SimpleTriggerFactoryBean bean = new SimpleTriggerFactoryBean();
        bean.setJobDetail(jobDetail01().getObject());
        bean.setRepeatCount(3);
        bean.setStartDelay(1000);
        bean.setRepeatInterval(1000);
        return bean;
    }

    @Bean
    CronTriggerFactoryBean cronTriggerFactoryBean() {
        CronTriggerFactoryBean bean = new CronTriggerFactoryBean();
        bean.setJobDetail(jobDetail02().getObject());
        bean.setCronExpression("0/5 * * * * ?");
        return bean;
    }

    @Bean
    SchedulerFactoryBean schedulerFactoryBean() {
        SchedulerFactoryBean bean = new SchedulerFactoryBean();
        bean.setTriggers(simpleTriggerFactoryBean().getObject(),cronTriggerFactoryBean().getObject());
        return bean;
    }

}
