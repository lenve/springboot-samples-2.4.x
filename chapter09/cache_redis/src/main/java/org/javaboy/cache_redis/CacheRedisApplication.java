package org.javaboy.cache_redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching//开启缓存功能
public class CacheRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(CacheRedisApplication.class, args);
    }

}
