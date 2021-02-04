package org.javaboy.validation.controller;

import org.javaboy.validation.model.User;
import org.javaboy.validation.validation.ValidationGroup1;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class UserController {
    @PostMapping("/user")
    public void addUser(@Validated(ValidationGroup1.class) User user, BindingResult result) {
        if (result != null && result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                System.out.println(error.getObjectName() + error.getDefaultMessage());
            }
        }

    }
}
