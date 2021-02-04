package org.javaboy.mail;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.javaboy.mail.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.context.IContext;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;

@SpringBootTest
class MailApplicationTests {

    @Autowired
    JavaMailSender javaMailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage simpMsg = new SimpleMailMessage();
        simpMsg.setFrom("1510161612@qq.com");
        simpMsg.setTo("1470249098@qq.com");
        simpMsg.setSentDate(new Date());
        simpMsg.setSubject("邮件主题-测试邮件");
        simpMsg.setText("邮件内容-测试邮件");
        javaMailSender.send(simpMsg);
    }

    @Test
    void test1() throws MessagingException {
        File file = new File("/Users/sang/Downloads/es视频教程.png");
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("1510161612@qq.com");
        helper.setTo("1470249098@qq.com");
        helper.setSentDate(new Date());
        helper.setSubject("邮件主题-测试邮件");
        helper.setText("邮件内容-测试邮件");
        helper.addAttachment(file.getName(), file);
        javaMailSender.send(mimeMessage);
    }

    @Test
    void test2() throws MessagingException {
        File file = new File("/Users/sang/Downloads/es视频教程.png");
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("1510161612@qq.com");
        helper.setTo("1470249098@qq.com");
        helper.setSentDate(new Date());
        helper.setSubject("邮件主题-测试邮件");
        helper.setText("<div>hello ，这是一封带图片资源的邮件。。。</div><div><img src='cid:p01' /></div>", true);
        helper.addInline("p01", file);
        javaMailSender.send(mimeMessage);
    }

    @Test
    void test3() throws MessagingException, IOException, TemplateException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("1510161612@qq.com");
        helper.setTo("1470249098@qq.com");
        helper.setSentDate(new Date());
        helper.setSubject("邮件主题-测试邮件");
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_30);
        cfg.setClassLoaderForTemplateLoading(MailApplicationTests.class.getClassLoader(), "mail");
        Template template = cfg.getTemplate("mail.ftl");
        User user = new User();
        user.setCompany("xxx公司");
        user.setUsername("javaboy");
        user.setPosition("Java架构师");
        user.setSalary(999999.0);
        StringWriter out = new StringWriter();
        template.process(user, out);
        String text = out.toString();
        System.out.println("text = " + text);
        helper.setText(text, true);
        javaMailSender.send(mimeMessage);
    }


    @Autowired
    TemplateEngine templateEngine;


    @Test
    void test4() throws MessagingException, IOException, TemplateException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        helper.setFrom("1510161612@qq.com");
        helper.setTo("1470249098@qq.com");
        helper.setSentDate(new Date());
        helper.setSubject("邮件主题-测试邮件");
        User user = new User();
        user.setCompany("xxx公司");
        user.setUsername("javaboy");
        user.setPosition("Java架构师");
        user.setSalary(999999.0);
        Context ctx = new Context();
        ctx.setVariable("username","javaboy");
        ctx.setVariable("position","Java工程师");
        ctx.setVariable("company","xxx集团");
        ctx.setVariable("salary", "999999");
        String text = templateEngine.process("mail.html", ctx);
        helper.setText(text, true);
        javaMailSender.send(mimeMessage);
    }
}
