package org.javaboy.jpa.dao;

import org.javaboy.jpa.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

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
public interface BookDao extends JpaRepository<Book,Long> {
    List<Book> getBookByAuthorIs(String author);

    @Query(nativeQuery = true,value = "select * from t_book where id=(select max(id) from t_book)")
    Book maxIdBook();

    @Query("update t_book set b_name=:name where id=:id")
    @Modifying
    void updateBookById(String name, Long id);
}