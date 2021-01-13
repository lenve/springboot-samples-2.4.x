package org.javaboy.demo04.config;

import org.javaboy.demo04.filter.MyTypeExcludeFilter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.PriorityOrdered;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
public class MyAppInit implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        applicationContext.addBeanFactoryPostProcessor(new MyTypeExcludeFilterPostProcessor());
    }
    private static class MyTypeExcludeFilterPostProcessor implements PriorityOrdered, BeanDefinitionRegistryPostProcessor{

        @Override
        public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
            beanDefinitionRegistry.registerBeanDefinition(MyTypeExcludeFilter.class.getName(),new RootBeanDefinition(MyTypeExcludeFilter.class));
        }

        @Override
        public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        }

        @Override
        public int getOrder() {
            return HIGHEST_PRECEDENCE;
        }
    }
}
