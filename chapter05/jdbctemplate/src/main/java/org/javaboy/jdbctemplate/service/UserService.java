package org.javaboy.jdbctemplate.service;

import org.javaboy.jdbctemplate.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Service;

import java.sql.*;
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
@Service
public class UserService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public int addUser(User user) {
        int result = jdbcTemplate.update("insert into user (username,address) values(?,?)", user.getUsername(), user.getAddress());
        return result;
    }

    public int addUser2(User user) {
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        int result = jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement ps = connection.prepareStatement("insert into user (username,address) values(?,?)", Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, user.getUsername());
                ps.setString(2, user.getAddress());
                return ps;
            }
        }, keyHolder);
        user.setId(keyHolder.getKey().longValue());
        return result;
    }

    public int deleteById(Long id) {
        return jdbcTemplate.update("delete from user where id=?", id);
    }

    public int updateById(Long id,String username) {
        return jdbcTemplate.update("update user set username=? where id=?", username, id);
    }

    public List<User> getAllUsers() {
        List<User> list = jdbcTemplate.query("select * from user", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                String username = resultSet.getString("username");
                String address = resultSet.getString("address");
                long id = resultSet.getLong("id");
                User user = new User();
                user.setId(id);
                user.setUsername(username);
                user.setAddress(address);
                return user;
            }
        });
        return list;
    }
    public List<User> getAllUsers2() {
        List<User> list = jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<>(User.class));
        return list;
    }
}