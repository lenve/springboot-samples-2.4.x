package org.javaboy.chat01.controller;

import org.javaboy.chat01.model.Chat;
import org.javaboy.chat01.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
@Controller
public class GreetingController {

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/hello")
//    @SendTo("/topic/greetings")
    public Message greeting(Message message) {
        System.out.println("message = " + message);
        simpMessagingTemplate.convertAndSend("/topic/greetings", message);
        return message;
    }
    @MessageMapping("/online_chat")
    public void chat(Principal principal, Chat chat) {
        String from = principal.getName();
        chat.setFrom(from);
        simpMessagingTemplate.convertAndSendToUser(chat.getTo(), "/queue/chat", chat);
    }
}
