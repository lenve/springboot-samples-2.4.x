package org.javaboy.thymeleaf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@SpringBootTest
class ThymeleafApplicationTests {

    @Autowired
    TemplateEngine templateEngine;

    @Test
    void contextLoads() {
        Context ctx = new Context();
        ctx.setVariable("username","javaboy");
        ctx.setVariable("position","Java 高工");
        ctx.setVariable("salary","30000");
        String mail = templateEngine.process("mail", ctx);
        System.out.println(mail);
    }

}
