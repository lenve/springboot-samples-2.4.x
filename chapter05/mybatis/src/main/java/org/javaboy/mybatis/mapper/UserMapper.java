package org.javaboy.mybatis.mapper;

import org.apache.ibatis.annotations.*;
import org.javaboy.mybatis.model.User;

import java.util.List;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨 mybatis
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    User getUserById(Long id);

    @Results({
            @Result(property = "address",column = "address1")
    })
    @Select("select * from user")
    List<User> getAllUsers();

    @Insert("insert into user (username,address1) values (#{username},#{address})")
    @SelectKey(statement = "select last_insert_id()",keyProperty = "id",before = false,resultType = Long.class)
    Integer addUser(User user);

    @Delete("delete from user where id=#{id}")
    Integer deleteById(Long id);

    @Update("update user set username=#{username} where id=#{id}")
    Integer updateById(String username, Long id);
}
