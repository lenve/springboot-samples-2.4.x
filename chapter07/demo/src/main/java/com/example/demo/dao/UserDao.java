package com.example.demo.dao;


import com.example.demo.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
public interface UserDao extends ElasticsearchRepository<User,Long> {

}
