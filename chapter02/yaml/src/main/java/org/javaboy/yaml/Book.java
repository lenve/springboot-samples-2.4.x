package org.javaboy.yaml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 *
 * 内省
 */
@Component
@ConfigurationProperties(prefix = "book")
public class Book {
    private String aaa;
    private List<String> tags;
    private List<Author> authors;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + aaa + '\'' +
                ", tags=" + tags +
                ", authors=" + authors +
                '}';
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getNamea() {
        return aaa;
    }

    public void setNamea(String name) {
        this.aaa = name;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
