package org.javaboy.jpa;

import org.javaboy.jpa.dao.BookDao;
import org.javaboy.jpa.model.Book;
import org.javaboy.jpa.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpaApplicationTests {

    @Autowired
    BookDao bookDao;

    @Test
    void contextLoads() {
        Book book = new Book();
        book.setName("三国演义");
        book.setAuthor("罗贯中");
        bookDao.save(book);
    }

    @Test
    void test1() {
        List<Book> list = bookDao.findAll();
        System.out.println("list = " + list);
        Optional<Book> byId = bookDao.findById(2L);
        System.out.println("byId = " + byId);
        bookDao.deleteById(1L);
    }

    @Test
    void test2() {
        //页码从 0 开始记，1 表示第二页
        PageRequest pageRequest = PageRequest.of(0, 3, Sort.by(Sort.Order.asc("id")));
        Page<Book> page = bookDao.findAll(pageRequest);
        System.out.println("总记录数： " + page.getTotalElements());
        System.out.println("总页数 " + page.getTotalPages());
        System.out.println("查到的数据 " + page.getContent());
        System.out.println("每页的记录数 " + page.getSize());
        System.out.println("是否还有下一页 " + page.hasNext());
        System.out.println("是否还有上一页 " + page.hasPrevious());
        System.out.println("是否最后一页 " + page.isLast());
        System.out.println("是否第一页 " + page.isFirst());
        System.out.println("当前页码 " + page.getNumber());
        System.out.println("当前页的记录数 " + page.getNumberOfElements());
    }

    @Test
    void test3() {
        List<Book> list = bookDao.getBookByAuthorIs("鲁迅");
        System.out.println("list = " + list);
    }


    @Test
    void test4() {
        System.out.println(bookDao.maxIdBook());
    }

    @Autowired
    BookService bookService;
    @Test
    void test5() {
        bookService.updateBookById("123", 7L);
    }
}
