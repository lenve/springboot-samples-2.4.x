package org.javaboy.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo01Application {

	@GetMapping("/hello")
	public String hello() {
		return "hello springboot!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo01Application.class, args);
	}

}
