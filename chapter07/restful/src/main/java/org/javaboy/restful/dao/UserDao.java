package org.javaboy.restful.dao;

import org.javaboy.restful.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@RepositoryRestResource(path = "people",collectionResourceRel = "us",itemResourceRel = "u")
public interface UserDao extends JpaRepository<User,Long> {
    @RestResource(path = "byname")
    List<User> findUserByUsernameIs(@Param("username") String username);

    @Override
    @RestResource(exported = false)
    void deleteById(Long aLong);
}
