package org.javaboy.aop.service;

import org.springframework.stereotype.Service;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Service
public class UserService {
    public String getUserById(Integer id) {
        System.out.println("getUserById");
        int i = 1 / 0;
        return "user";
    }

    public void deleteUserById(Integer id) {
        System.out.println("delete id:" + id);
    }
}