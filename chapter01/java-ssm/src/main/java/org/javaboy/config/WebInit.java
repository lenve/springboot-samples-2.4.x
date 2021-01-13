package org.javaboy.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 *
 * 这个类的作用相当于 web.xml 配置文件
 */
public class WebInit implements WebApplicationInitializer {
    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMVCConfig.class);
        ServletRegistration.Dynamic springmvc = servletContext.addServlet("springmvc", new DispatcherServlet(ctx));
        springmvc.addMapping("/");
        springmvc.setLoadOnStartup(1);
    }
}
