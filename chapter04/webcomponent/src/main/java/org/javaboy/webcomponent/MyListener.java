package org.javaboy.webcomponent;

import org.springframework.web.context.request.RequestContextListener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.annotation.WebListener;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@WebListener
public class MyListener extends RequestContextListener {
    @Override
    public void requestInitialized(ServletRequestEvent requestEvent) {
        System.out.println("requestInitialized");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent requestEvent) {
        System.out.println("requestDestroyed");
    }
}
