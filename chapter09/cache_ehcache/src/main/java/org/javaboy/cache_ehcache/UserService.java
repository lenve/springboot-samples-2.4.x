package org.javaboy.cache_ehcache;

import org.springframework.cache.annotation.Cacheable;
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
    @Cacheable(cacheNames = "user")
    public User getUserById(Long id) {
        System.out.println("id = " + id);
        User u = new User();
        u.setId(id);
        u.setUsername("javaboy");
        return u;
    }
}
