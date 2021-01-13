package org.javaboy.idempontent.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.javaboy.idempontent.exception.IdempotentException;
import org.javaboy.idempontent.token.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

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
@Aspect
public class IdempotentAspect {
    @Autowired
    TokenService tokenService;

    @Pointcut("@annotation(org.javaboy.idempontent.anno.AutoIdempotent)")
    public void pc1() {

    }

    @Before("pc1()")
    public void before() throws IdempotentException {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        try {
            tokenService.checkToken(request);
        } catch (IdempotentException e) {
            throw e;
        }
    }
}
