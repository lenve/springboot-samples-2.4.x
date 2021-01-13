package org.javaboy.webcomponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("org.javaboy.webcomponent")
public class WebcomponentApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebcomponentApplication.class, args);
    }

}
