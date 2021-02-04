package org.javaboy.restful_mongodb.dao;

import org.javaboy.restful_mongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
public interface UserDao extends MongoRepository<User,Long> {

}
