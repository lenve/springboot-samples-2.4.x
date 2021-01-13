package org.javaboy.idempontent.token;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

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
public class RedisService {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public boolean setEx(String key, String value, Long expireTime) {
        boolean result = false;
        try {
            ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
            ops.set(key,value);
            stringRedisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean exists(String key) {
        return stringRedisTemplate.hasKey(key);
    }

    public boolean remove(String key) {
        if (exists(key)) {
            return stringRedisTemplate.delete(key);
        }
        return false;
    }
}
