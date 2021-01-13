package org.javaboy.exception;

import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.DefaultErrorViewResolver;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Component
public class MyErrorViewResolver extends DefaultErrorViewResolver {
    public MyErrorViewResolver(ApplicationContext applicationContext, WebProperties.Resources resources) {
        super(applicationContext, resources);
    }

    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        Map<String, Object> map = new HashMap<>();
        map.putAll(model);
        if ((Integer) model.get("status") == 500) {
            map.put("message", "服务器内部错误");
        }
        ModelAndView view = new ModelAndView("javaboy/999",map);
        return view;
    }
}
