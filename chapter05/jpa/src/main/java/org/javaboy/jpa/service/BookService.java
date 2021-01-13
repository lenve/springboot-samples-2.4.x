package org.javaboy.jpa.service;

import org.javaboy.jpa.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨 jpa-book
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Service
public class BookService {
    @Autowired
    BookDao bookDao;
    @Transactional
    public void updateBookById(String name, Long id){
        bookDao.updateBookById(name, id);
    }
}
