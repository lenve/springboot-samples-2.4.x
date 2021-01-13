package org.javaboy.json;

import com.fasterxml.jackson.annotation.*;

import java.util.Date;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
//批量忽略字段
//@JsonIgnoreProperties({"birthday","address"})
public class User {
    //指定属性序列化/反序列化时的名称，默认名称就是属性名
    @JsonProperty(value = "aaaage",index = 99)
    private Integer age;
    @JsonProperty(index = 98)
    private String username;
//    @JsonProperty(index = 97)
    //日期格式化，注意时区问题
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    //类似于 @JsonProperty 中的 index
    @JsonPropertyOrder
    private Date birthday;

    //序列化/反序列化时忽略某一个字段
//    @JsonIgnore
    private String address;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", username='" + username + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
