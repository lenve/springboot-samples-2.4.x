package org.javaboy.cache_redis.service;

import org.javaboy.cache_redis.MyKeyGenerator;
import org.javaboy.cache_redis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
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
@CacheConfig(cacheNames = "c1")
public class UserService {

    @Cacheable//标记在方法上，表示该方法的返回结果需要缓存，默认情况下，方法的参数将作为缓存的 key
    public User getUserById(Long id) {
        System.out.println("getUserById:" + id);
        User user = new User();
        user.setId(id);
        user.setUsername("javaboy");
        return user;
    }

    @CacheEvict
    public void deleteUserById(Long id) {
        System.out.println("deleteUserById");
    }

    @CachePut(key = "#user.id")//如果缓存不存在，则进行缓存，否则进行更新。
    public User updateUserById(User user) {
        return user;
    }

    /**
     * 如果方法存在多个参数，则默认情况下，多个参数共同作为缓存的 key。
     *
     * 也可以自己指定缓存的 key，通过 #参数名
     *
     * 也可以使用 SPEL 表达式
     * @param id
     * @param username
     * @return
     */
//    @Cacheable(key = "#root.method.name")//标记在方法上，表示该方法的返回结果需要缓存，默认情况下，方法的参数将作为缓存的 key
    @Cacheable(keyGenerator = "myKeyGenerator")//标记在方法上，表示该方法的返回结果需要缓存，默认情况下，方法的参数将作为缓存的 key
    public User getUserById2(Long id,String username) {
        System.out.println("getUserById2:" + id);
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        return user;
    }
}
