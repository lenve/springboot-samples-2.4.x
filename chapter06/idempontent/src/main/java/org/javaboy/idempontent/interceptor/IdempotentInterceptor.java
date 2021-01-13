package org.javaboy.idempontent.interceptor;

import org.javaboy.idempontent.anno.AutoIdempotent;
import org.javaboy.idempontent.exception.IdempotentException;
import org.javaboy.idempontent.token.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
//@Component
public class IdempotentInterceptor implements HandlerInterceptor {
    @Autowired
    TokenService tokenService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        Method method = ((HandlerMethod) handler).getMethod();
        AutoIdempotent idempotent = method.getAnnotation(AutoIdempotent.class);
        if (idempotent != null) {
            try {
                return tokenService.checkToken(request);
            } catch (IdempotentException e) {
                throw e;
            }
        }
        return true;
    }
}
