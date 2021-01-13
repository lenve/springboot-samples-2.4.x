package org.javaboy.banner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BannerApplication {

    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(BannerApplication.class);
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
        SpringApplication.run(BannerApplication.class,args);
    }

}
