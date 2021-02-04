package org.javaboy.validation.model;

import org.javaboy.validation.validation.ValidationGroup1;
import org.javaboy.validation.validation.ValidationGroup2;

import javax.validation.constraints.*;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
public class User {
    private Long id;
    @Size(min = 5,max = 8,message = "{user.name.size}",groups = ValidationGroup1.class)
    private String name;
    @NotNull(message = "{user.address.notnull}",groups = ValidationGroup2.class)
    private String address;
    @DecimalMin(value = "1",message = "{user.age.min}",groups = {ValidationGroup1.class,ValidationGroup2.class})
    @DecimalMax(value = "200",message = "{user.age.max}")
    private Integer age;
    @NotNull(message = "{user.email.notnull}")
    @Email(message = "{user.email.pattern}")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
