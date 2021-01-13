package org.javaboy.demo04;

import org.javaboy.demo04.anno.EnableFruit;
import org.javaboy.demo04.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFruit
public class Demo04Application {

    @Autowired
    HelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(Demo04Application.class, args);
    }

}
