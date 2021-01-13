package org.javaboy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

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
public class LogAspect {
    @Pointcut("execution(* org.javaboy.aop.service.*.*(..))")
    public void pc1() {

    }

    @Before("pc1()")
    public void before(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println(name + " 方法开始执行了...");
    }

    @After("pc1()")
    public void after(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println(name + " 方法执行结束了...");
    }

    @AfterReturning(value = "pc1()", returning = "s")
    public void afterReturning(JoinPoint jp, String s) {
        String name = jp.getSignature().getName();
        System.out.println(name + " 方法的返回值是 " + s);
    }

    @AfterThrowing(value = "pc1()", throwing = "e")
    public void afterThrowing(JoinPoint jp, Exception e) {
        String name = jp.getSignature().getName();
        System.out.println(name + " 方法抛出了异常 " + e.getMessage());
    }

    @Around("pc1()")
    public Object around(ProceedingJoinPoint pjp) {
        try {

            //类似于反射中的 invoke 方法
            Object proceed = pjp.proceed();
            return proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}
